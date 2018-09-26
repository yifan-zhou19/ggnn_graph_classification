package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] h = new int[22][22];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0;i <= n + 1;i++)
		{
			h[0][i] = h[m + 1][i] = 0;
		}
		for (j = 1;j <= m;j++)
		{
			h[j][0] = h[j][n + 1] = 0;
		for (i = 1;i <= n;i++)
		{
			h[j][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}

		for (j = 1;j <= m;j++)
		{
		for (i = 1;i <= n;i++)
		{
		if (h[j][i] >= h[j - 1][i] != 0 && h[j][i] >= h[j + 1][i] != 0 && h[j][i] >= h[j][i + 1] != 0 && h[j][i] >= h[j][i - 1])
		{
		System.out.print(j - 1);
		System.out.print(" ");
		System.out.print(i - 1);
		System.out.print("\n");
		}
		}
		}
	}



}

