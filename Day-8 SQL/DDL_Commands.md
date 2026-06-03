DDL (Data Definition Language)

Used to define or modify database structure.

CREATE
CREATE TABLE Employee(
    EmpID INT PRIMARY KEY,
    EmpName VARCHAR(50),
    EmpCity VARCHAR(50),
    EmpSalary DECIMAL(10,2)
);
ALTER

Add a new column:

ALTER TABLE Employee
ADD EmpAge INT;
TRUNCATE

Remove all records but keep table structure:

TRUNCATE TABLE Employee;
DROP

Delete the entire table:

DROP TABLE Employee;
