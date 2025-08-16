# Employee Management System (Java + JDBC + MySQL)

A simple **CRUD application** built using **Java + JDBC + MySQL** that allows you to:

1. Fetch employees
2.Insert a new employee  
3.Update an existing employee  
4.Delete an employee

##  Features
1. **Menu-driven program** using `switch-case` and `do-while` loop  
2.Used **PreparedStatement** to avoid SQL Injection  
3.Clean JDBC code  
4.Easy to run in **Eclipse / VS Code**

## Technologies used
1.Java
2.MySQL
3.JDBC Driver

## Project Structure
Project_fin:
   src/ # Java source code
     BankClass.java
    
sql:
  database_setup.
  sql README.md


##Database
Run the following SQL 
CREATE DATABASE school;
USE school;

CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(20)
);

INSERT INTO employee VALUES (101, "priti");
INSERT INTO employee VALUES (102, "diya");
INSERT INTO employee VALUES (103, "khushi");
INSERT INTO employee VALUES (104, "dhruv");
INSERT INTO employee VALUES (105, "Arya");


##Java Setup

Open the project in Eclipse

Add the MySQL JDBC Connector (mysql-connector-j-8.x.x.jar) to your project’s Build Path.

Right click project -> Build Path -> Configure Build Path -> Add External JARs -> select the connector jar.

Update DB credentials in FinalClass.java if needed:

String url = "jdbc:mysql://localhost:3306/bank";
String uname = "your_name";
String pass = "your_password";

Run the Program

Run FinalClass.java

You will see a menu like this:
--Menu--
1. Fetch data
2. Insert data
3. Update data
4. Delete data
5. Exit
Enter choice: 1

Author:Diya Bajaj
Developed as a learning project to practice Java + JDBC + MySQL.
