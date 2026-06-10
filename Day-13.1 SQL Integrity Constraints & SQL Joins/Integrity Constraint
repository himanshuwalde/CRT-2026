1. NOT NULL:
    SQL> CREATE TABLE Person (
        PID number(4) NOT NULL,
        FNAME varchar2(225) NOT NULL,
        LNAME varchar2(255) NOT NULL,
        AGE number(3)
        );
    
    Table created.
    
    SQL> DESC Person;
     Name                                      Null?    Type
     ----------------------------------------- -------- ----------------------------
     PID                                       NOT NULL NUMBER(4)
     FNAME                                     NOT NULL VARCHAR2(225)
     LNAME                                     NOT NULL VARCHAR2(255)
     AGE                                                NUMBER(3)

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

2. DEFAULT:
    SQL> CREATE TABLE Person (
            PID number(4) NOT NULL,
            FNAME varchar2(225) NOT NULL,
            LNAME varchar2(255) NOT NULL,
            AGE number(3) DEFAULT 22
            );
        
        Table created.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

3. PRIMARY KEY:
    SQL> CREATE TABLE Person2 (
            PID NUMBER(4) NOT NULL PRIMARY KEY,
            FNAME VARCHAR(9) NOT NULL,
            LNAME VARCHAR(9),
            Age NUMBER(3)
        );
    
    Table created.
    
    SQL> DESC Person2;
     Name                                      Null?    Type
     ----------------------------------------- -------- ----------------------------
     PID                                       NOT NULL NUMBER(4)
     FNAME                                     NOT NULL VARCHAR2(9)
     LNAME                                              VARCHAR2(9)
     AGE                                                NUMBER(3)

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

4. COMPOSITE PRIMARY KEY:
    SQL> CREATE TABLE Person3 (
            PID NUMBER(4) NOT NULL,
            FNAME VARCHAR(9) NOT NULL,
            LNAME VARCHAR(9),
            Age NUMBER(3),
            CONSTRAINT PK_Person PRIMARY KEY (PID, LNAME)
        );
    
    Table created.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

5. FOREIGN KEY:
    SQL> CREATE TABLE emp5 (
            ENO NUMBER(5) NOT NULL PRIMARY KEY,
            ENAME CHAR(10),
            EMOB NUMBER(10),
            ESAL NUMBER(8,2),
            EADD VARCHAR2(20),
            ECITY CHAR(11),
            EDOJ DATE
        );
    
    Table created.

    SQL> CREATE TABLE department5 (
      2      DNO NUMBER(4),
      3      DNAME VARCHAR2(10),
      4      ENO NUMBER(4),
      5      ECITY VARCHAR2(9),
      6      FOREIGN KEY (ENO) REFERENCES emp5(ENO)
      7  );
    
    Table created.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

6. UNIQUE:
    SQL> CREATE TABLE Person (
            PID NUMBER(4),
            FNAME VARCHAR2(25),
            LNAME VARCHAR2(25),
            EMAIL VARCHAR2(50) UNIQUE
        );
    
    Table created.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

7. CHECK:
    SQL> CREATE TABLE Person (
            PID NUMBER(4),
            FNAME VARCHAR2(25),
            LNAME VARCHAR2(25),
            AGE NUMBER(3) CHECK (AGE >= 18)
        );
    
    Table created.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

8. INDEX:
    SQL> CREATE INDEX idx_fname
        ON Person(FNAME);
    
    Index created.
