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
		a = n % 10;
		b = n / 10 % 10;
		c = n / 100 % 10;
		d = n / 1000 % 10;
		if (n >= 10)
		{
			if (n / 10 >= 10)
			{
				if (n / 100 >= 10)
				{
					if (n / 1000 < 10)
					{
					System.out.printf("%d%d%d%d\n",a,b,c,d);
					}
				}
				else
				{
				System.out.printf("%d%d%d\n",a,b,c);
				}
			}
			else
			{
			System.out.printf("%d%d\n",a,b);
			}
		}
		else
		{
		System.out.printf("%d\n",n);
		}
	}
}

