package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static void input()
	{
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 0;k < m;k++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[k] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void arrange(int n, int m, int[] x, int[] y)
	{
		int j;
		int k;
		int t;
		for (j = 0;j < n - 1;j++)
		{
			for (k = 0;k < n - 1 - j;k++)
			{
				if (x[k] > x[k + 1])
				{
					t = x[k];
					x[k] = x[k + 1];
					x[k + 1] = t;
				}
			}
		}
		for (j = 0;j < m - 1;j++)
		{
			for (k = 0;k < m - 1 - j;k++)
			{
				if (y[k] > y[k + 1])
				{
					t = y[k];
					y[k] = y[k + 1];
					y[k + 1] = t;
				}
			}
		}
	}
	public static void combine(int n, int m, int[] x, int[] y)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			x[n + i] = y[i];
		}
	}
	public static void print(int n, int m, int[] x)
	{
		int i;
		for (i = 0;i < m + n - 1;i++)
		{
			System.out.printf("%d ",x[i]);
		}
		System.out.printf("%d",x[m + n - 1]);
	}

	public static void Main()
	{
		input();
		arrange(n, m, a, b);
		combine(n, m, a, b);
		print(n, m, a);
	}



}

