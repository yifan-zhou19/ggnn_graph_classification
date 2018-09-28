package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[22][22];
		int[][] b = new int[400][2];
		int n;
		int m;
		int num = 0;
		int i = 0;
		int j = 0;
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
			for (j = 0;j < n + 2;j++)
			{
				a[0][j] = 0;
				a[m + 1][j] = 0;
			}
			for (i = 1;i <= m;i++)
			{
				a[i][0] = 0;
				a[i][n + 1] = 0;
			}
			for (i = 1;i <= m;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
					{
					   num += 1;
					   b[num - 1][0] = i - 1;
					   b[num - 1][1] = j - 1;
					}
				}
			}
		  for (i = 0;i < num;i++)
		  {

				  System.out.printf("%d %d\n",b[i][0],b[i][1]);

		  }
		return 0;
	}


}

