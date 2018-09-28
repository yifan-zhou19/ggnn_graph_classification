package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int j;
	int[][] a = new int[11][11];
	int[][] b = new int[11][11];
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < 11;i++)
	{
	  for (j = 0;j < 11;j++)
	  {
		  a[i][j] = 0;
		  b[i][j] = 0;
			  if (i == 5 && j == 5)
			  {
				 a[i][j] = m;
			  }
	  }
	}


	  while (n-- != 0)
	  {
	   for (i = 1;i <= 9;i++)
	   {
		for (j = 1;j <= 9;j++)
		{
			if (a[i][j] != 0)
			{
				b[i - 1][j - 1] += a[i][j];
				b[i][j - 1] += a[i][j];
				b[i + 1][j - 1] += a[i][j];
				b[i - 1][j] += a[i][j];
				b[i + 1][j] += a[i][j];
				b[i - 1][j + 1] += a[i][j];
				b[i][j + 1] += a[i][j];
				b[i + 1][j + 1] += a[i][j];
				b[i][j] += a[i][j];
			}
		}
	   }

	  for (i = 1;i <= 9;i++)
	  {
		for (j = 1;j <= 9;j++)
		{
			 a[i][j] += b[i][j];
			 b[i][j] = 0;
		}
	  }
	  }



	for (i = 1;i <= 9;i++)
	{
		for (j = 1;j <= 9;j++)
		{
			if (j == 9)
			{
				System.out.print(" ");
				System.out.print(a[i][j]);
				System.out.print("\n");

			}
			else if (j == 1)
			{
				System.out.print(a[i][j]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[i][j]);
			}
		}
	}

	return 0;
	}
}

