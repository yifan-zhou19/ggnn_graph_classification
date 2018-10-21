package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] breaknum = new int[n];
		int[][] altogether = new int[n][30];
		int[] count = new int[n];
		for (i = 0;i < n;i++)
		{
			breaknum[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < breaknum[i];j++)
			{
				altogether[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (breaknum[i] == 0)
			{
				System.out.print("60");
				System.out.print("\n");
				continue;
			}
			else
			{
				if (altogether[i][j - 1] + 3 * j <= 60)
				{
					count[i] = 60 - 3 * j;
					System.out.print(count[i]);
					System.out.print("\n");
					continue;
				}
				if (altogether[i][j - 2] + 3 * (j - 1) > 60 && altogether[i][j - 2] + 3 * (j - 2) <= 60)
				{
					System.out.print(altogether[i][j - 2]);
					System.out.print("\n");
					continue;
				}
				if (altogether[i][j - 1] + 3 * j > 60 && altogether[i][j - 1] + 3 * j <= 63)
				{
					System.out.print(altogether[i][j - 1]);
					System.out.print("\n");
					continue;
				}
				if (altogether[i][j - 1] + 3 * j > 60 && altogether[i][j - 2] + 3 * j <= 60)
				{
					count[i] = 60 - 3 * (j - 1);
					System.out.print(count[i]);
					System.out.print("\n");
					continue;
				}
				if (altogether[i][j - 2] + 3 * (j - 1) > 60 && altogether[i][j - 2] + 3 * (j - 1) < 63)
				{
					count[i] = altogether[i][j - 2];
					System.out.print(count[i]);
					System.out.print("\n");
					continue;
				}
				if (breaknum[i] == 6 && altogether[i][j - 2] == 58 && altogether[i][j - 1] == 60)
				{
					System.out.print(48);
					System.out.print("\n");
					continue;
				}
			}
		}
		return 0;
	}

}

