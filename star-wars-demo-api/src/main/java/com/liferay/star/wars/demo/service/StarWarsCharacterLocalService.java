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

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.star.wars.demo.model.StarWarsCharacter;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for StarWarsCharacter. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see StarWarsCharacterLocalServiceUtil
 * @see com.liferay.star.wars.demo.service.base.StarWarsCharacterLocalServiceBaseImpl
 * @see com.liferay.star.wars.demo.service.impl.StarWarsCharacterLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface StarWarsCharacterLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StarWarsCharacterLocalServiceUtil} to access the star wars character local service. Add custom service methods to {@link com.liferay.star.wars.demo.service.impl.StarWarsCharacterLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public StarWarsCharacter addStarWarsCharacter(long userId, long groupId,
		java.lang.String name, java.lang.String picture,
		java.lang.String fraction, java.lang.String description,
		ServiceContext serviceContext) throws PortalException;

	/**
	* Adds the star wars character to the database. Also notifies the appropriate model listeners.
	*
	* @param starWarsCharacter the star wars character
	* @return the star wars character that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public StarWarsCharacter addStarWarsCharacter(
		StarWarsCharacter starWarsCharacter);

	/**
	* Creates a new star wars character with the primary key. Does not add the star wars character to the database.
	*
	* @param starWarsCharacterId the primary key for the new star wars character
	* @return the new star wars character
	*/
	public StarWarsCharacter createStarWarsCharacter(long starWarsCharacterId);

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	* Deletes the star wars character with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param starWarsCharacterId the primary key of the star wars character
	* @return the star wars character that was removed
	* @throws PortalException if a star wars character with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public StarWarsCharacter deleteStarWarsCharacter(long starWarsCharacterId)
		throws PortalException;

	/**
	* Deletes the star wars character from the database. Also notifies the appropriate model listeners.
	*
	* @param starWarsCharacter the star wars character
	* @return the star wars character that was removed
	* @throws PortalException
	*/
	@Indexable(type = IndexableType.DELETE)
	public StarWarsCharacter deleteStarWarsCharacter(
		StarWarsCharacter starWarsCharacter) throws PortalException;

	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public StarWarsCharacter fetchStarWarsCharacter(long starWarsCharacterId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the star wars character with the primary key.
	*
	* @param starWarsCharacterId the primary key of the star wars character
	* @return the star wars character
	* @throws PortalException if a star wars character with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public StarWarsCharacter getStarWarsCharacter(long starWarsCharacterId)
		throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<StarWarsCharacter> getStarWarsCharacters(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<StarWarsCharacter> getStarWarsCharacters(long groupId,
		int start, int end) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<StarWarsCharacter> getStarWarsCharacters(long groupId,
		int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<StarWarsCharacter> getStarWarsCharacters(long groupId,
		java.lang.String name, int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator);

	/**
	* Returns the number of star wars characters.
	*
	* @return the number of star wars characters
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStarWarsCharactersCount();

	public StarWarsCharacter updateStarWarsCharacter(long starWarsCharacterId,
		java.lang.String name, java.lang.String description)
		throws PortalException;

	/**
	* Updates the star wars character in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param starWarsCharacter the star wars character
	* @return the star wars character that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public StarWarsCharacter updateStarWarsCharacter(
		StarWarsCharacter starWarsCharacter);
}