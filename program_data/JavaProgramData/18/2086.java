package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int p;
		int sum;
		int i;
		int j;
		int k;
		void m1(int n,int a[100][100]);
		void m2(int n,int a[100][100]);
		void deal(int n,int a[100][100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = n;
		while (k-- != 0)
		{
			sum = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i][j] = Integer.parseInt(tempVar2);
					}
				}
			}
			p = n - 1;
			while (p != 0)
			{
				m1(p + 1, a);
				m2(p + 1, a);
				sum += a[1][1];
				deal(p + 1, a);
				p--;
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
	public static void m1(int n, int[][] a)
	{
		int min;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			min = a[i][0];
			for (j = 0;j < n;j++)
			{
				if (min == 0)
				{
					break;
				}
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			if (min != 0)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] -= min;
				}
			}
		}
	}
	public static void m2(int n, int[][] a)
	{
		int min;
		int i;
		int j;
		for (j = 0;j < n;j++)
		{
			min = a[0][j];
			for (i = 0;i < n;i++)
			{
				if (min == 0)
				{
					break;
				}
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			if (min != 0)
			{
				for (i = 0;i < n;i++)
				{
					a[i][j] -= min;
				}
			}
		}
	}
	public static void deal(int n, int[][] a)
	{
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				a[j][i] = a[j + 1][i];
			}
		}
	}
}

