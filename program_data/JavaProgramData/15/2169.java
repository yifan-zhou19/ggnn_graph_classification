package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int n;
		int i;
		int j;
		int b;
		int c;
		int d;
		int e;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i < n - 1;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				if (a[i][j - 1] == 0 && a[i - 1][j] == 0 && a[i - 1][j - 1] == 0)
				{
					b = i;
					c = j;
				}
			}
		}
		for (i = 1;i < n - 1;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				if (a[i][j + 1] == 0 && a[i + 1][j] == 0 && a[i + 1][j + 1] == 0)
				{
					d = i;
					e = j;
				}

			}
		}
		System.out.print((d - b + 1) * (e - c + 1));
		System.out.print("\n");
		return 0;
	}
}

