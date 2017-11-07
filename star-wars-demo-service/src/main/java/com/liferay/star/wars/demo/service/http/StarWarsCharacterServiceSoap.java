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

import com.liferay.star.wars.demo.service.StarWarsCharacterServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link StarWarsCharacterServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.star.wars.demo.model.StarWarsCharacterSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.star.wars.demo.model.StarWarsCharacter}, that is translated to a
 * {@link com.liferay.star.wars.demo.model.StarWarsCharacterSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StarWarsCharacterServiceHttp
 * @see com.liferay.star.wars.demo.model.StarWarsCharacterSoap
 * @see StarWarsCharacterServiceUtil
 * @generated
 */
@ProviderType
public class StarWarsCharacterServiceSoap {
	public static com.liferay.star.wars.demo.model.StarWarsCharacterSoap addStarWarsCharacter(
		long groupId, java.lang.String name, java.lang.String picture,
		java.lang.String fraction, java.lang.String description,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.star.wars.demo.model.StarWarsCharacter returnValue = StarWarsCharacterServiceUtil.addStarWarsCharacter(groupId,
					name, picture, fraction, description, serviceContext);

			return com.liferay.star.wars.demo.model.StarWarsCharacterSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacterSoap deleteStarWarsCharacter(
		long starWarsCharacterId) throws RemoteException {
		try {
			com.liferay.star.wars.demo.model.StarWarsCharacter returnValue = StarWarsCharacterServiceUtil.deleteStarWarsCharacter(starWarsCharacterId);

			return com.liferay.star.wars.demo.model.StarWarsCharacterSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacterSoap[] deleteStarWarsCharacters(
		long[] starWarsCharacterIds) throws RemoteException {
		try {
			java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> returnValue =
				StarWarsCharacterServiceUtil.deleteStarWarsCharacters(starWarsCharacterIds);

			return com.liferay.star.wars.demo.model.StarWarsCharacterSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacterSoap fetchStarWarsCharacter(
		long starWarsCharacterId) throws RemoteException {
		try {
			com.liferay.star.wars.demo.model.StarWarsCharacter returnValue = StarWarsCharacterServiceUtil.fetchStarWarsCharacter(starWarsCharacterId);

			return com.liferay.star.wars.demo.model.StarWarsCharacterSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacterSoap[] getStarWarsCharacters(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> returnValue =
				StarWarsCharacterServiceUtil.getStarWarsCharacters(groupId);

			return com.liferay.star.wars.demo.model.StarWarsCharacterSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacterSoap[] getStarWarsCharacters(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> returnValue =
				StarWarsCharacterServiceUtil.getStarWarsCharacters(groupId,
					start, end);

			return com.liferay.star.wars.demo.model.StarWarsCharacterSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacterSoap[] getStarWarsCharacters(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.star.wars.demo.model.StarWarsCharacter> orderByComparator)
		throws RemoteException {
		try {
			java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> returnValue =
				StarWarsCharacterServiceUtil.getStarWarsCharacters(groupId,
					start, end, orderByComparator);

			return com.liferay.star.wars.demo.model.StarWarsCharacterSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacterSoap[] getStarWarsCharacters(
		long groupId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.star.wars.demo.model.StarWarsCharacter> orderByComparator)
		throws RemoteException {
		try {
			java.util.List<com.liferay.star.wars.demo.model.StarWarsCharacter> returnValue =
				StarWarsCharacterServiceUtil.getStarWarsCharacters(groupId,
					name, start, end, orderByComparator);

			return com.liferay.star.wars.demo.model.StarWarsCharacterSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getStarWarsCharactersCount(long groupId)
		throws RemoteException {
		try {
			int returnValue = StarWarsCharacterServiceUtil.getStarWarsCharactersCount(groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getStarWarsCharactersCount(long groupId,
		java.lang.String name) throws RemoteException {
		try {
			int returnValue = StarWarsCharacterServiceUtil.getStarWarsCharactersCount(groupId,
					name);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.star.wars.demo.model.StarWarsCharacterSoap updateStarWarsCharacter(
		long starWarsCharacterId, java.lang.String name,
		java.lang.String picture, java.lang.String fraction,
		java.lang.String description) throws RemoteException {
		try {
			com.liferay.star.wars.demo.model.StarWarsCharacter returnValue = StarWarsCharacterServiceUtil.updateStarWarsCharacter(starWarsCharacterId,
					name, picture, fraction, description);

			return com.liferay.star.wars.demo.model.StarWarsCharacterSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(StarWarsCharacterServiceSoap.class);
}