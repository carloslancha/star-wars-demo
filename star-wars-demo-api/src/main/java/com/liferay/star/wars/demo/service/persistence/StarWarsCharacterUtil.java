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

package com.liferay.star.wars.demo.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.star.wars.demo.model.StarWarsCharacter;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the star wars character service. This utility wraps {@link com.liferay.star.wars.demo.service.persistence.impl.StarWarsCharacterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StarWarsCharacterPersistence
 * @see com.liferay.star.wars.demo.service.persistence.impl.StarWarsCharacterPersistenceImpl
 * @generated
 */
@ProviderType
public class StarWarsCharacterUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(StarWarsCharacter starWarsCharacter) {
		getPersistence().clearCache(starWarsCharacter);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<StarWarsCharacter> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StarWarsCharacter> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StarWarsCharacter> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static StarWarsCharacter update(StarWarsCharacter starWarsCharacter) {
		return getPersistence().update(starWarsCharacter);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static StarWarsCharacter update(
		StarWarsCharacter starWarsCharacter, ServiceContext serviceContext) {
		return getPersistence().update(starWarsCharacter, serviceContext);
	}

	/**
	* Returns all the star wars characters where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching star wars characters
	*/
	public static List<StarWarsCharacter> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the star wars characters where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of star wars characters
	* @param end the upper bound of the range of star wars characters (not inclusive)
	* @return the range of matching star wars characters
	*/
	public static List<StarWarsCharacter> findByGroupId(long groupId,
		int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the star wars characters where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of star wars characters
	* @param end the upper bound of the range of star wars characters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching star wars characters
	*/
	public static List<StarWarsCharacter> findByGroupId(long groupId,
		int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the star wars characters where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of star wars characters
	* @param end the upper bound of the range of star wars characters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching star wars characters
	*/
	public static List<StarWarsCharacter> findByGroupId(long groupId,
		int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first star wars character in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching star wars character
	* @throws NoSuchCharacterException if a matching star wars character could not be found
	*/
	public static StarWarsCharacter findByGroupId_First(long groupId,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws com.liferay.star.wars.demo.exception.NoSuchCharacterException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first star wars character in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching star wars character, or <code>null</code> if a matching star wars character could not be found
	*/
	public static StarWarsCharacter fetchByGroupId_First(long groupId,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last star wars character in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching star wars character
	* @throws NoSuchCharacterException if a matching star wars character could not be found
	*/
	public static StarWarsCharacter findByGroupId_Last(long groupId,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws com.liferay.star.wars.demo.exception.NoSuchCharacterException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last star wars character in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching star wars character, or <code>null</code> if a matching star wars character could not be found
	*/
	public static StarWarsCharacter fetchByGroupId_Last(long groupId,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the star wars characters before and after the current star wars character in the ordered set where groupId = &#63;.
	*
	* @param starWarsCharacterId the primary key of the current star wars character
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next star wars character
	* @throws NoSuchCharacterException if a star wars character with the primary key could not be found
	*/
	public static StarWarsCharacter[] findByGroupId_PrevAndNext(
		long starWarsCharacterId, long groupId,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws com.liferay.star.wars.demo.exception.NoSuchCharacterException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(starWarsCharacterId, groupId,
			orderByComparator);
	}

	/**
	* Returns all the star wars characters that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching star wars characters that the user has permission to view
	*/
	public static List<StarWarsCharacter> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	* Returns a range of all the star wars characters that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of star wars characters
	* @param end the upper bound of the range of star wars characters (not inclusive)
	* @return the range of matching star wars characters that the user has permission to view
	*/
	public static List<StarWarsCharacter> filterFindByGroupId(long groupId,
		int start, int end) {
		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the star wars characters that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of star wars characters
	* @param end the upper bound of the range of star wars characters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching star wars characters that the user has permission to view
	*/
	public static List<StarWarsCharacter> filterFindByGroupId(long groupId,
		int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		return getPersistence()
				   .filterFindByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the star wars characters before and after the current star wars character in the ordered set of star wars characters that the user has permission to view where groupId = &#63;.
	*
	* @param starWarsCharacterId the primary key of the current star wars character
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next star wars character
	* @throws NoSuchCharacterException if a star wars character with the primary key could not be found
	*/
	public static StarWarsCharacter[] filterFindByGroupId_PrevAndNext(
		long starWarsCharacterId, long groupId,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws com.liferay.star.wars.demo.exception.NoSuchCharacterException {
		return getPersistence()
				   .filterFindByGroupId_PrevAndNext(starWarsCharacterId,
			groupId, orderByComparator);
	}

	/**
	* Removes all the star wars characters where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of star wars characters where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching star wars characters
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns the number of star wars characters that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching star wars characters that the user has permission to view
	*/
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	* Returns the star wars character where groupId = &#63; and name = &#63; or throws a {@link NoSuchCharacterException} if it could not be found.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching star wars character
	* @throws NoSuchCharacterException if a matching star wars character could not be found
	*/
	public static StarWarsCharacter findByG_N(long groupId,
		java.lang.String name)
		throws com.liferay.star.wars.demo.exception.NoSuchCharacterException {
		return getPersistence().findByG_N(groupId, name);
	}

	/**
	* Returns the star wars character where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching star wars character, or <code>null</code> if a matching star wars character could not be found
	*/
	public static StarWarsCharacter fetchByG_N(long groupId,
		java.lang.String name) {
		return getPersistence().fetchByG_N(groupId, name);
	}

	/**
	* Returns the star wars character where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param name the name
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching star wars character, or <code>null</code> if a matching star wars character could not be found
	*/
	public static StarWarsCharacter fetchByG_N(long groupId,
		java.lang.String name, boolean retrieveFromCache) {
		return getPersistence().fetchByG_N(groupId, name, retrieveFromCache);
	}

	/**
	* Removes the star wars character where groupId = &#63; and name = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the star wars character that was removed
	*/
	public static StarWarsCharacter removeByG_N(long groupId,
		java.lang.String name)
		throws com.liferay.star.wars.demo.exception.NoSuchCharacterException {
		return getPersistence().removeByG_N(groupId, name);
	}

	/**
	* Returns the number of star wars characters where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching star wars characters
	*/
	public static int countByG_N(long groupId, java.lang.String name) {
		return getPersistence().countByG_N(groupId, name);
	}

	/**
	* Returns all the star wars characters where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching star wars characters
	*/
	public static List<StarWarsCharacter> findByG_LikeN(long groupId,
		java.lang.String name) {
		return getPersistence().findByG_LikeN(groupId, name);
	}

	/**
	* Returns a range of all the star wars characters where groupId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of star wars characters
	* @param end the upper bound of the range of star wars characters (not inclusive)
	* @return the range of matching star wars characters
	*/
	public static List<StarWarsCharacter> findByG_LikeN(long groupId,
		java.lang.String name, int start, int end) {
		return getPersistence().findByG_LikeN(groupId, name, start, end);
	}

	/**
	* Returns an ordered range of all the star wars characters where groupId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of star wars characters
	* @param end the upper bound of the range of star wars characters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching star wars characters
	*/
	public static List<StarWarsCharacter> findByG_LikeN(long groupId,
		java.lang.String name, int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		return getPersistence()
				   .findByG_LikeN(groupId, name, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the star wars characters where groupId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of star wars characters
	* @param end the upper bound of the range of star wars characters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching star wars characters
	*/
	public static List<StarWarsCharacter> findByG_LikeN(long groupId,
		java.lang.String name, int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_LikeN(groupId, name, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first star wars character in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching star wars character
	* @throws NoSuchCharacterException if a matching star wars character could not be found
	*/
	public static StarWarsCharacter findByG_LikeN_First(long groupId,
		java.lang.String name,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws com.liferay.star.wars.demo.exception.NoSuchCharacterException {
		return getPersistence()
				   .findByG_LikeN_First(groupId, name, orderByComparator);
	}

	/**
	* Returns the first star wars character in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching star wars character, or <code>null</code> if a matching star wars character could not be found
	*/
	public static StarWarsCharacter fetchByG_LikeN_First(long groupId,
		java.lang.String name,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		return getPersistence()
				   .fetchByG_LikeN_First(groupId, name, orderByComparator);
	}

	/**
	* Returns the last star wars character in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching star wars character
	* @throws NoSuchCharacterException if a matching star wars character could not be found
	*/
	public static StarWarsCharacter findByG_LikeN_Last(long groupId,
		java.lang.String name,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws com.liferay.star.wars.demo.exception.NoSuchCharacterException {
		return getPersistence()
				   .findByG_LikeN_Last(groupId, name, orderByComparator);
	}

	/**
	* Returns the last star wars character in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching star wars character, or <code>null</code> if a matching star wars character could not be found
	*/
	public static StarWarsCharacter fetchByG_LikeN_Last(long groupId,
		java.lang.String name,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		return getPersistence()
				   .fetchByG_LikeN_Last(groupId, name, orderByComparator);
	}

	/**
	* Returns the star wars characters before and after the current star wars character in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param starWarsCharacterId the primary key of the current star wars character
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next star wars character
	* @throws NoSuchCharacterException if a star wars character with the primary key could not be found
	*/
	public static StarWarsCharacter[] findByG_LikeN_PrevAndNext(
		long starWarsCharacterId, long groupId, java.lang.String name,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws com.liferay.star.wars.demo.exception.NoSuchCharacterException {
		return getPersistence()
				   .findByG_LikeN_PrevAndNext(starWarsCharacterId, groupId,
			name, orderByComparator);
	}

	/**
	* Returns all the star wars characters that the user has permission to view where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching star wars characters that the user has permission to view
	*/
	public static List<StarWarsCharacter> filterFindByG_LikeN(long groupId,
		java.lang.String name) {
		return getPersistence().filterFindByG_LikeN(groupId, name);
	}

	/**
	* Returns a range of all the star wars characters that the user has permission to view where groupId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of star wars characters
	* @param end the upper bound of the range of star wars characters (not inclusive)
	* @return the range of matching star wars characters that the user has permission to view
	*/
	public static List<StarWarsCharacter> filterFindByG_LikeN(long groupId,
		java.lang.String name, int start, int end) {
		return getPersistence().filterFindByG_LikeN(groupId, name, start, end);
	}

	/**
	* Returns an ordered range of all the star wars characters that the user has permissions to view where groupId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of star wars characters
	* @param end the upper bound of the range of star wars characters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching star wars characters that the user has permission to view
	*/
	public static List<StarWarsCharacter> filterFindByG_LikeN(long groupId,
		java.lang.String name, int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		return getPersistence()
				   .filterFindByG_LikeN(groupId, name, start, end,
			orderByComparator);
	}

	/**
	* Returns the star wars characters before and after the current star wars character in the ordered set of star wars characters that the user has permission to view where groupId = &#63; and name LIKE &#63;.
	*
	* @param starWarsCharacterId the primary key of the current star wars character
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next star wars character
	* @throws NoSuchCharacterException if a star wars character with the primary key could not be found
	*/
	public static StarWarsCharacter[] filterFindByG_LikeN_PrevAndNext(
		long starWarsCharacterId, long groupId, java.lang.String name,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws com.liferay.star.wars.demo.exception.NoSuchCharacterException {
		return getPersistence()
				   .filterFindByG_LikeN_PrevAndNext(starWarsCharacterId,
			groupId, name, orderByComparator);
	}

	/**
	* Removes all the star wars characters where groupId = &#63; and name LIKE &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	*/
	public static void removeByG_LikeN(long groupId, java.lang.String name) {
		getPersistence().removeByG_LikeN(groupId, name);
	}

	/**
	* Returns the number of star wars characters where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching star wars characters
	*/
	public static int countByG_LikeN(long groupId, java.lang.String name) {
		return getPersistence().countByG_LikeN(groupId, name);
	}

	/**
	* Returns the number of star wars characters that the user has permission to view where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching star wars characters that the user has permission to view
	*/
	public static int filterCountByG_LikeN(long groupId, java.lang.String name) {
		return getPersistence().filterCountByG_LikeN(groupId, name);
	}

	/**
	* Caches the star wars character in the entity cache if it is enabled.
	*
	* @param starWarsCharacter the star wars character
	*/
	public static void cacheResult(StarWarsCharacter starWarsCharacter) {
		getPersistence().cacheResult(starWarsCharacter);
	}

	/**
	* Caches the star wars characters in the entity cache if it is enabled.
	*
	* @param starWarsCharacters the star wars characters
	*/
	public static void cacheResult(List<StarWarsCharacter> starWarsCharacters) {
		getPersistence().cacheResult(starWarsCharacters);
	}

	/**
	* Creates a new star wars character with the primary key. Does not add the star wars character to the database.
	*
	* @param starWarsCharacterId the primary key for the new star wars character
	* @return the new star wars character
	*/
	public static StarWarsCharacter create(long starWarsCharacterId) {
		return getPersistence().create(starWarsCharacterId);
	}

	/**
	* Removes the star wars character with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param starWarsCharacterId the primary key of the star wars character
	* @return the star wars character that was removed
	* @throws NoSuchCharacterException if a star wars character with the primary key could not be found
	*/
	public static StarWarsCharacter remove(long starWarsCharacterId)
		throws com.liferay.star.wars.demo.exception.NoSuchCharacterException {
		return getPersistence().remove(starWarsCharacterId);
	}

	public static StarWarsCharacter updateImpl(
		StarWarsCharacter starWarsCharacter) {
		return getPersistence().updateImpl(starWarsCharacter);
	}

	/**
	* Returns the star wars character with the primary key or throws a {@link NoSuchCharacterException} if it could not be found.
	*
	* @param starWarsCharacterId the primary key of the star wars character
	* @return the star wars character
	* @throws NoSuchCharacterException if a star wars character with the primary key could not be found
	*/
	public static StarWarsCharacter findByPrimaryKey(long starWarsCharacterId)
		throws com.liferay.star.wars.demo.exception.NoSuchCharacterException {
		return getPersistence().findByPrimaryKey(starWarsCharacterId);
	}

	/**
	* Returns the star wars character with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param starWarsCharacterId the primary key of the star wars character
	* @return the star wars character, or <code>null</code> if a star wars character with the primary key could not be found
	*/
	public static StarWarsCharacter fetchByPrimaryKey(long starWarsCharacterId) {
		return getPersistence().fetchByPrimaryKey(starWarsCharacterId);
	}

	public static java.util.Map<java.io.Serializable, StarWarsCharacter> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the star wars characters.
	*
	* @return the star wars characters
	*/
	public static List<StarWarsCharacter> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the star wars characters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of star wars characters
	* @param end the upper bound of the range of star wars characters (not inclusive)
	* @return the range of star wars characters
	*/
	public static List<StarWarsCharacter> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the star wars characters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of star wars characters
	* @param end the upper bound of the range of star wars characters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of star wars characters
	*/
	public static List<StarWarsCharacter> findAll(int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the star wars characters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StarWarsCharacterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of star wars characters
	* @param end the upper bound of the range of star wars characters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of star wars characters
	*/
	public static List<StarWarsCharacter> findAll(int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the star wars characters from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of star wars characters.
	*
	* @return the number of star wars characters
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static StarWarsCharacterPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<StarWarsCharacterPersistence, StarWarsCharacterPersistence> _serviceTracker =
		ServiceTrackerFactory.open(StarWarsCharacterPersistence.class);
}