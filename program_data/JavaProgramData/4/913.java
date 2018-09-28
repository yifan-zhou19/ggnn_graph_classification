package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[110][110];
		int m;
		int n;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= m - 1;i++)
		{
						 for (j = 0;j <= n - 1;j++)
						 {
										  *(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
						 }
		}
		for (j = 0;j <= n - 1;j++)
		{
						  k = j;
						  for (i = 0;i <= m - 1;i++)
						  {
										   System.out.print((*(a + i) + k));
										   System.out.print("\n");
										   k--;
										   if (k < 0)
										   {
											   break;
										   }
						  }
		}
		for (i = 1;i <= m - 1;i++)
		{
						   j = n - 1;
						   for (k = i;k <= m - 1;k++)
						   {
											  System.out.print((*(a + k) + j));
											  System.out.print("\n");
											  j--;
											  if (j < 0)
											  {
												  break;
											  }
						   }
		}
		return 0;
	}

}

