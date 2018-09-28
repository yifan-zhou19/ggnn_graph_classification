package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 10000;
		b = n / 1000 - a * 10;
		c = n / 100 - a * 100 - b * 10;
		e = n % 10;
		d = (n % 100 - e) / 10;
	if (a != 0)
	{
		m = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
	}
		else
		{
			if (b != 0)
			{
				m = e * 1000 + d * 100 + c * 10 + b;
			}
			else
			{
				if (c != 0)
				{
					m = e * 100 + d * 10 + c;
				}
				else
				{
					if (b != 0)
					{
						m = e * 10 + d;
					}
					else
					{
						m = e;
					}
				}
			}
		}
		System.out.printf("%d",m);

	}
}

