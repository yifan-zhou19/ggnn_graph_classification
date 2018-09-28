package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int days;
		int i;
		int j;
		int k;
		int l;
		int m;
		a[4][4] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < days;i++)
		{
			  for (l = 0;l < 9;l++)
			  {
			 for (m = 0;m < 9;m++)
			 {
					b[l][m] = 0;
			 }
			  }
		  for (j = 1;j < 8;j++)
		  {
			for (k = 1;k < 8;k++)
			{
				if (a[j][k] == 0)
				{
					continue;
				}
				else
				{
					b[j][k] += 2 * a[j][k];
					b[j - 1][k - 1] += a[j][k];
					b[j + 1][k + 1] += a[j][k];
					b[j - 1][k + 1] += a[j][k];
					b[j + 1][k - 1] += a[j][k];
					b[j][k + 1] += a[j][k];
					b[j - 1][k] += a[j][k];
					b[j + 1][k] += a[j][k];
					b[j][k - 1] += a[j][k];
					a[j][k] = 0;
				}
			}
		  }
			for (j = 0;j < 9;j++)
			{
			  for (k = 0;k < 9;k++)
			  {
				a[j][k] = b[j][k];
			  }
			}
		}
		for (j = 0;j < 9;j++)
		{
			 System.out.print(a[j][0]);
			 for (k = 1;k < 9;k++)
			 {
				 System.out.print(" ");
				 System.out.print(a[j][k]);
			 }
			 System.out.print("\n");
		}
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

