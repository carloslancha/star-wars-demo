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

package com.liferay.star.wars.demo.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.star.wars.demo.service.http.StarWarsCharacterServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.star.wars.demo.service.http.StarWarsCharacterServiceSoap
 * @generated
 */
@ProviderType
public class StarWarsCharacterSoap implements Serializable {
	public static StarWarsCharacterSoap toSoapModel(StarWarsCharacter model) {
		StarWarsCharacterSoap soapModel = new StarWarsCharacterSoap();

		soapModel.setStarWarsCharacterId(model.getStarWarsCharacterId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setPicture(model.getPicture());
		soapModel.setFraction(model.getFraction());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static StarWarsCharacterSoap[] toSoapModels(
		StarWarsCharacter[] models) {
		StarWarsCharacterSoap[] soapModels = new StarWarsCharacterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StarWarsCharacterSoap[][] toSoapModels(
		StarWarsCharacter[][] models) {
		StarWarsCharacterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StarWarsCharacterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StarWarsCharacterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StarWarsCharacterSoap[] toSoapModels(
		List<StarWarsCharacter> models) {
		List<StarWarsCharacterSoap> soapModels = new ArrayList<StarWarsCharacterSoap>(models.size());

		for (StarWarsCharacter model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StarWarsCharacterSoap[soapModels.size()]);
	}

	public StarWarsCharacterSoap() {
	}

	public long getPrimaryKey() {
		return _starWarsCharacterId;
	}

	public void setPrimaryKey(long pk) {
		setStarWarsCharacterId(pk);
	}

	public long getStarWarsCharacterId() {
		return _starWarsCharacterId;
	}

	public void setStarWarsCharacterId(long starWarsCharacterId) {
		_starWarsCharacterId = starWarsCharacterId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getPicture() {
		return _picture;
	}

	public void setPicture(String picture) {
		_picture = picture;
	}

	public String getFraction() {
		return _fraction;
	}

	public void setFraction(String fraction) {
		_fraction = fraction;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _starWarsCharacterId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _picture;
	private String _fraction;
	private String _description;
}