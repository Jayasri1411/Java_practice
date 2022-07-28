-- Write the query to update the age as 20 where sname is starting with "v"
-- update studentdetails set age = 20 where sname like "v%";
-- select * from SDetails;

-- Write the query to select all the ages whose name ends with "a"
--select studentdetails age from where sname like "%a";

-- Write the query to delete the records from studentdetails whose sname contains "v".
-- delete from studentdetails where sname like "%v";

-- Write the query to select the studentdetails whose age is from 18 to 20 and sname starts with v
-- select  from studentdetails where age between (18 and 20) like "v%";
-- select * from studentdetails;

-- Write the query to get student who have scored maximum marks.
-- select max(marks) from studentdetails group by max marks;

-- Write a query to sort the students in studentdetails tables by rollno in descending order.
-- select * from studentdetails order by rollno desc;

-- Write the query to display the students count whose age is less than 20
-- select count(age) from studentdetails where age<20;

-- Write the query to display studentname with max marks of each student group by studentname.
-- select max(marks),sname from studentdetails group by marks;

-- Write the query to display studentname with sum of     marks of each student group by studentname.
-- select sum(marks),sname from  studentdetails group by sname having sum(marks)>500;
-- Write the query to display studentname with max marks of each student group by studentname having sum of marks greater than 500.
-- select max(marks),sname from studentdetails group by sname having sum(marks)>500;

-- Write the query to display studentname with max marks of each student group by studentname having sum of marks greater than 500 and studentname starts with "v".
-- select max(marks),name from studentmarks group by name having sum(marks)>500 and name like "v%";

-- Write the query to display studentname with min marks of each student group by studentname having sum of marks greater than 600.
--select min(marks),sname from studentdetails group by sname having sum(marks)>600;

--  Write the query to display subjectname whose subject name starts with "v" and deparment id in (1,2,7).
-- select subjectname = 'P' from studentdetails  where deptid in(1,2,7);

-- Write the query the students count based on gender.
-- select count(gender) from studentdetails where gender ="female";
-- Write the query the students count based the address and having count greater than 30.

--select count(fname) from Studentdetails group by address having count(address)>7;


