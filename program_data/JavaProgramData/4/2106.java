package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[100][100];
		int i;
		int j;
		int num = 1;
		int k;
		int l;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (m == 1)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < m;j++)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
				}
			}
			return 0;
		}
		k = 0;
		l = 0;
		while (true)
		{
			if (k < n && l < m)
			{
			System.out.print(a[k][l]);
			System.out.print("\n");
			}
			if (l != 0)
			{
				k++;
				l--;
				continue;
			}
			if (l == 0)
			{
				t = k;
				k = 0;
				l = t + 1;
			}
			while (k >= n != 0 || l >= m)
			{
				k++;
				l--;
				if (l == 0)
				{
					t = k;
					k = 0;
					l = t + 1;
				}
				if (l + k == m + n)
				{
					return 0;
				}
			}
		}
	}


}

