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

import com.liferay.kris.apiai.exception.NoSuchApiAiDataException;
import com.liferay.kris.apiai.model.ApiAiData;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the api ai data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApiAiDataUtil
 * @generated
 */
@ProviderType
public interface ApiAiDataPersistence extends BasePersistence<ApiAiData> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ApiAiDataUtil} to access the api ai data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, ApiAiData> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the api ai datas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching api ai datas
	 */
	public java.util.List<ApiAiData> findByUuid(String uuid);

	/**
	 * Returns a range of all the api ai datas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of api ai datas
	 * @param end the upper bound of the range of api ai datas (not inclusive)
	 * @return the range of matching api ai datas
	 */
	public java.util.List<ApiAiData> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the api ai datas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of api ai datas
	 * @param end the upper bound of the range of api ai datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching api ai datas
	 */
	public java.util.List<ApiAiData> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
			orderByComparator);

	/**
	 * Returns an ordered range of all the api ai datas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of api ai datas
	 * @param end the upper bound of the range of api ai datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching api ai datas
	 */
	public java.util.List<ApiAiData> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first api ai data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api ai data
	 * @throws NoSuchApiAiDataException if a matching api ai data could not be found
	 */
	public ApiAiData findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
				orderByComparator)
		throws NoSuchApiAiDataException;

	/**
	 * Returns the first api ai data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api ai data, or <code>null</code> if a matching api ai data could not be found
	 */
	public ApiAiData fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
			orderByComparator);

	/**
	 * Returns the last api ai data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api ai data
	 * @throws NoSuchApiAiDataException if a matching api ai data could not be found
	 */
	public ApiAiData findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
				orderByComparator)
		throws NoSuchApiAiDataException;

	/**
	 * Returns the last api ai data in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api ai data, or <code>null</code> if a matching api ai data could not be found
	 */
	public ApiAiData fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
			orderByComparator);

	/**
	 * Returns the api ai datas before and after the current api ai data in the ordered set where uuid = &#63;.
	 *
	 * @param apiAiDataId the primary key of the current api ai data
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next api ai data
	 * @throws NoSuchApiAiDataException if a api ai data with the primary key could not be found
	 */
	public ApiAiData[] findByUuid_PrevAndNext(
			long apiAiDataId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
				orderByComparator)
		throws NoSuchApiAiDataException;

	/**
	 * Removes all the api ai datas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of api ai datas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching api ai datas
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the api ai data where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchApiAiDataException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching api ai data
	 * @throws NoSuchApiAiDataException if a matching api ai data could not be found
	 */
	public ApiAiData findByUUID_G(String uuid, long groupId)
		throws NoSuchApiAiDataException;

	/**
	 * Returns the api ai data where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching api ai data, or <code>null</code> if a matching api ai data could not be found
	 */
	public ApiAiData fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the api ai data where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching api ai data, or <code>null</code> if a matching api ai data could not be found
	 */
	public ApiAiData fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the api ai data where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the api ai data that was removed
	 */
	public ApiAiData removeByUUID_G(String uuid, long groupId)
		throws NoSuchApiAiDataException;

	/**
	 * Returns the number of api ai datas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching api ai datas
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the api ai datas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching api ai datas
	 */
	public java.util.List<ApiAiData> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the api ai datas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of api ai datas
	 * @param end the upper bound of the range of api ai datas (not inclusive)
	 * @return the range of matching api ai datas
	 */
	public java.util.List<ApiAiData> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the api ai datas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of api ai datas
	 * @param end the upper bound of the range of api ai datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching api ai datas
	 */
	public java.util.List<ApiAiData> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
			orderByComparator);

	/**
	 * Returns an ordered range of all the api ai datas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<ApiAiData> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first api ai data in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api ai data
	 * @throws NoSuchApiAiDataException if a matching api ai data could not be found
	 */
	public ApiAiData findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
				orderByComparator)
		throws NoSuchApiAiDataException;

	/**
	 * Returns the first api ai data in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api ai data, or <code>null</code> if a matching api ai data could not be found
	 */
	public ApiAiData fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
			orderByComparator);

	/**
	 * Returns the last api ai data in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api ai data
	 * @throws NoSuchApiAiDataException if a matching api ai data could not be found
	 */
	public ApiAiData findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
				orderByComparator)
		throws NoSuchApiAiDataException;

	/**
	 * Returns the last api ai data in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api ai data, or <code>null</code> if a matching api ai data could not be found
	 */
	public ApiAiData fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
			orderByComparator);

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
	public ApiAiData[] findByUuid_C_PrevAndNext(
			long apiAiDataId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
				orderByComparator)
		throws NoSuchApiAiDataException;

	/**
	 * Removes all the api ai datas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of api ai datas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching api ai datas
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the api ai datas where userId = &#63; and createDate = &#63;.
	 *
	 * @param userId the user ID
	 * @param createDate the create date
	 * @return the matching api ai datas
	 */
	public java.util.List<ApiAiData> findByUserId(long userId, Date createDate);

	/**
	 * Returns a range of all the api ai datas where userId = &#63; and createDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param createDate the create date
	 * @param start the lower bound of the range of api ai datas
	 * @param end the upper bound of the range of api ai datas (not inclusive)
	 * @return the range of matching api ai datas
	 */
	public java.util.List<ApiAiData> findByUserId(
		long userId, Date createDate, int start, int end);

	/**
	 * Returns an ordered range of all the api ai datas where userId = &#63; and createDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param createDate the create date
	 * @param start the lower bound of the range of api ai datas
	 * @param end the upper bound of the range of api ai datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching api ai datas
	 */
	public java.util.List<ApiAiData> findByUserId(
		long userId, Date createDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
			orderByComparator);

	/**
	 * Returns an ordered range of all the api ai datas where userId = &#63; and createDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<ApiAiData> findByUserId(
		long userId, Date createDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first api ai data in the ordered set where userId = &#63; and createDate = &#63;.
	 *
	 * @param userId the user ID
	 * @param createDate the create date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api ai data
	 * @throws NoSuchApiAiDataException if a matching api ai data could not be found
	 */
	public ApiAiData findByUserId_First(
			long userId, Date createDate,
			com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
				orderByComparator)
		throws NoSuchApiAiDataException;

	/**
	 * Returns the first api ai data in the ordered set where userId = &#63; and createDate = &#63;.
	 *
	 * @param userId the user ID
	 * @param createDate the create date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api ai data, or <code>null</code> if a matching api ai data could not be found
	 */
	public ApiAiData fetchByUserId_First(
		long userId, Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
			orderByComparator);

	/**
	 * Returns the last api ai data in the ordered set where userId = &#63; and createDate = &#63;.
	 *
	 * @param userId the user ID
	 * @param createDate the create date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api ai data
	 * @throws NoSuchApiAiDataException if a matching api ai data could not be found
	 */
	public ApiAiData findByUserId_Last(
			long userId, Date createDate,
			com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
				orderByComparator)
		throws NoSuchApiAiDataException;

	/**
	 * Returns the last api ai data in the ordered set where userId = &#63; and createDate = &#63;.
	 *
	 * @param userId the user ID
	 * @param createDate the create date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api ai data, or <code>null</code> if a matching api ai data could not be found
	 */
	public ApiAiData fetchByUserId_Last(
		long userId, Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
			orderByComparator);

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
	public ApiAiData[] findByUserId_PrevAndNext(
			long apiAiDataId, long userId, Date createDate,
			com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
				orderByComparator)
		throws NoSuchApiAiDataException;

	/**
	 * Removes all the api ai datas where userId = &#63; and createDate = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param createDate the create date
	 */
	public void removeByUserId(long userId, Date createDate);

	/**
	 * Returns the number of api ai datas where userId = &#63; and createDate = &#63;.
	 *
	 * @param userId the user ID
	 * @param createDate the create date
	 * @return the number of matching api ai datas
	 */
	public int countByUserId(long userId, Date createDate);

	/**
	 * Caches the api ai data in the entity cache if it is enabled.
	 *
	 * @param apiAiData the api ai data
	 */
	public void cacheResult(ApiAiData apiAiData);

	/**
	 * Caches the api ai datas in the entity cache if it is enabled.
	 *
	 * @param apiAiDatas the api ai datas
	 */
	public void cacheResult(java.util.List<ApiAiData> apiAiDatas);

	/**
	 * Creates a new api ai data with the primary key. Does not add the api ai data to the database.
	 *
	 * @param apiAiDataId the primary key for the new api ai data
	 * @return the new api ai data
	 */
	public ApiAiData create(long apiAiDataId);

	/**
	 * Removes the api ai data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param apiAiDataId the primary key of the api ai data
	 * @return the api ai data that was removed
	 * @throws NoSuchApiAiDataException if a api ai data with the primary key could not be found
	 */
	public ApiAiData remove(long apiAiDataId) throws NoSuchApiAiDataException;

	public ApiAiData updateImpl(ApiAiData apiAiData);

	/**
	 * Returns the api ai data with the primary key or throws a <code>NoSuchApiAiDataException</code> if it could not be found.
	 *
	 * @param apiAiDataId the primary key of the api ai data
	 * @return the api ai data
	 * @throws NoSuchApiAiDataException if a api ai data with the primary key could not be found
	 */
	public ApiAiData findByPrimaryKey(long apiAiDataId)
		throws NoSuchApiAiDataException;

	/**
	 * Returns the api ai data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param apiAiDataId the primary key of the api ai data
	 * @return the api ai data, or <code>null</code> if a api ai data with the primary key could not be found
	 */
	public ApiAiData fetchByPrimaryKey(long apiAiDataId);

	/**
	 * Returns all the api ai datas.
	 *
	 * @return the api ai datas
	 */
	public java.util.List<ApiAiData> findAll();

	/**
	 * Returns a range of all the api ai datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of api ai datas
	 * @param end the upper bound of the range of api ai datas (not inclusive)
	 * @return the range of api ai datas
	 */
	public java.util.List<ApiAiData> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the api ai datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of api ai datas
	 * @param end the upper bound of the range of api ai datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of api ai datas
	 */
	public java.util.List<ApiAiData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
			orderByComparator);

	/**
	 * Returns an ordered range of all the api ai datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>ApiAiDataModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of api ai datas
	 * @param end the upper bound of the range of api ai datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of api ai datas
	 */
	public java.util.List<ApiAiData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApiAiData>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the api ai datas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of api ai datas.
	 *
	 * @return the number of api ai datas
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}