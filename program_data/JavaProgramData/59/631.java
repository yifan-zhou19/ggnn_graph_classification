package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int j;
	public static int k;
	public static int m;
	public static int ans;
	public static char[][] box = new char[120][120];
	public static char[][] box2 = new char[120][120];

	public static int Main()
	{
		ans = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			box[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = n;j >= 1;j--)
			{
				box[i][j] = box[i][j - 1];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					box2[i][j] = box[i][j];
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (box[i][j] == '@')
					{
						if (box2[i][j - 1] == '.')
						{
							box2[i][j - 1] = '@';
						}
						if (box2[i][j + 1] == '.')
						{
							box2[i][j + 1] = '@';
						}
						if (box2[i - 1][j] == '.')
						{
							box2[i - 1][j] = '@';
						}
						if (box2[i + 1][j] == '.')
						{
							box2[i + 1][j] = '@';
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					box[i][j] = box2[i][j];
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (box[i][j] == '@')
				{
					ans++;
				}
			}
		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}
}

