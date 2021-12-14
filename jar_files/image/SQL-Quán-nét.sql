Create database QUAN_NET
Use QUAN_NET


create table AcountAdmin(
	AdID int primary key identity,
	AdName nvarchar(100),
	Passwords nvarchar(100)
)
create table AcountMember(
	MbID int primary key identity,
	MbName nvarchar(100),
	PassWords  nvarchar(100),	
	SoTienNap int 
)

create table QLMayTinh(
	MID int primary key identity,
	MayID nvarchar(100),
	Status bit,
	MbName nvarchar(100)
)
create table ThongKe(
	TkID int primary key identity,
	MbName nvarchar(100),
	date DATE,
	SoTienNap int
)

--------------insert data-----------------
insert into AcountAdmin(AdName,Passwords)
values
('Admin1','Ndj123456'),	
('admin',	'12345678')	

insert into AcountMember(MbName,PassWords,SoTienNap)
values
('Fox'	,'A12345678','44000'),
('Bear'	,'B12345678','180000'),
('Elephant','C12345678','40000'),
('Dog'	,'D12345678	','74405'),
('Cat'	,'E12345678	','50000'),
('Chick'	,'F12345678	','80000'),
('Turkey'	,'A31245678	','20000'),
('Camel'	,'B43215678	','57000'),
('Whitemouse','F310345678','40000'),
('Bull'	,'H12345678','86000'),
('Cow	','G12345678','30000'),
('Calf'	,'P12345678','100000'),
('Piglet'	,'U12345678','20000'),
('Pig'	,'Q12345678','49475'),
('Dove'	,'V12345678','40000'),
('Parrot','A87654321','50000'),
('Goldfish','B12345679','20000'),
('Duck','C12345610','30000'),
('Lion','M12345678','20000'),
('Porcupine','L12345678','40000'),
('Hippopotamus','A12345678','20000'),
('Raccoon','B12345678','90000'),
('Giraffe','C12345678','70000'),
('Rhinoceros','N16022017','20000'),
('Jaguar','N16032017','50000'),
('Chimpanzee','N16042017','40000'),
('Donkey','N18022017','40000'),
('Zebra','N18012017','30000'),
('Panda','N06042017','10000'),
('Kangaroo','ND1602201','20000'),
('Hedgehog','ND1603207','50000'),
('Wolf'	,'ND1804207','41000'),
('Alligator','N16022017','111000'),
('Bat','N16032017','101000'),
('Mammoth',	'N16042017	','60000'),
('Mink'	,'N16000017	','20000'),
('Puma'	,'N06032018	','50000'),
('Hare','N09032017','40000'),
('Coyote','ND1602201','20000'),
('Chipmunk','ND1603207','50000'),
('Boar'	,'ND1804207','41000'),
('Beaver','N16022017','110000'),
('Buffalo','N16032017','92000'),
('PolarBear','N16042017','60000'),
('Porcupine','N16000017','20000'),
('Ladybug','N06032018','50000'),
('Honeycomb','N09032017','50000'),
('Tarantula','D31022009','150000'),
('Cockroach','D31022009','150000'),
('tuan'	,'T01022002','112000'),
('quynh'	,'Q23062001','20000'),
('son','S10022001','30000'),
('quyen',	'Q24042001','35000'),
('nhan',	'N14012548','150000'),
('dieu',	'T12412545','60000')

insert into QLMayTinh(MayID,Status, MbName)
values
('Máy 1','0','	'),	
('Máy 2','0','	'),	
('Máy 4	','0','	'), 
('Máy 5	','0','	'),
('Máy 6	','1','Kangaroo'),	
('Máy 7	','0','	'),	
('Máy 8	','1','Bat'),	
('Máy 9	','1','Cat'),	
('Máy 10','1','	Jaguar'),	
('Máy 28','0','	'),	
('Máy 12','0','	'),	
('Máy 13','0','	'),	
('Máy 21','0','	'),	
('Máy 15','1','Wolf'),	
('Máy 16','0','	'),	
('Máy 17','0','	'),	
('Máy 18','0','	'),	
('Máy 19','1','Zebra'),	
('Máy 20','1','Lion'),	
('Máy 24','1','Hippopotamus'),
('Máy 25','1','Jaguar'),	
('Máy 27','1','Dove'),	
('Máy 3','0',' '),		
('Máy 22','0',' '),		
('Máy 23','0',' '),	
('Máy 40','0',' ')

select * from ThongKe

insert into ThongKe(MbName,date,SoTienNap)
values 
('	Fox','	2021-01-21',	20000		),
('Bear	','  2021-01-25',50000		),
('Elephant	','  2021-01-28',	40000	),
('Dog	','  2021-01-28',	100000		),
('Bear	','  2021-01-31',	40000		),
('Elephant	','  2021-01-31',	50000	),
('Cat	','  2021-02-07',	50000		),
('Chick	','  2021-02-17',	60000		),
('Fox	','  2021-02-21',	10000		),
('Turkey	','  2021-02-26',	20000	),
('Cat	','  2021-02-27',	50000		),
('Chick	','  2021-02-27',	40000		),
('Dog	','  2021-02-28',	150000		),
('Bull	','  2021-03-11',	60000		),
('Turkey	','  2021-03-16',	20000	),
('Cow	','  2021-03-20',	30000		),
('Whitemouse','	 2021-03-21',	40000	),
('Chick','	2021-03-27',	50000		),
('Cat	','  2021-03-27',	50000		),
('Calf	','  2021-03-28',	100000		),
('Cow	','  2021-03-30',	70000		),
('Bull','	2021-04-10',	100000			),
('Piglet','	2021-04-16',20000		),
('Elephant','	2021-04-20',50000		),
('Bear','	2021-04-21',	50000			),
('Chick','	2021-04-21',50000			),
('Pig','	2021-04-21',	50000			),
('Dove','	2021-04-25',	40000			),
('Cat','	2021-04-27',	50000			),
('Calf','	2021-04-28',	100000			),
('Dove','	2021-05-15',	60000			),
('Parrot','	2021-05-18',	50000		),
('Goldfish','	2021-05-19',	20000		),
('Goldfish','	2021-05-21',	50000		),
('Pig','	2021-05-21',	50000			),
('Cat','	2021-05-27',	50000			),
('Duck','	2021-05-30',	30000			),
('Lion','	2021-05-31',	20000			),
('Squirrel','	2021-05-31',	50000		),
('Porcupine','	2021-06-08',	40000		),
('Hippopotamus','	2021-06-18',	20000	),
('Parrot','	2021-06-18',	50000	),
('Duck','	2021-06-20',	70000			),
('Lion','	2021-06-20',	20000			),
('Raccoon','	2021-06-23',	90000		),
('Giraffe','	2021-06-26',	70000		),
('Cat','	2021-06-27',	50000			),
('Porcupine','	2021-06-28',	60000		),
('Squirrel','	2021-06-30',	50000		),
('Raccoon','	2021-07-25',	100000		), 
('Giraffe','	2021-07-26',	50000		),
('Cat	','  2021-07-27',	50000			),
('Chimpanzee','	2021-07-29',	40000	),
('Donkey	','  2021-07-30',	40000		),
('Zebra	','  2021-07-30',	30000			),
('Panda	','  2021-07-31',	10000			),
('Kangaroo','	2021-08-10',	20000		),
('Hedgehog','	2021-08-14',	50000		),
('Wolf','	2021-08-23',	40000			),
('Alligator','	2021-08-24',	110000		),
('Bat	','  2021-08-25',	80000			),
('Mammoth','	2021-08-26',	60000		),
('Chimpanzee','	2021-08-29',	50000	),
('Mink','	2021-08-31',	20000			),
('Jaguar','	2021-09-02',	50000		),
('Hedgehog','	2021-09-14',	50000		),
('Puma','	2021-09-16',	50000			),
('Hare','	2021-09-17',	40000			),
('Coyote','	2021-09-21',	20000		),
('Chipmunk','	2021-09-21',	50000		),
('Wolf','	2021-09-23',	50000			),
('Elephant','	2021-09-23',	50000		),
('Chick	',' 2021-09-24',	50000			),
('Pig	',' 2021-09-24',	50000			),
('Alligator','	2021-09-24',	100000		),
('Bat	',' 2021-09-25',	100000			),
('Mammoth','	2021-09-26',	50000		),
('Hedgehog','	2021-10-14',	50000		),
('Bat','	2021-09-15',	100000			),
('Puma','	2021-10-15',	50000			),
('Hare','	2021-10-15',	50000			),
('Cat','	2021-10-15',	50000			),
('Beaver','	2021-10-19',110000		),
('Buffalo','	2021-10-20',	80000		),
('Lion	','  2021-10-20	',20000			),
('Dove','	2021-10-20',100000			),
('Goldfish','	2021-10-21',	50000		),
('	PolarBear','	2021-10-21',	60000	),
('	Coyote','	2021-10-21',50000		),
('	Chipmunk','	2021-10-21',50000	),
('	Raccoon','	2021-11-05',100000		),
('	Hippopotamus','	2021-11-06',	5000),
('	Beaver','	2021-11-10',100000		),
('	Hedgehog','	2021-11-14',50000	),
('	Cat','	2021-11-15',50000			),
('	Hare	',' 2021-11-15',	50000		),
('	Porcupine','  2021-11-19',	20000	),
('	Buffalo','	2021-11-20',80000		),
('	Ladybug','	2021-11-20',50000		),
('	Honeycomb','	2021-11-21',	40000	),
('	Chipmunk','	2021-11-21',50000	),
('	Chimpanzee','	2021-11-29',	50000	),
('	Wolf','	2021-11-29',50000		),
('	Mammoth','	2021-11-29',	50000		),
('	Ladybug','	2021-11-30',50000		),
('	Honeycomb','	2021-11-30',	50000	),
('	test','	2021-12-06',12000		),
('	test','	2021-12-06',1000		),
('	Dog','	2021-12-06',10000		),
('	Bat','	2021-12-06',10000		),
('	Wolf','	2021-12-06',1000		),
('	dog','	2021-12-06',100000		),
('	Fox','	2021-12-07',10000		),
('	tuan	','  2020-05-31',	20000		),
('	quyen','	2020-05-31',50000		),
('	quynh','	2020-06-08',40000		),
('	son','	2020-06-18',20000			),
('	tuan','	2020-06-18',50000		),
('	dieu','	2020-06-20',70000		),
('	nhan','	2020-06-20',20000		),
('	quyen','	2020-06-23',	90000		),
('	son','	2020-06-26',70000			),
('	tuan','	2020-06-27',50000		),
('	quynh','	2020-06-28',	60000	),
('	son','	2020-06-30',50000		),
('	dieu','	2020-07-25',100000		),
('	nhan','	2020-08-26',50000		),
('	quyen','	2020-07-27',	50000	),
('	tuan','	2020-07-29',40000		),
('	son','	2020-07-30',40000		),
('	nhan','	2020-07-30',30000		),
('	quynh','	2020-07-31',	10000	),
('	tuan','	2021-12-07',12000		),
('	Chick','	2021-12-07',	19000	),
('	Honeycomb','	2021-12-07',	10000),
('	Bat','	2021-12-07	',10000		),
('	Honeycomb	',' 2021-12-06',	10000),
('	Mammoth','	2021-12-06',12000	),
('	Bat	',' 2021-12-07',1000		),
('	Buffalo','	2021-12-07',	12000	),
('	Bull','	2021-12-07',10000		),
('	Boar','	2021-12-07',1000		),
('	Bear','	2021-12-07',120000		),
('	Bear','	2021-12-07',10000		),
('	Bull','	2021-12-07',10000		),
('	Camel','	2021-12-07',	7000		),
('	1','	2021-12-07',10000			),
('	1','	2021-12-07',10000			),
('	test','	2021-12-07',12000	),
('	test2','	2021-12-07',	12000		),
('	dog','	2021-12-07',1000			),
('	Alligator','	2021-12-07',1000	)

--------------------Function--------------
create function CTdoanhthuNam()
returns @t table(
	MbName nvarchar(100),
	date date,
	SoTienNap int
)
AS
begin

declare @y int;

set @y = datepart(year,getdate())

insert into @t
select MbName,date,SoTienNap from ThongKe where YEAR(date) = @y

return 
end
--------------------------------------------------------------------

create function CTdoanhThuNgay()
returns @t table(
	MbName nvarchar(100),
	date date,
	SoTienNap int
)
AS
begin
declare @date date;
set @date = getdate()
insert into @t
select MbName,date,SoTienNap from ThongKe where date= @date

return 
end
-------------------------------------------------
create function CTdoanhthuQuy()
returns @t table(
	MbName nvarchar(100),
	date date,
	SoTienNap int
)
AS
begin
declare @m int;
declare @y int;
set @m = datepart(QUARTER,getdate())
set @y = datepart(year,getdate())

insert into @t
select MbName,date,SoTienNap from ThongKe where datepart(QUarter,date)=@m and YEAR(date) = @y

return 
end
-----------------------------------------------------
create function CTdoanhthuThang()
returns @t table(
	MbName nvarchar(100),
	date date,
	SoTienNap int
)
AS
begin
declare @m int;
declare @y int;
set @m = datepart(MONTH,getdate())
set @y = datepart(year,getdate())

insert into @t
select MbName,date,SoTienNap from ThongKe where MONTH(date)=@m and YEAR(date) = @y

return 
end
------------------------------------------------------------------
create function CTDTNam(@nam int)
returns @t table(
	MbName nvarchar(100),
	Date date,
	SoTienNap int
)
AS
begin
insert into @t
select MbName,date,SoTienNap from ThongKe where DATEPART(year,date)=@nam
return
end
----------------------------------------------
create function CTDTQuy(@quy int,@nam int)
returns @t table(
	MbName nvarchar(100),
	Date date,
	SoTienNap int
)
AS
begin
insert into @t
select MbName,date,SoTienNap from ThongKe where Datepart(QUARTER,date)=@quy and DATEPART(year,date)=@nam
return
end
--------------------------------------------
create function CTDTThang(@thang int,@nam int)
returns @t table(
	MbName nvarchar(100),
	Date date,
	SoTienNap int
)
AS
begin
insert into @t
select MbName,date,SoTienNap from ThongKe where Datepart(MONTH,date)=@thang and DATEPART(year,date)=@nam
return
end
----------------------------------------------------------
create function TDTNam(@nam int)
returns int

AS
begin
declare @t int;

Set @t=(	select sum(SoTienNap) from ThongKe where DATEPART(year,date)=@nam)
return @t
end
----------------------------------------------------------------
create function TDTNgay(@d date)
returns int
AS
begin
declare @t int;

set @t=(	select sum(SoTienNap) from ThongKe where date = @d)
return @t
end
----------------------------------------------------------------
create function TDTQuy(@quy int,@nam int)
returns int

AS
begin
declare @t int;

Set @t=(	select sum(SoTienNap) from ThongKe where Datepart(QUARTER,date)=@quy and DATEPART(year,date)=@nam)
return @t
end
-----------------------------------------------------------------
create function TDTThang(@thang int,@nam int)
returns int

AS
begin
declare @t int;

Set @t=(	select sum(SoTienNap) from ThongKe where Datepart(MONTH,date)=@thang and DATEPART(year,date)=@nam)
return @t
end
----------------------------------------------------------------------
create function TongdoanhThuNam()
returns int
AS
begin

declare @t int;
declare @y int;

set @y = DATEPART(year,getdate())

set @t = (select sum(SoTienNap) from ThongKe where  YEAR(date)= @y)

return @t 
end
-------------------------------------------------------------------------
create function TongdoanhThuNgay()
returns int
AS
begin
declare @date date;
declare @t int;
set @date = getdate()

set @t = (select sum(SoTienNap) from ThongKe where date= @date)

return @t 
end
-------------------------------------------------------------------------------
create function TongDoanhthuQuy()
returns int
AS
begin
declare @m int;
declare @y int;
declare @t int;
set @m = datepart(QUARTER,getdate())
set @y = datepart(year,getdate())



set @t=( select sum(SoTienNap) from ThongKe where datepart(QUarter,date)=@m and YEAR(date) = @y )

return @t
end
------------------------------------------------------
create function TongdoanhThuThang()
returns int
AS
begin
declare @m int;
declare @t int;
declare @y int;
set @m =DATEPART(month, getdate())
set @y = DATEPART(year,getdate())

set @t = (select sum(SoTienNap) from ThongKe where month(date)= @m and YEAR(date)= @y)

return @t 
end
-----------------------------------------------------