package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[][] a = new int[m][n];
	   for (int i = 0;i < m;i++)
	   {
		 for (int j = 0;j < n;j++)
		 {
		   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	   }
	   int sum = 0;
	   while (true)
	   {
		if (sum == m + n - 1)
		{
			break;
		}
		else if (sum <= n - 1)
		{
		   for (int i = 0;i <= sum;i++)
		   {
			  if (i > m - 1)
			  {
				  break;
			  }
			  System.out.print(a[i][sum - i]);
			  System.out.print("\n");
		   }
			 sum++;
		}
		else
		{
		   for (int i = sum + 1 - n;i <= sum;i++)
		   {
			  if (i > m - 1)
			  {
				  break;
			  }
			  System.out.print(a[i][sum - i]);
			  System.out.print("\n");
		   }
		   sum++;
		}
	   }




	 return 0;
	}

}

