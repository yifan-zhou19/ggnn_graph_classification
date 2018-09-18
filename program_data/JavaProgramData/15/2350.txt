package <missing>;

public class GlobalMembers
{
	//************************************************************************
	//*???7-1.cpp                                                         
	//*???????                                                    
	//*??????                                                          
	//*???2013?11?4?                                                   
	//************************************************************************
	public static int Main()
	{
		int[][] t = new int[100][100];
		int i;
		int j;
		int n;
		int[] row = new int[2];
		int[] col = new int[2];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				t[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{

				if (t[i][j] == 0 && row[0] == 0)
				{
					row[0] = i;
				}
				if (t[n - i + 1][j] == 0 && row[1] == 0)
				{
					row[1] = n - i + 1;
				}
				if (t[j][i] == 0 && col[0] == 0)
				{
					col[0] = i;
				}
				if (t[n - j + 1][n - i + 1] == 0 && col[1] == 0)
				{

					col[1] = n - i + 1;
				}


			}
		}
		System.out.print((row[1] - row[0] - 1) * (col[1] - col[0] - 1));
		System.out.print("\n");
		return 0;
	}
}

