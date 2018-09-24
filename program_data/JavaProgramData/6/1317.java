package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int q;
		int j;
		int s1 = 0;
		int s2 = 0;
		int s;
		int[][] a = new int[100][100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (q = 0; q < k; q++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s1 = 0;
			s2 = 0;
			for (i = 0; i < m ; i++)
			{
				for (j = 0; j < n ; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					s1 = s1 + a[i][j];
				}
			}
			for (i = 1; i < m - 1; i++)
			{
				for (j = 1; j < n - 1; j++)
				{
					s2 = s2 + a[i][j];
				}
			}
			s = s1 - s2;
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}
}

