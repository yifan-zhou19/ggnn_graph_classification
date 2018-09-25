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
		b = a % 10;
		System.out.printf("%d",b);
		c = a / 10;
		if (c != 0)
		{
			System.out.printf("%d",c % 10);
		}
		d = a / 100;
		if (d != 0)
		{
			System.out.printf("%d",d % 10);
		}
		e = a / 1000;
		if (e != 0)
		{
			System.out.printf("%d",e);
		}

		return 0;
	}
}

