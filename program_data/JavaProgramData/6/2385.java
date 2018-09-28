package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k; //????????????
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int sum = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0) //???
		{
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			if (m >= 3 && n >= 3)
			{
				for (i = 0;i < n;i++) //???
				{
					sum = sum + a[0][i] + a[m - 1][i];
				}
				for (i = 1;i < m - 1;i++)
				{
					sum = sum + a[i][0] + a[i][n - 1];
				}
			}
			else
			{
				for (i = 0;i < m;i++)
				{
				for (j = 0;j < n;j++)
				{
					sum = sum + a[i][j];
				}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}

}

