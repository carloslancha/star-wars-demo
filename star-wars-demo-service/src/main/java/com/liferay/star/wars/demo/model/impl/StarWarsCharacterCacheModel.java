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

package com.liferay.star.wars.demo.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.liferay.star.wars.demo.model.StarWarsCharacter;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StarWarsCharacter in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see StarWarsCharacter
 * @generated
 */
@ProviderType
public class StarWarsCharacterCacheModel implements CacheModel<StarWarsCharacter>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StarWarsCharacterCacheModel)) {
			return false;
		}

		StarWarsCharacterCacheModel starWarsCharacterCacheModel = (StarWarsCharacterCacheModel)obj;

		if (starWarsCharacterId == starWarsCharacterCacheModel.starWarsCharacterId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, starWarsCharacterId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{starWarsCharacterId=");
		sb.append(starWarsCharacterId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", picture=");
		sb.append(picture);
		sb.append(", fraction=");
		sb.append(fraction);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public StarWarsCharacter toEntityModel() {
		StarWarsCharacterImpl starWarsCharacterImpl = new StarWarsCharacterImpl();

		starWarsCharacterImpl.setStarWarsCharacterId(starWarsCharacterId);
		starWarsCharacterImpl.setGroupId(groupId);
		starWarsCharacterImpl.setCompanyId(companyId);
		starWarsCharacterImpl.setUserId(userId);

		if (userName == null) {
			starWarsCharacterImpl.setUserName(StringPool.BLANK);
		}
		else {
			starWarsCharacterImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			starWarsCharacterImpl.setCreateDate(null);
		}
		else {
			starWarsCharacterImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			starWarsCharacterImpl.setModifiedDate(null);
		}
		else {
			starWarsCharacterImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			starWarsCharacterImpl.setName(StringPool.BLANK);
		}
		else {
			starWarsCharacterImpl.setName(name);
		}

		if (picture == null) {
			starWarsCharacterImpl.setPicture(StringPool.BLANK);
		}
		else {
			starWarsCharacterImpl.setPicture(picture);
		}

		if (fraction == null) {
			starWarsCharacterImpl.setFraction(StringPool.BLANK);
		}
		else {
			starWarsCharacterImpl.setFraction(fraction);
		}

		if (description == null) {
			starWarsCharacterImpl.setDescription(StringPool.BLANK);
		}
		else {
			starWarsCharacterImpl.setDescription(description);
		}

		starWarsCharacterImpl.resetOriginalValues();

		return starWarsCharacterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		starWarsCharacterId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		picture = objectInput.readUTF();
		fraction = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(starWarsCharacterId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (picture == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(picture);
		}

		if (fraction == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fraction);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long starWarsCharacterId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String picture;
	public String fraction;
	public String description;
}