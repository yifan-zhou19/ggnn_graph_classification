package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int m;
		int n;
		int j;
		int z;
		int s;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (z = 1;z <= k;z++)
		{
			s = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				int[][] a = new int[100][100];
				for (i = 0;i < m;i++)
				{
						for (j = 0;j < n;j++)
						{
							a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						}
				}
				if (m == 1 || n == 1)
				{
					for (i = 0;i < m;i++)
					{
										for (j = 0;j < n;j++)
										{
											s = s + a[i][j];
										}
					}
				}
				else
				{
				for (i = 0;i < n;i++)
				{
				s = s + *(a + i) + *(*(a + m - 1) + i);
				}
			for (i = 1;i < m - 1;i++)
			{
				s = s + *(*(a + i)) + *(*(a + i) + n - 1);
			}
				}
			System.out.print(s);
			System.out.print("\n");
		}

	}

}

