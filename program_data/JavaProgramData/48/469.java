package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] num = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 9;j++)
			{
			for (k = 0;k < 9;k++)
			{
				num[j][k] = 0;
			}
			}
			for (j = 0;j < 9;j++)
			{
			for (k = 0;k < 9;k++)
			{
				if (a[j][k] != 0) //????????
				{
					num[j + 1][k] = num[j + 1][k] + a[j][k];
					num[j - 1][k] = num[j - 1][k] + a[j][k];
					num[j][k + 1] = num[j][k + 1] + a[j][k];
					num[j][k - 1] = num[j][k - 1] + a[j][k];
					num[j - 1][k - 1] = num[j - 1][k - 1] + a[j][k];
					num[j - 1][k + 1] = num[j - 1][k + 1] + a[j][k];
					num[j + 1][k - 1] = num[j + 1][k - 1] + a[j][k];
					num[j + 1][k + 1] = num[j + 1][k + 1] + a[j][k];
				}
			}
			}
			for (j = 0;j < 9;j++)
			{
			for (k = 0;k < 9;k++)
			{
				if (a[j][k] != 0) //???????
				{
					a[j][k] = a[j][k] * 2;
				}
			}
			}
			for (j = 0;j < 9;j++) //????????
			{
			for (k = 0;k < 9;k++)
			{
				a[j][k] = a[j][k] + num[j][k];
			}
			}
		}
		for (j = 0;j < 9;j++) //????
		{
			for (k = 0;k < 9;k++)
			{
				if (k == 0)
				{
					System.out.print(a[j][k]);
				}
				else
				{
					System.out.print(' ');
					System.out.print(a[j][k]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

