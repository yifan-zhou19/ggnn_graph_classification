package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int[][] a = new int[9][9];
		int[] nmax = new int[9];
		int[] mmin = {9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999};
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i][j] > nmax[i])
				{
					nmax[i] = a[i][j];
				}
				if (a[i][j] < mmin[j])
				{
					mmin[j] = a[i][j];
				}
			}
		}
		while (true)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < m;j++)
				{
					if (nmax[i] == mmin[j])
					{
						System.out.print(i);
						System.out.print('+');
						System.out.print(j);
						System.out.print("\n");
						return 0;
					}
				}
			}
			System.out.print("No");
			System.out.print("\n");
			return 0;
		}
	}
}

