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

package com.liferay.kris.apiai.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.kris.apiai.model.ApiAiData;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ApiAiData in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ApiAiData
 * @generated
 */
@ProviderType
public class ApiAiDataCacheModel implements CacheModel<ApiAiData>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApiAiDataCacheModel)) {
			return false;
		}

		ApiAiDataCacheModel apiAiDataCacheModel = (ApiAiDataCacheModel)obj;

		if (apiAiDataId == apiAiDataCacheModel.apiAiDataId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, apiAiDataId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", apiAiDataId=");
		sb.append(apiAiDataId);
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
		sb.append(", type=");
		sb.append(type);
		sb.append(", result=");
		sb.append(result);
		sb.append(", action=");
		sb.append(action);
		sb.append(", fulfillment=");
		sb.append(fulfillment);
		sb.append(", speech=");
		sb.append(speech);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ApiAiData toEntityModel() {
		ApiAiDataImpl apiAiDataImpl = new ApiAiDataImpl();

		if (uuid == null) {
			apiAiDataImpl.setUuid(StringPool.BLANK);
		}
		else {
			apiAiDataImpl.setUuid(uuid);
		}

		apiAiDataImpl.setApiAiDataId(apiAiDataId);
		apiAiDataImpl.setGroupId(groupId);
		apiAiDataImpl.setCompanyId(companyId);
		apiAiDataImpl.setUserId(userId);

		if (userName == null) {
			apiAiDataImpl.setUserName(StringPool.BLANK);
		}
		else {
			apiAiDataImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			apiAiDataImpl.setCreateDate(null);
		}
		else {
			apiAiDataImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			apiAiDataImpl.setModifiedDate(null);
		}
		else {
			apiAiDataImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (type == null) {
			apiAiDataImpl.setType(StringPool.BLANK);
		}
		else {
			apiAiDataImpl.setType(type);
		}

		if (result == null) {
			apiAiDataImpl.setResult(StringPool.BLANK);
		}
		else {
			apiAiDataImpl.setResult(result);
		}

		if (action == null) {
			apiAiDataImpl.setAction(StringPool.BLANK);
		}
		else {
			apiAiDataImpl.setAction(action);
		}

		if (fulfillment == null) {
			apiAiDataImpl.setFulfillment(StringPool.BLANK);
		}
		else {
			apiAiDataImpl.setFulfillment(fulfillment);
		}

		if (speech == null) {
			apiAiDataImpl.setSpeech(StringPool.BLANK);
		}
		else {
			apiAiDataImpl.setSpeech(speech);
		}

		apiAiDataImpl.resetOriginalValues();

		return apiAiDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		apiAiDataId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		type = objectInput.readUTF();
		result = objectInput.readUTF();
		action = objectInput.readUTF();
		fulfillment = objectInput.readUTF();
		speech = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(apiAiDataId);

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

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (result == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(result);
		}

		if (action == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(action);
		}

		if (fulfillment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fulfillment);
		}

		if (speech == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(speech);
		}
	}

	public String uuid;
	public long apiAiDataId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String type;
	public String result;
	public String action;
	public String fulfillment;
	public String speech;
}