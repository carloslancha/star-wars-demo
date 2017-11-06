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

package com.liferay.star.wars.demo.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StarWarsCharacterService}.
 *
 * @author Brian Wing Shun Chan
 * @see StarWarsCharacterService
 * @generated
 */
@ProviderType
public class StarWarsCharacterServiceWrapper implements StarWarsCharacterService,
	ServiceWrapper<StarWarsCharacterService> {
	public StarWarsCharacterServiceWrapper(
		StarWarsCharacterService starWarsCharacterService) {
		_starWarsCharacterService = starWarsCharacterService;
	}

	@Override
	public com.liferay.star.wars.demo.model.StarWarsCharacter addStarWarsCharacter(
		long groupId, java.lang.String name, java.lang.String picture,
		java.lang.String fraction, java.lang.String description,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterService.addStarWarsCharacter(groupId, name,
			picture, fraction, description, serviceContext);
	}

	@Override
	public com.liferay.star.wars.demo.model.StarWarsCharacter deleteStarWarsCharacter(
		long starWarsCharacterId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterService.deleteStarWarsCharacter(starWarsCharacterId);
	}

	@Override
	public java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> deleteStarWarsCharacters(
		long[] starWarsCharacterIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterService.deleteStarWarsCharacters(starWarsCharacterIds);
	}

	@Override
	public com.liferay.star.wars.demo.model.StarWarsCharacter fetchStarWarsCharacter(
		long starWarsCharacterId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterService.fetchStarWarsCharacter(starWarsCharacterId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _starWarsCharacterService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterService.getStarWarsCharacters(groupId);
	}

	@Override
	public java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterService.getStarWarsCharacters(groupId, start,
			end);
	}

	@Override
	public java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.star.wars.demo.model.StarWarsCharacter> orderByComparator)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterService.getStarWarsCharacters(groupId, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		long groupId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.star.wars.demo.model.StarWarsCharacter> orderByComparator)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterService.getStarWarsCharacters(groupId, name,
			start, end, orderByComparator);
	}

	@Override
	public int getStarWarsCharactersCount(long groupId) {
		return _starWarsCharacterService.getStarWarsCharactersCount(groupId);
	}

	@Override
	public int getStarWarsCharactersCount(long groupId, java.lang.String name) {
		return _starWarsCharacterService.getStarWarsCharactersCount(groupId,
			name);
	}

	@Override
	public com.liferay.star.wars.demo.model.StarWarsCharacter updateStarWarsCharacter(
		long starWarsCharacterId, java.lang.String name,
		java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterService.updateStarWarsCharacter(starWarsCharacterId,
			name, description);
	}

	@Override
	public StarWarsCharacterService getWrappedService() {
		return _starWarsCharacterService;
	}

	@Override
	public void setWrappedService(
		StarWarsCharacterService starWarsCharacterService) {
		_starWarsCharacterService = starWarsCharacterService;
	}

	private StarWarsCharacterService _starWarsCharacterService;
}