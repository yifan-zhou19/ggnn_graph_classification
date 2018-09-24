package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a / 1000;
		c = a % 1000;
		d = c % 100;
		e = d % 10;
		c = c / 100;
		d = d / 10;
		System.out.printf("%d",e);
		if (d != 0,(b + c + d) != 0)
		{
			System.out.printf("%d",d);
		}
		if (c != 0,(b + c) != 0)
		{
			System.out.printf("%d",c);
		}
		if (b != 0)
		{
			System.out.printf("%d",b);
		}
	}

}

