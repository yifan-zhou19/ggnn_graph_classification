package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[22][22];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 22;i++)
		{ //??????????
		   for (int j = 0;j < 22;j++)
		   {
			  a[i][j] = 0;
		   }
		}
		for (int i = 1;i <= m;i++)
		{ //??????
		   for (int j = 1;j <= n;j++)
		   {
			   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		   System.out.print("\n");
		}
		for (int i = 1;i <= m;i++)
		{
		   for (int j = 1;j <= n;j++)
		   { //????????
			  if (a[i][j + 1] - a[i][j] <= 0 && a[i][j - 1] - a[i][j] <= 0 && a[i + 1][j] - a[i][j] <= 0 && a[i - 1][j] - a[i][j] <= 0)
			  {
				  System.out.print(i - 1);
				  System.out.print(" ");
				  System.out.print(j - 1);
				  System.out.print("\n");
			  }
		   }
		}
		return 0;
	}



}

