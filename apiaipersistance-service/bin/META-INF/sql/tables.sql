create table APIAI_ApiAiData (
	uuid_ VARCHAR(75) null,
	apiAiDataId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	type_ VARCHAR(75) null,
	result VARCHAR(500) null,
	action VARCHAR(500) null,
	fulfillment VARCHAR(500) null,
	speech VARCHAR(500) null
);