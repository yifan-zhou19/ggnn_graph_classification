package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int sum = 0;
		int[][] b = new int[102][102];
		final String a = "";
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a.charAt(i)[j] = ConsoleInput.readToWhiteSpace(true);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++) //??b???????????
				{
					if (a.charAt(i)[j] == '@')
					{
						b[i][j] = 1;
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a.charAt(i)[j] == '@' && b[i][j] == 1) //?????????????????
					{
						if (i - 1 >= 0 && a.charAt(i - 1)[j] == '.')
						{
							a.charAt(i - 1)[j] = '@';
						}
						if (j - 1 >= 0 && a.charAt(i)[j - 1] == '.')
						{
							a.charAt(i)[j - 1] = '@';
						}
						if (j + 1 < n && a.charAt(i)[j + 1] == '.')
						{
							a.charAt(i)[j + 1] = '@';
						}
						if (i + 1 < n && a.charAt(i + 1)[j] == '.')
						{
							a.charAt(i + 1)[j] = '@';
						}
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a.charAt(i)[j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}

}

