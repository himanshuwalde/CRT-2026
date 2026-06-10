CREATE TABLE Employee (
    EMPID NUMBER,
    EMPNAME VARCHAR2(20),
    EMPCITY VARCHAR2(20),
    EMPSALARY NUMBER(10,2),
    PINCODE NUMBER(6)
);

SQL> INSERT INTO Employee VALUES (101, 'Amit',   'Nashik', 50000, 422001);

1 row created.

SQL> INSERT INTO Employee VALUES (102, 'Rahul',  'Nashik', 55000, 422001);

1 row created.

SQL> INSERT INTO Employee VALUES (103, 'Priya',  'Pune',   60000, 411001);

1 row created.

SQL> INSERT INTO Employee VALUES (104, 'Neha',   'Pune',   58000, 411001);

1 row created.

SQL> INSERT INTO Employee VALUES (105, 'Karan',  'Mumbai', 65000, 400001);

1 row created.

SQL> INSERT INTO Employee VALUES (106, 'Sneha',  'Nagpur', 52000, 440001);

1 row created.

SQL> INSERT INTO Employee VALUES (107, 'Rohit',  'Delhi',  70000, 110001);

1 row created.

SQL> SELECT * FROM Employee;

     EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
---------- -------------------- -------------------- ---------- ----------
       101 Amit                 Nashik                    50000     422001
       102 Rahul                Nashik                    55000     422001
       103 Priya                Pune                      60000     411001
       104 Neha                 Pune                      58000     411001
       105 Karan                Mumbai                    65000     400001
       106 Sneha                Nagpur                    52000     440001
       107 Rohit                Delhi                     70000     110001

7 rows selected.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------

SQL> CREATE TABLE department (
        dno INT PRIMARY KEY,
        dname VARCHAR2(50)
    );

Table created.

SQL> INSERT INTO Department VALUES (1, 'IT');

1 row created.

SQL> INSERT INTO Department VALUES (2, 'HR');

1 row created.

SQL> INSERT INTO Department VALUES (3, 'Finance');

1 row created.

SQL> INSERT INTO Department VALUES (4, 'Sales');

1 row created.

SQL> SELECT * FROM Department;

       DNO DNAME
---------- --------------------------------------------------
         1 IT
         2 HR
         3 Finance
         4 Sales
--------------------------------------------------------------------------------------------------------------------------------------------------------------------

SQL> CREATE TABLE Orders (
        OID INT PRIMARY KEY,
        ProductName VARCHAR(50),
        Amount DECIMAL(10,2),
        eno INT,
        dno INT
    );

Table created.

SQL> INSERT INTO Orders VALUES (1001, 'Laptop',   55000, 101, 1);

1 row created.

SQL>    INSERT INTO Orders VALUES (1002, 'Mouse',     1000, 102, 2);

1 row created.

SQL> INSERT INTO Orders VALUES (1003, 'Keyboard',  1500, 103, 1);

1 row created.

SQL> INSERT INTO Orders VALUES (1004, 'Monitor',  12000, 105, 2);

1 row created.

SQL> INSERT INTO Orders VALUES (1005, 'Printer',   8000, 108, 3);

1 row created.

SQL> INSERT INTO Orders VALUES (1006, 'Scanner',   7000, 109, 4);

1 row created.

SQL> INSERT INTO Orders VALUES (1007, 'Tablet',   25000, 101, 1);

1 row created.

SQL> INSERT INTO Orders VALUES (1008, 'Camera',   30000, 110, 3);

1 row created.

SQL> SELECT * FROM Orders;

       OID PRODUCTNAME                                            AMOUNT        ENO        DNO
---------- -------------------------------------------------- ---------- ---------- ----------
      1001 Laptop                                                  55000        101          1
      1002 Mouse                                                    1000        102          2
      1003 Keyboard                                                 1500        103          1
      1004 Monitor                                                 12000        105          2
      1005 Printer                                                  8000        108          3
      1006 Scanner                                                  7000        109          4
      1007 Tablet                                                  25000        101          1
      1008 Camera                                                  30000        110          3

8 rows selected.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. INNER JOIN:
    SQL> SELECT Orders.OID,
               Orders.ProductName,
               Orders.Amount,
               Employee.EMPNAME
        FROM Orders
        INNER JOIN Employee
        ON Orders.eno = Employee.EMPID;
    
           OID PRODUCTNAME                                            AMOUNT EMPNAME
    ---------- -------------------------------------------------- ---------- --------------------
          1007 Tablet                                                  25000 Amit
          1001 Laptop                                                  55000 Amit
          1002 Mouse                                                    1000 Rahul
          1003 Keyboard                                                 1500 Priya
          1004 Monitor                                                 12000 Karan
    
    SQL> SELECT Orders.OID,
               Orders.ProductName,
               Orders.Amount,
               Employee.EMPNAME,
               Department.dname
        FROM Orders
        INNER JOIN Employee
        ON Orders.eno = Employee.EMPID
        INNER JOIN Department
       ON Orders.dno = Department.dno;
    
           OID PRODUCTNAME                                            AMOUNT EMPNAME              DNAME
    ---------- -------------------------------------------------- ---------- -------------------- --------------------------------------------------
          1007 Tablet                                                  25000 Amit                 IT
          1001 Laptop                                                  55000 Amit                 IT
          1002 Mouse                                                    1000 Rahul                HR
          1003 Keyboard                                                 1500 Priya                IT
          1004 Monitor                                                 12000 Karan                HR
--------------------------------------------------------------------------------------------------------------------------------------------------------------------

2. LEFT JOIN:
    SQL> SELECT Employee.EMPNAME,
               Orders.OID
        FROM Employee
        LEFT JOIN Orders
        ON Employee.EMPID = Orders.eno
        ORDER BY Employee.EMPNAME;
    
    EMPNAME                     OID
    -------------------- ----------
    Amit                       1001
    Amit                       1007
    Karan                      1004
    Neha
    Priya                      1003
    Rahul                      1002
    Rohit
    Sneha
    
    8 rows selected.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------

3. RIGHT JOIN:
    SQL> SELECT Orders.OID,
               Employee.EMPNAME
        FROM Employee
        RIGHT JOIN Orders
        ON Employee.EMPID = Orders.eno
        ORDER BY Orders.OID;
    
           OID EMPNAME
    ---------- --------------------
          1001 Amit
          1002 Rahul
          1003 Priya
          1004 Karan
          1005
          1006
          1007 Amit
          1008
    
    8 rows selected.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------

4. FULL JOIN:
    SQL> SELECT Employee.EMPNAME,
               Orders.OID
        FROM Employee
        FULL OUTER JOIN Orders
        ON Employee.EMPID = Orders.eno
        ORDER BY Employee.EMPNAME;
    
    EMPNAME                     OID
    -------------------- ----------
    Amit                       1007
    Amit                       1001
    Karan                      1004
    Neha
    Priya                      1003
    Rahul                      1002
    Rohit
    Sneha
                               1005
                               1006
                               1008
    
    11 rows selected.
    
    SQL> SELECT Employee.EMPNAME,
               Orders.OID
        FROM Employee
        FULL JOIN Orders
        ON Employee.EMPID = Orders.eno
        ORDER BY Employee.EMPNAME;
    
    EMPNAME                     OID
    -------------------- ----------
    Amit                       1007
    Amit                       1001
    Karan                      1004
    Neha
    Priya                      1003
    Rahul                      1002
    Rohit
    Sneha
                               1005
                               1006
                               1008
    
    11 rows selected.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------

5. SELF JOIN:
    SQL> SELECT A.EMPNAME AS Employee1,
               B.EMPNAME AS Employee2,
               A.EMPCITY
        FROM Employee A
        JOIN Employee B
        ON A.EMPCITY = B.EMPCITY
        AND A.EMPID < B.EMPID
        ORDER BY A.EMPCITY;
    
    EMPLOYEE1            EMPLOYEE2            EMPCITY
    -------------------- -------------------- --------------------
    Amit                 Rahul                Nashik
    Priya                Neha                 Pune
