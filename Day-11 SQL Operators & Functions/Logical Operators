1. ALL:
     SQL> SELECT * FROM Employee WHERE EMPSALARY > ALL (SELECT EMPSALARY FROM Employee WHERE EMPSALARY = 10000);
     
          EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
     ---------- -------------------- -------------------- ---------- ----------
            109 Saket                Nagpur                    20000     440026
            110 Zaid                 Pune                      25000     411002
            107 Himanshi             Goa                       30000     403001
            104 Tanmay               Nagpur                    45000     440001
            103 Ayush                Delhi                  48000.75     110001
            108 Kapil                Bhubaneswar               50000     751001
            102 Soni                 Mumbai                    60000     400001
            105 Mayur                Kerala                    65000     682001
            101 Himanshu             Pune                     100000     411001
     
     9 rows selected.

2. AND:
     SQL> SELECT * FROM Employee WHERE EMPCITY = 'Nagpur' AND EMPSALARY > 20000;
     
          EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
     ---------- -------------------- -------------------- ---------- ----------
            104 Tanmay               Nagpur                    45000     440001

3. ANY:
     SQL> SELECT * FROM Employee WHERE EMPSALARY > ANY (SELECT EMPSALARY FROM Employee WHERE EMPSALARY > 10000);
     
          EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
     ---------- -------------------- -------------------- ---------- ----------
            101 Himanshu             Pune                     100000     411001
            105 Mayur                Kerala                    65000     682001
            102 Soni                 Mumbai                    60000     400001
            108 Kapil                Bhubaneswar               50000     751001
            103 Ayush                Delhi                  48000.75     110001
            104 Tanmay               Nagpur                    45000     440001
            107 Himanshi             Goa                       30000     403001
            110 Zaid                 Pune                      25000     411002
     
     8 rows selected.

4. BETWEEN:
     SQL> SELECT * FROM Employee WHERE EMPSALARY BETWEEN 30000 AND 50000;
     
          EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
     ---------- -------------------- -------------------- ---------- ----------
            103 Ayush                Delhi                  48000.75     110001
            104 Tanmay               Nagpur                    45000     440001
            107 Himanshi             Goa                       30000     403001
            108 Kapil                Bhubaneswar               50000     751001

5. IN:
     SQL> SELECT * FROM Employee WHERE EMPCITY IN ('Nagpur', 'Pune');
     
          EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
     ---------- -------------------- -------------------- ---------- ----------
            101 Himanshu             Pune                     100000     411001
            104 Tanmay               Nagpur                    45000     440001
            109 Saket                Nagpur                    20000     440026
            110 Zaid                 Pune                      25000     411002

6. LIKE:
     SQL> SELECT * FROM Employee WHERE EMPCITY LIKE 'N%';
     
          EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
     ---------- -------------------- -------------------- ---------- ----------
            104 Tanmay               Nagpur                    45000     440001
            109 Saket                Nagpur                    20000     440026

7. NOT LIKE:
     SQL> SELECT * FROM Employee WHERE EMPCITY NOT LIKE 'N%';
     
          EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
     ---------- -------------------- -------------------- ---------- ----------
            101 Himanshu             Pune                     100000     411001
            102 Soni                 Mumbai                    60000     400001
            103 Ayush                Delhi                  48000.75     110001
            105 Mayur                Kerala                    65000     682001
            106 Sonakshi             Hyderabad                 10000     500001
            107 Himanshi             Goa                       30000     403001
            108 Kapil                Bhubaneswar               50000     751001
            110 Zaid                 Pune                      25000     411002
     
     8 rows selected.

8. OR:
     SQL> SELECT * FROM Employee WHERE EMPCITY = 'Nagpur' OR EMPCITY = 'Pune';
     
          EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
     ---------- -------------------- -------------------- ---------- ----------
            101 Himanshu             Pune                     100000     411001
            104 Tanmay               Nagpur                    45000     440001
            109 Saket                Nagpur                    20000     440026
            110 Zaid                 Pune                      25000     411002

9. SOME:
     SQL> SELECT * FROM Employee WHERE EMPSALARY > SOME (SELECT EMPSALARY FROM Employee WHERE EMPSALARY > 30000);
     
          EMPID EMPNAME              EMPCITY               EMPSALARY    PINCODE
     ---------- -------------------- -------------------- ---------- ----------
            101 Himanshu             Pune                     100000     411001
            102 Soni                 Mumbai                    60000     400001
            103 Ayush                Delhi                  48000.75     110001
            105 Mayur                Kerala                    65000     682001
            108 Kapil                Bhubaneswar               50000     751001
