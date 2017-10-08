package com.ust.db
@GrabConfig(systemClassLoader=true)
@Grab('mysql:mysql-connector-java:5.1.6')
import groovy.sql.Sql


class DBAccess{
	static void main(def args){
		def sql = Sql.newInstance("jdbc:mysql://localhost:3306/ustdb", "root",
				"root", "com.mysql.jdbc.Driver")

		def users = sql.dataSet('user')
		println users;

		users.each{println it}

		//{asDate(it.dateOfBirth) > asDate('1973-1-1') }

		def selectByName = users.findAll{obj -> obj.name == "Ravi"}
		println selectByName.sql
		println selectByName

		selectByName.each{println it}
	}
}




//sql.eachRow("select u.name from User u") {
//			println "${it.name}"
//		}

