package org.bank;

public class BankInfo2 extends AxisBank {
private void savings() {
	System.out.println("savings:46500");// TODO Auto-generated method stub

}
private void fixed() {
	System.out.println("Fixed:50000");// TODO Auto-generated method stub
	System.out.println("First Cloning Project Success");
}
public static void main(String[] args) {
	BankInfo2 b=new BankInfo2();
	b.savings();
	b.fixed();
	b.deposit();
}
}
