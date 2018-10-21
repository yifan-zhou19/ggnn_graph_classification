package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[50][50];
		int i;
		int j;
		int[] h = new int[500];
		int[] l = new int[500];
		int cc = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= m; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= m; j++)
			{
				if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j])
				{
					h[cc] = i;
					l[cc] = j;
					cc++;
				}
			}
		}
		int to = cc;
		for (i = 0; i < to; i++)
		{
			for (j = 0; j < to - 1; j++)
			{
				if (h[j] > h[j + 1])
				{
					int temp;
					temp = h[j + 1];
					h[j + 1] = h[j];
					h[j] = temp;
					temp = l[j + 1];
					l[j + 1] = l[j];
					l[j] = temp;
					continue;
				}
				if (h[j] == h[j + 1] && l[j] > l[j + 1])
				{
					int temp;
					temp = h[j + 1];
					h[j + 1] = h[j];
					h[j] = temp;
					temp = l[j + 1];
					l[j + 1] = l[j];
					l[j] = temp;
				}
			}
		}
		for (i = 0; i < to; i++)
		{
			System.out.print(h[i] - 1);
			System.out.print(" ");
			System.out.print(l[i] - 1);
			System.out.print("\n");
		}
		return 0;
	}

}

