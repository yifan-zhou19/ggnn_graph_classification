package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Integer.parseInt(tempVar);
		}
		while (1000 * a <= e-1000)
		{
			a++;
		}
		while (1000 * a + 100 * b <= e-100)
		{
			b++;
		}
		while (1000 * a + 100 * b + 10 * c <= e-10)
		{
			c++;
		}
		d = e-10 * c - 100 * b - 1000 * a;
		if (a > 0)
		{
			System.out.printf("%d%d%d%d",d,c,b,a);
		}
		else
		{
			if (b > 0)
			{
			System.out.printf("%d%d%d",d,c,b);
			}
		else
		{
			if (c > 0)
			{
			System.out.printf("%d%d",d,c);
			}
		else
		{
			System.out.printf("%d",d);
		}
		}
		}
	}
}

