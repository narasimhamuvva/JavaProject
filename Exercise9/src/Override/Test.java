package Override;

public class Test {
	public static void main(String args[]){
		Sbi sb= new Sbi();
		Icici ic=new Icici();
		Axis ax=new Axis();
System.out.println("SBI INTEREST RATE="+sb.getinterestrate()+"%");
System.out.println("ICICI INTEREST RATE="+ic.getinterestrate()+"%");
System.out.println("AXIS INTEREST RATE="+ax.getinterestrate()+"%");
		
	}

}
