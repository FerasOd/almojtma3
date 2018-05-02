package Model;

import java.sql.Date;
import java.time.LocalDate;

import javax.swing.JSpinner.DateEditor;

public class Person {

public String FirstName;
public String surName;
public String contry;
public Date birthDate;//E.G ->17/05/1994
public int  id;//have to be 9 numbers
public int Age;
public int  gender;//0 -> male , 1-> female
public int  phoneNumber;
	
	
	







public Person(int id2, String firstName2, String surName2, Date birthDate2,
		int gender2, int phoneNumber2, String contry2) {
	this.id=id2;
	this.FirstName= firstName2;
	this.surName=surName2;
	this.birthDate=birthDate2;
	this.gender = gender2;
	this.phoneNumber = phoneNumber2;
	this.contry = contry2;
//	this.Age= comp to doo ----------------------------------------------
////this.Age=LocalDate.now().getYear() -  birthDate.getYear();
	// TODO Auto-generated constructor stub
}





	
	
	
	
	
	

}
