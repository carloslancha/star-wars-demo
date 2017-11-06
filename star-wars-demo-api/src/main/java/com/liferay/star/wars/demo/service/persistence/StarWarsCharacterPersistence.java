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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.liferay.star.wars.demo.exception.NoSuchCharacterException;
import com.liferay.star.wars.demo.model.StarWarsCharacter;

/**
 * The persistence interface for the star wars character service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.star.wars.demo.service.persistence.impl.StarWarsCharacterPersistenceImpl
 * @see StarWarsCharacterUtil
 * @generated
 */
@ProviderType
public interface StarWarsCharacterPersistence extends BasePersistence<StarWarsCharacter> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StarWarsCharacterUtil} to access the star wars character persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the star wars characters where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching star wars characters
	*/
	public java.util.List<StarWarsCharacter> findByGroupId(long groupId);

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
	public java.util.List<StarWarsCharacter> findByGroupId(long groupId,
		int start, int end);

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
	public java.util.List<StarWarsCharacter> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator);

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
	public java.util.List<StarWarsCharacter> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first star wars character in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching star wars character
	* @throws NoSuchCharacterException if a matching star wars character could not be found
	*/
	public StarWarsCharacter findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator)
		throws NoSuchCharacterException;

	/**
	* Returns the first star wars character in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching star wars character, or <code>null</code> if a matching star wars character could not be found
	*/
	public StarWarsCharacter fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator);

	/**
	* Returns the last star wars character in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching star wars character
	* @throws NoSuchCharacterException if a matching star wars character could not be found
	*/
	public StarWarsCharacter findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator)
		throws NoSuchCharacterException;

	/**
	* Returns the last star wars character in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching star wars character, or <code>null</code> if a matching star wars character could not be found
	*/
	public StarWarsCharacter fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator);

	/**
	* Returns the star wars characters before and after the current star wars character in the ordered set where groupId = &#63;.
	*
	* @param starWarsCharacterId the primary key of the current star wars character
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next star wars character
	* @throws NoSuchCharacterException if a star wars character with the primary key could not be found
	*/
	public StarWarsCharacter[] findByGroupId_PrevAndNext(
		long starWarsCharacterId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator)
		throws NoSuchCharacterException;

	/**
	* Returns all the star wars characters that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching star wars characters that the user has permission to view
	*/
	public java.util.List<StarWarsCharacter> filterFindByGroupId(long groupId);

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
	public java.util.List<StarWarsCharacter> filterFindByGroupId(long groupId,
		int start, int end);

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
	public java.util.List<StarWarsCharacter> filterFindByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator);

	/**
	* Returns the star wars characters before and after the current star wars character in the ordered set of star wars characters that the user has permission to view where groupId = &#63;.
	*
	* @param starWarsCharacterId the primary key of the current star wars character
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next star wars character
	* @throws NoSuchCharacterException if a star wars character with the primary key could not be found
	*/
	public StarWarsCharacter[] filterFindByGroupId_PrevAndNext(
		long starWarsCharacterId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator)
		throws NoSuchCharacterException;

	/**
	* Removes all the star wars characters where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of star wars characters where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching star wars characters
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns the number of star wars characters that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching star wars characters that the user has permission to view
	*/
	public int filterCountByGroupId(long groupId);

	/**
	* Returns the star wars character where groupId = &#63; and name = &#63; or throws a {@link NoSuchCharacterException} if it could not be found.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching star wars character
	* @throws NoSuchCharacterException if a matching star wars character could not be found
	*/
	public StarWarsCharacter findByG_N(long groupId, java.lang.String name)
		throws NoSuchCharacterException;

	/**
	* Returns the star wars character where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching star wars character, or <code>null</code> if a matching star wars character could not be found
	*/
	public StarWarsCharacter fetchByG_N(long groupId, java.lang.String name);

	/**
	* Returns the star wars character where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param name the name
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching star wars character, or <code>null</code> if a matching star wars character could not be found
	*/
	public StarWarsCharacter fetchByG_N(long groupId, java.lang.String name,
		boolean retrieveFromCache);

	/**
	* Removes the star wars character where groupId = &#63; and name = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the star wars character that was removed
	*/
	public StarWarsCharacter removeByG_N(long groupId, java.lang.String name)
		throws NoSuchCharacterException;

	/**
	* Returns the number of star wars characters where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching star wars characters
	*/
	public int countByG_N(long groupId, java.lang.String name);

	/**
	* Returns all the star wars characters where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching star wars characters
	*/
	public java.util.List<StarWarsCharacter> findByG_LikeN(long groupId,
		java.lang.String name);

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
	public java.util.List<StarWarsCharacter> findByG_LikeN(long groupId,
		java.lang.String name, int start, int end);

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
	public java.util.List<StarWarsCharacter> findByG_LikeN(long groupId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator);

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
	public java.util.List<StarWarsCharacter> findByG_LikeN(long groupId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first star wars character in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching star wars character
	* @throws NoSuchCharacterException if a matching star wars character could not be found
	*/
	public StarWarsCharacter findByG_LikeN_First(long groupId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator)
		throws NoSuchCharacterException;

	/**
	* Returns the first star wars character in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching star wars character, or <code>null</code> if a matching star wars character could not be found
	*/
	public StarWarsCharacter fetchByG_LikeN_First(long groupId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator);

	/**
	* Returns the last star wars character in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching star wars character
	* @throws NoSuchCharacterException if a matching star wars character could not be found
	*/
	public StarWarsCharacter findByG_LikeN_Last(long groupId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator)
		throws NoSuchCharacterException;

	/**
	* Returns the last star wars character in the ordered set where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching star wars character, or <code>null</code> if a matching star wars character could not be found
	*/
	public StarWarsCharacter fetchByG_LikeN_Last(long groupId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator);

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
	public StarWarsCharacter[] findByG_LikeN_PrevAndNext(
		long starWarsCharacterId, long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator)
		throws NoSuchCharacterException;

	/**
	* Returns all the star wars characters that the user has permission to view where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching star wars characters that the user has permission to view
	*/
	public java.util.List<StarWarsCharacter> filterFindByG_LikeN(long groupId,
		java.lang.String name);

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
	public java.util.List<StarWarsCharacter> filterFindByG_LikeN(long groupId,
		java.lang.String name, int start, int end);

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
	public java.util.List<StarWarsCharacter> filterFindByG_LikeN(long groupId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator);

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
	public StarWarsCharacter[] filterFindByG_LikeN_PrevAndNext(
		long starWarsCharacterId, long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator)
		throws NoSuchCharacterException;

	/**
	* Removes all the star wars characters where groupId = &#63; and name LIKE &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	*/
	public void removeByG_LikeN(long groupId, java.lang.String name);

	/**
	* Returns the number of star wars characters where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching star wars characters
	*/
	public int countByG_LikeN(long groupId, java.lang.String name);

	/**
	* Returns the number of star wars characters that the user has permission to view where groupId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching star wars characters that the user has permission to view
	*/
	public int filterCountByG_LikeN(long groupId, java.lang.String name);

	/**
	* Caches the star wars character in the entity cache if it is enabled.
	*
	* @param starWarsCharacter the star wars character
	*/
	public void cacheResult(StarWarsCharacter starWarsCharacter);

	/**
	* Caches the star wars characters in the entity cache if it is enabled.
	*
	* @param starWarsCharacters the star wars characters
	*/
	public void cacheResult(
		java.util.List<StarWarsCharacter> starWarsCharacters);

	/**
	* Creates a new star wars character with the primary key. Does not add the star wars character to the database.
	*
	* @param starWarsCharacterId the primary key for the new star wars character
	* @return the new star wars character
	*/
	public StarWarsCharacter create(long starWarsCharacterId);

	/**
	* Removes the star wars character with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param starWarsCharacterId the primary key of the star wars character
	* @return the star wars character that was removed
	* @throws NoSuchCharacterException if a star wars character with the primary key could not be found
	*/
	public StarWarsCharacter remove(long starWarsCharacterId)
		throws NoSuchCharacterException;

	public StarWarsCharacter updateImpl(StarWarsCharacter starWarsCharacter);

	/**
	* Returns the star wars character with the primary key or throws a {@link NoSuchCharacterException} if it could not be found.
	*
	* @param starWarsCharacterId the primary key of the star wars character
	* @return the star wars character
	* @throws NoSuchCharacterException if a star wars character with the primary key could not be found
	*/
	public StarWarsCharacter findByPrimaryKey(long starWarsCharacterId)
		throws NoSuchCharacterException;

	/**
	* Returns the star wars character with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param starWarsCharacterId the primary key of the star wars character
	* @return the star wars character, or <code>null</code> if a star wars character with the primary key could not be found
	*/
	public StarWarsCharacter fetchByPrimaryKey(long starWarsCharacterId);

	@Override
	public java.util.Map<java.io.Serializable, StarWarsCharacter> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the star wars characters.
	*
	* @return the star wars characters
	*/
	public java.util.List<StarWarsCharacter> findAll();

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
	public java.util.List<StarWarsCharacter> findAll(int start, int end);

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
	public java.util.List<StarWarsCharacter> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator);

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
	public java.util.List<StarWarsCharacter> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StarWarsCharacter> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the star wars characters from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of star wars characters.
	*
	* @return the number of star wars characters
	*/
	public int countAll();
}