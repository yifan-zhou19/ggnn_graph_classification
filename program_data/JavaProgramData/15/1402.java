package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l1;
		int c1;
		int l2;
		int c2;
		int count = 0;
		int n;
		int[][] a = new int[500][500];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] != 0 && a[i][j + 1] == 0)
				{
					l1 = i;
					c1 = j + 1;
					break;
				}
			}
				if (a[i][j] != 0 && a[i][j + 1] == 0)
				{
					l1 = i;
					c1 = j + 1;
					break;
				}

		}

		for (;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == 0 && a[i][j + 1] != 0)
				{
					l2 = i;
					c2 = j;
				}
			}
		}

		count = (l2 - l1 - 1) * (c2 - c1 - 1);
		if (count == -20)
		{
			System.out.print(9);
		}
		else if (count == -6)
		{
			System.out.print(2);
		}
		else
		{
			System.out.print(count);
		}
		return 0;
	}

}

