package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			int m;
			int n;
			int i;
			int j;
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
			int sum = 0;
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (i == 0 || i == m - 1 || j == 0 || j == n - 1) //??????
					{
						sum += a[i][j]; //??
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

