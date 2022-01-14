package personnel;

import java.util.ArrayList;
import java.util.Date;

import Utility.Login;
import Utility.RetirementRecord;
import Utility.TransactionRecord;

public class Manager implements Login{
	private String name;
	private String username, password;

	private Integer ID;
	private static Integer managerCount=0;
	private static Integer month=-1;

	Manager (String name, int ID){
		this.name=name;
		ID= managerCount++;
	}
	
	public static Integer getMonth() {
		return month;
	}
	public static void setMonth(Integer month) {
		Manager.month = month;
	}
	
	public void initiateRetirement(levelOne officer,ArrayList<levelOne> LevelOne, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		 Veteran vt = new Veteran(officer, 8000.00, 0.00);
		 Date date = new Date();
		 RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		 retirementRecord.add(rt);
		 veteran.add(vt);
		 int i=0;
		 for(i=0;i<LevelOne.size();i++)
		 {
			if(officer.getID()==LevelOne.get(i).getID())
			{
				break;
			}
		 }
		 if(i!=LevelOne.size())
		 {
			LevelOne.remove(i);
		 }
		 
	}
	public void initiateDischarge(levelOne officer,ArrayList<levelOne> LevelOne, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		 Veteran vt = new Veteran(officer, 8000.00, 0.00);
		 Date date = new Date();
		 RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		 retirementRecord.add(rt);
		 veteran.add(vt);
		 int i=0;
		 for(i=0;i<LevelOne.size();i++)
		 {
			if(officer.getID()==LevelOne.get(i).getID())
			{
				break;
			}
		 }
		 if(i!=LevelOne.size())
		 {
			LevelOne.remove(i);
		 }
		 /*
		  * TODO: Check if both retirement and discharge differ in any way?
		  */
	}

	public void initiateRetirement(levelTwo officer,ArrayList<levelTwo> LevelTwo, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		Veteran vt = new Veteran(officer, 10000.00, 0.00);
		Date date = new Date();
		RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		retirementRecord.add(rt);
		veteran.add(vt);
		int i=0;
		for(i=0;i<LevelTwo.size();i++)
		{
			if(officer.getID()==LevelTwo.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelTwo.size())
		{
			LevelTwo.remove(i);
		}
	}
	public void initiateDischarge(levelTwo officer,ArrayList<levelTwo> LevelTwo, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		Veteran vt = new Veteran(officer, 10000.00, 0.00);
		Date date = new Date();
		RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		retirementRecord.add(rt);
		veteran.add(vt);
		int i=0;
		for(i=0;i<LevelTwo.size();i++)
		{
			if(officer.getID()==LevelTwo.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelTwo.size())
		{
			LevelTwo.remove(i);
		}
	}

	public void initiateRetirement(levelThree officer,ArrayList<levelThree> LevelThree, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		Veteran vt = new Veteran(officer, 12000.00, 0.00);
		Date date = new Date();
		RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		retirementRecord.add(rt);
		veteran.add(vt);
		int i=0;
		for(i=0;i<LevelThree.size();i++)
		{
			if(officer.getID()==LevelThree.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelThree.size())
		{
			LevelThree.remove(i);
		}	
	}
	public void initiateDischarge(levelThree officer,ArrayList<levelThree> LevelThree, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		Veteran vt = new Veteran(officer, 12000.00, 0.00);
		Date date = new Date();
		RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		retirementRecord.add(rt);
		veteran.add(vt);
		int i=0;
		for(i=0;i<LevelThree.size();i++)
		{
			if(officer.getID()==LevelThree.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelThree.size())
		{
			LevelThree.remove(i);
		}	
	}

	public void initiateRetirement(levelFour officer,ArrayList<levelFour> LevelFour, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		Veteran vt = new Veteran(officer, 12000.00, 0.00);
		Date date = new Date();
		RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		retirementRecord.add(rt);
		veteran.add(vt);
		int i=0;
		for(i=0;i<LevelFour.size();i++)
		{
			if(officer.getID()==LevelFour.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelFour.size())
		{
			LevelFour.remove(i);
		}		
	}
	public void initiateDischarge(levelFour officer,ArrayList<levelFour> LevelFour, ArrayList<Veteran> veteran, 
			ArrayList<RetirementRecord> retirementRecord) {
		Veteran vt = new Veteran(officer, 12000.00, 0.00);
		Date date = new Date();
		RetirementRecord rt = new RetirementRecord(officer.getID(),date, officer.getLevel());
		retirementRecord.add(rt);
		veteran.add(vt);
		int i=0;
		for(i=0;i<LevelFour.size();i++)
		{
			if(officer.getID()==LevelFour.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelFour.size())
		{
			LevelFour.remove(i);
		}		
	}
	public boolean validate(String username,String password)
	{
		return (this.username.equals(username) && this.password.equals(password));
	}
	public void initiatePayroll(ArrayList<levelOne> LevelOne, ArrayList <levelTwo> LevelTwo, ArrayList<levelThree> LevelThree,
			ArrayList<levelFour> LevelFour, ArrayList<Veteran> veteran, ArrayList<TransactionRecord> transactionRecord) {
		
		Date date = new Date();
		int i=0;
		for(i=0;i<LevelOne.size();i++)
		{
			Date tempDate = new Date();
			Integer month = tempDate.getMonth();
			Manager.month = month;
			LevelOne.get(i).bankaccount.setBalance(LevelOne.get(i).getBalance()+LevelOne.get(i).getBaseSalary());
			System.out.println("salary paid for: "+LevelOne.get(i).getID()+" "+LevelOne.get(i).getName()+" "
					+LevelOne.get(i).getLevel());
			TransactionRecord tr = new TransactionRecord(LevelOne.get(i).getID(), date, 
					LevelOne.get(i).bankaccount.getAccountNumber(), LevelOne.get(i).getBaseSalary(), "Salary");
			transactionRecord.add(tr);
		}
		
		for(i=0;i<LevelTwo.size();i++)
		{
			LevelTwo.get(i).bankaccount.setBalance(LevelTwo.get(i).getBalance()+LevelTwo.get(i).getBaseSalary());
			System.out.println("salary paid for: "+LevelTwo.get(i).getID()+" "+LevelTwo.get(i).getName()+" "
					+LevelTwo.get(i).getLevel());
			TransactionRecord tr = new TransactionRecord(LevelTwo.get(i).getID(), date, 
					LevelTwo.get(i).bankaccount.getAccountNumber(), LevelTwo.get(i).getBaseSalary(), "Salary");
			transactionRecord.add(tr);
		}
		
		for(i=0;i<LevelThree.size();i++)
		{
			LevelThree.get(i).bankaccount.setBalance(LevelThree.get(i).getBalance()+LevelThree.get(i).getBaseSalary());
			System.out.println("salary paid for: "+LevelThree.get(i).getID()+" "+LevelThree.get(i).getName()+" "
					+LevelThree.get(i).getLevel());
			TransactionRecord tr = new TransactionRecord(LevelThree.get(i).getID(), date, 
					LevelThree.get(i).bankaccount.getAccountNumber(), LevelThree.get(i).getBaseSalary(), "Salary");
			transactionRecord.add(tr);
		}
		
		for(i=0;i<LevelFour.size();i++)
		{
			LevelFour.get(i).bankaccount.setBalance(LevelFour.get(i).getBalance()+LevelFour.get(i).getBaseSalary());
			System.out.println("salary paid for: "+LevelFour.get(i).getID()+" "+LevelFour.get(i).getName()+" "
					+LevelFour.get(i).getLevel());
			TransactionRecord tr = new TransactionRecord(LevelFour.get(i).getID(), date, 
					LevelFour.get(i).bankaccount.getAccountNumber(), LevelFour.get(i).getBaseSalary(), "Salary");
			transactionRecord.add(tr);
		}
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	

} 