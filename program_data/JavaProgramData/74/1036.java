package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int p;
		int t;
		int[] a = new int[10000];
		int y = 0;
		int k;
		int q = 0;
		int x = 1;
		int r;
		int q1;
		int g;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 10000;i++)
		{
			a[i] = 0;
		}
		for (i = m;i <= n;i++)
		{
		if (m < 2)
		{
			System.out.print("2");
		}
		p = 0;
		for (j = 2;j < i;j++)
		{

			if (i % j == 0)
			{
			p = p + 1;
			}
		}
		if (p == 0)
		{
				if (i < 10)
				{
					a[y] = i;
					y = y + 1;
				}
				else
				{
					x = 1;
				for (k = 0;;k++)
				{
					x = x * 10;
					if (x > i)
					{
						break;
					}
				}
				r = x / 10;
				q = 0;
				g = i;
				for (k = 1;k < x;k = k * 10)
				{
					if (g >= 10)
					{
					q1 = g % 10;
					}
					else
					{
						q1 = g;
					}
					q = q + r * q1;
					r = r / 10;
					g = g / 10;

				}

				if (q == i)
				{
					a[y] = i;
					y = y + 1;
				}
				}
		}
		}

				if (a[0] == 0)
				{

				System.out.print("no");
				}
				else
				{
					System.out.printf("%d",a[0]);
				for (i = 1;i < y;i++)
				{
		System.out.printf(",%d",a[i]);
				}
				}
	}
}

