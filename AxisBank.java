package assignment.week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
	System.out.println("overriding deposit method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
	}

}
