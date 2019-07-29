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

package com.liferay.kris.apiai.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ApiAiDataService}.
 *
 * @author Brian Wing Shun Chan
 * @see ApiAiDataService
 * @generated
 */
@ProviderType
public class ApiAiDataServiceWrapper
	implements ApiAiDataService, ServiceWrapper<ApiAiDataService> {

	public ApiAiDataServiceWrapper(ApiAiDataService apiAiDataService) {
		_apiAiDataService = apiAiDataService;
	}

	@Override
	public String addApiAiDataPersistence(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String query, String authtoken, String speech, String action,
		String fulfillment, String result) {

		return _apiAiDataService.addApiAiDataPersistence(
			serviceContext, query, authtoken, speech, action, fulfillment,
			result);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _apiAiDataService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.liferay.kris.apiai.model.ApiAiData>
		getRecentConversation(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			int records) {

		return _apiAiDataService.getRecentConversation(serviceContext, records);
	}

	@Override
	public ApiAiDataService getWrappedService() {
		return _apiAiDataService;
	}

	@Override
	public void setWrappedService(ApiAiDataService apiAiDataService) {
		_apiAiDataService = apiAiDataService;
	}

	private ApiAiDataService _apiAiDataService;

}