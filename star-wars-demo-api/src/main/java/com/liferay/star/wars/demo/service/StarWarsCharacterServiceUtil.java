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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for StarWarsCharacter. This utility wraps
 * {@link com.liferay.star.wars.demo.service.impl.StarWarsCharacterServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see StarWarsCharacterService
 * @see com.liferay.star.wars.demo.service.base.StarWarsCharacterServiceBaseImpl
 * @see com.liferay.star.wars.demo.service.impl.StarWarsCharacterServiceImpl
 * @generated
 */
@ProviderType
public class StarWarsCharacterServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.star.wars.demo.service.impl.StarWarsCharacterServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.star.wars.demo.model.StarWarsCharacter addStarWarsCharacter(
		long groupId, java.lang.String name, java.lang.String picture,
		java.lang.String fraction, java.lang.String description,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addStarWarsCharacter(groupId, name, picture, fraction,
			description, serviceContext);
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacter deleteStarWarsCharacter(
		long starWarsCharacterId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteStarWarsCharacter(starWarsCharacterId);
	}

	public static java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> deleteStarWarsCharacters(
		long[] starWarsCharacterIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteStarWarsCharacters(starWarsCharacterIds);
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacter fetchStarWarsCharacter(
		long starWarsCharacterId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().fetchStarWarsCharacter(starWarsCharacterId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getStarWarsCharacters(groupId, start, end);
	}

	public static java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.star.wars.demo.model.StarWarsCharacter> orderByComparator)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getStarWarsCharacters(groupId, start, end, orderByComparator);
	}

	public static java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		long groupId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.star.wars.demo.model.StarWarsCharacter> orderByComparator)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getStarWarsCharacters(groupId, name, start, end,
			orderByComparator);
	}

	public static int getStarWarsCharactersCount(long groupId) {
		return getService().getStarWarsCharactersCount(groupId);
	}

	public static int getStarWarsCharactersCount(long groupId,
		java.lang.String name) {
		return getService().getStarWarsCharactersCount(groupId, name);
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacter updateStarWarsCharacter(
		long starWarsCharacterId, java.lang.String name,
		java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateStarWarsCharacter(starWarsCharacterId, name,
			description);
	}

	public static StarWarsCharacterService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<StarWarsCharacterService, StarWarsCharacterService> _serviceTracker =
		ServiceTrackerFactory.open(StarWarsCharacterService.class);
}