package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		double a = 7;
		double b = 8;
		double c = 9;
		double ch;
		double kor;
		
		// тут чета намудрил ))  r = ((b+Math.sqrt(Math.pow(b,2)+(4*a*c)))/(2a))-(Math.pow(a,3)*c+b));
		kor =(b+ Math.sqrt(Math.pow(b, 2) + 4*a*c));
		ch = (kor/(2*a))-(Math.pow(a, 3)*c+b); //а так получается 
		System.out.println(ch);
	}

}
