package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][20];
		int i;
		int j;
		int k;
		int n = 0;
		int[] x = new int[1000];
		for (i = 0;i < 1000;i++)
		{
			x[i] = 0;
			for (j = 0;j < 20;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
				if (a[i][j] == 0)
				{
					n++;
					break;
				}
				if (a[i][j] == -1)
				{
					break;
				}
			}
			if (a[i][0] == -1)
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;a[i][j] != 0;j++)
			{
				 for (k = 0;a[i][k] != 0;k++)
				 {
					 if (a[i][j] == 2 * a[i][k])
					 {
						 x[i]++;
					 }
				 }
			}
		}
		 for (i = 0;i < n;i++)
		 {
			 System.out.printf("%d\n",x[i]);
		 }
		 return 0;
	}
}

