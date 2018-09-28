package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int sum = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		for (int i = 0;i < k;i++)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i < m;i++)
			{
				for (int j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			if (m != 1 && n != 1)
			{
			  for (int i = 0;i < n;i++)
			  {
				sum += *(a + i) + *(*(a + m - 1) + i);
			  }
			  for (int i = 1;i < m - 1;i++)
			  {
				sum += *(*(a + i)) + *(*(a + i) + n - 1);
			  }
			  System.out.print(sum);
			  System.out.print("\n");
			}
			else
			{
				System.out.print(a);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

