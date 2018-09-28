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
		int x;
		int y;
		int i;
		int j = 0;
		int m;
		int n;
		int[] p = new int[32768];
		int q = 0;
		int s;
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (x = m;x <= n;x++)
		{
			a = x / 10000;
			b = x % 10000 / 1000;
			c = x % 1000 / 100;
			d = x % 100 / 10;
			e = x % 10;
			if (a != 0)
			{
				y = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
			}
			else
			{
				if (b != 0)
				{
					y = e * 1000 + d * 100 + c * 10 + b;
				}
				else
				{
					if (c != 0)
					{
						y = e * 100 + d * 10 + c;
					}
					else
					{
						if (d != 0)
						{
							y = e * 10 + d;
						}
						else
						{
							y = e;
						}
					}
				}
			}
			t = Math.sqrt(x);
			for (i = 2;i <= t;i++)
			{
				if (x % i == 0)
				{
					j++;
				}
			}
			if (x == y && j == 0)
			{
				p[q] = x;
				q++;
				j = 0;
			}
			else
			{
				j = 0;
				continue;
			}
		}
		if (q == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (s = 0;s <= q - 2;s++)
			{
				System.out.printf("%ld,",p[s]);
			}
			System.out.printf("%ld\n",p[q - 1]);
		}
	}
}

