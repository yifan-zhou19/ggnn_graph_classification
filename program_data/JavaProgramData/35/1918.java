package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String f = new String(new char[3]);
		f = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int n;
		int m;
		int x;
		int z = 0;
		int v = 1;
		m = f.charAt(0) - '0';
		n = f.charAt(2) - '0';
		int[][] a = new int[m][n];
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 0;i < m;i++)
		{
			int max = a[i][0];
			x = 0;
			for (int j = 0;j < n;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					x = j;
				}
			}

			for (int j = 0;j < n;j++)
			{
				if (max == a[i][j] && x != j)
				{
					v = 0;
					break;
				}
			}
			if (v == 0)
			{
				v = 1;
				continue;
			}

			int min = a[0][x];
			for (int j = 1;j < m;j++)
			{
				if (min > a[j][x])
				{
					min = a[j][x];
				}
			}
			if (max == min)
			{
				System.out.print(i);
				System.out.print("+");
				System.out.print(x);
				System.out.print("\n");
				z = 1;
				break;
			}
		}
		if (z == 0)
		{
		System.out.print("No");
		System.out.print("\n");
		}

		return 0;
	}

}

