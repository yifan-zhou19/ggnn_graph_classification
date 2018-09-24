package <missing>;

public class GlobalMembers
{
	public static int sub(int[][] num, int n)
	{
		int sum = 0;
		int j;
		int i;
		int min = 1000;
		for (j = 0;j < n;j++) //??????
		{
			min = 1000;
			for (i = 0;i < n;i++)
			{
				if (num[j][i] < min)
				{
					min = num[j][i];
					if (min == 0)
					{
						break;
					}
				}
			}
			if (min != 0)
			{
				for (i = 0;i < n;i++)
				{
					num[j][i] = num[j][i] - min;
				}
			}
		}
		for (j = 0;j < n;j++) //??????
		{
			min = 1000;
			for (i = 0;i < n;i++)
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
				for (i = 0;i < n;i++)
				{
					num[i][j] = num[i][j] - min;
				}
			}
		}
		sum = sum + num[1][1];
		if (n == 2) //??????
		{
			return sum;
		}
		else
		{
			for (i = 2;i < n;i++) //???n-1???
			{
				num[0][i - 1] = num[0][i];
				num[i - 1][0] = num[i][0];
			}
			for (i = 2;i < n;i++)
			{
				for (j = 2;j < n;j++)
				{
					num[i - 1][j - 1] = num[i][j];
				}
			}
			sum = sum + sub(num, n - 1); //??
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					num[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(sub(num, n));
			System.out.print("\n");
		}
		return 0;
	}
}

