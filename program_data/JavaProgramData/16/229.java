package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x == 10000)
		{
		System.out.print("00001");
		}
		else if (x < 10000 && x >= 1000)
		{
		a = x % 10;
		b = ((x - a) / 10) % 10;
		c = ((x - a - 10 * b) / 100) % 10;
		d = (x - a - 10 * b - 100 * c) / 1000;
		System.out.printf("%d%d%d%d",a,b,c,d);
		}
		else if (x < 1000 && x >= 100)
		{
		a = x % 10;
		b = ((x - a) / 10) % 10;
		c = (x - a - 10 * b) / 100;
		System.out.printf("%d%d%d",a,b,c);
		}
		else if (x < 100 && x >= 10)
		{
		a = x % 10;
		b = (x - a) / 10;
		System.out.printf("%d%d",a,b);
		}
		else
		{
			System.out.printf("%d",x);
		}
		return 0;
	}

}

