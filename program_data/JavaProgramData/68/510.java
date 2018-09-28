package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int h;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		b = 1;
		g = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i++)
		{
		if (i % 2 == 0)
		{
			System.out.printf("%d=",i);
			k = i / 2;
			for (j = 3;j <= k;j++)
			{
				b = 1;
				g = 1;
				if (j % 2 == 0)
				{
					continue;
				}
				h = Math.sqrt(j);
				for (t = 2;t <= h;t++)
				{
					a = j % t;

					if (a == 0)
					{
						b = 0;
						break;
					}
				}

				if (b == 1)
				{
					c = i - j;
					d = Math.sqrt(c);
					for (e = 2;e <= d;e++)
					{
						if (e % 2 == 0)
						{
							continue;
						}
						f = c % e;

						if (f == 0)
						{
							g = 0;
							break;
						}
					}
					if (g == 1)
					{
					System.out.printf("%d+%d\n",j,c);
					 break;
					}
				}
			}
		}
		}
	}




}

