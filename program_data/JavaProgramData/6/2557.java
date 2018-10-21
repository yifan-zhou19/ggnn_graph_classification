package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t > 0)
		{
				  int[][] a = new int[102][102];
				  int m;
				  int n;
				  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  int sum = 0;
				  for (int i = 0;i < m;i++)
				  {
						  for (int j = 0;j < n;j++)
						  {
						  *(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
						  }
				  }
				  if (m == 1)
				  {
					  for (int i = 0;i < n;i++)
					  {
						sum += *(a + i);
					  }
				  }
				  else
				  {
				  for (int i = 0;i < n;i++)
				  {
						sum += *(a + i);
				  }
				  for (int i = 1;i < m - 1;i++)
				  {
						  sum = sum + *(*(a + i)) + *(*(a + i) + n - 1);
				  }
				  for (int i = 0;i < n;i++)
				  {
						sum += *(*(a + m - 1) + i);
				  }
				  }
				  System.out.print(sum);
				  System.out.print("\n");
				  t--;
		}

		return 0;
	}

}

