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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link StarWarsCharacter}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StarWarsCharacter
 * @generated
 */
@ProviderType
public class StarWarsCharacterWrapper implements StarWarsCharacter,
	ModelWrapper<StarWarsCharacter> {
	public StarWarsCharacterWrapper(StarWarsCharacter starWarsCharacter) {
		_starWarsCharacter = starWarsCharacter;
	}

	@Override
	public Class<?> getModelClass() {
		return StarWarsCharacter.class;
	}

	@Override
	public String getModelClassName() {
		return StarWarsCharacter.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("starWarsCharacterId", getStarWarsCharacterId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("picture", getPicture());
		attributes.put("fraction", getFraction());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long starWarsCharacterId = (Long)attributes.get("starWarsCharacterId");

		if (starWarsCharacterId != null) {
			setStarWarsCharacterId(starWarsCharacterId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String picture = (String)attributes.get("picture");

		if (picture != null) {
			setPicture(picture);
		}

		String fraction = (String)attributes.get("fraction");

		if (fraction != null) {
			setFraction(fraction);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new StarWarsCharacterWrapper((StarWarsCharacter)_starWarsCharacter.clone());
	}

	@Override
	public int compareTo(StarWarsCharacter starWarsCharacter) {
		return _starWarsCharacter.compareTo(starWarsCharacter);
	}

	/**
	* Returns the company ID of this star wars character.
	*
	* @return the company ID of this star wars character
	*/
	@Override
	public long getCompanyId() {
		return _starWarsCharacter.getCompanyId();
	}

	/**
	* Returns the create date of this star wars character.
	*
	* @return the create date of this star wars character
	*/
	@Override
	public Date getCreateDate() {
		return _starWarsCharacter.getCreateDate();
	}

	/**
	* Returns the description of this star wars character.
	*
	* @return the description of this star wars character
	*/
	@Override
	public java.lang.String getDescription() {
		return _starWarsCharacter.getDescription();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _starWarsCharacter.getExpandoBridge();
	}

	/**
	* Returns the fraction of this star wars character.
	*
	* @return the fraction of this star wars character
	*/
	@Override
	public java.lang.String getFraction() {
		return _starWarsCharacter.getFraction();
	}

	/**
	* Returns the group ID of this star wars character.
	*
	* @return the group ID of this star wars character
	*/
	@Override
	public long getGroupId() {
		return _starWarsCharacter.getGroupId();
	}

	/**
	* Returns the modified date of this star wars character.
	*
	* @return the modified date of this star wars character
	*/
	@Override
	public Date getModifiedDate() {
		return _starWarsCharacter.getModifiedDate();
	}

	/**
	* Returns the name of this star wars character.
	*
	* @return the name of this star wars character
	*/
	@Override
	public java.lang.String getName() {
		return _starWarsCharacter.getName();
	}

	/**
	* Returns the picture of this star wars character.
	*
	* @return the picture of this star wars character
	*/
	@Override
	public java.lang.String getPicture() {
		return _starWarsCharacter.getPicture();
	}

	/**
	* Returns the primary key of this star wars character.
	*
	* @return the primary key of this star wars character
	*/
	@Override
	public long getPrimaryKey() {
		return _starWarsCharacter.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _starWarsCharacter.getPrimaryKeyObj();
	}

	/**
	* Returns the star wars character ID of this star wars character.
	*
	* @return the star wars character ID of this star wars character
	*/
	@Override
	public long getStarWarsCharacterId() {
		return _starWarsCharacter.getStarWarsCharacterId();
	}

	/**
	* Returns the user ID of this star wars character.
	*
	* @return the user ID of this star wars character
	*/
	@Override
	public long getUserId() {
		return _starWarsCharacter.getUserId();
	}

	/**
	* Returns the user name of this star wars character.
	*
	* @return the user name of this star wars character
	*/
	@Override
	public java.lang.String getUserName() {
		return _starWarsCharacter.getUserName();
	}

	/**
	* Returns the user uuid of this star wars character.
	*
	* @return the user uuid of this star wars character
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _starWarsCharacter.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _starWarsCharacter.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _starWarsCharacter.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _starWarsCharacter.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _starWarsCharacter.isNew();
	}

	@Override
	public void persist() {
		_starWarsCharacter.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_starWarsCharacter.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this star wars character.
	*
	* @param companyId the company ID of this star wars character
	*/
	@Override
	public void setCompanyId(long companyId) {
		_starWarsCharacter.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this star wars character.
	*
	* @param createDate the create date of this star wars character
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_starWarsCharacter.setCreateDate(createDate);
	}

	/**
	* Sets the description of this star wars character.
	*
	* @param description the description of this star wars character
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_starWarsCharacter.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_starWarsCharacter.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_starWarsCharacter.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_starWarsCharacter.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fraction of this star wars character.
	*
	* @param fraction the fraction of this star wars character
	*/
	@Override
	public void setFraction(java.lang.String fraction) {
		_starWarsCharacter.setFraction(fraction);
	}

	/**
	* Sets the group ID of this star wars character.
	*
	* @param groupId the group ID of this star wars character
	*/
	@Override
	public void setGroupId(long groupId) {
		_starWarsCharacter.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this star wars character.
	*
	* @param modifiedDate the modified date of this star wars character
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_starWarsCharacter.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this star wars character.
	*
	* @param name the name of this star wars character
	*/
	@Override
	public void setName(java.lang.String name) {
		_starWarsCharacter.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_starWarsCharacter.setNew(n);
	}

	/**
	* Sets the picture of this star wars character.
	*
	* @param picture the picture of this star wars character
	*/
	@Override
	public void setPicture(java.lang.String picture) {
		_starWarsCharacter.setPicture(picture);
	}

	/**
	* Sets the primary key of this star wars character.
	*
	* @param primaryKey the primary key of this star wars character
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_starWarsCharacter.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_starWarsCharacter.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the star wars character ID of this star wars character.
	*
	* @param starWarsCharacterId the star wars character ID of this star wars character
	*/
	@Override
	public void setStarWarsCharacterId(long starWarsCharacterId) {
		_starWarsCharacter.setStarWarsCharacterId(starWarsCharacterId);
	}

	/**
	* Sets the user ID of this star wars character.
	*
	* @param userId the user ID of this star wars character
	*/
	@Override
	public void setUserId(long userId) {
		_starWarsCharacter.setUserId(userId);
	}

	/**
	* Sets the user name of this star wars character.
	*
	* @param userName the user name of this star wars character
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_starWarsCharacter.setUserName(userName);
	}

	/**
	* Sets the user uuid of this star wars character.
	*
	* @param userUuid the user uuid of this star wars character
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_starWarsCharacter.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<StarWarsCharacter> toCacheModel() {
		return _starWarsCharacter.toCacheModel();
	}

	@Override
	public StarWarsCharacter toEscapedModel() {
		return new StarWarsCharacterWrapper(_starWarsCharacter.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _starWarsCharacter.toString();
	}

	@Override
	public StarWarsCharacter toUnescapedModel() {
		return new StarWarsCharacterWrapper(_starWarsCharacter.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _starWarsCharacter.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StarWarsCharacterWrapper)) {
			return false;
		}

		StarWarsCharacterWrapper starWarsCharacterWrapper = (StarWarsCharacterWrapper)obj;

		if (Objects.equals(_starWarsCharacter,
					starWarsCharacterWrapper._starWarsCharacter)) {
			return true;
		}

		return false;
	}

	@Override
	public StarWarsCharacter getWrappedModel() {
		return _starWarsCharacter;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _starWarsCharacter.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _starWarsCharacter.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_starWarsCharacter.resetOriginalValues();
	}

	private final StarWarsCharacter _starWarsCharacter;
}