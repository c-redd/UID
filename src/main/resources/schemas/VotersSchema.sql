/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  yd65
 * Created: Sep 8, 2020
 */

CREATE TABLE test_PollingStation (
PollingStationID int NOT NULL,
Name varchar(255) NOT NULL,
PRIMARY KEY (PollingStationID));

CREATE TABLE test_Voters (
ClientID int NOT NULL,
CardNumber  varchar(8) NOT NULL,
IssueDate DATE NOT NULL,
PollingStation int NOT NULL,
PRIMARY KEY (ClientID),
FOREIGN KEY (PollingStation) REFERENCES test_PollingStation(PollingStationID));

INSERT INTO test_PollingStation
VALUES (1, "Cavendish");
INSERT INTO test_PollingStation
VALUES (2, "UNZA");
