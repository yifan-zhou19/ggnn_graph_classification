package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < t ; i++)
		{
				int n;
				int m;
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				int[][] num = new int[110][110];
				for (int j = 0 ; j < m ; j++)
				{
						for (int k = 0 ; k < n ; k++)
						{
							num[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						}
				}
				int sum = 0;
				if (m == 1 && n != 1)
				{
					for (int j = 0 ; j < n ; j++)
					{
						sum = sum + num[0][j];
					}
					System.out.print(sum);
					System.out.print("\n");
				}
			else if (m != 1 && n == 1)
			{
				for (int j = 0 ; j < m ; j++)
				{
					sum = sum + num[m][0];
				}
				System.out.print(sum);
				System.out.print("\n");
			}
				else if (m == 1 && n == 1)
				{
					System.out.print(num[0][0]);
					System.out.print("\n");
				}
				else
				{
				for (int j = 0 ; j < n ; j++)
				{
					sum = sum + *(num + j);
				}
				for (int j = 0 ; j < n ; j++)
				{
					sum = sum + *(num[m - 1] + j);
				}
				for (int j = 1 ; j < m - 1 ; j++)
				{
					sum = sum + **(num + j);
				}
				for (int j = 1 ; j < m - 1 ; j++)
				{
					sum = sum + *(*(num + j) + n - 1);
				}
				System.out.print(sum);
				System.out.print("\n");
				}
		}
		return 0;
	}

}

