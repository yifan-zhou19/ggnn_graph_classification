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
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = n;
		a = n / 10000;
		n = n % 10000;
		b = n / 1000;
		n = n % 1000;
		c = n / 100;
		n = n % 100;
		d = n / 10;
		n = n % 10;
		if (x < 10)
		{
			System.out.printf("%d\n",n);
		}
		else
		{
			if (x < 100)
			{
				System.out.printf("%d%d\n",n,d);
			}
			else
			{
				if (x < 1000)
				{
					System.out.printf("%d%d%d\n",n,d,c);
				}
				else
				{
					if (x < 10000)
					{
						System.out.printf("%d%d%d%d\n",n,d,c,b);
					}
					else
					{
						System.out.printf("%d%d%d%d%d\n",n,d,c,b,a);
					}
				}
			}
		}
		return 0;
	}
}

