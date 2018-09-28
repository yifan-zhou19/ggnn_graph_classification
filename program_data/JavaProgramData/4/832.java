package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[][] a = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		for (j = 1;j <= m;j++)
		{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}
		for (i = 1;i <= m + n - 1;i++)
		{
			for (j = 1;j <= n;j++)
			{
			 if (i + 1 - j > 0 && i + 1 - j <= m) //????????
			 {
			 System.out.print((*(a + j) + i + 1 - j));
			 System.out.print("\n");
			 }
			}
		}
		return 0;
	}

}

