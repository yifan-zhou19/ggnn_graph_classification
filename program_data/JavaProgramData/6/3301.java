package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] c = new int[101][101];
		int n;
		int i;
		int j;
		int s;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < s;i++)
			{
				for (j = 0;j < t;j++)
				{
					c[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
				int sum = 0;
				if (s == 1)
				{
					for (i = 0;i < t;i++)
					{
						sum = sum + c[0][t];
					}
				}
				else if (t == 1)
				{
					for (i = 0;i < s;i++)
					{
						sum = sum + c[i][0];
					}
				}
				else
				{
					for (i = 0;i < t;i++)
					{
						sum = sum + c[0][i] + c[s - 1][i];
					}
					for (i = 1;i < s - 1;i++)
					{
						sum = sum + c[i][0] + c[i][t - 1];
					}
				}
				System.out.print(sum);
				System.out.print("\n");
		}
		return 0;
	}
}

