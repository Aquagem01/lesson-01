package lt.lhu.unit02.main;

public class Task02 {

	public static void main(String[] args) {
		double kat1 = 2.6;
		double kat2 = 3.4;
		double gip;
		double sq;
		gip = Math.pow(kat1,2) + Math.pow(kat2,2);
		gip = Math.sqrt(gip);
		sq = (kat1*kat2)/2;
		System.out.println("Длинна гипотенузы = " + gip);
		System.out.println("Площадь треугольника = " + sq);
	}

}
