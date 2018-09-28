package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int k;
	   k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (int i = 1;i <= k;i++)
	   {
		  int m;
		  int n;
		  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  int[][] a = new int[m][n];
		  int[] p = a;
		  for (int x = 0;x < m;x++)
		  {
			for (int y = 0;y < n;y++)
			{
			  *(p[x] + y) = ConsoleInput.readToWhiteSpace(true);
			}
		  }
		  int sum = 0;
		  for (int y = 0;y < n;y++)
		  {
			sum += *(p[0] + y);
		  }
		  for (int x = 1;x < m;x++)
		  {
			sum += *(p[x] + n - 1);
		  }
		  for (int y = n - 2;y >= 0;y--)
		  {
			sum += *(p[m - 1] + y);
		  }
		  for (int x = m - 2;x >= 1;x--)
		  {
			sum += *(p[x]);
		  }
		  System.out.print(sum);
		  System.out.print("\n");



	   }





	 return 0;
	}

}

