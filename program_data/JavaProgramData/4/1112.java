package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] a = new int[m][n];
			for (int c = 0;c < m;c++)
			{
				for (int d = 0;d < n;d++)
				{
					a[c][d] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[m];
			int[] p = new int[m];
			for (int j = 0;j < m;j++)
			{
				p[j] = a[j];
			}
			for (int k = 0;k <= m + n - 2;k++)
			{
				for (int c = 0;c < m;c++)
				{
							for (int d = 0;d < n;d++)
							{
								if (c + d == k)
								{
									System.out.print((p[c] + d));
									System.out.print("\n");
								}
							}
				}
			}
		return 0;
	}
}

