package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int i;
	int j;
	int[][] h = new int[22][22];
	for (i = 0;i < 22;i++)
	{
		for (j = 0;j < 22;j++)
		{
	h[i][j] = 0;
		}
	}
	for (i = 1;i <= m;i++)
	{
		for (j = 1;j <= n;j++)
		{
	h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	for (i = 1;i <= m;i++)
	{
		for (j = 1;j <= n;j++)
		{
		if (h[i][j] >= h[i][j - 1] != 0 && h[i][j] >= h[i][j + 1] != 0 && h[i][j] >= h[i + 1][j] != 0 && h[i][j] >= h[i - 1][j])
		{
	System.out.print(i - 1);
	System.out.print(" ");
	System.out.print(j - 1);
	System.out.print("\n");
		}
		}
	}
	return 0;

	}

}

