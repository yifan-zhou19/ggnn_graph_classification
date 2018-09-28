package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int order = 1;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[25][25];
		int[] peakx = new int[444];
		int[] peaky = new int[444];
		for (i = 1 ; i <= m ; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if ((a[1][1] >= a[1][2]) && (a[1][1] >= a[2][1]))
		{
			peakx[order] = 1;
			peaky[order] = 1;
			order++;
		}
		for (i = 2 ; i < n ; i++)
		{
			if ((a[1][i] >= a[1][i + 1]) && (a[1][i] >= a[1][i - 1]) && (a[1][i] >= a[2][i]))
			{
				peakx[order] = 1;
				peaky[order] = i;
				order++;
			}
		}
		if ((a[1][n] >= a[1][n - 1]) && (a[1][n] >= a[2][n]))
		{
			peakx[order] = 1;
			peaky[order] = n;
			order++;
		}
		for (i = 2 ; i < m ; i++)
		{
			if ((a[i][1] >= a[i][2]) && (a[i][1] >= a[i - 1][1]) && (a[i][1] >= a[i + 1][1]))
			{
				peakx[order] = i;
				peaky[order] = 1;
				order++;
			}
			for (j = 2 ; j < n ; j++)
			{
				if ((a[i][j] >= a[i][j + 1]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i - 1][j]))
				{
				peakx[order] = i;
				peaky[order] = j;
				order++;
				}
			}
			if ((a[i][n] >= a[i][n - 1]) && (a[i][n] >= a[i - 1][n]) && (a[i][n] >= a[i + 1][n]))
			{
				peakx[order] = i;
				peaky[order] = n;
				order++;
			}
		}
		if ((a[m][1] >= a[m][2]) && (a[m][1] >= a[m - 1][1]))
		{
			peakx[order] = m;
			peaky[order] = 1;
			order++;
		}
		for (i = 2 ; i < n ; i++)
		{
			if ((a[m][i] >= a[m][i + 1]) && (a[m][i] >= a[m][i - 1]) && (a[m][i] >= a[m - 1][i]))
			{
				peakx[order] = m;
				peaky[order] = i;
				order++;
			}
		}
		if ((a[m][n] >= a[m][n - 1]) && (a[m][n] >= a[m - 1][n]))
		{
			peakx[order] = m;
			peaky[order] = n;
			order++;
		}
		for (i = 1 ; i < order ; i++)
		{
			System.out.print(peakx[i] - 1);
			System.out.print(" ");
			System.out.print(peaky[i] - 1);
			if (i != (order - 1))
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

