--This is the CUSTOMERINFO table where all the information will come from registration
CREATE TABLE CUSTOMERINFO
(
CustomerId int IDENTITY(3000,1) PRIMARY KEY,
CustomerName varchar(256) NOT NULL,
CustomerEmail varchar(256) NOT NULL,
CustomerPhone varchar(11) NOT NULL,
CustomerAddress varchar(256) NOT NULL,
CustomerArea varchar(256) NOT NULL,
CustomerCity varchar(256) NOT NULL,
CustomerPassword varchar(256) NOT NULL,
)
SELECT * FROM CUSTOMERINFO;

--End of CUSTOMERINFO table

------------------------------------------------------------------------------------------------------------------


create table branchinfo
(
Branchid int identity(2001,1) not null primary key,
branchname varchar(500) not null,
area varchar(500) not null,
city varchar(500) not null
)
select * from branchinfo

create table employee
(
employeeid int identity(1001,1) primary key,
employeename varchar(500) not null,
employeemail varchar(500) not null,
Branchid int not null foreign key references branchinfo(Branchid),
employeephone varchar (11) not null,
employeesalary int not null,
employeejoin date not null,
empoloyeerank varchar(500) default 'NO RANK' not null,
employeepass varchar(500) default 'abcdef' not null
)
SELECT * FROM employee;
-------------------------------

----------------------------------------------------------------------------------------------------------------------------
-- This is the ALLORDERINFO table where all the information will come from "Request Pickup" Form. 
-- By default the OrderStatus will be "Pending Approval". The admin will change the OrderStatus in the database when he "accepts"(Button Press).
-- By default the PaymentStatus will be "Unpaid".

Create TABLE ALLORDERINFO
(
OrderId int IDENTITY(10000,1) PRIMARY KEY,
TrackingId int NULL,
CustomerID int NOT NULL FOREIGN KEY REFERENCES CUSTOMERINFO (CustomerID),
OrderDate varchar(11) NOT NULL,
OrderTime varchar(11) NOT NULL,
RecieversName varchar(256) NOT NULL,
RecieversPhone varchar(11) NOT NULL,
RecieversAddress varchar(256) NOT NULL,
RecieversArea varchar(256) NOT NULL,
ParcelType varchar(256) NOT NULL,
Payment varchar(256) NOT NULL,
DeliveryInstruction varchar(512) NULL,
OrderStatus varchar(256)  default 'pending approval' NOT NULL,
PaymentStatus varchar(256) default 'not paid' NOT NULL,
EmployeeID int FOREIGN KEY REFERENCES EMPLOYEE(EmployeeId) default '1001' NOT NULL ,
TrixId varchar(500)  default 'Null' not null
)

--End of ALLORDERINFO table

--------------------------------------------------------------------------------------------------------------
--PAYMENTINFO table. Here the information will appear when the customer submits payment information
--By default the PaymentStatus will be "unpaid". 
--When the admin views the payment application and updates, it changes the Payment Status to "PAID", the PaymentStatus in ALLORDERINFO table and CUSTOMERALLORDERINFO table will also be updated automatically

CREATE TABLE PAYMENTINFO
(
InvoiceId int IDENTITY(8000,1) PRIMARY KEY,
OrderID int NOT NULL FOREIGN KEY REFERENCES ALLORDERINFO(OrderId),
TrackingId int  default'0000'not null,
CustomerID int NOT NULL FOREIGN KEY REFERENCES CUSTOMERINFO(CustomerID),
TRXID varchar(256) NOT NULL default 'Null',
SenderPhone varchar(11) NOT NULL,
TotalPayment int NOT NULL,
PaymentStatus varchar(256) NOT NULL default 'not paid'
)
SELECT * FROM PAYMENTINFO


--End of PAYMENTINFO table

