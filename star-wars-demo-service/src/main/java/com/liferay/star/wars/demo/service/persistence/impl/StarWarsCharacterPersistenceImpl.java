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

package com.liferay.star.wars.demo.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.petra.string.CharPool;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.liferay.star.wars.demo.exception.NoSuchCharacterException;
import com.liferay.star.wars.demo.model.StarWarsCharacter;
import com.liferay.star.wars.demo.model.impl.StarWarsCharacterImpl;
import com.liferay.star.wars.demo.model.impl.StarWarsCharacterModelImpl;
import com.liferay.star.wars.demo.service.persistence.StarWarsCharacterPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the star wars character service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StarWarsCharacterPersistence
 * @see com.liferay.star.wars.demo.service.persistence.StarWarsCharacterUtil
 * @generated
 */
@ProviderType
public class StarWarsCharacterPersistenceImpl extends BasePersistenceImpl<StarWarsCharacter>
	implements StarWarsCharacterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StarWarsCharacterUtil} to access the star wars character persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StarWarsCharacterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
			StarWarsCharacterModelImpl.FINDER_CACHE_ENABLED,
			StarWarsCharacterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
			StarWarsCharacterModelImpl.FINDER_CACHE_ENABLED,
			StarWarsCharacterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
			StarWarsCharacterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
			StarWarsCharacterModelImpl.FINDER_CACHE_ENABLED,
			StarWarsCharacterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
			StarWarsCharacterModelImpl.FINDER_CACHE_ENABLED,
			StarWarsCharacterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			StarWarsCharacterModelImpl.GROUPID_COLUMN_BITMASK |
			StarWarsCharacterModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
			StarWarsCharacterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the star wars characters where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching star wars characters
	 */
	@Override
	public List<StarWarsCharacter> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StarWarsCharacter> findByGroupId(long groupId, int start,
		int end) {
		return findByGroupId(groupId, start, end, null);
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
	@Override
	public List<StarWarsCharacter> findByGroupId(long groupId, int start,
		int end, OrderByComparator<StarWarsCharacter> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
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
	@Override
	public List<StarWarsCharacter> findByGroupId(long groupId, int start,
		int end, OrderByComparator<StarWarsCharacter> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<StarWarsCharacter> list = null;

		if (retrieveFromCache) {
			list = (List<StarWarsCharacter>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (StarWarsCharacter starWarsCharacter : list) {
					if ((groupId != starWarsCharacter.getGroupId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_STARWARSCHARACTER_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(StarWarsCharacterModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<StarWarsCharacter>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<StarWarsCharacter>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first star wars character in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching star wars character
	 * @throws NoSuchCharacterException if a matching star wars character could not be found
	 */
	@Override
	public StarWarsCharacter findByGroupId_First(long groupId,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws NoSuchCharacterException {
		StarWarsCharacter starWarsCharacter = fetchByGroupId_First(groupId,
				orderByComparator);

		if (starWarsCharacter != null) {
			return starWarsCharacter;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCharacterException(msg.toString());
	}

	/**
	 * Returns the first star wars character in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching star wars character, or <code>null</code> if a matching star wars character could not be found
	 */
	@Override
	public StarWarsCharacter fetchByGroupId_First(long groupId,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		List<StarWarsCharacter> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last star wars character in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching star wars character
	 * @throws NoSuchCharacterException if a matching star wars character could not be found
	 */
	@Override
	public StarWarsCharacter findByGroupId_Last(long groupId,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws NoSuchCharacterException {
		StarWarsCharacter starWarsCharacter = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (starWarsCharacter != null) {
			return starWarsCharacter;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCharacterException(msg.toString());
	}

	/**
	 * Returns the last star wars character in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching star wars character, or <code>null</code> if a matching star wars character could not be found
	 */
	@Override
	public StarWarsCharacter fetchByGroupId_Last(long groupId,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<StarWarsCharacter> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public StarWarsCharacter[] findByGroupId_PrevAndNext(
		long starWarsCharacterId, long groupId,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws NoSuchCharacterException {
		StarWarsCharacter starWarsCharacter = findByPrimaryKey(starWarsCharacterId);

		Session session = null;

		try {
			session = openSession();

			StarWarsCharacter[] array = new StarWarsCharacterImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, starWarsCharacter,
					groupId, orderByComparator, true);

			array[1] = starWarsCharacter;

			array[2] = getByGroupId_PrevAndNext(session, starWarsCharacter,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected StarWarsCharacter getByGroupId_PrevAndNext(Session session,
		StarWarsCharacter starWarsCharacter, long groupId,
		OrderByComparator<StarWarsCharacter> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_STARWARSCHARACTER_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(StarWarsCharacterModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(starWarsCharacter);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<StarWarsCharacter> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the star wars characters where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (StarWarsCharacter starWarsCharacter : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(starWarsCharacter);
		}
	}

	/**
	 * Returns the number of star wars characters where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching star wars characters
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_STARWARSCHARACTER_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "starWarsCharacter.groupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_N = new FinderPath(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
			StarWarsCharacterModelImpl.FINDER_CACHE_ENABLED,
			StarWarsCharacterImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByG_N",
			new String[] { Long.class.getName(), String.class.getName() },
			StarWarsCharacterModelImpl.GROUPID_COLUMN_BITMASK |
			StarWarsCharacterModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_N = new FinderPath(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
			StarWarsCharacterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_N",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the star wars character where groupId = &#63; and name = &#63; or throws a {@link NoSuchCharacterException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the matching star wars character
	 * @throws NoSuchCharacterException if a matching star wars character could not be found
	 */
	@Override
	public StarWarsCharacter findByG_N(long groupId, String name)
		throws NoSuchCharacterException {
		StarWarsCharacter starWarsCharacter = fetchByG_N(groupId, name);

		if (starWarsCharacter == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", name=");
			msg.append(name);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchCharacterException(msg.toString());
		}

		return starWarsCharacter;
	}

	/**
	 * Returns the star wars character where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the matching star wars character, or <code>null</code> if a matching star wars character could not be found
	 */
	@Override
	public StarWarsCharacter fetchByG_N(long groupId, String name) {
		return fetchByG_N(groupId, name, true);
	}

	/**
	 * Returns the star wars character where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching star wars character, or <code>null</code> if a matching star wars character could not be found
	 */
	@Override
	public StarWarsCharacter fetchByG_N(long groupId, String name,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, name };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_G_N,
					finderArgs, this);
		}

		if (result instanceof StarWarsCharacter) {
			StarWarsCharacter starWarsCharacter = (StarWarsCharacter)result;

			if ((groupId != starWarsCharacter.getGroupId()) ||
					!Objects.equals(name, starWarsCharacter.getName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_STARWARSCHARACTER_WHERE);

			query.append(_FINDER_COLUMN_G_N_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_N_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_N_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_N_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
				}

				List<StarWarsCharacter> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_G_N, finderArgs,
						list);
				}
				else {
					StarWarsCharacter starWarsCharacter = list.get(0);

					result = starWarsCharacter;

					cacheResult(starWarsCharacter);

					if ((starWarsCharacter.getGroupId() != groupId) ||
							(starWarsCharacter.getName() == null) ||
							!starWarsCharacter.getName().equals(name)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_G_N,
							finderArgs, starWarsCharacter);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_G_N, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (StarWarsCharacter)result;
		}
	}

	/**
	 * Removes the star wars character where groupId = &#63; and name = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the star wars character that was removed
	 */
	@Override
	public StarWarsCharacter removeByG_N(long groupId, String name)
		throws NoSuchCharacterException {
		StarWarsCharacter starWarsCharacter = findByG_N(groupId, name);

		return remove(starWarsCharacter);
	}

	/**
	 * Returns the number of star wars characters where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the number of matching star wars characters
	 */
	@Override
	public int countByG_N(long groupId, String name) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_N;

		Object[] finderArgs = new Object[] { groupId, name };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_STARWARSCHARACTER_WHERE);

			query.append(_FINDER_COLUMN_G_N_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_N_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_N_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_N_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_G_N_GROUPID_2 = "starWarsCharacter.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_N_NAME_1 = "starWarsCharacter.name IS NULL";
	private static final String _FINDER_COLUMN_G_N_NAME_2 = "starWarsCharacter.name = ?";
	private static final String _FINDER_COLUMN_G_N_NAME_3 = "(starWarsCharacter.name IS NULL OR starWarsCharacter.name = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_LIKEN = new FinderPath(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
			StarWarsCharacterModelImpl.FINDER_CACHE_ENABLED,
			StarWarsCharacterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_LikeN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_LIKEN = new FinderPath(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
			StarWarsCharacterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByG_LikeN",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the star wars characters where groupId = &#63; and name LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the matching star wars characters
	 */
	@Override
	public List<StarWarsCharacter> findByG_LikeN(long groupId, String name) {
		return findByG_LikeN(groupId, name, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<StarWarsCharacter> findByG_LikeN(long groupId, String name,
		int start, int end) {
		return findByG_LikeN(groupId, name, start, end, null);
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
	@Override
	public List<StarWarsCharacter> findByG_LikeN(long groupId, String name,
		int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		return findByG_LikeN(groupId, name, start, end, orderByComparator, true);
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
	@Override
	public List<StarWarsCharacter> findByG_LikeN(long groupId, String name,
		int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_LIKEN;
		finderArgs = new Object[] { groupId, name, start, end, orderByComparator };

		List<StarWarsCharacter> list = null;

		if (retrieveFromCache) {
			list = (List<StarWarsCharacter>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (StarWarsCharacter starWarsCharacter : list) {
					if ((groupId != starWarsCharacter.getGroupId()) ||
							!StringUtil.wildcardMatches(
								starWarsCharacter.getName(), name,
								CharPool.UNDERLINE, CharPool.PERCENT,
								CharPool.BACK_SLASH, false)) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_STARWARSCHARACTER_WHERE);

			query.append(_FINDER_COLUMN_G_LIKEN_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_LIKEN_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_LIKEN_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_LIKEN_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(StarWarsCharacterModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(StringUtil.toLowerCase(name));
				}

				if (!pagination) {
					list = (List<StarWarsCharacter>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<StarWarsCharacter>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public StarWarsCharacter findByG_LikeN_First(long groupId, String name,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws NoSuchCharacterException {
		StarWarsCharacter starWarsCharacter = fetchByG_LikeN_First(groupId,
				name, orderByComparator);

		if (starWarsCharacter != null) {
			return starWarsCharacter;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCharacterException(msg.toString());
	}

	/**
	 * Returns the first star wars character in the ordered set where groupId = &#63; and name LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching star wars character, or <code>null</code> if a matching star wars character could not be found
	 */
	@Override
	public StarWarsCharacter fetchByG_LikeN_First(long groupId, String name,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		List<StarWarsCharacter> list = findByG_LikeN(groupId, name, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public StarWarsCharacter findByG_LikeN_Last(long groupId, String name,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws NoSuchCharacterException {
		StarWarsCharacter starWarsCharacter = fetchByG_LikeN_Last(groupId,
				name, orderByComparator);

		if (starWarsCharacter != null) {
			return starWarsCharacter;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCharacterException(msg.toString());
	}

	/**
	 * Returns the last star wars character in the ordered set where groupId = &#63; and name LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching star wars character, or <code>null</code> if a matching star wars character could not be found
	 */
	@Override
	public StarWarsCharacter fetchByG_LikeN_Last(long groupId, String name,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		int count = countByG_LikeN(groupId, name);

		if (count == 0) {
			return null;
		}

		List<StarWarsCharacter> list = findByG_LikeN(groupId, name, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public StarWarsCharacter[] findByG_LikeN_PrevAndNext(
		long starWarsCharacterId, long groupId, String name,
		OrderByComparator<StarWarsCharacter> orderByComparator)
		throws NoSuchCharacterException {
		StarWarsCharacter starWarsCharacter = findByPrimaryKey(starWarsCharacterId);

		Session session = null;

		try {
			session = openSession();

			StarWarsCharacter[] array = new StarWarsCharacterImpl[3];

			array[0] = getByG_LikeN_PrevAndNext(session, starWarsCharacter,
					groupId, name, orderByComparator, true);

			array[1] = starWarsCharacter;

			array[2] = getByG_LikeN_PrevAndNext(session, starWarsCharacter,
					groupId, name, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected StarWarsCharacter getByG_LikeN_PrevAndNext(Session session,
		StarWarsCharacter starWarsCharacter, long groupId, String name,
		OrderByComparator<StarWarsCharacter> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_STARWARSCHARACTER_WHERE);

		query.append(_FINDER_COLUMN_G_LIKEN_GROUPID_2);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_G_LIKEN_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_LIKEN_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_G_LIKEN_NAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(StarWarsCharacterModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindName) {
			qPos.add(StringUtil.toLowerCase(name));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(starWarsCharacter);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<StarWarsCharacter> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the star wars characters where groupId = &#63; and name LIKE &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 */
	@Override
	public void removeByG_LikeN(long groupId, String name) {
		for (StarWarsCharacter starWarsCharacter : findByG_LikeN(groupId, name,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(starWarsCharacter);
		}
	}

	/**
	 * Returns the number of star wars characters where groupId = &#63; and name LIKE &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the number of matching star wars characters
	 */
	@Override
	public int countByG_LikeN(long groupId, String name) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_LIKEN;

		Object[] finderArgs = new Object[] { groupId, name };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_STARWARSCHARACTER_WHERE);

			query.append(_FINDER_COLUMN_G_LIKEN_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_LIKEN_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_LIKEN_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_LIKEN_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(StringUtil.toLowerCase(name));
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_G_LIKEN_GROUPID_2 = "starWarsCharacter.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_LIKEN_NAME_1 = "starWarsCharacter.name IS NULL";
	private static final String _FINDER_COLUMN_G_LIKEN_NAME_2 = "lower(starWarsCharacter.name) LIKE ?";
	private static final String _FINDER_COLUMN_G_LIKEN_NAME_3 = "(starWarsCharacter.name IS NULL OR starWarsCharacter.name LIKE '')";

	public StarWarsCharacterPersistenceImpl() {
		setModelClass(StarWarsCharacter.class);
	}

	/**
	 * Caches the star wars character in the entity cache if it is enabled.
	 *
	 * @param starWarsCharacter the star wars character
	 */
	@Override
	public void cacheResult(StarWarsCharacter starWarsCharacter) {
		entityCache.putResult(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
			StarWarsCharacterImpl.class, starWarsCharacter.getPrimaryKey(),
			starWarsCharacter);

		finderCache.putResult(FINDER_PATH_FETCH_BY_G_N,
			new Object[] {
				starWarsCharacter.getGroupId(), starWarsCharacter.getName()
			}, starWarsCharacter);

		starWarsCharacter.resetOriginalValues();
	}

	/**
	 * Caches the star wars characters in the entity cache if it is enabled.
	 *
	 * @param starWarsCharacters the star wars characters
	 */
	@Override
	public void cacheResult(List<StarWarsCharacter> starWarsCharacters) {
		for (StarWarsCharacter starWarsCharacter : starWarsCharacters) {
			if (entityCache.getResult(
						StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
						StarWarsCharacterImpl.class,
						starWarsCharacter.getPrimaryKey()) == null) {
				cacheResult(starWarsCharacter);
			}
			else {
				starWarsCharacter.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all star wars characters.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(StarWarsCharacterImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the star wars character.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StarWarsCharacter starWarsCharacter) {
		entityCache.removeResult(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
			StarWarsCharacterImpl.class, starWarsCharacter.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((StarWarsCharacterModelImpl)starWarsCharacter,
			true);
	}

	@Override
	public void clearCache(List<StarWarsCharacter> starWarsCharacters) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StarWarsCharacter starWarsCharacter : starWarsCharacters) {
			entityCache.removeResult(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
				StarWarsCharacterImpl.class, starWarsCharacter.getPrimaryKey());

			clearUniqueFindersCache((StarWarsCharacterModelImpl)starWarsCharacter,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		StarWarsCharacterModelImpl starWarsCharacterModelImpl) {
		Object[] args = new Object[] {
				starWarsCharacterModelImpl.getGroupId(),
				starWarsCharacterModelImpl.getName()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_G_N, args, Long.valueOf(1),
			false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_G_N, args,
			starWarsCharacterModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		StarWarsCharacterModelImpl starWarsCharacterModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					starWarsCharacterModelImpl.getGroupId(),
					starWarsCharacterModelImpl.getName()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_N, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_N, args);
		}

		if ((starWarsCharacterModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_N.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					starWarsCharacterModelImpl.getOriginalGroupId(),
					starWarsCharacterModelImpl.getOriginalName()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_N, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_N, args);
		}
	}

	/**
	 * Creates a new star wars character with the primary key. Does not add the star wars character to the database.
	 *
	 * @param starWarsCharacterId the primary key for the new star wars character
	 * @return the new star wars character
	 */
	@Override
	public StarWarsCharacter create(long starWarsCharacterId) {
		StarWarsCharacter starWarsCharacter = new StarWarsCharacterImpl();

		starWarsCharacter.setNew(true);
		starWarsCharacter.setPrimaryKey(starWarsCharacterId);

		starWarsCharacter.setCompanyId(companyProvider.getCompanyId());

		return starWarsCharacter;
	}

	/**
	 * Removes the star wars character with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param starWarsCharacterId the primary key of the star wars character
	 * @return the star wars character that was removed
	 * @throws NoSuchCharacterException if a star wars character with the primary key could not be found
	 */
	@Override
	public StarWarsCharacter remove(long starWarsCharacterId)
		throws NoSuchCharacterException {
		return remove((Serializable)starWarsCharacterId);
	}

	/**
	 * Removes the star wars character with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the star wars character
	 * @return the star wars character that was removed
	 * @throws NoSuchCharacterException if a star wars character with the primary key could not be found
	 */
	@Override
	public StarWarsCharacter remove(Serializable primaryKey)
		throws NoSuchCharacterException {
		Session session = null;

		try {
			session = openSession();

			StarWarsCharacter starWarsCharacter = (StarWarsCharacter)session.get(StarWarsCharacterImpl.class,
					primaryKey);

			if (starWarsCharacter == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCharacterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(starWarsCharacter);
		}
		catch (NoSuchCharacterException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected StarWarsCharacter removeImpl(StarWarsCharacter starWarsCharacter) {
		starWarsCharacter = toUnwrappedModel(starWarsCharacter);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(starWarsCharacter)) {
				starWarsCharacter = (StarWarsCharacter)session.get(StarWarsCharacterImpl.class,
						starWarsCharacter.getPrimaryKeyObj());
			}

			if (starWarsCharacter != null) {
				session.delete(starWarsCharacter);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (starWarsCharacter != null) {
			clearCache(starWarsCharacter);
		}

		return starWarsCharacter;
	}

	@Override
	public StarWarsCharacter updateImpl(StarWarsCharacter starWarsCharacter) {
		starWarsCharacter = toUnwrappedModel(starWarsCharacter);

		boolean isNew = starWarsCharacter.isNew();

		StarWarsCharacterModelImpl starWarsCharacterModelImpl = (StarWarsCharacterModelImpl)starWarsCharacter;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (starWarsCharacter.getCreateDate() == null)) {
			if (serviceContext == null) {
				starWarsCharacter.setCreateDate(now);
			}
			else {
				starWarsCharacter.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!starWarsCharacterModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				starWarsCharacter.setModifiedDate(now);
			}
			else {
				starWarsCharacter.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (starWarsCharacter.isNew()) {
				session.save(starWarsCharacter);

				starWarsCharacter.setNew(false);
			}
			else {
				starWarsCharacter = (StarWarsCharacter)session.merge(starWarsCharacter);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!StarWarsCharacterModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { starWarsCharacterModelImpl.getGroupId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((starWarsCharacterModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						starWarsCharacterModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { starWarsCharacterModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}
		}

		entityCache.putResult(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
			StarWarsCharacterImpl.class, starWarsCharacter.getPrimaryKey(),
			starWarsCharacter, false);

		clearUniqueFindersCache(starWarsCharacterModelImpl, false);
		cacheUniqueFindersCache(starWarsCharacterModelImpl);

		starWarsCharacter.resetOriginalValues();

		return starWarsCharacter;
	}

	protected StarWarsCharacter toUnwrappedModel(
		StarWarsCharacter starWarsCharacter) {
		if (starWarsCharacter instanceof StarWarsCharacterImpl) {
			return starWarsCharacter;
		}

		StarWarsCharacterImpl starWarsCharacterImpl = new StarWarsCharacterImpl();

		starWarsCharacterImpl.setNew(starWarsCharacter.isNew());
		starWarsCharacterImpl.setPrimaryKey(starWarsCharacter.getPrimaryKey());

		starWarsCharacterImpl.setStarWarsCharacterId(starWarsCharacter.getStarWarsCharacterId());
		starWarsCharacterImpl.setGroupId(starWarsCharacter.getGroupId());
		starWarsCharacterImpl.setCompanyId(starWarsCharacter.getCompanyId());
		starWarsCharacterImpl.setUserId(starWarsCharacter.getUserId());
		starWarsCharacterImpl.setUserName(starWarsCharacter.getUserName());
		starWarsCharacterImpl.setCreateDate(starWarsCharacter.getCreateDate());
		starWarsCharacterImpl.setModifiedDate(starWarsCharacter.getModifiedDate());
		starWarsCharacterImpl.setName(starWarsCharacter.getName());
		starWarsCharacterImpl.setPicture(starWarsCharacter.getPicture());
		starWarsCharacterImpl.setFraction(starWarsCharacter.getFraction());
		starWarsCharacterImpl.setDescription(starWarsCharacter.getDescription());

		return starWarsCharacterImpl;
	}

	/**
	 * Returns the star wars character with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the star wars character
	 * @return the star wars character
	 * @throws NoSuchCharacterException if a star wars character with the primary key could not be found
	 */
	@Override
	public StarWarsCharacter findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCharacterException {
		StarWarsCharacter starWarsCharacter = fetchByPrimaryKey(primaryKey);

		if (starWarsCharacter == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCharacterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return starWarsCharacter;
	}

	/**
	 * Returns the star wars character with the primary key or throws a {@link NoSuchCharacterException} if it could not be found.
	 *
	 * @param starWarsCharacterId the primary key of the star wars character
	 * @return the star wars character
	 * @throws NoSuchCharacterException if a star wars character with the primary key could not be found
	 */
	@Override
	public StarWarsCharacter findByPrimaryKey(long starWarsCharacterId)
		throws NoSuchCharacterException {
		return findByPrimaryKey((Serializable)starWarsCharacterId);
	}

	/**
	 * Returns the star wars character with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the star wars character
	 * @return the star wars character, or <code>null</code> if a star wars character with the primary key could not be found
	 */
	@Override
	public StarWarsCharacter fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
				StarWarsCharacterImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		StarWarsCharacter starWarsCharacter = (StarWarsCharacter)serializable;

		if (starWarsCharacter == null) {
			Session session = null;

			try {
				session = openSession();

				starWarsCharacter = (StarWarsCharacter)session.get(StarWarsCharacterImpl.class,
						primaryKey);

				if (starWarsCharacter != null) {
					cacheResult(starWarsCharacter);
				}
				else {
					entityCache.putResult(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
						StarWarsCharacterImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
					StarWarsCharacterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return starWarsCharacter;
	}

	/**
	 * Returns the star wars character with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param starWarsCharacterId the primary key of the star wars character
	 * @return the star wars character, or <code>null</code> if a star wars character with the primary key could not be found
	 */
	@Override
	public StarWarsCharacter fetchByPrimaryKey(long starWarsCharacterId) {
		return fetchByPrimaryKey((Serializable)starWarsCharacterId);
	}

	@Override
	public Map<Serializable, StarWarsCharacter> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, StarWarsCharacter> map = new HashMap<Serializable, StarWarsCharacter>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			StarWarsCharacter starWarsCharacter = fetchByPrimaryKey(primaryKey);

			if (starWarsCharacter != null) {
				map.put(primaryKey, starWarsCharacter);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
					StarWarsCharacterImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (StarWarsCharacter)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_STARWARSCHARACTER_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (StarWarsCharacter starWarsCharacter : (List<StarWarsCharacter>)q.list()) {
				map.put(starWarsCharacter.getPrimaryKeyObj(), starWarsCharacter);

				cacheResult(starWarsCharacter);

				uncachedPrimaryKeys.remove(starWarsCharacter.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(StarWarsCharacterModelImpl.ENTITY_CACHE_ENABLED,
					StarWarsCharacterImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the star wars characters.
	 *
	 * @return the star wars characters
	 */
	@Override
	public List<StarWarsCharacter> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StarWarsCharacter> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<StarWarsCharacter> findAll(int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<StarWarsCharacter> findAll(int start, int end,
		OrderByComparator<StarWarsCharacter> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<StarWarsCharacter> list = null;

		if (retrieveFromCache) {
			list = (List<StarWarsCharacter>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_STARWARSCHARACTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STARWARSCHARACTER;

				if (pagination) {
					sql = sql.concat(StarWarsCharacterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<StarWarsCharacter>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<StarWarsCharacter>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the star wars characters from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (StarWarsCharacter starWarsCharacter : findAll()) {
			remove(starWarsCharacter);
		}
	}

	/**
	 * Returns the number of star wars characters.
	 *
	 * @return the number of star wars characters
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_STARWARSCHARACTER);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return StarWarsCharacterModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the star wars character persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(StarWarsCharacterImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_STARWARSCHARACTER = "SELECT starWarsCharacter FROM StarWarsCharacter starWarsCharacter";
	private static final String _SQL_SELECT_STARWARSCHARACTER_WHERE_PKS_IN = "SELECT starWarsCharacter FROM StarWarsCharacter starWarsCharacter WHERE starWarsCharacterId IN (";
	private static final String _SQL_SELECT_STARWARSCHARACTER_WHERE = "SELECT starWarsCharacter FROM StarWarsCharacter starWarsCharacter WHERE ";
	private static final String _SQL_COUNT_STARWARSCHARACTER = "SELECT COUNT(starWarsCharacter) FROM StarWarsCharacter starWarsCharacter";
	private static final String _SQL_COUNT_STARWARSCHARACTER_WHERE = "SELECT COUNT(starWarsCharacter) FROM StarWarsCharacter starWarsCharacter WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "starWarsCharacter.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StarWarsCharacter exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No StarWarsCharacter exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(StarWarsCharacterPersistenceImpl.class);
}