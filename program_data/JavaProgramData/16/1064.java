package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n % 10;
		n = (n - a) / 10;
		b = n % 10;
		n = (n - b) / 10;
		c = n % 10;
		n = (n - c) / 10;
		d = n % 10;
		if (d != 0)
		{
			System.out.printf("%d%d%d%d",a,b,c,d);
		}
		else if (c != 0)
		{
			System.out.printf("%d%d%d",a,b,c);
		}
		else if (b != 0)
		{
			System.out.printf("%d%d",a,b);
		}
		else
		{
			System.out.printf("%d",a);
		}
		return 0;
	}
}

