package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
	System.out.println("Для вычисления выражения введите числа a b  и c \r Введите число a:");
	Scanner sc = new Scanner(System.in);
	double a = sc.nextDouble();
	System.out.println("Введите число b:");
	double b = sc.nextDouble();
	System.out.println("Введите число c:");
	double c = sc.nextDouble();
	double d = Math.pow(a,2) - Math.pow((b-c),2) + Math.log(Math.pow(b,2) +1); 
	System.out.println(d);
}
}
