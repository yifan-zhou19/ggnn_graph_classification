package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 6;
		while (i <= n)
		{
			a = 3;
			e = 1;
			f = 1;
			while ((a <= i / 2) & (e != 0 || f != 0))
			{
				b = i - a;
				c = 3;
				d = 3;
				e = 0;
				f = 0;
				while (c <= Math.sqrt(a))
				{
					if (a % c == 0)
					{
						e = e+1;
					}
					else
					{
						e = e;
					}
					c++;
				}
				while (d <= Math.sqrt(b))
				{
					if (b % d == 0)
					{
						f = f + 1;
					}
					else
					{
						f = f;
					}
					d++;
				}
				a = a + 2;
			}
			System.out.printf("%ld=%ld+%ld\n",i,a - 2,b);
			i = i + 2;
		}
	}

}

