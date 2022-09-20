package lt.lhu.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		double a = 2;
		double b = 10;
		double h = 1;
		double x;
		double Fx;
		x = a;
		while (x!=b+1)
		{System.out.print(x);
		Fx = 2*(Math.tan(x/2))+1;
		System.out.println("\t"+Fx);
		x = x+h;}
			}

}
