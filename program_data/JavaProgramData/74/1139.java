package <missing>;

public class GlobalMembers
{
	public static int y = 0;
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		int l;
		int x;
		int p = 0;
		int[] a = new int[10000];
		int[] b = new int[10000];
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
		int huiwen = new int(int j,int x,int y);
		for (i = m;i <= n;i++)
		{
			for (j = 2;i >= j;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (i == j)
			{
				if (j >= 1000000 && j < 10000000)
				{
					x = 7;
				}
				if (j >= 100000 && j < 1000000)
				{
					x = 6;
				}
				if (j >= 10000 && j < 100000)
				{
					x = 5;
				}
				if (j >= 1000 && j < 10000)
				{
					x = 4;
				}
				if (j > 100 && j < 1000)
				{
					x = 3;
				}
				if (j > 10 && j < 100)
				{
					x = 2;
				}
				if (j >= 0 && j < 10)
				{
					x = 1;
				}

				a[k] = j;
				k = k + 1;
			}
		}
		for (l = 0;l < k;l++)
		{
			n = huiwen(a[l], x, y);
			if (n == a[l])
			{
				b[p] = a[l];
				p = p + 1;
			}
		}
		if (p == 0)
		{
			System.out.print("no");
		}
		else
		{
		for (l = 0;l < p - 1;l++)
		{
			System.out.printf("%d,",b[l]);
		}
		System.out.printf("%d",b[p - 1]);
		}
	}

	public static int huiwen(int j,int x,int y)
	{
		if (j == 0)
		{
			return (y);
		}
		else
		{
			y = y * 10 + j % 10;

			huiwen(j / 10, x - 1, y);
		}
	}








}

