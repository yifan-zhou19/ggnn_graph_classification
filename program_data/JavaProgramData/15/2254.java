package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int x1;
		int y1;
		int x2;
		int y2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					x1 = i;
					y1 = j;
					i = n;
					break;
				}
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (a[i][j] == 0)
				{
					x2 = i;
					y2 = j;
					i = -1;
					break;
				}
			}
		}
		System.out.print((x2 - x1 - 1) * (y2 - y1 - 1));
		System.out.print("\n");
		return 0;
	}

}

