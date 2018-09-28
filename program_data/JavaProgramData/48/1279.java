package <missing>;

public class GlobalMembers
{
	public static int[][] p = new int[9][9];
	public static int[][] q = new int[9][9];
	public static int Main()
	{
		void xijun();
		int m;
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= 8;i++)
		{
			  for (j = 0;j <= 8;j++)
			  {
					 p[i][j] = q[i][j] = 0;
			  }
		}
		p[4][4] = m;
	   for (i = 0;i <= n - 1;i++)
	   {
			  xijun();
	   }
	   for (i = 0;i <= 8;i++)
	   {
			  for (j = 0;j < 8;j++)
			  {
					 System.out.printf("%d ",p[i][j]);
			  }
			  System.out.printf("%d",p[i][8]);
			  System.out.print("\n");
	   }


	}
	public static void xijun()
	{
		  int i;
		  int j;
		  int k;
		   for (i = 0;i <= 8;i++)
		   {
			  for (j = 0;j <= 8;j++)
			  {
					if (p[i][j] != 0)
					{
						q[i - 1][j - 1] = q[i - 1][j - 1] + p[i][j];
					 q[i - 1][j] = q[i - 1][j] + p[i][j];
					 q[i - 1][j + 1] = q[i - 1][j + 1] + p[i][j];
					 q[i][j - 1] = q[i][j - 1] + p[i][j];
					 q[i][j + 1] = q[i][j + 1] + p[i][j];
					 q[i + 1][j - 1] = q[i + 1][j - 1] + p[i][j];
					 q[i + 1][j] = q[i + 1][j] + p[i][j];
					 q[i + 1][j + 1] = q[i + 1][j + 1] + p[i][j];
					 q[i][j] = 2 * p[i][j] + q[i][j];
					}
			  }
		   }
			for (i = 0;i <= 8;i++)
			{
			  for (j = 0;j <= 8;j++)
			  {
					 p[i][j] = q[i][j];
					 q[i][j] = 0;
			  }
			}


	}

}

