package Model;

import java.security.acl.LastOwnerException;
import java.sql.Date;
import java.time.LocalDate;


public class Client extends Person  {

private int LicenceSerialNum;
private Date IssueDate;
private Date ExpiredDate;

	
	public Client(int Id, String FirstName, String SurName, Date BirthDate,
			Date IssueDate, Date ExpiredDate, int Gender, int LicenceSerialNum ,int PhoneNumber,String contry) {
		super(Id,FirstName,SurName,BirthDate,Gender,PhoneNumber,contry);
		this.LicenceSerialNum=LicenceSerialNum;
		this.IssueDate=IssueDate;
		this.ExpiredDate=ExpiredDate;
		
		
		// TODO Auto-generated constructor stub
	}

}
