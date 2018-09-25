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
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x / 10000;
		b = (x % 10000) / 1000;
		c = (x % 1000) / 100;
		d = (x % 100) / 10;
		e = x % 10;
		System.out.printf("%d",e);
		if (d != 0 || c != 0 || b != 0 || a != 0)
		{
			System.out.printf("%d",d);
		}
		if (c != 0 || b != 0 || a != 0)
		{
			System.out.printf("%d",c);
		}
		if (b != 0 || a != 0)
		{
			System.out.printf("%d",b);
		}
		if (a != 0)
		{
			System.out.printf("%d",a);
		}
		return 0;
	}

}

