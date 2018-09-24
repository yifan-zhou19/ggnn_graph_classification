package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int m;
		int[][] num = new int[100][100];
		int sum;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		for (int a = 0;a < k;a++)
		{
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  sum = 0;
				for (int i = 0;i < m;i++)
				{
				   for (int j = 0;j < n;j++)
				   {
						  num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						System.out.print(" ");
				   if (i == 0 || i == m - 1 || j == 0 || j == n - 1)
				   {
					   sum += num[i][j];
				   }
				   }
				   System.out.print("\n");
				}
				System.out.print(sum);
				System.out.print("\n");
		}
				return 0;
	}
}

