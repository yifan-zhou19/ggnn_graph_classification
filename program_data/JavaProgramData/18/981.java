package <missing>;

public class GlobalMembers
{
	public static int[][][] a = new int[100][1000][1000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int min;
		int p;
		int q;
		int k;
		int h;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;k++) //??n???
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					a[k][i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}
	  for (p = 1;p <= n;p++) // ???????
	  {
		  h = n;
		  for (q = 1;q <= n - 1;q++) //???????
		  {
		  for (i = 1;i <= h;i++)
		  {
			min = 100000;
			for (j = 1;j <= h;j++)
			{
				if (a[p][i][j] < min)
				{
					min = a[p][i][j];
				}
			}
			for (k = 1;k <= h;k++)
			{
				a[p][i][k] = a[p][i][k] - min;
			}
		  } //?????
		  for (j = 1;j <= h;j++)
		  {
			min = 100000;
			for (i = 1;i <= h;i++)
			{
				if (a[p][i][j] < min)
				{
					min = a[p][i][j];
				}
			}
			for (k = 1;k <= h;k++)
			{
				a[p][k][j] = a[p][k][j] - min;
			}
		  }
		  sum += a[p][2][2];
		  for (i = 1;i <= h;i++)
		  {
			a[p][2][i] = 0;
		  }
		  for (j = 1;j <= h;j++)
		  {
			a[p][j][2] = 0;
		  }
		  for (i = 3;i <= h;i++)
		  {
			for (j = 1;j <= h;j++)
			{
			a[p][j][i - 1] = a[p][j][i];
			}
		  }
		for (i = 3;i <= h;i++)
		{
			for (j = 1;j <= h;j++)
			{
			a[p][i - 1][j] = a[p][i][j];
			}
		}
		h -= 1;
		  }
		 System.out.print(sum);
		 System.out.print("\n");
		 sum = 0;
	  }


	return 0;
	}

}

