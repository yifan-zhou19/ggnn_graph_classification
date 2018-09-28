package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		final String a = "";
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a.charAt(i)[j] = ConsoleInput.readToWhiteSpace(true);
			}
		}
		int day = 0;
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k = 0;
		int[][] use = new int[100][100];
		for (k = 1;k < day;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (use[i][j] == 0 && a.charAt(i)[j] == '@')
					{

						if (a.charAt(i + 1)[j] == '.')
						{
							use[i + 1][j] = 1;
							a.charAt(i + 1)[j] = '@';
						}
						if (a.charAt(i - 1)[j] == '.')
						{
							use[i - 1][j] = 1;
							a.charAt(i - 1)[j] = '@';
						}
						if (a.charAt(i)[j + 1] == '.')
						{
							use[i][j + 1] = 1;
							a.charAt(i)[j + 1] = '@';
						}
						if (a.charAt(i)[j - 1] == '.')
						{
							use[i][j - 1] = 1;
							a.charAt(i)[j - 1] = '@';
						}
					}
				}
			}
			for (i = 0;i < 100;i++)
			{
				for (j = 0;j < 100;j++)
				{
					use[i][j] = 0;
				}
			}
		}
		int times = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a.charAt(i)[j] == '@')
				{
					times++;
				}
			}
		}
		System.out.print(times);
		System.out.print("\n");
		return 0;
	}
}

