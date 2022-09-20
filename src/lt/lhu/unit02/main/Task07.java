package lt.lhu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		int a = -3;
		int b = 5;
		int c = -4;
		if (a>0)
		{System.out.print(Math.pow(a, 2));}
			else 
			{System.out.println(Math.pow(a, 4));} //почему выводит положительное число если входное отрицательное?
		System.out.println(b>0? Math.pow(b, 2): Math.pow(b, 4));// и тут тоже?
		
			boolean x = c>0;
			int s;
			if (x)
				{s=2;}
			else
				{s=4;}
			System.out.println(Math.pow(c, s));
	}

}
