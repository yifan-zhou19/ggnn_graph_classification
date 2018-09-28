package <missing>;

public class GlobalMembers
{
	// xunzhaoshanding.cpp : Defines the entry point for the console application.
	//



	public static int Main()
	{
		int m = 0;
		int n = 0;
		int[][] high = new int[21][21];
		int i = 0;
		int t = 0;

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1;i <= m;i++)
		{
			for (t = 1;t <= n;t++)
			{
				high[i][t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 1;i <= m;i++)
		{
			for (t = 1;t <= n;t++)
			{
				if (high[i][t] >= high[i - 1][t] != 0 && high[i][t] >= high[i + 1][t] != 0 && high[i][t] >= high[i][t + 1] != 0 && high[i][t] >= high[i][t - 1])
				{
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(t - 1);
					System.out.print("\n");
				}
			}
		}

		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		return 0;
	}

}

