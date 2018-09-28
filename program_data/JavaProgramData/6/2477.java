package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = new int(int p[100][100],int m,int n);
		int N;
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (k = 0;k < N;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			s = sum(a, m, n);
			System.out.printf("%d\n",s);
		}
		return 0;
	}
	public static int sum(int[][] p, int m, int n)
	{
		int i;
		int k = 0;
		if (m != 1)
		{
			for (i = 0;i < n;i++)
			{
				k += *(p + i) + *(*(p + m - 1) + i);
			}
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				k += *(p + i);
			}
		}
		if (n != 1)
		{
			for (i = 1;i < m - 1;i++)
			{
				k += **(p + i) + *(*(p + i) + n - 1);
			}
		}
		else
		{
			for (i = 1;i < m - 1;i++)
			{
				k += **(p + i);
			}
		}
		return k;
	}
}

