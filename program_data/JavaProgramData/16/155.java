package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		a = i / 10000;
		b = (i - a * 10000) / 1000;
		c = (i - 10000 * a - 1000 * b) / 100;
		d = (i - 10000 * a - 1000 * b - 100 * c) / 10;
		e = i - 10000 * a - 1000 * b - 100 * c - 10 * d;
		if (a == 0 && b == 0 && c == 0 && d == 0)
		{
			System.out.printf("%d\n",e);
		}
		else if (a == 0 && b == 0 && c == 0)
		{
			System.out.printf("%d%d\n",e,d);
		}
		else if (a == 0 && b == 0)
		{
			System.out.printf("%d%d%d\n",e,d,c);
		}
		else if (a == 0)
		{
			System.out.printf("%d%d%d%d\n",e,d,c,b);
		}
		else
		{
			System.out.printf("%d%d%d%d%d\n",e,d,c,b,a);
		}
	}

}

