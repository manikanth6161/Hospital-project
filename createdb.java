/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_mangament_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Adarsh Maurya
 */
public class createdb {
        // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/";

   //  Database credentials
   static String USER = "root";
   static String PASS = "123456";
   public createdb(){
        DbDetails data=new DbDetails();
       String details[]=data.getDetails();
       USER=details[0];;
       PASS=details[1];
   }
   public  void createDB() {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //STEP 4: Execute a query
      System.out.println("Creating database...");
      stmt = conn.createStatement();
      
      String sql1 = "CREATE DATABASE HOSPITAL_DB";
      stmt.executeUpdate(sql1);
      System.out.println("Database created successfully...");
      String sql2=" create table flag(ch varchar(1) not null,primary key(ch));";
      String sql3="insert into flag values('Y');";
      establishconnection ob=new establishconnection();
      int f1=ob.update(sql2);
      if(f1==0){
          System.out.println("error in creating flag of data base ");
      }
      else 
          System.out.println("flag table has been created");
      
      int f2=ob.update(sql3);
      if(f2==0){
          System.out.println("error in setting flag of data base ");
      }
      else 
          System.out.println("database has been flagged");
      String sql4="create table adminlogin(username varchar(30) not null,password varchar(15) not null,primary key(username));";
       int f3=ob.update(sql4);
      if(f3==0){
          System.out.println("error in creating table adminlogin ");
      }
      else 
          System.out.println("adminlogin table created");
      String sql5="create table employee(employeeID varchar(4) not null,Name varchar(30) not null,specialization varchar(30),address varchar(30) not null,dateofjoin varchar(10),Sunday varchar(1),Monday varchar(1),tuesday varchar(1),wednesday varchar(1),thursday varchar(1),friday varchar(1),saturday varchar(1),salary varchar(10),contacts varchar(14),img varchar(80),designation varchar(30) not null,primary key(employeeID));";  
       int f4=ob.update(sql5);
      if(f4==0){
          System.out.println("error in creating table employee ");
      }
      else 
          System.out.println("employee table has been created");
      String sql6="create table patient(patientno int(4) not null,name varchar(30) not null,age int(3) not null,address varchar(30) not null,doctor varchar(20) not null,checkup date not null,credit varchar(8),debit varchar(8),remaining varchar(8),admitted varchar(1) default 'N',admsndate date,bedno varchar(4),contacts varchar(15),medicdetails longtext);";
       int f5=ob.update(sql6);
      if(f5==0){
          System.out.println("error in creating patient table ");
      }
      else 
          System.out.println("patient table has been created");
      String sql7=" create table payments_patient(patientno int(4) not null,name varchar(30) not null,paid char(1),payments longtext,dop varchar(10));";
       int f6=ob.update(sql7);
      if(f6==0){
          System.out.println("error in creating pp table ");
      }
      else 
          System.out.println("pp table has been created");
   }catch(Exception e){
      //Handle errors for JDBC
      System.err.println("Database creation failed...");
   }
   }
}

