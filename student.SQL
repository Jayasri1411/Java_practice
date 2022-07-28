create table studentdetails(studentid int,fname varchar(12),lname varchar(20),age int,email varchar(12),gender varchar(10),address varchar(20),rollno int);
insert into studentdetails values
(1,"a","b",20,"jaya@gmail.com","female","chittor",120),
(2,"l","k",11,"arha@gmail.com","female","chittor",124),
(3,"z","o",12,"yammy@gmail.com","female","chittor",121),
(4,"v","m",23,"sri@gmail.com","female","chittor",122),
(5,"n","v",26,"sai@gmail.com","female","chittor",129),
(6,"a","c",28,"vidhya@gmail.com","female","chittor",128),
(7,"q","w",29,"vijji@gmail.com","female","chittor",127),
(8,"v","u",24,"lakshmi@gmail.com","female","chittor",125),
(9,"y","x",25,"sravani@gmail.com","female","chittor",126),
(10,"z","a",28,"siva@gmail.com","male","chittor",123);
select *from studentdetails;
create table deptdetails(deptid int,deptname varchar(12),date date);
insert into deptdetails values
(1,"cse",2/2/2021),
(2,"eee",2/2/2021),
(3,"civil",2/2/2021),
(4,"mech",2/2/2021),
(5,"ece",2/2/2021);
select *from deptdetails;
create table subjectdetails(subid int,subject varchar(12),deptid int);
insert into subjectdetails values
(1,"java",123),
(2,"html",122),
(3,"css",134),
(4,"javascript",145),
(5,"bootstrap",167),
(6,"angular",178),
(7,"java",123),
(8,"advancejava",167),
(9,"csharp",175),
(10,"aws",156),
(11,"cloud",143),
(12,"c++",133),
(14,"c",163),
(15,"dbms",193),
(16,"mysql",153),
(17,"sql",173),
(18,"nodejs",193),
(19,"ruby",183),
(20,"python",173),
(12,"java",175);
select *from subjectdetails;

create table studentmarks(smid int,studentid int,subjectid int,marks float,percentage float);
insert into studentmarks values
(1,10,1,50,77.0),
(1,11,12,56,73.0),
(1,12,13,59,77.0),
(1,14,16,60,78.1),
(1,15,17,55,70.0),
(1,16,6,53,78.0),
(1,17,1,55,79.0),
(1,18,7,52,72.0),
(1,19,9,56,73.0),
(1,20,10,57,70.0),
(1,21,1,56,72.0),
(1,22,11,55,73.0),
(1,24,1,56,77.0),
(1,23,1,57,70.0),
(1,26,1,55,70.0),
(1,22,1,55,77.0),
(1,21,1,55,79.0),
(1,20,1,55,75.0),
(1,19,1,55,78.0),
(1,18,1,55,73.0),
(1,17,1,55,72.0),
(1,16,1,55,79.0),
(1,13,1,55,76.0),
(1,14,1,55,72.0),
(1,15,1,55,74.0),
(1,11,1,55,79.0),
(1,12,1,55,76.0),
(1,30,1,55,75.0),
(1,29,1,55,77.0),
(1,28,1,55,78.0),
(1,27,7,55,70.9),
(1,26,9,55,76.0),
(1,25,4,55,70.0),
(1,24,6,55,60.0),
(1,23,9,55,90.0),
(1,22,9,55,80.0),
(1,21,4,57,50.0),
(1,1,1,59,70.0),
(1,27,57,45,90.0),
(1,11,1,59,80.0),
(1,10,1,55,70.0),
(1,6,7,55,70.0),
(1,1,7,59,79.0),
(1,5,6,53,78.0),
(1,4,1,58,74.0),
(1,2,1,55,73.0),
(1,4,8,57,72.0),
(1,2,6,52,70.3),
(1,1,1,59,71.0),
(1,3,6,58,72.0),
(1,2,4,56,70.0);
select * from studentmarks;
create table studentdeptdetails(sdeptid int,studentid int,deptid int);
insert into studentdeptdetails values
(1,10,21),
(2,11,22),
(3,12,23),
(4,13,24),
(5,14,25),
(6,15,26),
(7,16,27),
(8,17,28),
(9,18,29),
(10,19,20);
select * from studentdeptdetails;
--Write a query to select all columns of studentdetails table.
select *from studentdetails ;
--	Write a query to select studentid from studentdetails table
select studentid from studentdetails;
--Write a query to select studentnames from studentdetails whose age is greater than 20
select * from studentdetails where age >20;
--Write a query to select sname as StudentName from studentdetails whose studentid is less than 10
select * from studentdetails where studentid <10;
--Write a query to select all columns of studentdetails table where studentid is either 1,2 and 7
select * from studentdetails where studentid 1 or 2 or 7;
--Write a query to select all columns of studentdetails table  where studentid is from 1 to 10
select *from studentdetails where studentid < 10;
--Write a query to update sname as ‘vijay’ of studentdetails table where studentid is 1
--update employeee set ename="vijay" where studentid=1;

