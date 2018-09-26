package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] flag = new int[110][110];
		int patient = 0;
		char[][] condition = new char[110][110];
		int i;
		int j;
		int l;
		int h;
		int g;
		int p;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				condition[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (condition[i][j] == '@')
				{
					flag[i][j] = 1;
					patient++;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 2; l <= m; l++)
		{
			for (p = 1; p <= n; p++)
			{
				for (q = 1; q <= n; q++)
				{
					if ((condition[p][q] == '.') && (condition[p + 1][q] == '@' || condition[p - 1][q] == '@' || condition[p][q + 1] == '@' || condition[p][q - 1] == '@'))
					{
						flag[p][q] = 1;
					}
				}
			}
			patient = 0;
			for (h = 1; h <= n; h++)
			{
				for (g = 1; g <= n; g++)
				{
					if (flag[h][g] == 1)
					{
						patient++;
						condition[h][g] = '@';
					}
				}
			}
		}
		System.out.print(patient);
		System.out.print("\n");
		return 0;
	}
}

