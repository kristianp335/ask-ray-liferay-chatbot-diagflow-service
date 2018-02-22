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

package com.liferay.kris.apiai.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ApiAiData}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApiAiData
 * @generated
 */
@ProviderType
public class ApiAiDataWrapper implements ApiAiData, ModelWrapper<ApiAiData> {
	public ApiAiDataWrapper(ApiAiData apiAiData) {
		_apiAiData = apiAiData;
	}

	@Override
	public Class<?> getModelClass() {
		return ApiAiData.class;
	}

	@Override
	public String getModelClassName() {
		return ApiAiData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("apiAiDataId", getApiAiDataId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("type", getType());
		attributes.put("result", getResult());
		attributes.put("action", getAction());
		attributes.put("fulfillment", getFulfillment());
		attributes.put("speech", getSpeech());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long apiAiDataId = (Long)attributes.get("apiAiDataId");

		if (apiAiDataId != null) {
			setApiAiDataId(apiAiDataId);
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

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String result = (String)attributes.get("result");

		if (result != null) {
			setResult(result);
		}

		String action = (String)attributes.get("action");

		if (action != null) {
			setAction(action);
		}

		String fulfillment = (String)attributes.get("fulfillment");

		if (fulfillment != null) {
			setFulfillment(fulfillment);
		}

		String speech = (String)attributes.get("speech");

		if (speech != null) {
			setSpeech(speech);
		}
	}

	@Override
	public ApiAiData toEscapedModel() {
		return new ApiAiDataWrapper(_apiAiData.toEscapedModel());
	}

	@Override
	public ApiAiData toUnescapedModel() {
		return new ApiAiDataWrapper(_apiAiData.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _apiAiData.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _apiAiData.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _apiAiData.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _apiAiData.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ApiAiData> toCacheModel() {
		return _apiAiData.toCacheModel();
	}

	@Override
	public int compareTo(ApiAiData apiAiData) {
		return _apiAiData.compareTo(apiAiData);
	}

	@Override
	public int hashCode() {
		return _apiAiData.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _apiAiData.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ApiAiDataWrapper((ApiAiData)_apiAiData.clone());
	}

	/**
	* Returns the action of this api ai data.
	*
	* @return the action of this api ai data
	*/
	@Override
	public java.lang.String getAction() {
		return _apiAiData.getAction();
	}

	/**
	* Returns the fulfillment of this api ai data.
	*
	* @return the fulfillment of this api ai data
	*/
	@Override
	public java.lang.String getFulfillment() {
		return _apiAiData.getFulfillment();
	}

	/**
	* Returns the result of this api ai data.
	*
	* @return the result of this api ai data
	*/
	@Override
	public java.lang.String getResult() {
		return _apiAiData.getResult();
	}

	/**
	* Returns the speech of this api ai data.
	*
	* @return the speech of this api ai data
	*/
	@Override
	public java.lang.String getSpeech() {
		return _apiAiData.getSpeech();
	}

	/**
	* Returns the type of this api ai data.
	*
	* @return the type of this api ai data
	*/
	@Override
	public java.lang.String getType() {
		return _apiAiData.getType();
	}

	/**
	* Returns the user name of this api ai data.
	*
	* @return the user name of this api ai data
	*/
	@Override
	public java.lang.String getUserName() {
		return _apiAiData.getUserName();
	}

	/**
	* Returns the user uuid of this api ai data.
	*
	* @return the user uuid of this api ai data
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _apiAiData.getUserUuid();
	}

	/**
	* Returns the uuid of this api ai data.
	*
	* @return the uuid of this api ai data
	*/
	@Override
	public java.lang.String getUuid() {
		return _apiAiData.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _apiAiData.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _apiAiData.toXmlString();
	}

	/**
	* Returns the create date of this api ai data.
	*
	* @return the create date of this api ai data
	*/
	@Override
	public Date getCreateDate() {
		return _apiAiData.getCreateDate();
	}

	/**
	* Returns the modified date of this api ai data.
	*
	* @return the modified date of this api ai data
	*/
	@Override
	public Date getModifiedDate() {
		return _apiAiData.getModifiedDate();
	}

	/**
	* Returns the api ai data ID of this api ai data.
	*
	* @return the api ai data ID of this api ai data
	*/
	@Override
	public long getApiAiDataId() {
		return _apiAiData.getApiAiDataId();
	}

	/**
	* Returns the company ID of this api ai data.
	*
	* @return the company ID of this api ai data
	*/
	@Override
	public long getCompanyId() {
		return _apiAiData.getCompanyId();
	}

	/**
	* Returns the group ID of this api ai data.
	*
	* @return the group ID of this api ai data
	*/
	@Override
	public long getGroupId() {
		return _apiAiData.getGroupId();
	}

	/**
	* Returns the primary key of this api ai data.
	*
	* @return the primary key of this api ai data
	*/
	@Override
	public long getPrimaryKey() {
		return _apiAiData.getPrimaryKey();
	}

	/**
	* Returns the user ID of this api ai data.
	*
	* @return the user ID of this api ai data
	*/
	@Override
	public long getUserId() {
		return _apiAiData.getUserId();
	}

	@Override
	public void persist() {
		_apiAiData.persist();
	}

	/**
	* Sets the action of this api ai data.
	*
	* @param action the action of this api ai data
	*/
	@Override
	public void setAction(java.lang.String action) {
		_apiAiData.setAction(action);
	}

	/**
	* Sets the api ai data ID of this api ai data.
	*
	* @param apiAiDataId the api ai data ID of this api ai data
	*/
	@Override
	public void setApiAiDataId(long apiAiDataId) {
		_apiAiData.setApiAiDataId(apiAiDataId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_apiAiData.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this api ai data.
	*
	* @param companyId the company ID of this api ai data
	*/
	@Override
	public void setCompanyId(long companyId) {
		_apiAiData.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this api ai data.
	*
	* @param createDate the create date of this api ai data
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_apiAiData.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_apiAiData.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_apiAiData.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_apiAiData.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fulfillment of this api ai data.
	*
	* @param fulfillment the fulfillment of this api ai data
	*/
	@Override
	public void setFulfillment(java.lang.String fulfillment) {
		_apiAiData.setFulfillment(fulfillment);
	}

	/**
	* Sets the group ID of this api ai data.
	*
	* @param groupId the group ID of this api ai data
	*/
	@Override
	public void setGroupId(long groupId) {
		_apiAiData.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this api ai data.
	*
	* @param modifiedDate the modified date of this api ai data
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_apiAiData.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_apiAiData.setNew(n);
	}

	/**
	* Sets the primary key of this api ai data.
	*
	* @param primaryKey the primary key of this api ai data
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_apiAiData.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_apiAiData.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the result of this api ai data.
	*
	* @param result the result of this api ai data
	*/
	@Override
	public void setResult(java.lang.String result) {
		_apiAiData.setResult(result);
	}

	/**
	* Sets the speech of this api ai data.
	*
	* @param speech the speech of this api ai data
	*/
	@Override
	public void setSpeech(java.lang.String speech) {
		_apiAiData.setSpeech(speech);
	}

	/**
	* Sets the type of this api ai data.
	*
	* @param type the type of this api ai data
	*/
	@Override
	public void setType(java.lang.String type) {
		_apiAiData.setType(type);
	}

	/**
	* Sets the user ID of this api ai data.
	*
	* @param userId the user ID of this api ai data
	*/
	@Override
	public void setUserId(long userId) {
		_apiAiData.setUserId(userId);
	}

	/**
	* Sets the user name of this api ai data.
	*
	* @param userName the user name of this api ai data
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_apiAiData.setUserName(userName);
	}

	/**
	* Sets the user uuid of this api ai data.
	*
	* @param userUuid the user uuid of this api ai data
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_apiAiData.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this api ai data.
	*
	* @param uuid the uuid of this api ai data
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_apiAiData.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApiAiDataWrapper)) {
			return false;
		}

		ApiAiDataWrapper apiAiDataWrapper = (ApiAiDataWrapper)obj;

		if (Objects.equals(_apiAiData, apiAiDataWrapper._apiAiData)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _apiAiData.getStagedModelType();
	}

	@Override
	public ApiAiData getWrappedModel() {
		return _apiAiData;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _apiAiData.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _apiAiData.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_apiAiData.resetOriginalValues();
	}

	private final ApiAiData _apiAiData;
}