package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int i = 0;
		int j = 0;
		int[][] a = new int[30][30];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
		   for (j = 0;j < n;j++)
		   {
			  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		}
		if ((a[0][0] >= a[0][1]) && (a[0][0] >= a[1][0]))
		{
			System.out.print("0 0");
			System.out.print("\n");
		}
		for (i = 1;i < n - 1;i++)
		{
		   if ((a[0][i] >= a[0][i + 1]) && (a[0][i] >= a[0][i - 1]) && (a[0][i] >= a[1][i]))
		   {
		   System.out.print("0 ");
		   System.out.print(i);
		   System.out.print("\n");
		   }
		}
		if ((a[0][n - 1] >= a[0][n - 2]) && (a[0][n - 1] >= a[1][n - 1]))
		{
			System.out.print("0 ");
			System.out.print(n - 1);
			System.out.print("\n");
		}
		for (i = 1;i < m - 1;i++)
		{
		   if ((a[i][0] >= a[i][1]) && (a[i][0] >= a[i + 1][0]) && (a[i][0] >= a[i - 1][0]))
		   {
			   System.out.print(i);
			   System.out.print(" 0");
			   System.out.print("\n");
		   }
		   for (j = 1;j < n - 1;j++)
		   {
			  if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j + 1]) && (a[i][j] >= a[i][j - 1]))
			  {
			  System.out.print(i);
			  System.out.print(" ");
			  System.out.print(j);
			  System.out.print("\n");
			  }
		   }
		   if ((a[i][n - 1] >= a[i][n - 2]) && (a[i][n - 1] >= a[i + 1][n - 1]) && (a[i][n - 1] >= a[i - 1][n - 1]))
		   {
			   System.out.print(i);
			   System.out.print(" ");
			   System.out.print(n - 1);
			   System.out.print("\n");
		   }
		}
		if ((a[m - 1][0] >= a[m - 1][1]) && (a[m - 1][0] >= a[m - 2][0]))
		{
			System.out.print(m - 1);
			System.out.print(" 0");
			System.out.print("\n");
		}
		for (i = 1;i < n - 1;i++)
		{
		   if ((a[m - 1][i] >= a[m - 1][i + 1]) && (a[m - 1][i] >= a[m - 1][i - 1]) && (a[m - 1][i] >= a[m - 2][i]))
		   {
		   System.out.print(m - 1);
		   System.out.print(" ");
		   System.out.print(i);
		   System.out.print("\n");
		   }
		}
		if ((a[m - 1][n - 1] >= a[m - 1][n - 2]) && (a[m - 1][n - 1] >= a[m - 2][n - 1]))
		{
			System.out.print(m - 1);
			System.out.print(" ");
			System.out.print(n - 1);
			System.out.print("\n");
		}
		return 0;
	}

}

