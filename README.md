####JPA Hibernate Entity Listener
##Recipe 18 (Spring Cache Abstraction)

In this recipe you will be shown how to use EntityListener
We will be using an annotation-based approach.

Using hsqldb 2.3.3 version to support fully JDBC 3.0

Build Dependencies
-------

| Requirement      |  Version   |
|------------------|:----------:|
|  Apache Maven    |    3.x     |
|  Java JDK        |    >= 6    |
|  Eclipse         | >= Helios  |
|  hsqldb          | >= 2.0.x  |


Building The Recipe
-------
1. Compile: mvn clean install
2. execute: mvn exec:java

   EmployeeDebugListener class handle the event: preUpdate the entity.
   

Output:

validate: Employee id: 1
Employee.resetSyncTime called on employee id: 1
 INFO [org.exoplatform.recipe18.Main.main()] (Main.java:27) - preUpdate..........
EmployeeDebugListener.Update called on employee id: 1
Employee.resetSyncTime called on employee id: 1

Table Name: EMPLOYEE
 Row:
    Column Name: ID,  
    Column Type: INTEGER:  
    Column Value: 1

    Column Name: NAME,  
    Column Type: VARCHAR:  
    Column Value: Thanh
