package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int m;
	public static int n;
	public static int[][] arr = new int[105][105];

	public static int Main()
	{
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int sum = 0;
			for (int i = 0;i < m;i++)
			{
				for (int j = 0;j < n;j++)
				{
					arr[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (i == 0 || i == m - 1 || j == 0 || j == n - 1)
					{
						sum += arr[i][j];
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

