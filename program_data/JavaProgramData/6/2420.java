package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int s;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
			for (t = 0;t < k;t++)
			{
				s = 0;

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
		if (m == 1 && n == 1)
		{
			System.out.printf("%d",a[0][0]);
			continue;
		}
		for (j = 0;j < n;j++)
		{
			s = s + *(a[0] + j);
			s = s + *(a[m - 1] + j);
		}
		for (i = 0;i < m;i++)
		{
			s = s + *(a[i] + 0);
			s = s + *(a[i] + n - 1);
		}
		s = s - a[0][0] - a[m - 1][0] - a[0][n - 1] - a[m - 1][n - 1];
		System.out.printf("%d\n",s);
			}
	}

}

