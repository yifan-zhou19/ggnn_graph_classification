package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[9][9];
		int[][] s1 = new int[9][9];
		int i = 0;
		int j = 0;
		int m = 0;
		int n = 0;
		int k = 0;
		for (i = 0;i <= 8;i++) //???
		{
			for (j = 0;j <= 8;j++)
			{
			   s[i][j] = 0;
			   s1[i][j] = 0;
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s[4][4] = m;
		for (k = 1;k <= n;k++) //??
		{
				 for (i = 1;i <= 7;i++) //??
				 {
						for (j = 1;j <= 7;j++)
						{
						   if (s[i][j] != 0)
						   {
							   s1[i][j] += 2 * s[i][j];
							   s1[i + 1][j] += s[i][j];
							   s1[i - 1][j] += s[i][j];
							   s1[i][j + 1] += s[i][j];
							   s1[i][j - 1] += s[i][j];
							   s1[i + 1][j + 1] += s[i][j];
							   s1[i - 1][j - 1] += s[i][j];
							   s1[i + 1][j - 1] += s[i][j];
							   s1[i - 1][j + 1] += s[i][j];

						   }
						}
				 }
				 for (i = 0;i <= 8;i++)
				 {
						for (j = 0;j <= 8;j++)
						{
							 s[i][j] = s1[i][j];
						}
				 }
				 for (i = 0;i <= 8;i++) //s1??
				 {
						for (j = 0;j <= 8;j++)
						{
							 s1[i][j] = 0;
						}
				 }

		}
		for (i = 0;i <= 8;i++) //??
		{
		   for (j = 0;j <= 8;j++)
		   {
			  if (j == 0)
			  {
				  System.out.print(s[i][j]);
				  continue;
			  }
			  if (j == 8)
			  {
				  System.out.print(" ");
				  System.out.print(s[i][j]);
				  System.out.print("\n");
				  continue;
			  }
			  System.out.print(" ");
			  System.out.print(s[i][j]);
		   }
		}
	return 0;
	}
}

