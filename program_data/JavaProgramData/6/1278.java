package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[100];
		int[] y = new int[100];
		int[][] m = new int[100][100];
		int i;
		int j;
		int k;
		int[] count = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			x[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < x[k];i++)
			{
				for (j = 0;j < y[k];j++)
				{
					m[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (i == 0 || i == x[k] - 1 || j == 0 || j == y[k] - 1)
					{
						count[k] += m[i][j];
					}
				}
			}
		}
		for (k = 0;k < n;k++)
		{
			System.out.print(count[k]);
			System.out.print("\n");
		}
		return 0;
	}

}

