package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int a;
		int b;
		int c;
		int d;
		int e;
		int p;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = m / 10000;
		b = m % 10000 / 1000;
		c = m % 1000 / 100;
		d = m % 100 / 10;
		e = m % 10;
		p = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
		x = (10 - a) / 10;
		y = 1 - x;
		p = p / 10 * x + p * y;
		x = (10 - b) / 10;
		y = 1 - x;
		p = p / 10 * x + p * y;
		x = (10 - c) / 10;
		y = 1 - x;
		p = p / 10 * x + p * y;
		x = (10 - d) / 10;
		y = 1 - x;
		p = p / 10 * x + p * y;
		System.out.printf("%d",p);
	}



}

