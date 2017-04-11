This is Demo application for creating monitoring services in Java Enterprise application.

This application contains below Modlules.
Parent						--> Parent Module
INGEar						--> Ear Module which creates EAR. Below MOdules are added in single EAR	
WebModule					--> War Module which is dependent on below 3 modules.
Utility						--> Jar module which consist Java code for DAO,Service layer
Dependency-1				--> Independant Jar module
Dependency-2				--> Independant Jar module

Understanding :
1. Parent pom is with pom packging structurere.
2. Utility	,Dependency-1 and Dependency-2 are added as dependency in WebModule.
3. It is assumed that Dependency-2 and Dependency-1 would have other rest web-services which is accessed by WebModule.
4. INGEar modle consist Ear file which include WebModule war file.

This appplication consist 5 different endpoints : 
1. 	http://localhost:8080/WebModule/rest/statuscheck/db 		--> This will give us status whether DB server as UP or DOWN
2.  http://localhost:8080/WebModule/rest/statuscheck/app1		--> This will give us status whether dependent Dependency-1 is Up or DOWN
3.  http://localhost:8080/WebModule/rest/statuscheck/app2		--> This will give us status whether dependent Dependency-2 is Up or DOWN
4.  http://localhost:8080/WebModule/rest/statuscheck/app		--> This will give us UP stats of main application (WebModule)
5.  http://localhost:8080/WebModule/rest/statuscheck/dependency	--> This will give us list of dependency from Database.


Technology Used :
Java 		: 1.8
Maven 		: 3.0.4
Spring 		: 3.2.2
JPA
Hibernate
Database 	:MySQL
Server 		: JBoss


For screenshot and steps for executing application read Steps.doc file.