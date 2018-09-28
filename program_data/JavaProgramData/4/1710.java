package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] num = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < m;j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int k = 0;k < n + m - 1;k++)
		{
			if (k < m)
			{
				for (int i = 0;k >= i != 0 && i < n;i++)
				{
					System.out.print(num[i][k - i]);
					System.out.print("\n");
				}
			}
			else
			{
				for (int i = k - m + 1;i < n && k >= i;i++)
				{
					System.out.print(num[i][k - i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}



}

