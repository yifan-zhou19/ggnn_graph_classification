package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i = 0;
		int j = 0;
		int h = 0;
		int k = 0;
		int n = 0;
		int m = 0;
		int[][] a = new int[100][100];
		int t = 0;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  for (j = 0;j < n;j++)
		  {
			  for (h = 0;h < m;h++)
			  {
				  *(*(a + j) + h) = ConsoleInput.readToWhiteSpace(true);


			  }
		  }
		  for (i = 0;i < n + m - 1;i++)
		  {
			  for (j = 0;j < n;j++)
			  {
				  for (h = 0;h < m;h++)
				  {
					  if (j + h == i)
					  {
						  System.out.print((*(a + j) + h));
						  System.out.print("\n");
					  }
				  }
			  }
		  }
			   return 0;
	}



}

