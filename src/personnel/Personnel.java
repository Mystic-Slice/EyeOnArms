package personnel;

import java.util.Scanner;
import Utility.BankAccount;

<<<<<<< HEAD
public  class Personnel{
=======
public class Personnel {
>>>>>>> 0803c8e9d1f26576ed9e545656e5187a73df1cc9
	Scanner sc=new Scanner(System.in);
	public Integer  id;
	public String name;
	public BankAccount bankaccount;
	//give bank account belonging to the class bank account
	public static int PersonnelCount=0;
	public Personnel(String name, Double balance){
		this.name=name;
		this.id=PersonnelCount+1;
		this.bankaccount=new BankAccount(balance);
	}
	public static int GetPersonnelCount() {
		return PersonnelCount;
	}
	
<<<<<<< HEAD
=======
	public Double getBalance()
	{
		return this.bankaccount.getbalance();
	}
	
>>>>>>> 0803c8e9d1f26576ed9e545656e5187a73df1cc9
	
	
}
