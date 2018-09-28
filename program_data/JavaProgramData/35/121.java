package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int max;
		int maxj;
		int flag;
		int[][] a = new int[8][8];
		int k;
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][m - 1] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			max = a[i][0];
			maxj = 0;
			for (j = 0;j < m;j++)
			{

				if (a[i][j] > max)
				{
					max = a[i][j];
					maxj = j;
				}
			}

				flag = 1;
				for (k = 0;k < n;k++)
				{

					if (max > a[k][maxj])
					{
						flag = 0;
						continue;
					}
				}

				if (flag == 1)
				{
					System.out.printf("%d+%d",i,maxj);
					break;
				}

		}
		if (flag == 0)
		{
			System.out.print("No");
		}
	}
}

