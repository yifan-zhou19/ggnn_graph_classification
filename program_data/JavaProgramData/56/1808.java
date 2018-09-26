package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int m;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = m % 10;
		b = (m % 100 - m % 10) / 10;
		c = (m % 1000 - m % 100) / 100;
		d = (m % 10000 - m % 1000) / 1000;
		e = (m % 100000 - m % 10000) / 10000;
		if (e != 0)
		{
			y = a * 10000 + b * 1000 + c * 100 + d * 10 + e;
			System.out.printf("%ld",y);
		}
		else
		{
			if (d != 0)
			{
			y = a * 1000 + b * 100 + c * 10 + d;
			System.out.printf("%d",y);
			}
			else
			{
				if (c != 0)
				{
				y = a * 100 + b * 10 + c;
				System.out.printf("%d",y);
				}
				else
				{
					if (b != 0)
					{
					y = a * 10 + b;
					System.out.printf("%d",y);
					}
					else
					{
						y = a;
						System.out.printf("%d",y);
					}
				}
			}
		}
	}

}

