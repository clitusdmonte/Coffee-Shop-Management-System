create table employee_cd(empId varchar(10) not null,firstname varchar(15),lastname varchar(15),phoneNo bigint(10),SSN bigint(11),email varchar(25), address varchar(25),constraint emp_pk primary key(empId));


create table users_cd(userId varchar(10) not null,empId varchar(10) not null,username varchar(15),password varchar(15),role varchar(10),constraint usercd_pk primary key(userId),constraint usercd_fk foreign key(empId) references employee_cd(empId));

create table inventory_cd(itemId varchar(10) not null,itemName varchar(20), itemQuantity bigint(10),constraint inventory_cd_pk1 primary key(itemId));

create table itemCategory_cd(categoryId bigint(10) not null, categoryName varchar(20),constraint itemCategory_cd primary key(categoryId));

create table menuItem_cd(menuItem_cdId varchar(10) not null, categoryId bigint(10), menuItem_cdName varchar(15),menuItem_cdPrice float(10,2), itemDesc varchar(150),constraint menuItem_cdCategory_cd_pk primary key(menuItem_cdId),constraint menuItem_cdCategory_cd_fk foreign key(categoryId) references itemCategory_cd(categoryId));

create table orderss_cd(orderId bigint(10) AUTO_INCREMENT,userid varchar(10) not null, orderItems varchar(400) not null,orderPrice float(10,2),constraint orders_pk primary key(orderId),constraint orders_fk1 foreign key(userid) references users_cd(userid));


insert into employee_cd(empId,firstname,lastname,phoneNo,SSN,email, address) values('101','Clitus','Dmonte',1234567890,123456789,'rponting@gmail.com','Millenium Park');
insert into employee_cd(empId,firstname,lastname,phoneNo,SSN,email, address) values('102','admin','admin',3255874125,996358741,'ssmith@gmail.com','IIT Mies,Bronzville');
insert into employee_cd(empId,firstname,lastname,phoneNo,SSN,email, address) values('103','Jhon','Dave',1234567890,123456789,'jdave@gmail.com','IIT Mies,Bronzville');
insert into employee_cd(empId,firstname,lastname,phoneNo,SSN,email, address) values('104','Jack','Daneil',3125748960,547896125,'jdaneil@gmail.com','Downtown, chicago');
insert into employee_cd(empId,firstname,lastname,phoneNo,SSN,email, address) values('105','David','Warner',9632587410,741258963,'dwarner@gmail.com','Naperville');
insert into employee_cd(empId,firstname,lastname,phoneNo,SSN,email, address) values('106','Archi','Dsouza',9632367410,870958963,'archi@gmail.com','Downtown');

insert into users_cd(userId,empId,username,password,role) values('1001','101','clitus','123','customer');
insert into users_cd(userId,empId,username,password,role) values('1002','102','admin','123','admin');
insert into users_cd(userId,empId,username,password,role) values('1003','103','dave','123','manager');
insert into users_cd(userId,empId,username,password,role) values('1004','104','daneil','123','chef');
insert into users_cd(userId,empId,username,password,role) values('1005','105','warner','123','delivery');
insert into users_cd(userId,empId,username,password,role) values('1006','106','archi','123','manager');



insert into itemCategory_cd(categoryId, categoryName) values(1,'coffee');
insert into itemCategory_cd(categoryId, categoryName) values(2,'cold drink');
insert into itemCategory_cd(categoryId, categoryName) values(3,'soda');
insert into itemCategory_cd(categoryId, categoryName) values(4,'juice');

insert into menuItem_cd(menuItem_cdId , categoryId, menuItem_cdName ,menuItem_cdPrice, itemDesc) values('11',1,'Espresso',10,'The espresso (aka “short black”) is the foundation and the most important part to every espresso based drink');
insert into menuItem_cd(menuItem_cdId , categoryId, menuItem_cdName ,menuItem_cdPrice, itemDesc) values('12',1,'Short Macchiato',15,'A short macchiato is similar to an espresso but with a dollop of steamed milk and foam to mellow the harsh taste of an espresso');
insert into menuItem_cd(menuItem_cdId , categoryId, menuItem_cdName ,menuItem_cdPrice, itemDesc) values('13',1,'Ristretto',12,'A ristretto is an espresso shot that is extracted with the same amount of coffee but half the amount of water.');
insert into menuItem_cd(menuItem_cdId , categoryId, menuItem_cdName ,menuItem_cdPrice, itemDesc) values('21',1,'Pepsi',2,'Pepsi with ice and soda ');
insert into menuItem_cd(menuItem_cdId , categoryId, menuItem_cdName ,menuItem_cdPrice, itemDesc) values('22',1,'Coca-Cola',3,'Coca cola with soda');
insert into menuItem_cd(menuItem_cdId , categoryId, menuItem_cdName ,menuItem_cdPrice, itemDesc) values('23',1,'Fanta',2,'Fanta with ice');
insert into menuItem_cd(menuItem_cdId , categoryId, menuItem_cdName ,menuItem_cdPrice, itemDesc) values('41',1,'Soda',2,'Soda with ice ');
insert into menuItem_cd(menuItem_cdId , categoryId, menuItem_cdName ,menuItem_cdPrice, itemDesc) values('51',1,'Apple Juice',3,'Apple juice with Dry fruit');
insert into menuItem_cd(menuItem_cdId , categoryId, menuItem_cdName ,menuItem_cdPrice, itemDesc) values('52',1,'Watermelon',2,'Watermelon juice with ice');

insert into inventory_cd(itemId, itemName, itemQuantity) values('12','white bread', 12);
insert into inventory_cd(itemId, itemName, itemQuantity) values('13','wheat bread', 15);
insert into inventory_cd(itemId, itemName, itemQuantity) values('14','Chilli Sauce', 20);



SELECT * from users_cd where username='clitus' and password='123' 
SELECT * from users_cd where username='dev' and password='123' 
SELECT * from users_cd where username='dave' and password='123' 

SELECT * from inventory_cd
select * from employee_cd;
select * from users_cd;
select * from  orderss_cd;







