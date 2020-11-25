CREATE DATABASE if not exists SP4;
use SP4;
DROP TABLE OrdersPizza;
DROP TABLE OldOrdersPizza;
DROP TABLE Orders;
DROP TABLE Pizza;
DROP TABLE OldOrders;
SELECT *from Orders;
SELECT *from Pizza;
SELECT *from OrdersPizza;
SELECT *from OldOrders;
SELECT *from OldOrdersPizza;

CREATE TABLE Orders (

OrderId int AUTO_INCREMENT NOT NULL,
TotalPrice int NOT NULL,
PickUpTime int NOT NULL,
CONSTRAINT PK_Order PRIMARY KEY(OrderId)

);

CREATE TABLE Pizza (

PizzaId int AUTO_INCREMENT NOT NULL,
PizzaName VARCHAR(255) NOT NULL,
Price int NOT NULL,
CONSTRAINT PK_Pizza PRIMARY KEY(PizzaId)

);

CREATE TABLE OrdersPizza (

OrderPizzaId int AUTO_INCREMENT NOT NULL,
OrderId int NOT NULL,
PizzaId int NOT NULL,

CONSTRAINT PK_Order_Pizza PRIMARY KEY(OrderPizzaId),
CONSTRAINT FK_Order FOREIGN KEY(OrderId) REFERENCES Orders(OrderId),
CONSTRAINT FK_Pizza FOREIGN KEY(PizzaId) REFERENCES Pizza(PizzaId)

);

CREATE TABLE OldOrders (

OldOrderId int NOT NULL,
TotalPrice float NOT NULL,
PickUpTime int NOT NULL,
CONSTRAINT PK_Order PRIMARY KEY(OldOrderId)

);

CREATE TABLE OldOrdersPizza (

OldOrderPizzaId int AUTO_INCREMENT NOT NULL,
OldOrderId int NOT NULL,
PizzaId int NOT NULL,

CONSTRAINT PK_OldOrder_Pizza PRIMARY KEY(OldOrderPizzaId),
CONSTRAINT FK_OldOrder FOREIGN KEY(OldOrderId) REFERENCES OldOrders(OldOrderId),
CONSTRAINT FK_OldOrdersPizza FOREIGN KEY(PizzaId) REFERENCES Pizza(PizzaId)

);

insert into Pizza(PizzaName, Price)
VALUES ('Vesuvio', 57),('Amerikaner', 53),('Cacciatore', 57),('Carbona',63),('Dennis',65),('Bertil',57),('Silvia',61),('Victoria',61),('Toronfo',61),('Capricciosa',61),('Hawai',61),('Le Blissofa',61),('Venezia',61),
('Mafia',61),('Margherita',50),('Latinos',76),('Vegetariana',76),('ro Stagioni',71),('Italiana',76),('Calzone (Lukket)',74),('Amada',60),('Azzurra',60),('Cesar',65),('Ambra',65),('Erik',65),('Asta',70),
('Geddo',70),('Gabriel',65),('Robert',65),('Michael',60),('Kristina',65),('Ulf',70),('BRIAN (UDEN OST)',55),('Hvid',65);