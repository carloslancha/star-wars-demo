/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.star.wars.demo.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.star.wars.demo.model.StarWarsCharacter;
import com.liferay.star.wars.demo.service.StarWarsCharacterLocalServiceUtil;

import java.util.Map;
import java.util.Objects;

import org.osgi.service.component.annotations.Component;

/**
 * @author Jürgen Kappler
 */
@Component(
	property = {"model.class.name=com.liferay.star.wars.demo.model.StarWarsCharacter"},
	service = BaseModelPermissionChecker.class
)
public class StarWarsCharacterPermission implements BaseModelPermissionChecker {

	public static void check(
			PermissionChecker permissionChecker, long starWarsCharacterId,
			String actionId)
		throws PortalException {

		if (!contains(permissionChecker, starWarsCharacterId, actionId)) {
			throw new PrincipalException.MustHavePermission(
				permissionChecker, StarWarsCharacter.class.getName(),
				starWarsCharacterId, actionId);
		}
	}

	public static void check(
			PermissionChecker permissionChecker,
			StarWarsCharacter starWarsCharacter, String actionId)
		throws PortalException {

		if (!contains(permissionChecker, starWarsCharacter, actionId)) {
			throw new PrincipalException.MustHavePermission(
				permissionChecker, StarWarsCharacter.class.getName(),
				starWarsCharacter.getStarWarsCharacterId(), actionId);
		}
	}

	public static boolean contains(
			PermissionChecker permissionChecker, long starWarsCharacterId,
			String actionId)
		throws PortalException {

		StarWarsCharacter starWarsCharacter =
			StarWarsCharacterLocalServiceUtil.fetchStarWarsCharacter(
				starWarsCharacterId);

		if (starWarsCharacter == null) {
			_log.error(
				"Unable to get star wars character " + starWarsCharacterId);

			return false;
		}

		return contains(permissionChecker, starWarsCharacter, actionId);
	}

	public static boolean contains(
		PermissionChecker permissionChecker,
		StarWarsCharacter starWarsCharacter, String actionId) {

		Map<Object, Object> permissionChecksMap =
			permissionChecker.getPermissionChecksMap();

		PermissionCacheKey permissionCacheKey = new PermissionCacheKey(
			starWarsCharacter.getStarWarsCharacterId(), actionId);

		Boolean contains = (Boolean)permissionChecksMap.get(permissionCacheKey);

		if (contains == null) {
			contains = _contains(
				permissionChecker, starWarsCharacter, actionId);

			permissionChecksMap.put(permissionCacheKey, contains);
		}

		return contains;
	}

	@Override
	public void checkBaseModel(
			PermissionChecker permissionChecker, long groupId, long primaryKey,
			String actionId)
		throws PortalException {

		check(permissionChecker, primaryKey, actionId);
	}

	private static boolean _contains(
		PermissionChecker permissionChecker,
		StarWarsCharacter starWarsCharacter, String actionId) {

		if (permissionChecker.hasOwnerPermission(
				starWarsCharacter.getCompanyId(),
				StarWarsCharacter.class.getName(),
				starWarsCharacter.getStarWarsCharacterId(),
				starWarsCharacter.getUserId(), actionId) ||
			permissionChecker.hasPermission(
				starWarsCharacter.getGroupId(),
				StarWarsCharacter.class.getName(),
				starWarsCharacter.getStarWarsCharacterId(), actionId)) {

			return true;
		}

		return false;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		StarWarsCharacterPermission.class);

	private static class PermissionCacheKey {

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}

			if (!(obj instanceof PermissionCacheKey)) {
				return false;
			}

			PermissionCacheKey permissionCacheKey = (PermissionCacheKey)obj;

			if ((_starWarsCharacterId ==
					permissionCacheKey._starWarsCharacterId) &&
				Objects.equals(_actionId, permissionCacheKey._actionId)) {

				return true;
			}

			return false;
		}

		@Override
		public int hashCode() {
			int hash = HashUtil.hash(0, _starWarsCharacterId);

			return HashUtil.hash(hash, _actionId);
		}

		private PermissionCacheKey(long starWarsCharacterId, String actionId) {
			_starWarsCharacterId = starWarsCharacterId;
			_actionId = actionId;
		}

		private final String _actionId;
		private final long _starWarsCharacterId;

	}

}