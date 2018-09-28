package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int m;
		int n;
		int i;
		int j;
		int l;
		int x;
		int y;
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
		b[4][4] = m;
		for (l = 0;l < n;l++)
		{
						 for (i = 0;i < 9;i++)
						 {
										  for (j = 0;j < 9;j++)
										  {
														   if (b[i][j] != 0)
														   {
																		  for (x = i - 1;x <= i + 1;x++)
																		  {
																								for (y = j - 1;y <= j + 1;y++)
																								{
																													  a[x][y] += b[i][j];
																								}
																		  }
														   }
										  }
						 }
						 for (i = 0;i < 9;i++)
						 {
										  for (j = 0;j < 9;j++)
										  {
														   b[i][j] = a[i][j];
										  }
						 }

		}
		for (i = 0;i < 9;i++)
		{
						 for (j = 0;j < 8;j++)
						 {
										  System.out.printf("%d ",a[i][j]);
						 }
						 System.out.printf("%d",a[i][8]);
						 System.out.print("\n");

		}
		return 0;
	}
}

