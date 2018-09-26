package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int[][] a = new int[50][50];
		(int)(*pa)[50];
		int i;
		int j;
		int l = 0;
		int max = new int(int m,int a[50]);
		int min = new int(int n,int i,int max,int p[50]);
		pa = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= m - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (min(n, i, max(m, a[i]), pa) != 0)
			{
				l++;
				System.out.printf("%d+%d\n",i,max(m, a[i]));
			}
		}
		if (l == 0)
		{
			System.out.print("No\n");
		}
	}

	public static int max(int m, int[] a)
	{
		int max1;
		int i;
		int k;
		max1 = a[0];
		k = 0;
		for (i = 1;i <= m - 1;i++)
		{
			if (a[i] > max1)
			{
				max1 = a[i];
				k = i;
			}
		}
		return k;
	}

	public static int min(int n, int i, int max, int[] pa)
	{
		int j;
		int m;
		m = (pa[i] + max);
		for (j = 0;j <= n - 1;j++)
		{
			if (*(pa[j] + max) < m)
			{
				return 0;
			}
		}
		return 1;
	}
}

