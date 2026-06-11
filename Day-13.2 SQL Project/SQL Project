SQL> CREATE TABLE CUSTOMER (
        CUST_ID VARCHAR2(5) PRIMARY KEY,
        F_NAME VARCHAR2(50),
        L_NAME VARCHAR2(50),
        AREA VARCHAR2(10),
        PHONE_NO VARCHAR2(10)
    );

Table created.

SQL> SELECT * FROM CUSTOMER;

CUST_ F_NAME                                             L_NAME                                             AREA       PHONE_NO
----- -------------------------------------------------- -------------------------------------------------- ---------- ----------
C01   Rahul                                              Sharma                                             DA         9876543210
C02   Priya                                              Patil                                              MU         9876543211
C03   Pooja                                              Joshi                                              GH         9876543212
C04   Amit                                               Verma                                              DA         9876543213
C05   Neha                                               Singh                                              JK         9876543214
C06   Rajesh                                             Kumar                                              MU         9876543215
C07   Kiran                                              Patel                                              GH         9876543216
C08   Sonal                                              Mehta                                              DA         9876543217
C09   Vikas                                              Gupta                                              JK         9876543218
C10   Preeti                                             Desai                                              MU         9876543219

10 rows selected.

SQL> CREATE TABLE CATEGORY (
        CATEGORY_ID VARCHAR2(5) PRIMARY KEY,
        CATEGORY_NAME VARCHAR2(30)
    );

Table created.

SQL> SELECT * FROM CATEGORY;

CATEG CATEGORY_NAME
----- ------------------------------
CT01  Electronics
CT02  Clothing
CT03  Books
CT04  Home
CT05  Sports

SQL> CREATE TABLE PRODUCT (
        PRODUCT_ID VARCHAR2(5) PRIMARY KEY,
        PRODUCT_NAME VARCHAR2(50),
        CATEGORY_ID VARCHAR2(5),
        PRICE NUMBER(8,2),
        STOCK NUMBER,
        CONSTRAINT FK_PRODUCT_CATEGORY
        FOREIGN KEY (CATEGORY_ID)
        REFERENCES CATEGORY(CATEGORY_ID)
   );

Table created.

SQL> SELECT * FROM PRODUCT;

PRODU PRODUCT_NAME                                       CATEG      PRICE      STOCK
----- -------------------------------------------------- ----- ---------- ----------
PR01  Laptop                                             CT01       50000         20
PR02  Mouse                                              CT01         500        100
PR03  Keyboard                                           CT01        1200         50
PR04  TShirt                                             CT02         800         75
PR05  Jeans                                              CT02        1500         40
PR06  Oracle Book                                        CT03         650         30
PR07  Chair                                              CT04        3000         25
PR08  Table                                              CT04        5000         15
PR09  Football                                           CT05         900         40
PR10  Cricket Bat                                        CT05        2500         20

10 rows selected.

SQL> CREATE TABLE ORDERS (
        ORDER_ID VARCHAR2(5) PRIMARY KEY,
        CUST_ID VARCHAR2(5),
        ORDER_DATE DATE,
        TOTAL_AMOUNT NUMBER(10,2),
        CONSTRAINT FK_ORDER_CUSTOMER
        FOREIGN KEY (CUST_ID)
        REFERENCES CUSTOMER(CUST_ID)
    );

Table created.

SQL> SELECT * FROM ORDERS;

ORDER CUST_ ORDER_DAT TOTAL_AMOUNT
----- ----- --------- ------------
O01   C01   05-JUL-23        50500
O02   C02   10-JUL-23         1500
O03   C03   15-AUG-23          650
O04   C04   20-AUG-23         3000
O05   C02   22-AUG-23          900
O06   C05   25-AUG-23         2500
O07   C06   27-AUG-23         5000
O08   C07   30-AUG-23          800

8 rows selected.

SQL> CREATE TABLE ORDER_ITEMS (
        ORDER_ITEM_ID NUMBER PRIMARY KEY,
        ORDER_ID VARCHAR2(5),
        PRODUCT_ID VARCHAR2(5),
        QUANTITY NUMBER,
        PRICE NUMBER(8,2),
        CONSTRAINT FK_OI_ORDER
        FOREIGN KEY (ORDER_ID)
        REFERENCES ORDERS(ORDER_ID),
       CONSTRAINT FK_OI_PRODUCT
       FOREIGN KEY (PRODUCT_ID)
       REFERENCES PRODUCT(PRODUCT_ID)
   );

Table created.

SQL> SELECT * FROM ORDER_ITEMS;

ORDER_ITEM_ID ORDER PRODU   QUANTITY      PRICE
------------- ----- ----- ---------- ----------
            1 O01   PR01           1      50000
            2 O01   PR02           1        500
            3 O02   PR05           1       1500
            4 O03   PR06           1        650
            5 O04   PR07           1       3000
            6 O05   PR09           1        900
            7 O06   PR10           1       2500
            8 O07   PR08           1       5000
            9 O08   PR04           1        800
           10 O02   PR04           4        800

10 rows selected.

SQL> CREATE TABLE INVOICE (
        INV_NO VARCHAR2(5) PRIMARY KEY,
        ORDER_ID VARCHAR2(5),
        INV_DATE DATE,
        AMOUNT NUMBER(10,2),
        CONSTRAINT FK_INVOICE_ORDER
        FOREIGN KEY (ORDER_ID)
        REFERENCES ORDERS(ORDER_ID)
    );

Table created.

SQL> SELECT * FROM INVOICE;

INV_N ORDER INV_DATE      AMOUNT
----- ----- --------- ----------
I01   O01   06-JUL-23      50500
I02   O02   11-JUL-23       1500
I03   O03   16-AUG-23        650
I04   O04   21-AUG-23       3000
I05   O05   23-AUG-23        900
I06   O06   26-AUG-23       2500
I07   O07   28-AUG-23       5000
I08   O08   31-AUG-23        800

8 rows selected.

SQL> CREATE TABLE PAYMENT (
        PAYMENT_ID VARCHAR2(5) PRIMARY KEY,
        INV_NO VARCHAR2(5),
        PAYMENT_DATE DATE,
        PAYMENT_MODE VARCHAR2(20),
        PAYMENT_STATUS VARCHAR2(15),
        CONSTRAINT FK_PAYMENT_INVOICE
        FOREIGN KEY (INV_NO)
        REFERENCES INVOICE(INV_NO)
   );

Table created.

SQL> SELECT * FROM PAYMENT;

PAYME INV_N PAYMENT_D PAYMENT_MODE         PAYMENT_STATUS
----- ----- --------- -------------------- ---------------
P01   I01   06-JUL-23 UPI                  SUCCESS
P02   I02   11-JUL-23 CARD                 SUCCESS
P03   I03   16-AUG-23 UPI                  FAILED
P04   I04   21-AUG-23 CARD                 SUCCESS
P05   I05   23-AUG-23 UPI                  SUCCESS
P06   I06   26-AUG-23 UPI                  SUCCESS
P07   I07   28-AUG-23 CARD                 SUCCESS
P08   I08   31-AUG-23 UPI                  FAILED

8 rows selected.
====================================================================================================================================================================
====================================================================================================================================================================
Question 1
Display all records from the CUSTOMER table.

SQL> SELECT * FROM CUSTOMER;

CUST_ F_NAME                                             L_NAME                                             AREA       PHONE_NO
----- -------------------------------------------------- -------------------------------------------------- ---------- ----------
C01   Rahul                                              Sharma                                             DA         9876543210
C02   Priya                                              Patil                                              MU         9876543211
C03   Pooja                                              Joshi                                              GH         9876543212
C04   Amit                                               Verma                                              DA         9876543213
C05   Neha                                               Singh                                              JK         9876543214
C06   Rajesh                                             Kumar                                              MU         9876543215
C07   Kiran                                              Patel                                              GH         9876543216
C08   Sonal                                              Mehta                                              DA         9876543217
C09   Vikas                                              Gupta                                              JK         9876543218
C10   Preeti                                             Desai                                              MU         9876543219

10 rows selected.
====================================================================================================================================================================
Question 2
Find the first name and area of customer with cust_id = 'C03'.

SQL> SELECT F_NAME, AREA
  2  FROM CUSTOMER
  3  WHERE CUST_ID = 'C03';

F_NAME                                             AREA
-------------------------------------------------- ----------
Pooja                                              GH
====================================================================================================================================================================
Question 3
List names and phone numbers of all customers.

SQL> SELECT F_NAME, L_NAME, PHONE_NO
  2  FROM CUSTOMER;

F_NAME                                             L_NAME                                             PHONE_NO
-------------------------------------------------- -------------------------------------------------- ----------
Rahul                                              Sharma                                             9876543210
Priya                                              Patil                                              9876543211
Pooja                                              Joshi                                              9876543212
Amit                                               Verma                                              9876543213
Neha                                               Singh                                              9876543214
Rajesh                                             Kumar                                              9876543215
Kiran                                              Patel                                              9876543216
Sonal                                              Mehta                                              9876543217
Vikas                                              Gupta                                              9876543218
Preeti                                             Desai                                              9876543219

10 rows selected.
====================================================================================================================================================================
Question 4
Count the total number of customers.

SQL> SELECT COUNT(*) AS TOTAL_CUSTOMERS
  2  FROM CUSTOMER;

TOTAL_CUSTOMERS
---------------
             10
====================================================================================================================================================================
Question 5
Find customers staying in area 'DA', 'MU', or 'GH'.

SQL> SELECT *
  2  FROM CUSTOMER
  3  WHERE AREA IN ('DA','MU','GH');

CUST_ F_NAME                                             L_NAME                                             AREA       PHONE_NO
----- -------------------------------------------------- -------------------------------------------------- ---------- ----------
C01   Rahul                                              Sharma                                             DA         9876543210
C02   Priya                                              Patil                                              MU         9876543211
C03   Pooja                                              Joshi                                              GH         9876543212
C04   Amit                                               Verma                                              DA         9876543213
C06   Rajesh                                             Kumar                                              MU         9876543215
C07   Kiran                                              Patel                                              GH         9876543216
C08   Sonal                                              Mehta                                              DA         9876543217
C10   Preeti                                             Desai                                              MU         9876543219

8 rows selected.
====================================================================================================================================================================
Question 6
Change the area of customer 'C01' to 'JK'.

SQL> UPDATE CUSTOMER
  2  SET AREA = 'JK'
  3  WHERE CUST_ID = 'C01';

1 row updated.
====================================================================================================================================================================
Question 7
Find customers whose first name starts with the letter 'P'.

SQL> SELECT *
  2  FROM CUSTOMER
  3  WHERE F_NAME LIKE 'P%';

CUST_ F_NAME                                             L_NAME                                             AREA       PHONE_NO
----- -------------------------------------------------- -------------------------------------------------- ---------- ----------
C02   Priya                                              Patil                                              MU         9876543211
C03   Pooja                                              Joshi                                              GH         9876543212
C10   Preeti                                             Desai                                              MU         9876543219
====================================================================================================================================================================
Question 8
Find customers whose area has 'A' as the second character.

SQL> SELECT *
  2  FROM CUSTOMER
  3  WHERE AREA LIKE '_A%';

CUST_ F_NAME                                             L_NAME                                             AREA       PHONE_NO
----- -------------------------------------------------- -------------------------------------------------- ---------- ----------
C04   Amit                                               Verma                                              DA         9876543213
C08   Sonal                                              Mehta                                              DA         9876543217
====================================================================================================================================================================
Question 9
Update the phone number of customer 'Rajesh' to 567889.

SQL> UPDATE CUSTOMER
  2  SET PHONE_NO = '567889'
  3  WHERE F_NAME = 'Rajesh';

1 row updated.
====================================================================================================================================================================
Question 10
Delete customer with cust_id = 'C09'.

SQL> DELETE FROM CUSTOMER
  2  WHERE CUST_ID = 'C09';

1 row deleted.
====================================================================================================================================================================
Question 11
Display all product categories.

SQL> SELECT * FROM CATEGORY;

CATEG CATEGORY_NAME
----- ------------------------------
CT01  Electronics
CT02  Clothing
CT03  Books
CT04  Home
CT05  Sports
====================================================================================================================================================================
Question 12
List all products with price greater than 150.

SQL> SELECT *
  2  FROM PRODUCT
  3  WHERE PRICE > 150;

PRODU PRODUCT_NAME                                       CATEG      PRICE      STOCK
----- -------------------------------------------------- ----- ---------- ----------
PR01  Laptop                                             CT01       50000         20
PR02  Mouse                                              CT01         500        100
PR03  Keyboard                                           CT01        1200         50
PR04  TShirt                                             CT02         800         75
PR05  Jeans                                              CT02        1500         40
PR06  Oracle Book                                        CT03         650         30
PR07  Chair                                              CT04        3000         25
PR08  Table                                              CT04        5000         15
PR09  Football                                           CT05         900         40
PR10  Cricket Bat                                        CT05        2500         20

10 rows selected.
====================================================================================================================================================================
Question 13
Find products priced between 100 and 180.

SQL> SELECT *
  2  FROM PRODUCT
  3  WHERE PRICE BETWEEN 100 AND 180;

no rows selected
====================================================================================================================================================================
Question 14
Display product name and price of all products.

SQL> SELECT PRODUCT_NAME, PRICE
  2  FROM PRODUCT;

PRODUCT_NAME                                            PRICE
-------------------------------------------------- ----------
Laptop                                                  50000
Mouse                                                     500
Keyboard                                                 1200
TShirt                                                    800
Jeans                                                    1500
Oracle Book                                               650
Chair                                                    3000
Table                                                    5000
Football                                                  900
Cricket Bat                                              2500

10 rows selected.
====================================================================================================================================================================
Question 15
Count the number of products in each category.

SQL> SELECT CATEGORY_ID, COUNT(*) AS PRODUCT_COUNT
  2  FROM PRODUCT
  3  GROUP BY CATEGORY_ID;

CATEG PRODUCT_COUNT
----- -------------
CT03              1
CT04              2
CT01              3
CT02              2
CT05              2
====================================================================================================================================================================
Question 16
Find the maximum and minimum product price.

SQL> SELECT MAX(PRICE) AS MAX_PRICE,
  2         MIN(PRICE) AS MIN_PRICE
  3  FROM PRODUCT;

 MAX_PRICE  MIN_PRICE
---------- ----------
     50000        500
====================================================================================================================================================================
Question 17
Calculate the average price of all products.

SQL> SELECT AVG(PRICE) AS AVERAGE_PRICE
  2  FROM PRODUCT;

AVERAGE_PRICE
-------------
         6605
====================================================================================================================================================================
Question 18
Find products belonging to 'Electronics' or 'Clothing' category.

SQL> SELECT P.*
  2  FROM PRODUCT P
  3  JOIN CATEGORY C
  4  ON P.CATEGORY_ID = C.CATEGORY_ID
  5  WHERE C.CATEGORY_NAME IN ('Electronics','Clothing');

PRODU PRODUCT_NAME                                       CATEG      PRICE      STOCK
----- -------------------------------------------------- ----- ---------- ----------
PR01  Laptop                                             CT01       50000         20
PR02  Mouse                                              CT01         500        100
PR03  Keyboard                                           CT01        1200         50
PR04  TShirt                                             CT02         800         75
PR05  Jeans                                              CT02        1500         40
====================================================================================================================================================================
Question 19
Increase the price of product 'Laptop' to 55000.

SQL> UPDATE PRODUCT
  2  SET PRICE = 55000
  3  WHERE PRODUCT_NAME = 'Laptop';
====================================================================================================================================================================
Question 20
List products sorted by product name in ascending order.

SQL> SELECT *
  2  FROM PRODUCT
  3  ORDER BY PRODUCT_NAME ASC;

PRODU PRODUCT_NAME                                       CATEG      PRICE      STOCK
----- -------------------------------------------------- ----- ---------- ----------
PR07  Chair                                              CT04        3000         25
PR10  Cricket Bat                                        CT05        2500         20
PR09  Football                                           CT05         900         40
PR05  Jeans                                              CT02        1500         40
PR03  Keyboard                                           CT01        1200         50
PR01  Laptop                                             CT01       55000         20
PR02  Mouse                                              CT01         500        100
PR06  Oracle Book                                        CT03         650         30
PR04  TShirt                                             CT02         800         75
PR08  Table                                              CT04        5000         15

10 rows selected.
====================================================================================================================================================================
Question 21
Display all orders placed by customer 'C02'.

SQL> SELECT *
  2  FROM ORDERS
  3  WHERE CUST_ID = 'C02';

ORDER CUST_ ORDER_DAT TOTAL_AMOUNT
----- ----- --------- ------------
O02   C02   10-JUL-23         1500
O05   C02   22-AUG-23        12000
====================================================================================================================================================================
Question 22
Count total number of orders.

SQL> SELECT COUNT(*) AS TOTAL_ORDERS
  2  FROM ORDERS;

TOTAL_ORDERS
------------
           8
====================================================================================================================================================================
Question 23
Find orders placed before August.

SQL> SELECT *
  2  FROM ORDERS
  3  WHERE ORDER_DATE < TO_DATE('01-08-2023','DD-MM-YYYY');

ORDER CUST_ ORDER_DAT TOTAL_AMOUNT
----- ----- --------- ------------
O01   C01   05-JUL-23        50500
O02   C02   10-JUL-23         1500
====================================================================================================================================================================
Question 24
Display order_id and order_date of all orders.

SQL> SELECT ORDER_ID, ORDER_DATE
  2  FROM ORDERS;

ORDER ORDER_DAT
----- ---------
O01   05-JUL-23
O02   10-JUL-23
O03   15-AUG-23
O04   20-AUG-23
O05   22-AUG-23
O06   25-AUG-23
O07   27-AUG-23
O08   30-AUG-23

8 rows selected.
====================================================================================================================================================================
Question 25
Change the total amount of order 'O05' to 12000.

SQL> UPDATE ORDERS
  2  SET TOTAL_AMOUNT = 12000
  3  WHERE ORDER_ID = 'O05';

1 row updated.
====================================================================================================================================================================
Question 26
Display all order items.

SQL> SELECT *
  2  FROM ORDER_ITEMS;

ORDER_ITEM_ID ORDER PRODU   QUANTITY      PRICE
------------- ----- ----- ---------- ----------
            1 O01   PR01           1      50000
            2 O01   PR02           1        500
            3 O02   PR05           1       1500
            4 O03   PR06           1        650
            5 O04   PR07           1       3000
            6 O05   PR09           1        900
            7 O06   PR10           1       2500
            8 O07   PR08           1       5000
            9 O08   PR04           1        800
           10 O02   PR04           4        800

10 rows selected.
====================================================================================================================================================================
Question 27
Find total quantity ordered for each product.

SQL> SELECT PRODUCT_ID,
  2         SUM(QUANTITY) AS TOTAL_QUANTITY
  3  FROM ORDER_ITEMS
  4  GROUP BY PRODUCT_ID;

PRODU TOTAL_QUANTITY
----- --------------
PR07               1
PR08               1
PR04               5
PR02               1
PR10               1
PR06               1
PR01               1
PR05               1
PR09               1

9 rows selected.
====================================================================================================================================================================
Question 28
Find products ordered more than 3 times.

SQL> SELECT PRODUCT_ID,
  2         SUM(QUANTITY) AS TOTAL_ORDERED
  3  FROM ORDER_ITEMS
  4  GROUP BY PRODUCT_ID
  5  HAVING SUM(QUANTITY) > 3;

PRODU TOTAL_ORDERED
----- -------------
PR04              5
====================================================================================================================================================================
Question 29
Calculate total price per order using order_items table.

SQL> SELECT ORDER_ID,
  2         SUM(QUANTITY * PRICE) AS TOTAL_PRICE
  3  FROM ORDER_ITEMS
  4  GROUP BY ORDER_ID;

ORDER TOTAL_PRICE
----- -----------
O05           900
O07          5000
O06          2500
O08           800
O04          3000
O03           650
O01         50500
O02          4700

8 rows selected.
====================================================================================================================================================================
Question 30
Find products that were never ordered.

SQL> SELECT PRODUCT_NAME
  2  FROM PRODUCT
  3  WHERE PRODUCT_ID NOT IN
  4  (
  5      SELECT PRODUCT_ID
  6      FROM ORDER_ITEMS
  7  );

PRODUCT_NAME
--------------------------------------------------
Keyboard
====================================================================================================================================================================
Question 31
Display all invoices.

SQL> SELECT *
  2  FROM INVOICE;

INV_N ORDER INV_DATE      AMOUNT
----- ----- --------- ----------
I01   O01   06-JUL-23      50500
I02   O02   11-JUL-23       1500
I03   O03   16-AUG-23        650
I04   O04   21-AUG-23       3000
I05   O05   23-AUG-23        900
I06   O06   26-AUG-23       2500
I07   O07   28-AUG-23       5000
I08   O08   31-AUG-23        800

8 rows selected.
====================================================================================================================================================================
Question 32
Find invoice details for order_id 'O03'.

SQL> SELECT *
  2  FROM INVOICE
  3  WHERE ORDER_ID = 'O03';

INV_N ORDER INV_DATE      AMOUNT
----- ----- --------- ----------
I03   O03   16-AUG-23        650
====================================================================================================================================================================
Question 33
Delete invoice with inv_no = 'I08'.

SQL> DELETE FROM INVOICE
  2  WHERE INV_NO = 'I08';
====================================================================================================================================================================
Question 34
Change invoice date of inv_no 'I07' to 16-08-2023.

SQL> UPDATE INVOICE
  2  SET INV_DATE = TO_DATE('16-08-2023','DD-MM-YYYY')
  3  WHERE INV_NO = 'I07';

1 row updated.
====================================================================================================================================================================
Question 35
Find invoices generated between two given dates.

SQL> SELECT *
  2  FROM INVOICE
  3  WHERE INV_DATE BETWEEN
  4  TO_DATE('01-08-2023','DD-MM-YYYY')
  5  AND
  6  TO_DATE('31-08-2023','DD-MM-YYYY');

INV_N ORDER INV_DATE      AMOUNT
----- ----- --------- ----------
I03   O03   16-AUG-23        650
I04   O04   21-AUG-23       3000
I05   O05   23-AUG-23        900
I06   O06   26-AUG-23       2500
I07   O07   16-AUG-23       5000
I08   O08   31-AUG-23        800

6 rows selected.
====================================================================================================================================================================
Question 36
Display all payment records.

SQL> SELECT *
  2  FROM PAYMENT;

PAYME INV_N PAYMENT_D PAYMENT_MODE         PAYMENT_STATUS
----- ----- --------- -------------------- ---------------
P01   I01   06-JUL-23 UPI                  SUCCESS
P02   I02   11-JUL-23 CARD                 SUCCESS
P03   I03   16-AUG-23 UPI                  FAILED
P04   I04   21-AUG-23 CARD                 SUCCESS
P05   I05   23-AUG-23 UPI                  SUCCESS
P06   I06   26-AUG-23 UPI                  SUCCESS
P07   I07   28-AUG-23 CARD                 SUCCESS
P08   I08   31-AUG-23 UPI                  FAILED

8 rows selected.
====================================================================================================================================================================
Question 37
Find payments with payment status 'FAILED'.

SQL> SELECT *
  2  FROM PAYMENT
  3  WHERE PAYMENT_STATUS = 'FAILED';

PAYME INV_N PAYMENT_D PAYMENT_MODE         PAYMENT_STATUS
----- ----- --------- -------------------- ---------------
P03   I03   16-AUG-23 UPI                  FAILED
P08   I08   31-AUG-23 UPI                  FAILED
====================================================================================================================================================================
Question 38
Count number of successful payments.

SQL> SELECT COUNT(*) AS SUCCESSFUL_PAYMENTS
  2  FROM PAYMENT
  3  WHERE PAYMENT_STATUS = 'SUCCESS';

SUCCESSFUL_PAYMENTS
-------------------
                  6
====================================================================================================================================================================
Question 39
Find payments made using 'UPI'.

SQL> SELECT *
  2  FROM PAYMENT
  3  WHERE PAYMENT_MODE = 'UPI';

PAYME INV_N PAYMENT_D PAYMENT_MODE         PAYMENT_STATUS
----- ----- --------- -------------------- ---------------
P01   I01   06-JUL-23 UPI                  SUCCESS
P03   I03   16-AUG-23 UPI                  FAILED
P05   I05   23-AUG-23 UPI                  SUCCESS
P06   I06   26-AUG-23 UPI                  SUCCESS
P08   I08   31-AUG-23 UPI                  FAILED
====================================================================================================================================================================
Question 40
Delete payment record with payment_id 'P09'.

SQL> DELETE FROM PAYMENT
  2  WHERE PAYMENT_ID = 'P09';

0 rows deleted.
====================================================================================================================================================================
Question 41
Display customer names along with their order IDs.

SQL> SELECT C.F_NAME,
  2         C.L_NAME,
  3         O.ORDER_ID
  4  FROM CUSTOMER C
  5  JOIN ORDERS O
  6  ON C.CUST_ID = O.CUST_ID;

F_NAME                                             L_NAME                                             ORDER
-------------------------------------------------- -------------------------------------------------- -----
Rahul                                              Sharma                                             O01
Priya                                              Patil                                              O05
Priya                                              Patil                                              O02
Pooja                                              Joshi                                              O03
Amit                                               Verma                                              O04
Neha                                               Singh                                              O06
Rajesh                                             Kumar                                              O07
Kiran                                              Patel                                              O08

8 rows selected.
====================================================================================================================================================================
Question 42
List product names and quantities ordered by each customer.

SQL> SELECT C.F_NAME,
  2         P.PRODUCT_NAME,
  3         OI.QUANTITY
  4  FROM CUSTOMER C
  5  JOIN ORDERS O
  6  ON C.CUST_ID = O.CUST_ID
  7  JOIN ORDER_ITEMS OI
  8  ON O.ORDER_ID = OI.ORDER_ID
  9  JOIN PRODUCT P
 10  ON OI.PRODUCT_ID = P.PRODUCT_ID;

F_NAME                                             PRODUCT_NAME                                         QUANTITY
-------------------------------------------------- -------------------------------------------------- ----------
Rahul                                              Laptop                                                      1
Rahul                                              Mouse                                                       1
Priya                                              TShirt                                                      4
Kiran                                              TShirt                                                      1
Priya                                              Jeans                                                       1
Pooja                                              Oracle Book                                                 1
Amit                                               Chair                                                       1
Rajesh                                             Table                                                       1
Priya                                              Football                                                    1
Neha                                               Cricket Bat                                                 1

10 rows selected.
====================================================================================================================================================================
Question 43
Find total amount spent by each customer.

SQL> SELECT C.CUST_ID,
  2         C.F_NAME,
  3         SUM(O.TOTAL_AMOUNT) AS TOTAL_SPENT
  4  FROM CUSTOMER C
  5  JOIN ORDERS O
  6  ON C.CUST_ID = O.CUST_ID
  7  GROUP BY C.CUST_ID, C.F_NAME;

CUST_ F_NAME                                             TOTAL_SPENT
----- -------------------------------------------------- -----------
C05   Neha                                                      2500
C01   Rahul                                                    50500
C02   Priya                                                    13500
C03   Pooja                                                      650
C04   Amit                                                      3000
C06   Rajesh                                                    5000
C07   Kiran                                                      800

7 rows selected.
====================================================================================================================================================================
Question 44
Display invoice number and customer name.

SQL> SELECT I.INV_NO,
  2         C.F_NAME,
  3         C.L_NAME
  4  FROM CUSTOMER C
  5  JOIN ORDERS O
  6  ON C.CUST_ID = O.CUST_ID
  7  JOIN INVOICE I
  8  ON O.ORDER_ID = I.ORDER_ID;

INV_N F_NAME                                             L_NAME
----- -------------------------------------------------- --------------------------------------------------
I01   Rahul                                              Sharma
I05   Priya                                              Patil
I02   Priya                                              Patil
I03   Pooja                                              Joshi
I04   Amit                                               Verma
I06   Neha                                               Singh
I07   Rajesh                                             Kumar
I08   Kiran                                              Patel

8 rows selected.
====================================================================================================================================================================
Question 45
Find customers who have placed at least one order.

SQL> SELECT DISTINCT C.*
  2  FROM CUSTOMER C
  3  JOIN ORDERS O
  4  ON C.CUST_ID = O.CUST_ID;

CUST_ F_NAME                                             L_NAME                                             AREA       PHONE_NO
----- -------------------------------------------------- -------------------------------------------------- ---------- ----------
C02   Priya                                              Patil                                              MU         9876543211
C03   Pooja                                              Joshi                                              GH         9876543212
C07   Kiran                                              Patel                                              GH         9876543216
C04   Amit                                               Verma                                              DA         9876543213
C05   Neha                                               Singh                                              JK         9876543214
C01   Rahul                                              Sharma                                             JK         9876543210
C06   Rajesh                                             Kumar                                              MU         567889

7 rows selected.
====================================================================================================================================================================
Question 46
Find customers who have not placed any orders.

SQL> SELECT *
  2  FROM CUSTOMER
  3  WHERE CUST_ID NOT IN
  4  (
  5      SELECT CUST_ID
  6      FROM ORDERS
  7  );

CUST_ F_NAME                                             L_NAME                                             AREA       PHONE_NO
----- -------------------------------------------------- -------------------------------------------------- ---------- ----------
C08   Sonal                                              Mehta                                              DA         9876543217
C10   Preeti                                             Desai                                              MU         9876543219
====================================================================================================================================================================
Question 47
Display product name and category name for all products.

SQL> SELECT P.PRODUCT_NAME,
  2         C.CATEGORY_NAME
  3  FROM PRODUCT P
  4  JOIN CATEGORY C
  5  ON P.CATEGORY_ID = C.CATEGORY_ID;

PRODUCT_NAME                                       CATEGORY_NAME
-------------------------------------------------- ------------------------------
Laptop                                             Electronics
Mouse                                              Electronics
Keyboard                                           Electronics
TShirt                                             Clothing
Jeans                                              Clothing
Oracle Book                                        Books
Chair                                              Home
Table                                              Home
Football                                           Sports
Cricket Bat                                        Sports

10 rows selected.
====================================================================================================================================================================
Question 48
Find total sales amount for each category.

SQL> SELECT C.CATEGORY_NAME,
  2         SUM(OI.QUANTITY * OI.PRICE) AS TOTAL_SALES
  3  FROM CATEGORY C
  4  JOIN PRODUCT P
  5  ON C.CATEGORY_ID = P.CATEGORY_ID
  6  JOIN ORDER_ITEMS OI
  7  ON P.PRODUCT_ID = OI.PRODUCT_ID
  8  GROUP BY C.CATEGORY_NAME;

CATEGORY_NAME                  TOTAL_SALES
------------------------------ -----------
Clothing                              5500
Books                                  650
Electronics                          50500
Home                                  8000
Sports                                3400
====================================================================================================================================================================
Question 49
Find the customer who has spent the maximum amount.

SQL> SELECT *
  2  FROM
  3  (
  4      SELECT C.CUST_ID,
  5             C.F_NAME,
  6             SUM(O.TOTAL_AMOUNT) AS TOTAL_SPENT
  7      FROM CUSTOMER C
  8      JOIN ORDERS O
  9      ON C.CUST_ID = O.CUST_ID
 10      GROUP BY C.CUST_ID, C.F_NAME
 11      ORDER BY TOTAL_SPENT DESC
 12  )
 13  WHERE ROWNUM = 1;

CUST_ F_NAME                                             TOTAL_SPENT
----- -------------------------------------------------- -----------
C01   Rahul                                                    50500
====================================================================================================================================================================
Question 50
Display product names ordered by customers from area 'DA'.

SQL> SELECT DISTINCT P.PRODUCT_NAME
  2  FROM CUSTOMER C
  3  JOIN ORDERS O
  4  ON C.CUST_ID = O.CUST_ID
  5  JOIN ORDER_ITEMS OI
  6  ON O.ORDER_ID = OI.ORDER_ID
  7  JOIN PRODUCT P
  8  ON OI.PRODUCT_ID = P.PRODUCT_ID
  9  WHERE C.AREA = 'DA';

PRODUCT_NAME
--------------------------------------------------
Chair
