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

package com.liferay.star.wars.demo.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.star.wars.demo.constants.StarWarsDemoActionKeys;
import com.liferay.star.wars.demo.model.StarWarsCharacter;
import com.liferay.star.wars.demo.service.base.StarWarsCharacterServiceBaseImpl;
import com.liferay.star.wars.demo.service.permission.StarWarsCharacterPermission;
import com.liferay.star.wars.demo.service.permission.StarWarsDemoPermission;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jürgen Kappler
 */
public class StarWarsCharacterServiceImpl
	extends StarWarsCharacterServiceBaseImpl {

	@Override
	public StarWarsCharacter addStarWarsCharacter(
			long groupId, String name, String picture, String fraction,
			String description, ServiceContext serviceContext)
		throws PortalException {

		StarWarsDemoPermission.check(
			getPermissionChecker(), groupId,
			StarWarsDemoActionKeys.ADD_STAR_WARS_CHARACTER);

		return starWarsCharacterLocalService.addStarWarsCharacter(
			getUserId(), groupId, name, picture, fraction, description,
			serviceContext);
	}

	@Override
	public StarWarsCharacter deleteStarWarsCharacter(long starWarsCharacterId)
		throws PortalException {

		StarWarsCharacterPermission.check(
			getPermissionChecker(), starWarsCharacterId, ActionKeys.DELETE);

		return starWarsCharacterLocalService.deleteStarWarsCharacter(
			starWarsCharacterId);
	}

	@Override
	public List<StarWarsCharacter> deleteStarWarsCharacters(
			long[] starWarsCharacterIds)
		throws PortalException {

		List<StarWarsCharacter> undeletableStarWarsCharacters =
			new ArrayList<>();

		for (long starWarsCharacterId : starWarsCharacterIds) {
			try {
				StarWarsCharacterPermission.check(
					getPermissionChecker(), starWarsCharacterId,
					ActionKeys.DELETE);

				starWarsCharacterLocalService.deleteStarWarsCharacter(
					starWarsCharacterId);
			}
			catch (PortalException pe) {
				if (_log.isDebugEnabled()) {
					_log.debug(pe, pe);
				}

				StarWarsCharacter starWarsCharacter =
					starWarsCharacterPersistence.fetchByPrimaryKey(
						starWarsCharacterId);

				undeletableStarWarsCharacters.add(starWarsCharacter);
			}
		}

		return undeletableStarWarsCharacters;
	}

	@Override
	public StarWarsCharacter fetchStarWarsCharacter(long starWarsCharacterId)
		throws PortalException {

		StarWarsCharacter starWarsCharacter =
			starWarsCharacterLocalService.fetchStarWarsCharacter(
				starWarsCharacterId);

		if (starWarsCharacter != null) {
			StarWarsCharacterPermission.check(
				getPermissionChecker(), starWarsCharacter, ActionKeys.VIEW);
		}

		return starWarsCharacter;
	}

	@Override
	public List<StarWarsCharacter> getStarWarsCharacters(long groupId)
		throws PortalException {

		return starWarsCharacterPersistence.filterFindByGroupId(groupId);
	}

	@Override
	public List<StarWarsCharacter> getStarWarsCharacters(
			long groupId, int start, int end)
		throws PortalException {

		return starWarsCharacterPersistence.filterFindByGroupId(
			groupId, start, end);
	}

	@Override
	public List<StarWarsCharacter> getStarWarsCharacters(
			long groupId, int start, int end,
			OrderByComparator<StarWarsCharacter> orderByComparator)
		throws PortalException {

		return starWarsCharacterPersistence.filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	@Override
	public List<StarWarsCharacter> getStarWarsCharacters(
			long groupId, String name, int start, int end,
			OrderByComparator<StarWarsCharacter> orderByComparator)
		throws PortalException {

		return starWarsCharacterPersistence.filterFindByG_LikeN(
			groupId, name, start, end, orderByComparator);
	}

	@Override
	public int getStarWarsCharactersCount(long groupId) {
		return starWarsCharacterPersistence.filterCountByGroupId(groupId);
	}

	@Override
	public int getStarWarsCharactersCount(long groupId, String name) {
		return starWarsCharacterPersistence.filterCountByG_LikeN(groupId, name);
	}

	@Override
	public StarWarsCharacter updateStarWarsCharacter(
			long starWarsCharacterId, String name, String picture,
			String fraction, String description)
		throws PortalException {

		StarWarsCharacterPermission.check(
			getPermissionChecker(), starWarsCharacterId, ActionKeys.UPDATE);

		return starWarsCharacterLocalService.updateStarWarsCharacter(
			starWarsCharacterId, name, picture, fraction, description);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		StarWarsCharacterServiceImpl.class);

}