package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int a;
		int b;
		int c;
		int d;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = (int)(n / 1000);
		b = (int)(n / 100 - a * 10);
		c = (int)(n / 10 - a * 100 - b * 10);
		d = (int)(n - a * 1000 - b * 100 - c * 10);
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

