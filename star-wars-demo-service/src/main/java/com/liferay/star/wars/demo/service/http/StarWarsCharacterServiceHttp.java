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

package com.liferay.star.wars.demo.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import com.liferay.star.wars.demo.service.StarWarsCharacterServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link StarWarsCharacterServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StarWarsCharacterServiceSoap
 * @see HttpPrincipal
 * @see StarWarsCharacterServiceUtil
 * @generated
 */
@ProviderType
public class StarWarsCharacterServiceHttp {
	public static com.liferay.star.wars.demo.model.StarWarsCharacter addStarWarsCharacter(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String name,
		java.lang.String picture, java.lang.String fraction,
		java.lang.String description,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(StarWarsCharacterServiceUtil.class,
					"addStarWarsCharacter", _addStarWarsCharacterParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					name, picture, fraction, description, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.star.wars.demo.model.StarWarsCharacter)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacter deleteStarWarsCharacter(
		HttpPrincipal httpPrincipal, long starWarsCharacterId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(StarWarsCharacterServiceUtil.class,
					"deleteStarWarsCharacter",
					_deleteStarWarsCharacterParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					starWarsCharacterId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.star.wars.demo.model.StarWarsCharacter)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> deleteStarWarsCharacters(
		HttpPrincipal httpPrincipal, long[] starWarsCharacterIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(StarWarsCharacterServiceUtil.class,
					"deleteStarWarsCharacters",
					_deleteStarWarsCharactersParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					starWarsCharacterIds);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacter fetchStarWarsCharacter(
		HttpPrincipal httpPrincipal, long starWarsCharacterId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(StarWarsCharacterServiceUtil.class,
					"fetchStarWarsCharacter",
					_fetchStarWarsCharacterParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					starWarsCharacterId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.star.wars.demo.model.StarWarsCharacter)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		HttpPrincipal httpPrincipal, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(StarWarsCharacterServiceUtil.class,
					"getStarWarsCharacters",
					_getStarWarsCharactersParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		HttpPrincipal httpPrincipal, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(StarWarsCharacterServiceUtil.class,
					"getStarWarsCharacters",
					_getStarWarsCharactersParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		HttpPrincipal httpPrincipal, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.star.wars.demo.model.StarWarsCharacter> orderByComparator)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(StarWarsCharacterServiceUtil.class,
					"getStarWarsCharacters",
					_getStarWarsCharactersParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> getStarWarsCharacters(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.star.wars.demo.model.StarWarsCharacter> orderByComparator)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(StarWarsCharacterServiceUtil.class,
					"getStarWarsCharacters",
					_getStarWarsCharactersParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					name, start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int getStarWarsCharactersCount(HttpPrincipal httpPrincipal,
		long groupId) {
		try {
			MethodKey methodKey = new MethodKey(StarWarsCharacterServiceUtil.class,
					"getStarWarsCharactersCount",
					_getStarWarsCharactersCountParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int getStarWarsCharactersCount(HttpPrincipal httpPrincipal,
		long groupId, java.lang.String name) {
		try {
			MethodKey methodKey = new MethodKey(StarWarsCharacterServiceUtil.class,
					"getStarWarsCharactersCount",
					_getStarWarsCharactersCountParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					name);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacter updateStarWarsCharacter(
		HttpPrincipal httpPrincipal, long starWarsCharacterId,
		java.lang.String name, java.lang.String picture,
		java.lang.String fraction, java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(StarWarsCharacterServiceUtil.class,
					"updateStarWarsCharacter",
					_updateStarWarsCharacterParameterTypes10);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					starWarsCharacterId, name, picture, fraction, description);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.star.wars.demo.model.StarWarsCharacter)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(StarWarsCharacterServiceHttp.class);
	private static final Class<?>[] _addStarWarsCharacterParameterTypes0 = new Class[] {
			long.class, java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteStarWarsCharacterParameterTypes1 = new Class[] {
			long.class
		};
	private static final Class<?>[] _deleteStarWarsCharactersParameterTypes2 = new Class[] {
			long[].class
		};
	private static final Class<?>[] _fetchStarWarsCharacterParameterTypes3 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getStarWarsCharactersParameterTypes4 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getStarWarsCharactersParameterTypes5 = new Class[] {
			long.class, int.class, int.class
		};
	private static final Class<?>[] _getStarWarsCharactersParameterTypes6 = new Class[] {
			long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getStarWarsCharactersParameterTypes7 = new Class[] {
			long.class, java.lang.String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getStarWarsCharactersCountParameterTypes8 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getStarWarsCharactersCountParameterTypes9 = new Class[] {
			long.class, java.lang.String.class
		};
	private static final Class<?>[] _updateStarWarsCharacterParameterTypes10 = new Class[] {
			long.class, java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class
		};
}