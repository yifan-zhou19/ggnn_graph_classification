package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100]; //???????
		int h;
		int l;
		int i;
		int j;
	h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i <= h - 1;i++)
	{
		for (j = 0;j <= l - 1;j++)
		{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	for (i = 0;i <= l - 1;i++)
	{
		for (j = 0;j <= (i> h - 1?h - 1:i);j++)
		{
			System.out.print(a[j][i - j]);
			System.out.print("\n");
		}

	}
	for (i = l;i <= l + h - 2;i++)
	{
		for (j = i - l + 1;j <= (i> h - 1?h - 1:i);j++)
		{
			System.out.print(a[j][i - j]);
			System.out.print("\n");
		}

	}
	return 0;
	}
}

