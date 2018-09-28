package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
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
		int[][] a = new int[30][30];
		int[][] b = new int[400][2];
		int i;
		int j;
		int k = 0;
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
				{
					b[k][0] = i;
					b[k][1] = j;
					k++;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = i;j < k;j++)
			{
				if (b[i][0] >= b[j][0])
				{
					int tmp1;
					int tmp2;
					tmp1 = b[i][0];
					tmp2 = b[i][1];
					b[i][0] = b[j][0];
					b[i][1] = b[j][1];
					b[j][0] = tmp1;
					b[j][1] = tmp2;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = i;j < k;j++)
			{
				if (b[i][0] == b[j][0])
				{
				if (b[i][1] >= b[j][1])
				{
					int tmp1;
					int tmp2;
					tmp1 = b[i][0];
					tmp2 = b[i][1];
					b[i][0] = b[j][0];
					b[i][1] = b[j][1];
					b[j][0] = tmp1;
					b[j][1] = tmp2;
				}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d %d\n",b[i][0] - 1,b[i][1] - 1);
		}
		return 0;
	}

}

