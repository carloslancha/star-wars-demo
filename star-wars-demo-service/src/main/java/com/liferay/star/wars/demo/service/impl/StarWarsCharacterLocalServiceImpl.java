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
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.star.wars.demo.exception.DuplicateStarWarsCharacterException;
import com.liferay.star.wars.demo.exception.StarWarsCharacterNameException;
import com.liferay.star.wars.demo.model.StarWarsCharacter;
import com.liferay.star.wars.demo.service.base.StarWarsCharacterLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author Jürgen Kappler
 */
public class StarWarsCharacterLocalServiceImpl
	extends StarWarsCharacterLocalServiceBaseImpl {

	@Override
	public StarWarsCharacter addStarWarsCharacter(
			long userId, long groupId, String name, String picture,
			String fraction, String description, ServiceContext serviceContext)
		throws PortalException {

		// Star Wars Character

		User user = userLocalService.getUser(userId);

		validate(groupId, name);

		long starWarsCharacterId = counterLocalService.increment();

		StarWarsCharacter starWarsCharacter =
			starWarsCharacterPersistence.create(starWarsCharacterId);

		starWarsCharacter.setGroupId(groupId);
		starWarsCharacter.setCompanyId(user.getCompanyId());
		starWarsCharacter.setUserId(user.getUserId());
		starWarsCharacter.setUserName(user.getFullName());
		starWarsCharacter.setCreateDate(
			serviceContext.getCreateDate(new Date()));
		starWarsCharacter.setModifiedDate(
			serviceContext.getModifiedDate(new Date()));
		starWarsCharacter.setName(name);
		starWarsCharacter.setPicture(picture);
		starWarsCharacter.setFraction(fraction);
		starWarsCharacter.setDescription(description);

		starWarsCharacterPersistence.update(starWarsCharacter);

		// Resources

		resourceLocalService.addModelResources(
			starWarsCharacter, serviceContext);

		return starWarsCharacter;
	}

	@Override
	public StarWarsCharacter deleteStarWarsCharacter(long starWarsCharacterId)
		throws PortalException {

		StarWarsCharacter starWarsCharacter = getStarWarsCharacter(
			starWarsCharacterId);

		return deleteStarWarsCharacter(starWarsCharacter);
	}

	@Override
	public StarWarsCharacter deleteStarWarsCharacter(
			StarWarsCharacter starWarsCharacter)
		throws PortalException {

		/// Star Wars character

		starWarsCharacterPersistence.remove(starWarsCharacter);

		// Resources

		resourceLocalService.deleteResource(
			starWarsCharacter.getCompanyId(), StarWarsCharacter.class.getName(),
			ResourceConstants.SCOPE_INDIVIDUAL,
			starWarsCharacter.getStarWarsCharacterId());

		return starWarsCharacter;
	}

	@Override
	public StarWarsCharacter fetchStarWarsCharacter(long starWarsCharacterId) {
		return starWarsCharacterPersistence.fetchByPrimaryKey(
			starWarsCharacterId);
	}

	@Override
	public List<StarWarsCharacter> getStarWarsCharacters(
			long groupId, int start, int end)
		throws PortalException {

		return getStarWarsCharacters(groupId, start, end, null);
	}

	@Override
	public List<StarWarsCharacter> getStarWarsCharacters(
			long groupId, int start, int end,
			OrderByComparator<StarWarsCharacter> orderByComparator)
		throws PortalException {

		return starWarsCharacterPersistence.findByGroupId(
			groupId, start, end, orderByComparator);
	}

	@Override
	public List<StarWarsCharacter> getStarWarsCharacters(
		long groupId, String name, int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator) {

		if (Validator.isNull(name)) {
			return starWarsCharacterPersistence.findByGroupId(
				groupId, start, end, orderByComparator);
		}

		return starWarsCharacterPersistence.findByG_LikeN(
			groupId, name, start, end, orderByComparator);
	}

	@Override
	public StarWarsCharacter updateStarWarsCharacter(
			long starWarsCharacterId, String name, String picture,
			String fraction, String description)
		throws PortalException {

		StarWarsCharacter starWarsCharacter =
			starWarsCharacterPersistence.findByPrimaryKey(starWarsCharacterId);

		if (!Objects.equals(starWarsCharacter.getName(), name)) {
			validate(starWarsCharacter.getGroupId(), name);
		}

		starWarsCharacter.setModifiedDate(new Date());
		starWarsCharacter.setName(name);
		starWarsCharacter.setPicture(picture);
		starWarsCharacter.setFraction(fraction);
		starWarsCharacter.setDescription(description);

		starWarsCharacterPersistence.update(starWarsCharacter);

		return starWarsCharacter;
	}

	protected void validate(long groupId, String name) throws PortalException {
		if (Validator.isNull(name)) {
			throw new StarWarsCharacterNameException(
				"Name must not be null for group " + groupId);
		}

		StarWarsCharacter starWarsCharacter =
			starWarsCharacterPersistence.fetchByG_N(groupId, name);

		if (starWarsCharacter != null) {
			throw new DuplicateStarWarsCharacterException(name);
		}
	}

}