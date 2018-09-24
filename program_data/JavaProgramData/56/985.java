package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int c;
		int d;
		int e;
		a = n % 10;
		b = (n / 10) % 10;
		c = (n / 100) % 10;
		d = (n / 1000) % 10;
		e = n / 10000;
		if (b == 0)
		{
			System.out.printf("%d",a);
		}
		else if (c == 0)
		{
			System.out.printf("%d%d",a,b);
		}
		else if (d == 0)
		{
			System.out.printf("%d%d%d",a,b,c);
		}
		else if (e == 0)
		{
			System.out.printf("%d%d%d%d",a,b,c,d);
		}
		else
		{
			System.out.printf("%d%d%d%d%d",a,b,c,d,e);
		}
		return 0;
	}
}

