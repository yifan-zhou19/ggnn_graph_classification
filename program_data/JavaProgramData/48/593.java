package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10];
		int[][] t = new int[10][10];
		int time = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		for (i = 1;i < 10;i++)
		{
		   for (j = 1;j < 10;j++)
		   {
		   a[i][j] = 0;
		   }
		}
		a[5][5] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < time;i++)
		{
			  for (j = 5 - i;j <= 5 + i;j++)
			  {
				for (k = 5 - i;k <= 5 + i;k++)
				{
				t[j][k] = a[j][k];
				}
			  }
			  for (j = 5 - i;j <= 5 + i;j++)
			  {
				for (k = 5 - i;k <= 5 + i;k++)
				{
				   a[j - 1][k - 1] = a[j - 1][k - 1] + t[j][k];
				   a[j - 1][k] = a[j - 1][k] + t[j][k];
				   a[j - 1][k + 1] = a[j - 1][k + 1] + t[j][k];
				   a[j][k - 1] = a[j][k - 1] + t[j][k];
				   a[j][k] = a[j][k] + t[j][k];
				   a[j][k + 1] = a[j][k + 1] + t[j][k];
				   a[j + 1][k - 1] = a[j + 1][k - 1] + t[j][k];
				   a[j + 1][k] = a[j + 1][k] + t[j][k];
				   a[j + 1][k + 1] = a[j + 1][k + 1] + t[j][k];

				}
			  }
		}
		for (i = 1;i < 10;i++)
		{
				 for (j = 1;j <= 8;j++)
				 {
					System.out.print(a[i][j]);
					System.out.print(" ");
				 }
				 System.out.print(a[i][9]);
				 System.out.print("\n");
		}
		   return 0;
	}

}

