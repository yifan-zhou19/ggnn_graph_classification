package <missing>;

public class GlobalMembers
{
	// ??(6-4) ??????????.cpp : ??????????????
	//

	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] s = new int[120][120];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				s[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int num;
		for (num = 0;num < m + n - 1;num++)
		{
			for (j = num;j > -1;j--)
			{
				i = num - j;
				if (i > -1 && i < n && j < m)
				{
					System.out.print(s[i][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

