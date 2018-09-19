package <missing>;

public class GlobalMembers
{
	public static int[][] num = new int[100][100];
	public static int n;

	public static void modify()
	{
		for (int i = 0;i < n;i++)
		{
			int min = num[i][0];
			for (int j = 1;j < n;j++)
			{
				if (num[i][j] < min)
				{
					min = num[i][j];
				}
			}
			for (int j = 0;j < n;j++)
			{
				num[i][j] -= min;
			}
		}
		for (int j = 0;j < n;j++)
		{
			int min = num[0][j];
			for (int i = 1;i < n;i++)
			{
				if (num[i][j] < min)
				{
					min = num[i][j];
				}
			}
			for (int i = 0;i < n;i++)
			{
				num[i][j] -= min;
			}
		}
	}

	public static void remove()
	{
		for (int i = 1;i < n - 1;i++)
		{
			for (int j = 0;j < n;j++)
			{
				num[i][j] = num[i + 1][j];
			}
		}
		for (int j = 1;j < n - 1;j++)
		{
			for (int i = 0;i < n;i++)
			{
				num[i][j] = num[i][j + 1];
			}
		}
	}

	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int round = N;
		while (round-- != 0)
		{
			n = N;
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int sum = 0;
			while (n > 1)
			{
				modify();
				sum += num[1][1];
				remove();
				n--;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

