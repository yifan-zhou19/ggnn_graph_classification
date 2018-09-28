package <missing>;

public class GlobalMembers
{
	//*************************
	//*  ??????? 
	//*  ????? 
	//*  ???1200012941 
	//*  ???2012?9?24? 
	//*************************
	public static int Main()
	{
		char[][] exp = new char[100][100];
		int i;
		int j;
		int k;
		int n;
		int m;
		int[][] a = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
		 for (j = 0; j < n; j++)
		 {
			 exp[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			 if (exp[i][j] == '#')
			 {
				 a[i][j] = -1;
			 }
			 if (exp[i][j] == '@')
			 {
				 a[i][j] = 1;
			 }
		 }
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k < m; k++)
		{
			for (i = 0; i < n; i++)
			{
			 for (j = 0; j < n; j++)
			 {
				 if (a[i][j] == k)
				 {
					 if (i + 1 < n && a[i + 1][j] == 0)
					 {
						 a[i + 1][j] = k + 1;
					 }
					 if (j + 1 < n && a[i][j + 1] == 0)
					 {
						 a[i][j + 1] = k + 1;
					 }
					 if (i - 1 >= 0 && a[i - 1][j] == 0)
					 {
						 a[i - 1][j] = k + 1;
					 }
					 if (j - 1 >= 0 && a[i][j - 1] == 0)
					 {
						 a[i][j - 1] = k + 1;
					 }
				 }
			 }
			}
		}
		int sum = 0;
		for (i = 0; i < n; i++)
		{
		 for (j = 0; j < n; j++)
		 {
			 if (a[i][j] > 0)
			 {
				 sum++;
			 }
		 }
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

