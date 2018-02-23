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
 * Provides a wrapper for {@link ApiAiDataLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ApiAiDataLocalService
 * @generated
 */
@ProviderType
public class ApiAiDataLocalServiceWrapper implements ApiAiDataLocalService,
	ServiceWrapper<ApiAiDataLocalService> {
	public ApiAiDataLocalServiceWrapper(
		ApiAiDataLocalService apiAiDataLocalService) {
		_apiAiDataLocalService = apiAiDataLocalService;
	}

	/**
	* Adds the api ai data to the database. Also notifies the appropriate model listeners.
	*
	* @param apiAiData the api ai data
	* @return the api ai data that was added
	*/
	@Override
	public com.liferay.kris.apiai.model.ApiAiData addApiAiData(
		com.liferay.kris.apiai.model.ApiAiData apiAiData) {
		return _apiAiDataLocalService.addApiAiData(apiAiData);
	}

	/**
	* Creates a new api ai data with the primary key. Does not add the api ai data to the database.
	*
	* @param apiAiDataId the primary key for the new api ai data
	* @return the new api ai data
	*/
	@Override
	public com.liferay.kris.apiai.model.ApiAiData createApiAiData(
		long apiAiDataId) {
		return _apiAiDataLocalService.createApiAiData(apiAiDataId);
	}

	/**
	* Deletes the api ai data from the database. Also notifies the appropriate model listeners.
	*
	* @param apiAiData the api ai data
	* @return the api ai data that was removed
	*/
	@Override
	public com.liferay.kris.apiai.model.ApiAiData deleteApiAiData(
		com.liferay.kris.apiai.model.ApiAiData apiAiData) {
		return _apiAiDataLocalService.deleteApiAiData(apiAiData);
	}

	/**
	* Deletes the api ai data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param apiAiDataId the primary key of the api ai data
	* @return the api ai data that was removed
	* @throws PortalException if a api ai data with the primary key could not be found
	*/
	@Override
	public com.liferay.kris.apiai.model.ApiAiData deleteApiAiData(
		long apiAiDataId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _apiAiDataLocalService.deleteApiAiData(apiAiDataId);
	}

	@Override
	public com.liferay.kris.apiai.model.ApiAiData fetchApiAiData(
		long apiAiDataId) {
		return _apiAiDataLocalService.fetchApiAiData(apiAiDataId);
	}

	/**
	* Returns the api ai data matching the UUID and group.
	*
	* @param uuid the api ai data's UUID
	* @param groupId the primary key of the group
	* @return the matching api ai data, or <code>null</code> if a matching api ai data could not be found
	*/
	@Override
	public com.liferay.kris.apiai.model.ApiAiData fetchApiAiDataByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _apiAiDataLocalService.fetchApiAiDataByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the api ai data with the primary key.
	*
	* @param apiAiDataId the primary key of the api ai data
	* @return the api ai data
	* @throws PortalException if a api ai data with the primary key could not be found
	*/
	@Override
	public com.liferay.kris.apiai.model.ApiAiData getApiAiData(long apiAiDataId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _apiAiDataLocalService.getApiAiData(apiAiDataId);
	}

	/**
	* Returns the api ai data matching the UUID and group.
	*
	* @param uuid the api ai data's UUID
	* @param groupId the primary key of the group
	* @return the matching api ai data
	* @throws PortalException if a matching api ai data could not be found
	*/
	@Override
	public com.liferay.kris.apiai.model.ApiAiData getApiAiDataByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _apiAiDataLocalService.getApiAiDataByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the api ai data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param apiAiData the api ai data
	* @return the api ai data that was updated
	*/
	@Override
	public com.liferay.kris.apiai.model.ApiAiData updateApiAiData(
		com.liferay.kris.apiai.model.ApiAiData apiAiData) {
		return _apiAiDataLocalService.updateApiAiData(apiAiData);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _apiAiDataLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _apiAiDataLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _apiAiDataLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _apiAiDataLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _apiAiDataLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _apiAiDataLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of api ai datas.
	*
	* @return the number of api ai datas
	*/
	@Override
	public int getApiAiDatasCount() {
		return _apiAiDataLocalService.getApiAiDatasCount();
	}

	@Override
	public java.lang.String addApiAiData(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.lang.String query, java.lang.String authtoken,
		java.lang.String speech, java.lang.String action,
		java.lang.String fulfillment, java.lang.String result) {
		return _apiAiDataLocalService.addApiAiData(serviceContext, query,
			authtoken, speech, action, fulfillment, result);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _apiAiDataLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _apiAiDataLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.kris.apiai.model.impl.ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _apiAiDataLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.kris.apiai.model.impl.ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _apiAiDataLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.kris.apiai.model.ApiAiData> getApiAiDataByUserId(
		long userId) {
		return _apiAiDataLocalService.getApiAiDataByUserId(userId);
	}

	/**
	* Returns a range of all the api ai datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.kris.apiai.model.impl.ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @return the range of api ai datas
	*/
	@Override
	public java.util.List<com.liferay.kris.apiai.model.ApiAiData> getApiAiDatas(
		int start, int end) {
		return _apiAiDataLocalService.getApiAiDatas(start, end);
	}

	/**
	* Returns all the api ai datas matching the UUID and company.
	*
	* @param uuid the UUID of the api ai datas
	* @param companyId the primary key of the company
	* @return the matching api ai datas, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.kris.apiai.model.ApiAiData> getApiAiDatasByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _apiAiDataLocalService.getApiAiDatasByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of api ai datas matching the UUID and company.
	*
	* @param uuid the UUID of the api ai datas
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching api ai datas, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.kris.apiai.model.ApiAiData> getApiAiDatasByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.kris.apiai.model.ApiAiData> orderByComparator) {
		return _apiAiDataLocalService.getApiAiDatasByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.kris.apiai.model.ApiAiData> getRecentConversation(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		int records) {
		return _apiAiDataLocalService.getRecentConversation(serviceContext,
			records);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _apiAiDataLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _apiAiDataLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ApiAiDataLocalService getWrappedService() {
		return _apiAiDataLocalService;
	}

	@Override
	public void setWrappedService(ApiAiDataLocalService apiAiDataLocalService) {
		_apiAiDataLocalService = apiAiDataLocalService;
	}

	private ApiAiDataLocalService _apiAiDataLocalService;
}