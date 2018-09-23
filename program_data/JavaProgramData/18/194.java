package <missing>;

public class GlobalMembers
{
	// ?????????.cpp : Defines the entry point for the console application.
	// ????????????????
	public static int[][] a = new int[100][100]; //???????????????
	public static int sum(int n) //??????????????????
	{
		int i = 0;
		int j = 0;
		int min = 0;
		int count = 0;
		for (i = 0;i < n;i++) //?????????????????????????
		{
			min = a[i][0];
			for (j = 0;j < n;j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
				else
				{
					min = min;
				}
			}
			for (j = 0;j < n;j++)
			{
				a[i][j] = a[i][j] - min;
			}
		}
		for (i = 0;i < n;i++) //?????????????????????????
		{
			min = a[0][i];
			for (j = 0;j < n;j++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
				else
				{
					min = min;
				}
			}
			for (j = 0;j < n;j++)
			{
				a[j][i] = a[j][i] - min;
			}
		}
		count = count + a[1][1]; //???????a[1][1]???
		if (n == 2) //???????????count
		{
			return count;
		}
		else //?????n-1??????????
		{
			for (i = 2;i < n;i++)
			{
				a[i - 1][0] = a[i][0];
			}
			for (j = 2;j < n;j++)
			{
				a[0][j - 1] = a[0][j];
			}
			for (i = 2;i < n;i++)
			{
				for (j = 2;j < n;j++)
				{
					a[i - 1][j - 1] = a[i][j];
				}
			}
			count = count + sum(n - 1);
			return count;
		}
	}
	public static int Main() //?????
	{
		int n; //n?????
		int i = 0;
		int j = 0;
		int k = 0;
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			b[i] = sum(n); //??sum??
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(b[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

