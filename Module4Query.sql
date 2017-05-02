/*
Adam Wear
5.02.2017
This query is designed to create tables for the 234a_A2DJ project database.
-- Created table TEST
-- Created table TAKE_TEST
-- Changed PK_Take_Test datatype from text to int
-- Dropped table Test_ID
-- Dropped table Admin_Setup
-- Created table USER_ACCOUNT
-- Dropped table User_Account
-- Created table RESULT
-- Dropped table Basic_Result_Report
-- Created table ITEM
*/
USE "234a_A2DJ"; --Ensures the correct database is being used. This is the project database.

--Creates TABLE TEST and associated fields
CREATE TABLE TEST(
PK_Test_ID			int			NOT NULL,
Items				int			NOT NULL,
Date_Time			Char(11)	NULL
CONSTRAINT PK_Test_IDPK PRIMARY KEY(PK_Test_ID)
);
--Creates TABLE TAKE_TEST and associated fields
CREATE TABLE TAKE_TEST(
PK_Take_Test	int		NOT NULL,
FK_Test_ID		int		NULL,
FK_User_ID		int		Null,
CONSTRAINT PK_Take_TestPK PRIMARY KEY(PK_Take_Test)
);

--Creates TABLE USER_ACCOUNT and associated fields
CREATE TABLE USER_ACCOUNT(
PK_User_ID		int			NOT NULL,
LastName		Char(10)	NULL,
FirstName		Char(10)	NULL,
Email			Char(26)	NULL,
UserPassword	Char(16)	NULL,
User_Role		Char(10)	NULL

CONSTRAINT PK_User_IDPK PRIMARY KEY(PK_User_ID)
);

--Creates Table RESULT and associated fields
CREATE TABLE RESULT(
PK_Results_ID	int		NOT NULL,
FK_Take_Test	int		NULL,
Items			int		NULL,
FK_Item1_ID		int		NULL,
FK_Item2_ID		int		NULL
CONSTRAINT PK_Results_IDPK PRIMARY KEY(PK_Results_ID)
);

--Creates table ITEM and associated fields
CREATE TABLE ITEM(
PK_Item_ID		int		NOT NULL,
Item			int		NULL,
FK_Test_ID		int		NULL
CONSTRAINT PK_Item_IDPK PRIMARY KEY(PK_Item_ID)
);

DROP TABLE Admin_Setup;
DROP TABLE Test_ID;
DROP TABLE User_Account;
DROP TABLE Basic_Result_Report;
GO