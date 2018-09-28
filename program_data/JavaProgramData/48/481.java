package <missing>;

public class GlobalMembers
{
	//????????????????????????
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[11][11]; //a????????
		int[][] b = new int[11][11]; //b????????
		int i;
		int j;
		int k;
		int p;
		int q;
		for (i = 0;i < 11;i++) //???????
		{
		   for (j = 0;j < 11;j++)
		   {
			 a[i][j] = 0;
		   }
		}
		for (i = 0;i < 11;i++)
		{
		   for (j = 0;j < 11;j++)
		   {
			 b[i][j] = 0;
		   }
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m; //???????m
		for (k = 1;k <= n;k++) //???n?
		{
			for (i = 1;i <= 9;i++) //????????
			{
			   for (j = 1;j <= 9;j++)
			   {
					  for (p = i - 1;p <= i + 1;p++)
					  {
						 for (q = j - 1;q <= j + 1;q++)
						 {
							 b[i][j] += a[p][q];
						 }
					  }
					  b[i][j] += a[i][j];
			   }
			}
			for (i = 1;i <= 9;i++) //???????????????????
			{
			   for (j = 1;j <= 9;j++)
			   {
					  a[i][j] = b[i][j];
					  b[i][j] = 0;
			   }
			}
		}
		for (i = 1;i <= 9;i++) //??n??????
		{
			   for (j = 1;j < 9;j++)
			   {
				   System.out.print(a[i][j]);
				   System.out.print(' ');
			   }
				System.out.print(a[i][9]);
				System.out.print("\n");
		}


		return 0;
	}

}

