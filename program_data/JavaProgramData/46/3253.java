package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int n;
		int m;
		int[][] flag = new int[100][100];
		int k = 0;
		int l = 0;
		int num = 0;
		int sign = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		while (num < m * n)
		{
			System.out.print(a[k][l]);
			System.out.print("\n");
			flag[k][l] = 1;
			num++;
			if (sign == 1)
			{
				if (l != m - 1 && flag[k][l + 1] == 0)
				{
					l++;
				}
				else
				{
					sign = 2;
					k++;
					continue;
				}
			}
			if (sign == 2)
			{
				if (k != n - 1 && flag[k + 1][l] == 0)
				{
					k++;
				}
				else
				{
					sign = 3;
					l--;
					continue;
				}
			}
			if (sign == 3)
			{
				if (l != 0 && flag[k][l - 1] == 0)
				{
					l--;
				}
				else
				{
					sign = 4;
					k--;
					continue;
				}
			}
			if (sign == 4)
			{
				if (m != 0 && flag[k - 1][l] == 0)
				{
					k--;
				}
				else
				{
					sign = 1;
					l++;
					continue;
				}
			}
		}
		return 0;
	}
}

