package Model;

import java.sql.Date;

public class Worker  extends Person {

	private int Rank;
	
	public Worker(int Id, String firstName, String surName, Date birthDate,
			int gender, int phoneNumber, String contry,int Rank) {
		super(Id, firstName, surName, birthDate, gender, phoneNumber, contry);
		this.Rank= Rank;
		// TODO Auto-generated constructor stub
	}

}
