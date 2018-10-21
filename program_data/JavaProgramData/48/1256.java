package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[][] set = new int[20][20];
		int[][] ad = new int[20][20];
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
		for (i = 0;i < 11;i++)
		{
						 for (j = 0;j < 11;j++)
						 {
										  set[i][j] = 0;
						 }
		}
		set[5][5] = m;



	 for (k = 1;k <= n;k++)
	 {
			   for (i = 1;i <= 9;i++)
			   {
						for (j = 1;j <= 9;j++)
						{
							  if (set[i][j] != 0)
							  {
										ad[i][j] = set[i][j];
							  }
						}
			   }







		for (i = 1;i <= 9;i++)
		{
						for (j = 1;j <= 9;j++)
						{
							 if (ad[i][j] != 0)
							 {
		set[i][j - 1] += ad[i][j];
		set[i - 1][j] += ad[i][j];
		set[i - 1][j - 1] += ad[i][j];
		set[i - 1][j + 1] += ad[i][j];
		set[i][j] = set[i][j] + ad[i][j];
		set[i + 1][j] += ad[i][j];
		set[i][j + 1] += ad[i][j];
		set[i + 1][j - 1] += ad[i][j];
		set[i + 1][j + 1] += ad[i][j];
							 }
						}
		}
	for (i = 0;i < 11;i++)
	{
						 for (j = 0;j < 11;j++)
						 {
										  ad[i][j] = 0;
						 }
	}

	 }

		for (i = 1;i <= 9;i++)
		{
						 for (j = 1;j <= 8;j++)
						 {
		System.out.printf("%d ",set[i][j]);
						 }
	System.out.printf("%d",set[i][9]);
	System.out.print("\n");
		}

	return 0;
	}

}

