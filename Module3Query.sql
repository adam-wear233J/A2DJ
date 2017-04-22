/*
Adam Wear
4.22.2017
This query is designed to create tables for the 234a_A2DJ project database.
*/
USE 234a_A2DJ --Ensures the correct database is being used. This is the project database.

--Creates TABLE Admin_Setup and associated fields
CREATE TABLE Admin_Setup(
TestSubmission		int		NOT NULL,
AdminID				int		NOT NULL,
FindTestResults		Char(4)	NULL,
TestID				int		NULL
CONSTRAINT AdminIDPK PRIMARY KEY(AdminID)
);
--Creates TABLE Test_ID and associated fields
CREATE TABLE Test_ID(
TestID		int		NOT NULL,
Question	text	NULL,
UserID		int		Null,
CONSTRAINT TestIDPK PRIMARY KEY(TestID)
);

--Creates TABLE User_Account and associated fields
CREATE TABLE User_Account(
UserAcctID		int			NOT NULL,
LastName		Char(10)	NULL,
FirstName		Char(10)	NULL,
Email			Char(26)	NULL,
UserPassword	Char(16)	NULL
CONSTRAINT UserAcctIDPK PRIMARY KEY(UserAcctID)
);

--Creates Table Basic_Result_Report and associated fields
CREATE TABLE Basic_Result_Report(
ResultsID		int		NOT NULL,
Win				int		NULL,
Loss			int		NULL,
Tie				int		NULL,
FK_TestID		int		NULL
CONSTRAINT ResultsIDPK PRIMARY KEY(ResultsID)
);

GO