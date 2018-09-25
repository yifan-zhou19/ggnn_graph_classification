package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int[][] zb = new int[100][2];
		int k = 0;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i][j] == 0)
				{
					zb[k][0] = i;
					zb[k][1] = j;
					k++;
				}
			}
		}

		s = (zb[k - 1][0] - zb[0][0] - 1) * (zb[k - 1][1] - zb[0][1] - 1);
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}

}

