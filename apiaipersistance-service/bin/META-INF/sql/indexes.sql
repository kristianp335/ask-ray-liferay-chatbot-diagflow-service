create index IX_7DF415AD on APIAI_ApiAiData (userId, createDate);
create index IX_C85360E9 on APIAI_ApiAiData (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F5E10DAB on APIAI_ApiAiData (uuid_[$COLUMN_LENGTH:75$], groupId);