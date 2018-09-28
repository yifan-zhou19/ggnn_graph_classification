package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int flag = 0;
		int f = 0;
		int deter = 0;
		int[][] a = new int[10][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					if (a[i][j] >= a[i][k])
					{
						f++;
					}
				}
				if (f == n)
				{
					flag++;
				}
				f = 0;
				for (k = 0;k < m;k++)
				{
					if (a[i][j] <= a[k][j])
					{
						f++;
					}
				}
				if (f == m)
				{
					flag++;
				}
				f = 0;
				if (flag == 2)
				{
					System.out.printf("%d+%d",i,j);
					deter = 1;
				}
				flag = 0;
			}
		}
		if (deter == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

