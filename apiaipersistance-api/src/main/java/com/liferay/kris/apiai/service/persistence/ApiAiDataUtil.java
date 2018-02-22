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

package com.liferay.kris.apiai.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.kris.apiai.model.ApiAiData;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.Date;
import java.util.List;

/**
 * The persistence utility for the api ai data service. This utility wraps {@link com.liferay.kris.apiai.service.persistence.impl.ApiAiDataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApiAiDataPersistence
 * @see com.liferay.kris.apiai.service.persistence.impl.ApiAiDataPersistenceImpl
 * @generated
 */
@ProviderType
public class ApiAiDataUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ApiAiData apiAiData) {
		getPersistence().clearCache(apiAiData);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ApiAiData> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ApiAiData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ApiAiData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ApiAiData> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ApiAiData update(ApiAiData apiAiData) {
		return getPersistence().update(apiAiData);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ApiAiData update(ApiAiData apiAiData,
		ServiceContext serviceContext) {
		return getPersistence().update(apiAiData, serviceContext);
	}

	/**
	* Returns all the api ai datas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching api ai datas
	*/
	public static List<ApiAiData> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the api ai datas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @return the range of matching api ai datas
	*/
	public static List<ApiAiData> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the api ai datas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching api ai datas
	*/
	public static List<ApiAiData> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<ApiAiData> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the api ai datas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching api ai datas
	*/
	public static List<ApiAiData> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<ApiAiData> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first api ai data in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api ai data
	* @throws NoSuchApiAiDataException if a matching api ai data could not be found
	*/
	public static ApiAiData findByUuid_First(java.lang.String uuid,
		OrderByComparator<ApiAiData> orderByComparator)
		throws com.liferay.kris.apiai.exception.NoSuchApiAiDataException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first api ai data in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api ai data, or <code>null</code> if a matching api ai data could not be found
	*/
	public static ApiAiData fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<ApiAiData> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last api ai data in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api ai data
	* @throws NoSuchApiAiDataException if a matching api ai data could not be found
	*/
	public static ApiAiData findByUuid_Last(java.lang.String uuid,
		OrderByComparator<ApiAiData> orderByComparator)
		throws com.liferay.kris.apiai.exception.NoSuchApiAiDataException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last api ai data in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api ai data, or <code>null</code> if a matching api ai data could not be found
	*/
	public static ApiAiData fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<ApiAiData> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the api ai datas before and after the current api ai data in the ordered set where uuid = &#63;.
	*
	* @param apiAiDataId the primary key of the current api ai data
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next api ai data
	* @throws NoSuchApiAiDataException if a api ai data with the primary key could not be found
	*/
	public static ApiAiData[] findByUuid_PrevAndNext(long apiAiDataId,
		java.lang.String uuid, OrderByComparator<ApiAiData> orderByComparator)
		throws com.liferay.kris.apiai.exception.NoSuchApiAiDataException {
		return getPersistence()
				   .findByUuid_PrevAndNext(apiAiDataId, uuid, orderByComparator);
	}

	/**
	* Removes all the api ai datas where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of api ai datas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching api ai datas
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the api ai data where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchApiAiDataException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching api ai data
	* @throws NoSuchApiAiDataException if a matching api ai data could not be found
	*/
	public static ApiAiData findByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.kris.apiai.exception.NoSuchApiAiDataException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the api ai data where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching api ai data, or <code>null</code> if a matching api ai data could not be found
	*/
	public static ApiAiData fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the api ai data where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching api ai data, or <code>null</code> if a matching api ai data could not be found
	*/
	public static ApiAiData fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the api ai data where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the api ai data that was removed
	*/
	public static ApiAiData removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.kris.apiai.exception.NoSuchApiAiDataException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of api ai datas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching api ai datas
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the api ai datas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching api ai datas
	*/
	public static List<ApiAiData> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the api ai datas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @return the range of matching api ai datas
	*/
	public static List<ApiAiData> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the api ai datas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching api ai datas
	*/
	public static List<ApiAiData> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<ApiAiData> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the api ai datas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching api ai datas
	*/
	public static List<ApiAiData> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<ApiAiData> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first api ai data in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api ai data
	* @throws NoSuchApiAiDataException if a matching api ai data could not be found
	*/
	public static ApiAiData findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<ApiAiData> orderByComparator)
		throws com.liferay.kris.apiai.exception.NoSuchApiAiDataException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first api ai data in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api ai data, or <code>null</code> if a matching api ai data could not be found
	*/
	public static ApiAiData fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<ApiAiData> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last api ai data in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api ai data
	* @throws NoSuchApiAiDataException if a matching api ai data could not be found
	*/
	public static ApiAiData findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<ApiAiData> orderByComparator)
		throws com.liferay.kris.apiai.exception.NoSuchApiAiDataException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last api ai data in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api ai data, or <code>null</code> if a matching api ai data could not be found
	*/
	public static ApiAiData fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<ApiAiData> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the api ai datas before and after the current api ai data in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param apiAiDataId the primary key of the current api ai data
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next api ai data
	* @throws NoSuchApiAiDataException if a api ai data with the primary key could not be found
	*/
	public static ApiAiData[] findByUuid_C_PrevAndNext(long apiAiDataId,
		java.lang.String uuid, long companyId,
		OrderByComparator<ApiAiData> orderByComparator)
		throws com.liferay.kris.apiai.exception.NoSuchApiAiDataException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(apiAiDataId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the api ai datas where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of api ai datas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching api ai datas
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the api ai datas where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @return the matching api ai datas
	*/
	public static List<ApiAiData> findByUserId(long userId, Date createDate) {
		return getPersistence().findByUserId(userId, createDate);
	}

	/**
	* Returns a range of all the api ai datas where userId = &#63; and createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @return the range of matching api ai datas
	*/
	public static List<ApiAiData> findByUserId(long userId, Date createDate,
		int start, int end) {
		return getPersistence().findByUserId(userId, createDate, start, end);
	}

	/**
	* Returns an ordered range of all the api ai datas where userId = &#63; and createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching api ai datas
	*/
	public static List<ApiAiData> findByUserId(long userId, Date createDate,
		int start, int end, OrderByComparator<ApiAiData> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, createDate, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the api ai datas where userId = &#63; and createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching api ai datas
	*/
	public static List<ApiAiData> findByUserId(long userId, Date createDate,
		int start, int end, OrderByComparator<ApiAiData> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, createDate, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first api ai data in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api ai data
	* @throws NoSuchApiAiDataException if a matching api ai data could not be found
	*/
	public static ApiAiData findByUserId_First(long userId, Date createDate,
		OrderByComparator<ApiAiData> orderByComparator)
		throws com.liferay.kris.apiai.exception.NoSuchApiAiDataException {
		return getPersistence()
				   .findByUserId_First(userId, createDate, orderByComparator);
	}

	/**
	* Returns the first api ai data in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api ai data, or <code>null</code> if a matching api ai data could not be found
	*/
	public static ApiAiData fetchByUserId_First(long userId, Date createDate,
		OrderByComparator<ApiAiData> orderByComparator) {
		return getPersistence()
				   .fetchByUserId_First(userId, createDate, orderByComparator);
	}

	/**
	* Returns the last api ai data in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api ai data
	* @throws NoSuchApiAiDataException if a matching api ai data could not be found
	*/
	public static ApiAiData findByUserId_Last(long userId, Date createDate,
		OrderByComparator<ApiAiData> orderByComparator)
		throws com.liferay.kris.apiai.exception.NoSuchApiAiDataException {
		return getPersistence()
				   .findByUserId_Last(userId, createDate, orderByComparator);
	}

	/**
	* Returns the last api ai data in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api ai data, or <code>null</code> if a matching api ai data could not be found
	*/
	public static ApiAiData fetchByUserId_Last(long userId, Date createDate,
		OrderByComparator<ApiAiData> orderByComparator) {
		return getPersistence()
				   .fetchByUserId_Last(userId, createDate, orderByComparator);
	}

	/**
	* Returns the api ai datas before and after the current api ai data in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param apiAiDataId the primary key of the current api ai data
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next api ai data
	* @throws NoSuchApiAiDataException if a api ai data with the primary key could not be found
	*/
	public static ApiAiData[] findByUserId_PrevAndNext(long apiAiDataId,
		long userId, Date createDate,
		OrderByComparator<ApiAiData> orderByComparator)
		throws com.liferay.kris.apiai.exception.NoSuchApiAiDataException {
		return getPersistence()
				   .findByUserId_PrevAndNext(apiAiDataId, userId, createDate,
			orderByComparator);
	}

	/**
	* Removes all the api ai datas where userId = &#63; and createDate = &#63; from the database.
	*
	* @param userId the user ID
	* @param createDate the create date
	*/
	public static void removeByUserId(long userId, Date createDate) {
		getPersistence().removeByUserId(userId, createDate);
	}

	/**
	* Returns the number of api ai datas where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @return the number of matching api ai datas
	*/
	public static int countByUserId(long userId, Date createDate) {
		return getPersistence().countByUserId(userId, createDate);
	}

	/**
	* Caches the api ai data in the entity cache if it is enabled.
	*
	* @param apiAiData the api ai data
	*/
	public static void cacheResult(ApiAiData apiAiData) {
		getPersistence().cacheResult(apiAiData);
	}

	/**
	* Caches the api ai datas in the entity cache if it is enabled.
	*
	* @param apiAiDatas the api ai datas
	*/
	public static void cacheResult(List<ApiAiData> apiAiDatas) {
		getPersistence().cacheResult(apiAiDatas);
	}

	/**
	* Creates a new api ai data with the primary key. Does not add the api ai data to the database.
	*
	* @param apiAiDataId the primary key for the new api ai data
	* @return the new api ai data
	*/
	public static ApiAiData create(long apiAiDataId) {
		return getPersistence().create(apiAiDataId);
	}

	/**
	* Removes the api ai data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param apiAiDataId the primary key of the api ai data
	* @return the api ai data that was removed
	* @throws NoSuchApiAiDataException if a api ai data with the primary key could not be found
	*/
	public static ApiAiData remove(long apiAiDataId)
		throws com.liferay.kris.apiai.exception.NoSuchApiAiDataException {
		return getPersistence().remove(apiAiDataId);
	}

	public static ApiAiData updateImpl(ApiAiData apiAiData) {
		return getPersistence().updateImpl(apiAiData);
	}

	/**
	* Returns the api ai data with the primary key or throws a {@link NoSuchApiAiDataException} if it could not be found.
	*
	* @param apiAiDataId the primary key of the api ai data
	* @return the api ai data
	* @throws NoSuchApiAiDataException if a api ai data with the primary key could not be found
	*/
	public static ApiAiData findByPrimaryKey(long apiAiDataId)
		throws com.liferay.kris.apiai.exception.NoSuchApiAiDataException {
		return getPersistence().findByPrimaryKey(apiAiDataId);
	}

	/**
	* Returns the api ai data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param apiAiDataId the primary key of the api ai data
	* @return the api ai data, or <code>null</code> if a api ai data with the primary key could not be found
	*/
	public static ApiAiData fetchByPrimaryKey(long apiAiDataId) {
		return getPersistence().fetchByPrimaryKey(apiAiDataId);
	}

	public static java.util.Map<java.io.Serializable, ApiAiData> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the api ai datas.
	*
	* @return the api ai datas
	*/
	public static List<ApiAiData> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the api ai datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @return the range of api ai datas
	*/
	public static List<ApiAiData> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the api ai datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of api ai datas
	*/
	public static List<ApiAiData> findAll(int start, int end,
		OrderByComparator<ApiAiData> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the api ai datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApiAiDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of api ai datas
	* @param end the upper bound of the range of api ai datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of api ai datas
	*/
	public static List<ApiAiData> findAll(int start, int end,
		OrderByComparator<ApiAiData> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the api ai datas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of api ai datas.
	*
	* @return the number of api ai datas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ApiAiDataPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ApiAiDataPersistence, ApiAiDataPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ApiAiDataPersistence.class);
}