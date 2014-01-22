BeanTdd
===================
Automate test EJB with Glassfish Embedded & TestNG.


Software Library
-----
 1. Java SE 7
 -  Java EE 7
 -  Maven
 -  TestNG


Software Infrastructure
-----
 1. Netbeans 7.4
 -  Glassfish v4
 -  PostgreSQL 9.2


Prerequire
-----
 1. Config path at <glassfish.embedded-static-shell.jar /> in pom.xml
 -  Create database "bean" and execute schema-databasevendor.sql.
 -  Create jdbc-connection-pool, jdbc-resource in Glassfish consule.


Execute
-----
 1. mvn clean build
 -  mvn test


Result
-----
Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0


BUILD SUCCESS

Total time: 1:29.072s
Finished at: Wed Jan 22 14:40:14 ICT 2014
Final Memory: 10M/157M
