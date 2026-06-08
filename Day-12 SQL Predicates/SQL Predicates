SQL> SELECT * FROM Employee;

     EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
---------- -------------------- -------------------- ---------- ----------
       101 Himanshu             Pune                     100000     411001
       102 Soni                 Mumbai                    60000     400001
       103 Ayush                Delhi                  48000.75     110001
       104 Tanmay               Nagpur                    45000     440001
       105 Mayur                Kerala                    65000     682001
       106 Sonakshi             Hyderabad                 10000     500001
       107 Himanshi             Goa                       30000     403001
       108 Kapil                Bhubaneswar               50000     751001
       109 Saket                Nagpur                    20000     440026
       110 Zaid                 Pune                      25000     411002

10 rows selected.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

1. BETWEEN:
    I. SQL> SELECT * FROM Employee WHERE EMPSALARY BETWEEN 10000 AND 30000;
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           106 Sonakshi             Hyderabad                 10000     500001
           107 Himanshi             Goa                       30000     403001
           109 Saket                Nagpur                    20000     440026
           110 Zaid                 Pune                      25000     411002
    
    II. SQL> SELECT * FROM Employee WHERE EMPSALARY NOT BETWEEN 10000 AND 30000;
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           101 Himanshu             Pune                     100000     411001
           102 Soni                 Mumbai                    60000     400001
           103 Ayush                Delhi                  48000.75     110001
           104 Tanmay               Nagpur                    45000     440001
           105 Mayur                Kerala                    65000     682001
           108 Kapil                Bhubaneswar               50000     751001
    
    6 rows selected.
    
    III. SQL> SELECT * FROM Employee WHERE (EMPSALARY BETWEEN 10000 AND 30000) AND NOT EMPID IN (109, 110);
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           106 Sonakshi             Hyderabad                 10000     500001
           107 Himanshi             Goa                       30000     403001
    
    IV. SQL> SELECT * FROM Employee WHERE EMPNAME BETWEEN 'A' AND 'S';
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           101 Himanshu             Pune                     100000     411001
           103 Ayush                Delhi                  48000.75     110001
           105 Mayur                Kerala                    65000     682001
           107 Himanshi             Goa                       30000     403001
           108 Kapil                Bhubaneswar               50000     751001
    
    V. SQL> SELECT * FROM Employee WHERE EMPNAME NOT BETWEEN 'A' AND 'S';
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           102 Soni                 Mumbai                    60000     400001
           104 Tanmay               Nagpur                    45000     440001
           106 Sonakshi             Hyderabad                 10000     500001
           109 Saket                Nagpur                    20000     440026
           110 Zaid                 Pune                      25000     411002
    
    VI. SQL> SELECT * FROM Employee WHERE EMPNAME BETWEEN 'Himanshu' AND 'Himanshi' ORDER BY EMPNAME;
    
    no rows selected
    
    VII. SQL> SELECT * FROM Employee WHERE EMPNAME NOT BETWEEN 'Himanshu' AND 'Himanshi' ORDER BY EMPNAME;
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           103 Ayush                Delhi                  48000.75     110001
           107 Himanshi             Goa                       30000     403001
           101 Himanshu             Pune                     100000     411001
           108 Kapil                Bhubaneswar               50000     751001
           105 Mayur                Kerala                    65000     682001
           109 Saket                Nagpur                    20000     440026
           106 Sonakshi             Hyderabad                 10000     500001
           102 Soni                 Mumbai                    60000     400001
           104 Tanmay               Nagpur                    45000     440001
           110 Zaid                 Pune                      25000     411002
    
    10 rows selected.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

SQL> CREATE TABLE DEPARTMENT (
  2      EMPID NUMBER PRIMARY KEY,
  3      EMPCITY VARCHAR2(20),
  4      DEPARTMENT VARCHAR2(20)
  5  );

Table created.

SQL> INSERT INTO DEPARTMENT VALUES (101, 'Pune', 'IT');

1 row created.

SQL> INSERT INTO DEPARTMENT VALUES (102, 'Mumbai', 'HR');

1 row created.

SQL> INSERT INTO DEPARTMENT VALUES (103, 'Delhi', 'Finance');

1 row created.

SQL> INSERT INTO DEPARTMENT VALUES (104, 'Nagpur', 'Marketing');

1 row created.

SQL> INSERT INTO DEPARTMENT VALUES (105, 'Kerala', 'Sales');

1 row created.

SQL> INSERT INTO DEPARTMENT VALUES (106, 'Hyderabad', 'IT');

1 row created.

SQL> INSERT INTO DEPARTMENT VALUES (107, 'Goa', 'HR');

1 row created.

SQL> INSERT INTO DEPARTMENT VALUES (108, 'Bhubaneswar', 'Finance');

1 row created.

SQL> INSERT INTO DEPARTMENT VALUES (109, 'Nagpur', 'Marketing');

1 row created.

SQL> INSERT INTO DEPARTMENT VALUES (110, 'Pune', 'Sales');

1 row created.

SQL> SELECT * FROM Department;

     EMPID EMPCITY              DEPARTMENT
---------- -------------------- --------------------
       101 Pune                 IT
       102 Mumbai               HR
       103 Delhi                Finance
       104 Nagpur               Marketing
       105 Kerala               Sales
       106 Hyderabad            IT
       107 Goa                  HR
       108 Bhubaneswar          Finance
       109 Nagpur               Marketing
       110 Pune                 Sales

10 rows selected.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

2. IN:
    I. SQL> SELECT * FROM Employee WHERE EMPCITY IN ('Pune', 'Nagpur', 'Mumbai');
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           101 Himanshu             Pune                     100000     411001
           102 Soni                 Mumbai                    60000     400001
           104 Tanmay               Nagpur                    45000     440001
           109 Saket                Nagpur                    20000     440026
           110 Zaid                 Pune                      25000     411002
    
    II. SQL> SELECT * FROM Employee WHERE EMPCITY IN ('Pune', 'Nagpur');
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           101 Himanshu             Pune                     100000     411001
           104 Tanmay               Nagpur                    45000     440001
           109 Saket                Nagpur                    20000     440026
           110 Zaid                 Pune                      25000     411002
    
    III. SQL> SELECT * FROM Employee WHERE EMPCITY IN ('Pune', 'Nagpur', 'Goa');
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           101 Himanshu             Pune                     100000     411001
           104 Tanmay               Nagpur                    45000     440001
           107 Himanshi             Goa                       30000     403001
           109 Saket                Nagpur                    20000     440026
           110 Zaid                 Pune                      25000     411002
    
    IV. SQL> SELECT * FROM Employee WHERE EMPCITY NOT IN ('Pune', 'Nagpur');
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           102 Soni                 Mumbai                    60000     400001
           103 Ayush                Delhi                  48000.75     110001
           105 Mayur                Kerala                    65000     682001
           106 Sonakshi             Hyderabad                 10000     500001
           107 Himanshi             Goa                       30000     403001
           108 Kapil                Bhubaneswar               50000     751001
    
    6 rows selected.
    
    V. SQL> SELECT * FROM Employee WHERE EMPID IN (SELECT EMPID FROM Department WHERE EMPCITY = 'Nagpur');
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           104 Tanmay               Nagpur                    45000     440001
           109 Saket                Nagpur                    20000     440026

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

3. LIKE:
    I. SQL> SELECT * FROM Employee WHERE EMPNAME LIKE 'H%';
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           101 Himanshu             Pune                     100000     411001
           107 Himanshi             Goa                       30000     403001
    
    II. SQL> SELECT * FROM Employee WHERE EMPNAME LIKE '%o%';
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           102 Soni                 Mumbai                    60000     400001
           106 Sonakshi             Hyderabad                 10000     500001
    
    III. SQL> SELECT * FROM Employee WHERE EMPNAME NOT LIKE '%o%';
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           101 Himanshu             Pune                     100000     411001
           103 Ayush                Delhi                  48000.75     110001
           104 Tanmay               Nagpur                    45000     440001
           105 Mayur                Kerala                    65000     682001
           107 Himanshi             Goa                       30000     403001
           108 Kapil                Bhubaneswar               50000     751001
           109 Saket                Nagpur                    20000     440026
           110 Zaid                 Pune                      25000     411002
    
    8 rows selected.
    
    IV. SQL> SELECT * FROM Employee WHERE EMPNAME LIKE '_a%';
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           104 Tanmay               Nagpur                    45000     440001
           105 Mayur                Kerala                    65000     682001
           108 Kapil                Bhubaneswar               50000     751001
           109 Saket                Nagpur                    20000     440026
           110 Zaid                 Pune                      25000     411002
    
    V. SQL> SELECT * FROM Employee WHERE EMPNAME LIKE '_ak%';
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           109 Saket                Nagpur                    20000     440026
    
    VI. SQL> SELECT * FROM Employee WHERE EMPNAME LIKE '__m%';
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           101 Himanshu             Pune                     100000     411001
           107 Himanshi             Goa                       30000     403001

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

4. ORDER BY:
    I. SQL> SELECT * FROM Employee ORDER BY EMPNAME;
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           103 Ayush                Delhi                  48000.75     110001
           107 Himanshi             Goa                       30000     403001
           101 Himanshu             Pune                     100000     411001
           108 Kapil                Bhubaneswar               50000     751001
           105 Mayur                Kerala                    65000     682001
           109 Saket                Nagpur                    20000     440026
           106 Sonakshi             Hyderabad                 10000     500001
           102 Soni                 Mumbai                    60000     400001
           104 Tanmay               Nagpur                    45000     440001
           110 Zaid                 Pune                      25000     411002
    
    10 rows selected.
    
    II. SQL> SELECT * FROM Employee ORDER BY EMPNAME DESC;
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           110 Zaid                 Pune                      25000     411002
           104 Tanmay               Nagpur                    45000     440001
           102 Soni                 Mumbai                    60000     400001
           106 Sonakshi             Hyderabad                 10000     500001
           109 Saket                Nagpur                    20000     440026
           105 Mayur                Kerala                    65000     682001
           108 Kapil                Bhubaneswar               50000     751001
           101 Himanshu             Pune                     100000     411001
           107 Himanshi             Goa                       30000     403001
           103 Ayush                Delhi                  48000.75     110001
    
    10 rows selected.
    
    III. SQL> SELECT * FROM Employee ORDER BY EMPNAME ASC;
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           103 Ayush                Delhi                  48000.75     110001
           107 Himanshi             Goa                       30000     403001
           101 Himanshu             Pune                     100000     411001
           108 Kapil                Bhubaneswar               50000     751001
           105 Mayur                Kerala                    65000     682001
           109 Saket                Nagpur                    20000     440026
           106 Sonakshi             Hyderabad                 10000     500001
           102 Soni                 Mumbai                    60000     400001
           104 Tanmay               Nagpur                    45000     440001
           110 Zaid                 Pune                      25000     411002
    
    10 rows selected.
    
    IV. SQL> SELECT * FROM Employee ORDER BY EMPSALARY;
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           106 Sonakshi             Hyderabad                 10000     500001
           109 Saket                Nagpur                    20000     440026
           110 Zaid                 Pune                      25000     411002
           107 Himanshi             Goa                       30000     403001
           104 Tanmay               Nagpur                    45000     440001
           103 Ayush                Delhi                  48000.75     110001
           108 Kapil                Bhubaneswar               50000     751001
           102 Soni                 Mumbai                    60000     400001
           105 Mayur                Kerala                    65000     682001
           101 Himanshu             Pune                     100000     411001
    
    10 rows selected.
    
    V. SQL> SELECT * FROM Employee ORDER BY EMPNAME, EMPCITY;
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           103 Ayush                Delhi                  48000.75     110001
           107 Himanshi             Goa                       30000     403001
           101 Himanshu             Pune                     100000     411001
           108 Kapil                Bhubaneswar               50000     751001
           105 Mayur                Kerala                    65000     682001
           109 Saket                Nagpur                    20000     440026
           106 Sonakshi             Hyderabad                 10000     500001
           102 Soni                 Mumbai                    60000     400001
           104 Tanmay               Nagpur                    45000     440001
           110 Zaid                 Pune                      25000     411002
    
    10 rows selected.
    
    VI. SQL> SELECT * FROM Employee ORDER BY EMPNAME ASC, EMPCITY DESC;
    
         EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
    ---------- -------------------- -------------------- ---------- ----------
           103 Ayush                Delhi                  48000.75     110001
           107 Himanshi             Goa                       30000     403001
           101 Himanshu             Pune                     100000     411001
           108 Kapil                Bhubaneswar               50000     751001
           105 Mayur                Kerala                    65000     682001
           109 Saket                Nagpur                    20000     440026
           106 Sonakshi             Hyderabad                 10000     500001
           102 Soni                 Mumbai                    60000     400001
           104 Tanmay               Nagpur                    45000     440001
           110 Zaid                 Pune                      25000     411002
    
    10 rows selected.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

5. GROUP BY:
     I. SQL> SELECT COUNT(EMPID), EMPCITY FROM Employee GROUP BY EMPCITY;
     
     COUNT(EMPID) EMPCITY
     ------------ --------------------
                1 Delhi
                1 Mumbai
                1 Goa
                1 Bhubaneswar
                2 Nagpur
                1 Hyderabad
                2 Pune
                1 Kerala
     
     8 rows selected.
     
     II. SQL> SELECT COUNT(EMPID), EMPCITY FROM Employee GROUP BY EMPCITY ORDER BY COUNT(EMPID) DESC;
     
     COUNT(EMPID) EMPCITY
     ------------ --------------------
                2 Pune
                2 Nagpur
                1 Goa
                1 Kerala
                1 Hyderabad
                1 Mumbai
                1 Delhi
                1 Bhubaneswar
     
     8 rows selected.
     
     III. SQL> SELECT Employee.EMPNAME, COUNT(Department.EMPID) AS DeptCount FROM Department
              2  LEFT JOIN Employee ON Department.EMPID = Employee.EMPID
              3  GROUP BY Employee.EMPNAME;
     
     EMPNAME               DEPTCOUNT
     -------------------- ----------
     Ayush                         1
     Saket                         1
     Himanshi                      1
     Zaid                          1
     Soni                          1
     Tanmay                        1
     Sonakshi                      1
     Mayur                         1
     Himanshu                      1
     Kapil                         1
     
     10 rows selected.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

6. HAVING:
     I. SQL> SELECT COUNT(EMPID), EMPCITY FROM Employee GROUP BY EMPCITY HAVING COUNT(EMPID) > 2;
     
     no rows selected
     
     II. SQL> SELECT COUNT(EMPID), EMPCITY FROM Employee GROUP BY EMPCITY HAVING COUNT(EMPID) > 1;
     
     COUNT(EMPID) EMPCITY
     ------------ --------------------
                2 Nagpur
                2 Pune
