package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] mountain = new int[m + 2][n + 2];

		for (int i = 0;i < m + 2;i++)
		{
			for (int j = 0;j < n + 2;j++)
			{
				if (i != 0 && j != 0 && i != m + 1 && j != n + 1)
				{
					mountain[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				else
				{
					mountain[i][j] = -1;
				}
			}
		}

		for (int i = 1;i < m + 1;i++)
		{
			for (int j = 1;j < n + 1;j++)
			{
				if (mountain[i][j] != -1)
				{
					if (!(mountain[i - 1][j] > mountain[i][j] || mountain[i + 1][j] > mountain[i][j] || mountain[i][j - 1] > mountain[i][j] || mountain[i][j + 1] > mountain[i][j]))
					{
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					System.out.print("\n");
					}
				}
			}
		}
	}

}

