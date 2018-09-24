package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 10)
		{
			System.out.printf("%d", n);
		}
		else
		{
			if (n <= 100)
			{
				int a;
				int b;
				int c;
				a = n / 10;
				b = n % 10;
				c = b * 10 + a;
				System.out.printf("%d", c);
			}
			else
			{
				if (n <= 1000)
				{
					int d;
					int e;
					int f;
					int g;
					d = n / 100;
					e = (n - d * 100) / 10;
					f = (n - d * 100) % 10;
					g = f * 100 + e * 10 + d;
					   System.out.printf("%d", g);
				}
				else
				{
					if (n <= 10000)
					{
						int h;
						int i;
						int j;
						int k;
						int l;
						h = n / 1000;
						i = (n - h * 1000) / 100;
						j = (n - h * 1000 - i * 100) / 10;
						k = (n - h * 1000 - i * 100) % 10;
						l = k * 1000 + j * 100 + i * 10 + h;
						System.out.printf("%d", l);
					}
					else
					{
						if (n <= 100000)
						{
							int m;
							int o;
							int p;
							int q;
							int r;
							int s;
							m = n / 10000;
							o = (n - m * 10000) / 1000;
							p = (n - m * 10000 - o * 1000) / 100;
							q = (n - m * 10000 - o * 1000 - p * 100) / 10;
							r = (n - m * 10000 - o * 1000 - p * 100) % 10;
							s = r * 10000 + q * 1000 + p * 100 + o * 10 + m;
							System.out.printf("%d", s);
						}
					}
				}
			}
		}
		return 0;
	}
}

