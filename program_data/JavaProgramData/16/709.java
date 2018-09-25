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
		d = a % 10; //??
		b = (a % 1000 - a % 100) / 100; //??
		c = (a % 100 - d) / 10; //??
		e = (a % 10000 - a % 1000) / 1000;
		if (a >= 1000)
		{
	System.out.printf("%d%d%d%d\n",d,c,b,e);
		}
		else if (a >= 100)
		{
			System.out.printf("%d%d%d\n",d,c,b);
		}
		else if (a >= 10)
		{
			System.out.printf("%d%d\n",d,c);
		}
		else
		{
			System.out.printf("%d\n",d);
		}
		return 0;
	}
}

