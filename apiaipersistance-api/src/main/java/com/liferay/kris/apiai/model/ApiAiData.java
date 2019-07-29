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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ApiAiData service. Represents a row in the &quot;APIAI_ApiAiData&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ApiAiDataModel
 * @generated
 */
@ImplementationClassName("com.liferay.kris.apiai.model.impl.ApiAiDataImpl")
@ProviderType
public interface ApiAiData extends ApiAiDataModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.liferay.kris.apiai.model.impl.ApiAiDataImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ApiAiData, Long> API_AI_DATA_ID_ACCESSOR =
		new Accessor<ApiAiData, Long>() {

			@Override
			public Long get(ApiAiData apiAiData) {
				return apiAiData.getApiAiDataId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ApiAiData> getTypeClass() {
				return ApiAiData.class;
			}

		};

}