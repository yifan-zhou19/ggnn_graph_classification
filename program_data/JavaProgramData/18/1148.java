package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[][] a = new int[101][101];
	public static int s;
	public static void cal()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		for (j = 0; j < n; ++j)
		{
			for (k = 0; k < n; ++k)
			{
				a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		s = 0;
		for (j = 0; j < n; ++j)
		{
			for (k = j; k < n; ++k) //?????????????????
			{
				for (m = l = j; l < n; ++l)
				{
					if (a[k][l] < a[k][m])
					{
						m = l;
					}
				}
				m = a[k][m];
				for (l = j; l < n; ++l)
				{
					a[k][l] -= m;
				}
			}
			for (k = j; k < n; ++k) //?????????????????
			{
				for (m = l = j; l < n; ++l)
				{
					if (a[l][k] < a[m][k])
					{
						m = l;
					}
				}
				m = a[m][k];
				for (l = j; l < n; ++l)
				{
					a[l][k] -= m;
				}
			}
			s += a[j + 1][j + 1];
			for (k = j + 1; k < n; ++k) //?????????????
			{
				a[j + 1][k] = a[j][k];
				a[k][j + 1] = a[k][j];
			}
			a[j + 1][j + 1] = a[j][j];
		}
		return;
	}
	public static int Main()
	{
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; ++i)
		{
			cal(); //??s
			System.out.print(s);
			System.out.print("\n");
		}
	}

}

