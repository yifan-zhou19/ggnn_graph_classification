package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int p = 0;
		int[][] num = new int[100][100];
		int sum = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (p < k)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 0;j < n;j++)
			{
				sum += num[0][j];
			}
			for (i = 1;i < m - 1;i++)
			{
				sum += num[i][0];
				sum += num[i][n - 1];
			}
			for (j = 0;j < n;j++)
			{
				sum += num[m - 1][j];
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
			p++;
		}
		return 0;
	}

}

