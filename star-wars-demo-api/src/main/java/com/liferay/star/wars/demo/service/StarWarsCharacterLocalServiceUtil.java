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
 * Provides the local service utility for StarWarsCharacter. This utility wraps
 * {@link com.liferay.star.wars.demo.service.impl.StarWarsCharacterLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see StarWarsCharacterLocalService
 * @see com.liferay.star.wars.demo.service.base.StarWarsCharacterLocalServiceBaseImpl
 * @see com.liferay.star.wars.demo.service.impl.StarWarsCharacterLocalServiceImpl
 * @generated
 */
@ProviderType
public class StarWarsCharacterLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.star.wars.demo.service.impl.StarWarsCharacterLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.star.wars.demo.model.StarWarsCharacter addStarWarsCharacter(
		long userId, long groupId, java.lang.String name,
		java.lang.String picture, java.lang.String fraction,
		java.lang.String description,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addStarWarsCharacter(userId, groupId, name, picture,
			fraction, description, serviceContext);
	}

	/**
	* Adds the star wars character to the database. Also notifies the appropriate model listeners.
	*
	* @param starWarsCharacter the star wars character
	* @return the star wars character that was added
	*/
	public static com.liferay.star.wars.demo.model.StarWarsCharacter addStarWarsCharacter(
		com.liferay.star.wars.demo.model.StarWarsCharacter starWarsCharacter) {
		return getService().addStarWarsCharacter(starWarsCharacter);
	}

	/**
	* Creates a new star wars character with the primary key. Does not add the star wars character to the database.
	*
	* @param starWarsCharacterId the primary key for the new star wars character
	* @return the new star wars character
	*/
	public static com.liferay.star.wars.demo.model.StarWarsCharacter createStarWarsCharacter(
		long starWarsCharacterId) {
		return getService().createStarWarsCharacter(starWarsCharacterId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the star wars character with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param starWarsCharacterId the primary key of the star wars character
	* @return the star wars character that was removed
	* @throws PortalException if a star wars character with the primary key could not be found
	*/
	public static com.liferay.star.wars.demo.model.StarWarsCharacter deleteStarWarsCharacter(
		long starWarsCharacterId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteStarWarsCharacter(starWarsCharacterId);
	}

	/**
	* Deletes the star wars character from the database. Also notifies the appropriate model listeners.
	*
	* @param starWarsCharacter the star wars character
	* @return the star wars character that was removed
	* @throws PortalException
	*/
	public static com.liferay.star.wars.demo.model.StarWarsCharacter deleteStarWarsCharacter(
		com.liferay.star.wars.demo.model.StarWarsCharacter starWarsCharacter)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteStarWarsCharacter(starWarsCharacter);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.star.wars.demo.model.impl.StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.star.wars.demo.model.impl.StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacter fetchStarWarsCharacter(
		long starWarsCharacterId) {
		return getService().fetchStarWarsCharacter(starWarsCharacterId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the star wars character with the primary key.
	*
	* @param starWarsCharacterId the primary key of the star wars character
	* @return the star wars character
	* @throws PortalException if a star wars character with the primary key could not be found
	*/
	public static com.liferay.star.wars.demo.model.StarWarsCharacter getStarWarsCharacter(
		long starWarsCharacterId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getStarWarsCharacter(starWarsCharacterId);
	}

	/**
	* Returns a range of all the star wars characters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.star.wars.demo.model.impl.StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of star wars characters
	* @param end the upper bound of the range of star wars characters (not inclusive)
	* @return the range of star wars characters
	*/
	public static java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		int start, int end) {
		return getService().getStarWarsCharacters(start, end);
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
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.star.wars.demo.model.StarWarsCharacter> orderByComparator) {
		return getService()
				   .getStarWarsCharacters(groupId, name, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of star wars characters.
	*
	* @return the number of star wars characters
	*/
	public static int getStarWarsCharactersCount() {
		return getService().getStarWarsCharactersCount();
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacter updateStarWarsCharacter(
		long starWarsCharacterId, java.lang.String name,
		java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateStarWarsCharacter(starWarsCharacterId, name,
			description);
	}

	/**
	* Updates the star wars character in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param starWarsCharacter the star wars character
	* @return the star wars character that was updated
	*/
	public static com.liferay.star.wars.demo.model.StarWarsCharacter updateStarWarsCharacter(
		com.liferay.star.wars.demo.model.StarWarsCharacter starWarsCharacter) {
		return getService().updateStarWarsCharacter(starWarsCharacter);
	}

	public static StarWarsCharacterLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<StarWarsCharacterLocalService, StarWarsCharacterLocalService> _serviceTracker =
		ServiceTrackerFactory.open(StarWarsCharacterLocalService.class);
}