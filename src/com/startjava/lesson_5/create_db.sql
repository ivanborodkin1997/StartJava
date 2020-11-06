-- create database

CREATE TABLE Jeagers (
	id	SERIAL PRIMARY KEY,
	modelName	TEXT,
	mark	INTEGER,
	height  FLOAT,
	weight  FLOAT,
	status  TEXT,
	origin	TEXT,
     kaijuKill	INTEGER,
	launch	DATE,
);
