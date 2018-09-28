package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a = int x;
	int b = int y;
		int m;
		int n;
		int i = 0;
		int k;
		int j;
		int[] c = new int[20];
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
		for (k = m;k <= n;k++)
		{
			if (a(k) == 1 && k == b(k))
			{
				c[i] = k;
		i++;
			}
		}
		if (i == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",c[0]);
			for (j = 1;j < i;j++)
			{
				System.out.printf(",%d",c[j]);
			}
		}
	}
	public static int a(int x)
	{
			int k;
			int t;
			k = Math.sqrt(x);
			for (t = 2;t <= k;t++)
			{
				if (x % t == 0)
				{
					break;
				}
			}
				if (t > k)
				{
					return (1);
				}
				else
				{
					return (0);
				}
	}
	public static int b(int y)
	{
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		int a6;
		int a7;
		int a8;
		int z;
		a1 = y / 10000000;
		a2 = (y % 10000000) / 1000000;
		a3 = (y % 1000000) / 100000;
		a4 = (y % 100000) / 10000;
		a5 = (y % 10000) / 1000;
		a6 = (y % 1000) / 100;
		a7 = (y % 100) / 10;
		a8 = y % 10;
		if (a1 != 0)
		{
			z = a8 * 10000000 + a7 * 1000000 + a6 * 100000 + a5 * 10000 + a4 * 1000 + a3 * 100 + a2 * 10 + a1;
		}
		else if (a2 != 0)
		{
			z = a8 * 1000000 + a7 * 100000 + a6 * 10000 + a5 * 1000 + a4 * 100 + a3 * 10 + a2;
		}
			else if (a3 != 0)
			{
				z = a8 * 100000 + a7 * 10000 + a6 * 1000 + a5 * 100 + a4 * 10 + a3;
			}
			else if (a4 != 0)
			{
				z = a8 * 10000 + a7 * 1000 + a6 * 100 + a5 * 10 + a4;
			}
			else if (a5 != 0)
			{
				z = a8 * 1000 + a7 * 100 + a6 * 10 + a5;
			}
			else if (a6 != 0)
			{
				z = a8 * 100 + a7 * 10 + a6;
			}
			else if (a7 != 0)
			{
				z = a8 * 10 + a7;
			}
			else
			{
				z = a8;
			}
			return (z);
	}



}

