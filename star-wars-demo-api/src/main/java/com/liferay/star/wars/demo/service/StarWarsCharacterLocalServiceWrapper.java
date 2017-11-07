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
 * Provides a wrapper for {@link StarWarsCharacterLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StarWarsCharacterLocalService
 * @generated
 */
@ProviderType
public class StarWarsCharacterLocalServiceWrapper
	implements StarWarsCharacterLocalService,
		ServiceWrapper<StarWarsCharacterLocalService> {
	public StarWarsCharacterLocalServiceWrapper(
		StarWarsCharacterLocalService starWarsCharacterLocalService) {
		_starWarsCharacterLocalService = starWarsCharacterLocalService;
	}

	@Override
	public com.liferay.star.wars.demo.model.StarWarsCharacter addStarWarsCharacter(
		long userId, long groupId, java.lang.String name,
		java.lang.String picture, java.lang.String fraction,
		java.lang.String description,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterLocalService.addStarWarsCharacter(userId,
			groupId, name, picture, fraction, description, serviceContext);
	}

	/**
	* Adds the star wars character to the database. Also notifies the appropriate model listeners.
	*
	* @param starWarsCharacter the star wars character
	* @return the star wars character that was added
	*/
	@Override
	public com.liferay.star.wars.demo.model.StarWarsCharacter addStarWarsCharacter(
		com.liferay.star.wars.demo.model.StarWarsCharacter starWarsCharacter) {
		return _starWarsCharacterLocalService.addStarWarsCharacter(starWarsCharacter);
	}

	/**
	* Creates a new star wars character with the primary key. Does not add the star wars character to the database.
	*
	* @param starWarsCharacterId the primary key for the new star wars character
	* @return the new star wars character
	*/
	@Override
	public com.liferay.star.wars.demo.model.StarWarsCharacter createStarWarsCharacter(
		long starWarsCharacterId) {
		return _starWarsCharacterLocalService.createStarWarsCharacter(starWarsCharacterId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the star wars character with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param starWarsCharacterId the primary key of the star wars character
	* @return the star wars character that was removed
	* @throws PortalException if a star wars character with the primary key could not be found
	*/
	@Override
	public com.liferay.star.wars.demo.model.StarWarsCharacter deleteStarWarsCharacter(
		long starWarsCharacterId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterLocalService.deleteStarWarsCharacter(starWarsCharacterId);
	}

	/**
	* Deletes the star wars character from the database. Also notifies the appropriate model listeners.
	*
	* @param starWarsCharacter the star wars character
	* @return the star wars character that was removed
	* @throws PortalException
	*/
	@Override
	public com.liferay.star.wars.demo.model.StarWarsCharacter deleteStarWarsCharacter(
		com.liferay.star.wars.demo.model.StarWarsCharacter starWarsCharacter)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterLocalService.deleteStarWarsCharacter(starWarsCharacter);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _starWarsCharacterLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _starWarsCharacterLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _starWarsCharacterLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _starWarsCharacterLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _starWarsCharacterLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _starWarsCharacterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.star.wars.demo.model.StarWarsCharacter fetchStarWarsCharacter(
		long starWarsCharacterId) {
		return _starWarsCharacterLocalService.fetchStarWarsCharacter(starWarsCharacterId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _starWarsCharacterLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _starWarsCharacterLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _starWarsCharacterLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the star wars character with the primary key.
	*
	* @param starWarsCharacterId the primary key of the star wars character
	* @return the star wars character
	* @throws PortalException if a star wars character with the primary key could not be found
	*/
	@Override
	public com.liferay.star.wars.demo.model.StarWarsCharacter getStarWarsCharacter(
		long starWarsCharacterId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterLocalService.getStarWarsCharacter(starWarsCharacterId);
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
	@Override
	public java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		int start, int end) {
		return _starWarsCharacterLocalService.getStarWarsCharacters(start, end);
	}

	@Override
	public java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterLocalService.getStarWarsCharacters(groupId,
			start, end);
	}

	@Override
	public java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.star.wars.demo.model.StarWarsCharacter> orderByComparator)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterLocalService.getStarWarsCharacters(groupId,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		long groupId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.star.wars.demo.model.StarWarsCharacter> orderByComparator) {
		return _starWarsCharacterLocalService.getStarWarsCharacters(groupId,
			name, start, end, orderByComparator);
	}

	/**
	* Returns the number of star wars characters.
	*
	* @return the number of star wars characters
	*/
	@Override
	public int getStarWarsCharactersCount() {
		return _starWarsCharacterLocalService.getStarWarsCharactersCount();
	}

	@Override
	public com.liferay.star.wars.demo.model.StarWarsCharacter updateStarWarsCharacter(
		long starWarsCharacterId, java.lang.String name,
		java.lang.String picture, java.lang.String fraction,
		java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _starWarsCharacterLocalService.updateStarWarsCharacter(starWarsCharacterId,
			name, picture, fraction, description);
	}

	/**
	* Updates the star wars character in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param starWarsCharacter the star wars character
	* @return the star wars character that was updated
	*/
	@Override
	public com.liferay.star.wars.demo.model.StarWarsCharacter updateStarWarsCharacter(
		com.liferay.star.wars.demo.model.StarWarsCharacter starWarsCharacter) {
		return _starWarsCharacterLocalService.updateStarWarsCharacter(starWarsCharacter);
	}

	@Override
	public StarWarsCharacterLocalService getWrappedService() {
		return _starWarsCharacterLocalService;
	}

	@Override
	public void setWrappedService(
		StarWarsCharacterLocalService starWarsCharacterLocalService) {
		_starWarsCharacterLocalService = starWarsCharacterLocalService;
	}

	private StarWarsCharacterLocalService _starWarsCharacterLocalService;
}