package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int h1;
		int l1;
		int h2;
		int l2;
		int[][] a = new int[1000][1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (a[i][j] == 0)
				{
					h1 = i;
					l1 = j;
					break;
					break;
				}
			}
		}
		for (i = n - 1; i >= 0; i--)
		{
			for (j = n - 1; j >= 0; j--)
			{
				if (a[i][j] == 0)
				{
					h2 = i;
					l2 = j;
					break;
					break;
				}
			}
		}
		System.out.print((Math.abs(h2 - h1) - 1) * (Math.abs(l2 - l1) - 1));
		System.out.print("\n");
		return 0;
	}
}

