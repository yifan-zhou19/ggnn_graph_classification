package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int m = 0;
		int n = 0;
		int[][] a = new int[10][10];
		int p = 0;
		int k = 0;
		int l = 0;
		int t = 0;
		int q = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		for (p = 0;p < n;p++)
		{
		  int[][] b = new int[10][10];
		  for (i = 1;i < 8;i++)
		  {
			  for (j = 1;j < 8;j++)
			  {
				  b[i][j] = b[i][j] + a[i][j];
				  for (t = -1;t <= 1;t++)
				  {
					  for (q = -1;q <= 1;q++)
					  {
						  b[i + t][j + q] = b[i + t][j + q] + a[i][j];
					  }
				  }
			  }
		  }
			  for (i = 0;i < 9;i++)
			  {
				  for (j = 0;j < 9;j++)
				  {
					  a[i][j] = b[i][j];
				  }
			  }

		}

		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 8;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print(a[i][8]);
			System.out.print("\n");
		}

		return 0;
	}






}

