package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[100][100];
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				s[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 1;k <= m;k++)
		{
			for (l = 1;l <= n;l++)
			{
				if ((s[k][l] >= s[k - 1][l]) && (s[k][l] >= s[k][l - 1]) && (s[k][l] >= s[k + 1][l]) && (s[k][l] >= s[k][l + 1]))
				{
					System.out.print(k - 1);
					System.out.print(" ");
					System.out.print(l - 1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

