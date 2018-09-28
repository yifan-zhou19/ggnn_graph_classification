package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int s;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[20][20];
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
		for (j = 0;j < n;j++)
		{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}
		for (i = 0;i < m;i++)
		{
		for (j = 0;j < n;j++)
		{
			s = 1;
			if (i - 1 >= 0 && a[i - 1][j] > a[i][j])
			{
				s = 0;
			}
			if (i + 1 < m && a[i + 1][j]> a[i][j])
			{
				s = 0;
			}
			if (j - 1 >= 0 && a[i][j - 1] > a[i][j])
			{
				s = 0;
			}
			if (j + 1 < n && a[i][j + 1]> a[i][j])
			{
				s = 0;
			}
			if (s == 1)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		}
		return 0;
	}
}

