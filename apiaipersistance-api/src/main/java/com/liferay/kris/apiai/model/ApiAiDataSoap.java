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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.kris.apiai.service.http.ApiAiDataServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.kris.apiai.service.http.ApiAiDataServiceSoap
 * @generated
 */
@ProviderType
public class ApiAiDataSoap implements Serializable {
	public static ApiAiDataSoap toSoapModel(ApiAiData model) {
		ApiAiDataSoap soapModel = new ApiAiDataSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setApiAiDataId(model.getApiAiDataId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setType(model.getType());
		soapModel.setResult(model.getResult());
		soapModel.setAction(model.getAction());
		soapModel.setFulfillment(model.getFulfillment());
		soapModel.setSpeech(model.getSpeech());

		return soapModel;
	}

	public static ApiAiDataSoap[] toSoapModels(ApiAiData[] models) {
		ApiAiDataSoap[] soapModels = new ApiAiDataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ApiAiDataSoap[][] toSoapModels(ApiAiData[][] models) {
		ApiAiDataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ApiAiDataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ApiAiDataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ApiAiDataSoap[] toSoapModels(List<ApiAiData> models) {
		List<ApiAiDataSoap> soapModels = new ArrayList<ApiAiDataSoap>(models.size());

		for (ApiAiData model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ApiAiDataSoap[soapModels.size()]);
	}

	public ApiAiDataSoap() {
	}

	public long getPrimaryKey() {
		return _apiAiDataId;
	}

	public void setPrimaryKey(long pk) {
		setApiAiDataId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getApiAiDataId() {
		return _apiAiDataId;
	}

	public void setApiAiDataId(long apiAiDataId) {
		_apiAiDataId = apiAiDataId;
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

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public String getResult() {
		return _result;
	}

	public void setResult(String result) {
		_result = result;
	}

	public String getAction() {
		return _action;
	}

	public void setAction(String action) {
		_action = action;
	}

	public String getFulfillment() {
		return _fulfillment;
	}

	public void setFulfillment(String fulfillment) {
		_fulfillment = fulfillment;
	}

	public String getSpeech() {
		return _speech;
	}

	public void setSpeech(String speech) {
		_speech = speech;
	}

	private String _uuid;
	private long _apiAiDataId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _type;
	private String _result;
	private String _action;
	private String _fulfillment;
	private String _speech;
}