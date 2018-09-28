package <missing>;

public class GlobalMembers
{
		public static int[][] a = new int[9][9];
		public static int[][] b = new int[9][9];
	public static int Main()
	{
		void sc(int i,int j);
		int n;
		int m;
		int k;
		int i;
		int j;
		for (i = 0;i < 9;i++)
		{
		for (j = 0;j < 9;j++)
		{
			a[i][j] = 0;
			b[i][j] = 0;
		}
		}
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
		a[4][4] = m;
	   for (k = 0;k < n;k++)
	   {
						for (i = 0;i < 9;i++)
						{
						   for (j = 0;j < 9;j++)
						   {
								  if (a[i][j] != 0)
								  {
									  sc(i, j);
								  }
						   }
						}
						for (i = 0;i < 9;i++)
						{
						   for (j = 0;j < 9;j++)
						   {
										 a[i][j] = b[i][j];
										 b[i][j] = 0;
						   }
						}

	   }
							for (i = 0;i < 9;i++)
							{
								for (j = 0;j < 8;j++)
								{
								System.out.printf("%d ",a[i][j]);
								}
							System.out.printf("%d\n",a[i][8]);
							}

	}
	public static void sc(int i,int j)
	{
		 b[i - 1][j] += a[i][j];
		 b[i + 1][j] += a[i][j];
		 b[i][j + 1] += a[i][j];
		 b[i][j - 1] += a[i][j];
		 b[i - 1][j - 1] += a[i][j];
		 b[i - 1][j + 1] += a[i][j];
		 b[i + 1][j - 1] += a[i][j];
		 b[i + 1][j + 1] += a[i][j];
		 b[i][j] = b[i][j] + a[i][j] * 2;
	}

}

