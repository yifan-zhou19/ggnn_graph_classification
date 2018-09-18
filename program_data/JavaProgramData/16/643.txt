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
		c = (int)(a / 10) % 10;
		d = (int)(a / 100) % 10;
		e = (int)(a / 1000) % 10;
		if (a >= 0 && a < 10)
		{
			System.out.printf("%d\n",a);
		}
		else if (a >= 10 && a < 100)
		{
			System.out.printf("%d%d\n",b,c);
		}
		else if (a >= 100 && a < 1000)
		{
			System.out.printf("%d%d%d\n",b,c,d);
		}
		else
		{
			System.out.printf("%d%d%d%d\n",b,c,d,e);
		}
		return 0;
	}
}

