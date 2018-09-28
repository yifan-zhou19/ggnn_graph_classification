package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num;
		int[] a = new int[6];
		int b;
		int i;
		for (i = 0;i <= 5;i++)
		{
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a[i] = Integer.parseInt(tempVar);
			 }
		}
		for (i = 0;i <= 5;i++)
		{
			b = reverse(a[i]);
			System.out.printf("%d\n",b);
		}
		return 0;
	}
	public static int reverse(int num)
	{
		int c;
		int d;
		int e;
		int f;
		int g;
		int j;
		int k;
		int l;
		int m;
		int n;
		int o;
		int p;
		int q;
		int x;
		if (num == 0)
		{
			x = num;
		}
		else
		{
			if (num > 0)
			{
				c = num % 10000;
				d = num - c;
				e = d / 10000;
				f = c % 1000;
				g = c - f;
				j = g / 1000;
				k = f % 100;
				l = f - k;
				m = l / 100;
				n = k % 10;
				o = k - n;
				p = o / 10;
				q = 10000 * n + 1000 * p + 100 * m + 10 * j + e;
				if (e != 0)
				{
					x = q;
				}
				if (e == 0 && j != 0)
				{
					x = q / 10;
				}
				if (e == 0 && j == 0 && m != 0)
				{
					x = q / 100;
				}
				if (e == 0 && j == 0 && m == 0 && p != 0)
				{
					x = q / 1000;
				}
				if (e == 0 && j == 0 && m == 0 && p == 0 && n != 0)
				{
					x = q / 10000;
				}
			}
			else
			{
				if (num < 0)
				{
					num = 0 - num;
					c = num % 10000;
					d = num - c;
					e = d / 10000;
					f = c % 1000;
					g = c - f;
					j = g / 1000;
					k = f % 100;
					l = f - k;
					m = l / 100;
					n = k % 10;
					o = k - n;
					p = o / 10;
					q = 10000 * n + 1000 * p + 100 * m + 10 * j + e;
					if (e != 0)
					{
					   x = q;
					}
					if (e == 0 && j != 0)
					{
					  x = q / 10;
					}
					if (e == 0 && j == 0 && m != 0)
					{
						x = q / 100;
					}
					if (e == 0 && j == 0 && m == 0 && p != 0)
					{
						x = q / 1000;
					}
					if (e == 0 && j == 0 && m == 0 && p == 0 && n != 0)
					{
						x = q / 10000;
					}
					x = 0 - x;
				}
			}
		}
		return (x);
	}
}

