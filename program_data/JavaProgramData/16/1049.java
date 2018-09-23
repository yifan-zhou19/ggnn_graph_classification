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
		c = (a % 100 - a % 10) / 10;
		d = (a % 1000 - a % 100) / 100;
		e = (a - a % 1000) / 1000;
		if (e != 0)
		{
			System.out.printf("%d%d%d%d",b,c,d,e);
		}
		else
		{
			if (d != 0)
			{
				System.out.printf("%d%d%d",b,c,d);
			}
			else
			{
			if (c != 0)
			{
				System.out.printf("%d%d",b,c);
			}
			else
			{
				System.out.printf("%d",b);
			}
			}
		}
		return 0;
	}
}

