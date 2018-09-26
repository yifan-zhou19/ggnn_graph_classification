package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a / 10 == 0)
		{
			System.out.printf("%d",a);
		}
		else if (a / 100 == 0)
		{
			int b;
			int c;
			b = a % 10;
			c = a / 10;
			System.out.printf("%d%d\n",b,c);
		}
		else if (a / 1000 == 0)
		{
			int b;
			int c;
			int d;
			b = a % 10;
			c = a / 10 % 10;
			d = a / 100;
			System.out.printf("%d%d%d\n",b,c,d);
		}
		else if (a / 10000 == 0)
		{
			int b;
			int c;
			int d;
			int e;
			b = a % 10;
			c = a / 10 % 10;
			d = a / 100 % 10;
			e = a / 1000 % 10;
			System.out.printf("%d%d%d%d\n",b,c,d,e);
		}
		else if (a / 100000 == 0)
		{
			int b;
			int c;
			int d;
			int e;
			int f;
			b = a % 10;
			c = a / 10 % 10;
			d = a / 100 % 10;
			e = a / 1000 % 10;
			f = a / 10000 % 10;
			System.out.printf("%d%d%d%d%d\n",b, c, d, e, f);
		}
		else
		{
			System.out.print("error\n");
		}
	}
}

