package <missing>;

public class GlobalMembers
{
	//********************************
	//*???10??                 **
	//*??????                 **
	//*???2012.1.11              **
	//*******************************/

	public static int Main()
	{
		int m;
		int n;
		int[][] hei = new int[20][20];
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				hei[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (j != 0 && hei[i][j] < hei[i][j - 1])
				{
					continue;
				}
				if (j != n - 1 && hei[i][j] < hei[i][j + 1])
				{
					continue;
				}
				if (i != 0 && hei[i][j] < hei[i - 1][j])
				{
					continue;
				}
				if (i != m - 1 && hei[i][j] < hei[i + 1][j])
				{
					continue;
				}
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

