package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		a = s / 10000;
		b = (s - 10000 * a) / 1000;
		c = (s - 10000 * a - 1000 * b) / 100;
		d = (s - 10000 * a - 1000 * b - 100 * c) / 10;
		e = (s - 10000 * a - 1000 * b - 100 * c - 10 * d);
		if (a != 0)
		{
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		else if (b != 0)
		{
			System.out.printf("%d%d%d%d",e,d,c,b);
		}
		else if (c != 0)
		{
			System.out.printf("%d%d%d",e,d,c);
		}
		else if (b != 0)
		{
			System.out.printf("%d%d",e,d);
		}
		else if (e != 0)
		{
			System.out.printf("%d",e);
		}
		else
		{
			System.out.print("0");
		}

		return 0;
	}

}

