package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[101][101];
	public static int n;
	public static int k;
	public static int num = 0;
	public static int[][] b = new int[101][101];
	public static int search()
	{
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			if ((b[i - 1][j] == 2 || b[i + 1][j] == 2 || b[i][j - 1] == 2 || b[i][j + 1] == 2) && b[i][j] == 0)
			{
				b[i][j] = 1;
				num = num + 1;
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b[i][j] == 1)
				{
					b[i][j] = 2;
				}
			}
		}

				return 0;
	}
	public static int Main()
	{

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int l;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '.')
				{
					b[i][j] = 0;
				}
				else if (a[i][j] == '@')
				{
					b[i][j] = 2;
					num = num + 1;
				}
				else if (a[i][j] == '#')
				{
					b[i][j] = -1;
				}
			}
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 0;l < k - 1;l++)
		{
			search();
		}
		System.out.print(num);
		System.out.print("\n");
	return 0;
	}
}

