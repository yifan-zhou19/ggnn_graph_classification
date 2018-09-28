package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int y;
		int x;
		int i;
		int j;
		int k;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < y;i++)
		{
			for (j = 0;j < x;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0;k < x;k++)
		{
			for (i = 0;i < y && k - i >= 0;i++)
			{
				System.out.print(a[i][k - i]);
				System.out.print("\n");
			}
		}
		for (k = x;k < x + y - 1;k++)
		{
			for (j = x - 1;k - j < y && j >= 0;j--)
			{
				System.out.print(a[k - j][j]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

