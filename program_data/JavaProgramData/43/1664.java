package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
	a = 3;

		while ((2 * a) <= m)
		{
	b = m - a;
	c = Math.sqrt(a);
	d = Math.sqrt(b);
	e = c;
	f = d;



			while (e >= 2)
			{
	if (a % e == 0)
	{
	break;
	}
	else
	{
	e--;
	}
			}
				while (f >= 2)
				{
	if (b % f == 0)
	{
	break;
	}
	else
	{
	f--;
	}
				}
				if (e == 1 && f == 1)
				{
					System.out.printf("%d %d\n",a,b);
				}
				a++;

		}
	return (0);
	}
}

