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

package com.liferay.kris.apiai.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.kris.apiai.model.ApiAiData;
import com.liferay.kris.apiai.service.base.ApiAiDataLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import aQute.bnd.annotation.ProviderType;


/**
 * The implementation of the api ai data local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.kris.apiai.service.ApiAiDataLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApiAiDataLocalServiceBaseImpl
 * @see com.liferay.kris.apiai.service.ApiAiDataLocalServiceUtil
 */
@ProviderType
public class ApiAiDataLocalServiceImpl extends ApiAiDataLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.kris.apiai.service.ApiAiDataLocalServiceUtil} to access the api ai data local service.
	 */
	
	@Override
	public List<ApiAiData> getApiAiDataByUserId(long userId)
	{	
		System.out.println("getting the ApiAiData");
		return apiAiDataPersistence.findAll(0, 1000);
	}
	
	@Override
	public String addApiAiData(ServiceContext serviceContext,  String query, String authtoken, String speech, String action, String fulfillment, String result) {
				
		String derivedUserName = "";
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		long userId = serviceContext.getUserId();
		User user;
		try {
			user = UserLocalServiceUtil.getUser(userId);
			derivedUserName = user.getFirstName() + " " + user.getLastName();
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Date today = new Date();	
		
		//build the query ApiAiData object
		ApiAiData apiAiDataQuery = super.createApiAiData(CounterLocalServiceUtil.increment(ApiAiData.class.getName()));
		apiAiDataQuery.setGroupId(groupId);
		apiAiDataQuery.setCompanyId(companyId);
		apiAiDataQuery.setUserId(userId);
		apiAiDataQuery.setCreateDate(today);
		apiAiDataQuery.setModifiedDate(today);
		apiAiDataQuery.setUserName(derivedUserName);
		apiAiDataQuery.setAction("");
		apiAiDataQuery.setFulfillment("");
		apiAiDataQuery.setSpeech(query);
		apiAiDataQuery.setResult("");
		apiAiDataQuery.setType("query");
			
		super.addApiAiData(apiAiDataQuery);
		
		//build the reponse ApiAiData object
		ApiAiData apiAiDataResponse = super.createApiAiData(CounterLocalServiceUtil.increment(ApiAiData.class.getName()));
		apiAiDataResponse.setGroupId(groupId);
		apiAiDataResponse.setCompanyId(companyId);
		apiAiDataResponse.setUserId(userId);
		apiAiDataResponse.setCreateDate(today);
		apiAiDataResponse.setModifiedDate(today);
		apiAiDataResponse.setUserName(derivedUserName);
		apiAiDataResponse.setAction(action);
		apiAiDataResponse.setFulfillment(fulfillment.substring(0, 50));
		apiAiDataResponse.setSpeech(speech);
		apiAiDataResponse.setResult(result.substring(0, 50));
		apiAiDataResponse.setType("response");		
		super.addApiAiData(apiAiDataResponse);		
			
		return "success";			
		
	}
	
	public List<ApiAiData> getRecentConversation(ServiceContext serviceContext, int records) {
		long userId = serviceContext.getUserId();
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		cal.add(Calendar.DATE, -1);
		Date oneDayBefore = cal.getTime();
		Calendar calAfter = Calendar.getInstance();
		calAfter.add(Calendar.DATE, 1);
		Date oneDayAfter = calAfter.getTime();
		DynamicQuery dynamicQuery = super.dynamicQuery();
		dynamicQuery.add(RestrictionsFactoryUtil.between("createDate", oneDayBefore, oneDayAfter));
		dynamicQuery.add(RestrictionsFactoryUtil.eq("userId", userId));
		int endValue = super.dynamicQuery(dynamicQuery).size();
		int startValue = 0;
		if (endValue > records) {
			startValue = endValue - records;
		}
		
		List<ApiAiData> apiAiData = super.dynamicQuery(dynamicQuery, startValue, endValue);
		return apiAiData;
	}
	
	public List<ApiAiData> getRecentConversation(ServiceContext serviceContext, int records, String sortOrder) {
		long userId = serviceContext.getUserId();
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		cal.add(Calendar.DATE, -1);
		Date oneDayBefore = cal.getTime();
		Calendar calAfter = Calendar.getInstance();
		calAfter.add(Calendar.DATE, 1);
		Date oneDayAfter = calAfter.getTime();
		DynamicQuery dynamicQuery = super.dynamicQuery();
		dynamicQuery.add(RestrictionsFactoryUtil.between("createDate", oneDayBefore, oneDayAfter));
		dynamicQuery.add(RestrictionsFactoryUtil.eq("userId", userId));
		
		Order order = OrderFactoryUtil.asc("apiAiDataId");
		if (sortOrder != null && sortOrder.equalsIgnoreCase("desc")) {
			order = OrderFactoryUtil.desc("apiAiDataId");
		}
		System.out.println("order by: " + sortOrder);
		dynamicQuery.addOrder(order);
		
		int endValue = super.dynamicQuery(dynamicQuery).size();
		int startValue = 0;
		if (endValue > records) {
			startValue = endValue - records;
		}
		
		List<ApiAiData> apiAiData = super.dynamicQuery(dynamicQuery, startValue, endValue);
		return apiAiData;
	}
}