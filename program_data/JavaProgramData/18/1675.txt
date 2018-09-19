package <missing>;

public class GlobalMembers
{
	public static int[][] num = new int[100][100];
	public static int n = 0;

	public static int xiaoling(int a)
	{
		int i;
		int j;
		int min;
		int temp = 0;
		if (a == 1)
		{
			return 0;
		}
		for (i = 0;i < a;i++)
		{
			min = num[i][0];
			for (j = 0;j < a;j++)
			{
				min = (min > num[i][j])?num[i][j]:min;
			}
			if (min != 0)
			{
				for (j = 0;j < a;j++)
				{
					num[i][j] = num[i][j] - min;
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			min = num[0][i];
			for (j = 0;j < a;j++)
			{
				min = (min > num[j][i])?num[j][i]:min;
			}
			if (min != 0)
			{
				for (j = 0;j < a;j++)
				{
					num[j][i] = num[j][i] - min;
				}
			}
		}
		temp = num[1][1];
		for (i = 0;i < a;i++)
		{
			for (j = 1;j < a - 1;j++)
			{
				num[i][j] = num[i][j + 1];
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 1;j < a - 1;j++)
			{
				num[j][i] = num[j + 1][i];
			}
		}
		return temp + xiaoling(a - 1);
	}

	public static int Main()
	{
		int i;
		int j;
		int sum = 0;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			sum = xiaoling(n);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

