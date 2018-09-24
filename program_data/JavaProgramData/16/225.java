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
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n;
		a = n % 10;
		n = n / 10;
		b = n % 10;
		n = n / 10;
		c = n % 10;
		n = n / 10;
		d = n % 10;
		if (m < 10)
		{
			System.out.printf("%d",m);
		}
			else
			{
			if (m < 100)
			{
				System.out.printf("%d%d",a,b);
			}
			else
			{
				if (m < 1000)
				{
					System.out.printf("%d%d%d",a,b,c);
				}
				else
				{
					if (m < 10000)
					{
						System.out.printf("%d%d%d%d",a,b,c,d);
					}
				}
			}
			}
					return 0;
	}
}

