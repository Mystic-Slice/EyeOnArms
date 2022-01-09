package personnel;

public class Veteran extends Personnel{
	public double pensionAmount;
	public static int veteranCount=0;
	public Veteran(levelOne officer,double pensionAmount,String name, Double balance ) {
		super(name, balance);
		this.pensionAmount = pensionAmount;
		this.id = veteranCount++;
	}
	public Veteran(levelTwo officer,double pensionAmount,String name, Double balance ) {
		super(name, balance);
		this.pensionAmount = pensionAmount;
		this.id = veteranCount++;
	}
	public Veteran(levelThree officer,double pensionAmount,String name, Double balance ) {
		super(name, balance);
		this.pensionAmount = pensionAmount;
		this.id = veteranCount++;;
	}
	public Veteran(levelFour officer,double pensionAmount,String name, Double balance ) {
		super(name, balance);
		this.pensionAmount = pensionAmount;
		this.id = veteranCount++;
	}
	
	public static int getVeteranCount() {
		return veteranCount;
	}
	
	
	
	
	
}
