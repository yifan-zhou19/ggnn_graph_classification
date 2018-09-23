package <missing>;

public class GlobalMembers
{
	public static int cut(int[][] num, int n)
	{
		int m = 0;
		int i = 0;
		int k = 0;
		int sum = 0;
		int j = 0;
		int[] l = new int[100];
		int[] s = new int[100];
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				l[j] = 0;
				s[j] = 0;
			}
			for (j = 0;j < n;j++)
			{
				if (num[j][0] >= 0)
				{
					l[j] = num[j][0];
					for (k = 0;k < n;k++)
					{
						if (num[j][k] >= 0 && num[j][k] < l[j])
						{
							l[j] = num[j][k];
						}
					}
					for (k = 0;k < n;k++)
					{
						num[j][k] = num[j][k] - l[j];
					}
				}
			}
			System.out.print("\n");
			for (j = 0;j < n;j++)
			{
				if (num[0][j] >= 0)
				{
					s[j] = num[0][j];
					for (k = 0;k < n;k++)
					{
						if (num[k][j] >= 0 && num[k][j] < s[j])
						{
							s[j] = num[k][j];
						}
					}
					for (k = 0;k < n;k++)
					{
						num[k][j] = num[k][j] - s[j];
					}
				}
			}
			sum = sum + num[i][i];
			for (j = 0;j < n;j++)
			{
				num[i][j] = -10;
				num[j][i] = -10;
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int sum = 0;
		int[][] num = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < 100;j++)
			{
				for (k = 0;k < 100;k++)
				{
					num[j][k] = -10;
				}
			}
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					num[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			sum = cut(num, n);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

