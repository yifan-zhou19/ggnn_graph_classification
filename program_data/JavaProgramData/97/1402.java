package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int n;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x % 10 < 5)
		{
			f = x % 10;
		}
		else
		{
			e = 1;
			f = x % 10 - 5;
		}
		if (x > 100)
		{
			a = x / 100;
		}
		if (x > 10)
		{
			n = (x / 10) % 10;
			if (n - 5 >= 0)
			{
				b = 1;
				if ((n - 5) % 2 == 0)
				{
					c = (n - 5) / 2;
				}
				else
				{
					d = 1;
					c = (n - 5 - d) / 2;
				}
			}
			else if (n % 2 == 0)
			{
				c = n / 2;
			}
			else
			{
				d = 1;
				c = (n - d) / 2;
			}
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);

		return 0;
	}
}

