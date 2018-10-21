package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] b = new int[5];
		int[] c = new int[5];
		int i;
		int j;
		int m;
		int k;
		m = -1;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				 String tempVar = ConsoleInput.scanfRead();
				 if (tempVar != null)
				 {
					 a[i][j] = Integer.parseInt(tempVar);
				 }
				c[j] = a[i][j];
				b[i] = a[i][j];
			}
		}
	   for (i = 0;i <= 4;i++)
	   {
			for (j = 0;j <= 4;j++)
			{
				if (a[i][j] > b[i])
				{
					b[i] = a[i][j];
				}
				if (a[i][j] < c[j])
				{
					c[j] = a[i][j];
				}
			}
	   }
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				if (a[i][j] == b[i] && a[i][j] == c[j])
				{
				   m = i;
				   k = j;
				}
			}
		}
		if (m == -1)
		{
			System.out.print("not found");
		}
		else
		{
			System.out.printf("%d %d %d",m + 1,k + 1,a[m][k]);
		}
		return 0;
	}
}

