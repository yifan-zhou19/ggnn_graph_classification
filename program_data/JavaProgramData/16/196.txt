package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 1000;
		b = n / 100 - 10 * a;
		c = n / 10 - 100 * a - 10 * b;
		d = n - 1000 * a - 100 * b - 10 * c;
		if (a == 0)
		{
			if (b == 0)
			{
				if (c == 0)
				{
					System.out.printf("%d\n",d);
				}
				else
				{
					System.out.printf("%d%d\n",d,c);
				}
			}
			else
			{
				System.out.printf("%d%d%d\n",d,c,b);
			}
		}
		else
		{
			System.out.printf("%d%d%d%d\n",d,c,b,a);
		}
		return 0;
	}
}

