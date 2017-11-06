create table StarWarsCharacter (
	starWarsCharacterId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	picture VARCHAR(75) null,
	fraction VARCHAR(75) null,
	description VARCHAR(75) null
);