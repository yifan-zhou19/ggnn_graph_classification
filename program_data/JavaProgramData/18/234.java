package <missing>;

public class GlobalMembers
{
	public static int del(int[][] num, int n)
	{
		int sum = 0;
		int j;
		int i;
		int min = 1000;
		for (j = 0; j <= n - 1; j++)
		{
			min = 1000;
			for (i = 0; i <= n - 1; i++)
			{
				if (num[j][i] < min)
				{
					min = num[j][i];

				}
			}

			if (min != 0)
			{
				for (i = 0; i <= n - 1; i++)
				{
					num[j][i] = num[j][i] - min;
				}
			}
		}

		for (j = 0; j <= n - 1; j++)
		{
			min = 1000;
			for (i = 0; i <= n - 1; i++)
			{
				if (num[i][j] < min)
				{
					min = num[i][j];
					if (min == 0)
					{
						break;
					}
				}
			}
			if (min != 0)
			{
				for (i = 0; i <= n - 1; i++)
				{
					num[i][j] = num[i][j] - min;
				}
			}
		}
		sum = sum + num[1][1];
		if (n == 2)
		{
			return sum;
		}
		else
		{
			for (i = 2; i <= n; i++)
			{
				num[0][i - 1] = num[0][i];
				num[i - 1][0] = num[i][0];
			}
			for (i = 2; i <= n - 1; i++)
			{
				for (j = 2; j <= n - 1; j++)
				{
					num[i - 1][j - 1] = num[i][j];
				}
			}
			sum = sum + del(num, n - 1);
			return sum;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[][] num = new int[200][200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i <= n - 1; i++)
		{
			for (j = 0; j <= n - 1; j++)
			{
				for (k = 0; k <= n - 1; k++)
				{

					num[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(del(num, n));
			System.out.print("\n");
		}
		return 0;
	}

}

