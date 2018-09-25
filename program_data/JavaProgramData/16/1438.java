package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int x;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a < 10)
		{
			System.out.printf("%d",a);
		}
		else if (a == 10)
		{
			b = 0;
			c = 1;
			System.out.printf("%d%d",b,c);
		}
		else if (a > 10 && a < 100)
		{
			b = a / 10;
			c = a - b * 10;
			x = c * 10 + b;
			System.out.printf("%d",x);
		}
		else if (a == 100)
		{
			b = 1;
			System.out.printf("%d%d%d",y,y,b);
		}
		else if (a > 100 && a < 1000)
		{
			b = a / 100;
			c = (a - 100 * b) / 10;
			d = a - 100 * b - 10 * c;
			x = d * 100 + c * 10 + b;
			System.out.printf("%d",x);
		}
		else if (a == 1000)
		{
			b = 1;
			System.out.printf("%d%d%d%d",y,y,y,b);
		}
		else if (a > 1000 && a < 10000)
		{
		b = a / 1000;
		c = (a - b * 1000) / 100;
		d = (a - b * 1000 - c * 100) / 10;
		e = a - b * 1000 - c * 100 - d * 10;
		x = e * 1000 + d * 100 + c * 10 + b;
		System.out.printf("%d",x);
		}
		else if (a == 10000)
		{
			b = 1;
			System.out.printf("%d%d%d%d%d",y,y,y,y,b);
		}
		return 0;
	}

}

