package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int hang;
		int lie;
		hang = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lie = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[20][20];
		for (int i1 = 0;i1 < hang;i1++)
		{
			for (int j1 = 0;j1 < lie;j1++)
			{
				a[i1][j1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 0;i < hang;i++)
		{
			for (int j = 0;j < lie;j++) //:?????????????????continue
			{
				if ((i - 1) >= 0 && a[i][j] < a[i - 1][j])
				{
					continue;
				}
				if (i + 1 < hang && a[i][j] < a[i + 1][j])
				{
					continue;
				}
				if (j - 1 >= 0 && a[i][j] < a[i][j - 1])
				{
					continue;
				}
				if (j + 1 < lie && a[i][j] < a[i][j + 1])
				{
					continue;
				}
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

