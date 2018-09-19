package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int s = 0;
	public static void juzhen(int x)
	{

		for (int i = 0;i < x;i++)
		{
			int m = a[i][0];
			for (int j = 1;j < x;j++)
			{

				if (a[i][j] < m)
				{
					m = a[i][j];
				}
			}
			for (int j = 0;j < x;j++)
			{
				a[i][j] = a[i][j] - m;
			}
		}
		for (int i = 0;i < x;i++)
		{
				int m = a[0][i];
				for (int j = 1;j < x;j++)
				{

					if (a[j][i] < m)
					{
						m = a[j][i];
					}
				}
				for (int j = 0;j < x;j++)
				{
					a[j][i] = a[j][i] - m;
				}
		}
		s = s + a[1][1];
		if (x == 2)
		{
			System.out.print(s);
			System.out.print("\n");
			return;
		}
		for (int i = 1;i < x - 1;i++)
		{
			for (int j = 0;j < x;j++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
		for (int i = 1;i < x - 1;i++)
		{
			for (int j = 0;j < x - 1;j++)
			{
				a[j][i] = a[j][i + 1];
			}
		}
		juzhen(x - 1);

	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int o = 1;o <= n;o++)
		{
			s = 0;
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			juzhen(n);

		}
	}
}

