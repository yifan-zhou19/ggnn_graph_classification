package <missing>;

public class GlobalMembers
{
	/*
	 *???pro.cpp
	 *????????????
	 *??: 2012-11-27
	 *?????1200012825
	 */

	public static int[][] a = new int[100][100];
	public static int sum = 0;
	public static int n;
	public static void rows(int num)
	{
		int[] min1 = new int[100];
		for (int i = 1;i <= n + 1 - num;i++)
		{
			min1[i] = a[i][1];
		}
		for (int i = 1;i <= n + 1 - num;i++)
		{
			for (int j = 1;j <= n + 1 - num;j++)
			{
				if (min1[i] > a[i][j])
				{
					min1[i] = a[i][j]; //????
				}
			}
			for (int j = 1;j <= n + 1 - num;j++)
			{
				a[i][j] = a[i][j] - min1[i]; //?????
			}
		}
	}
	public static void columns(int num)
	{
		int[] min2 = new int[100];
		for (int j = 1;j <= n + 1 - num;j++)
		{
			min2[j] = a[1][j];
		}
		for (int j = 1;j <= n + 1 - num;j++)
		{
			for (int i = 1;i <= n + 1 - num;i++)
			{
				if (min2[j] > a[i][j])
				{
					min2[j] = a[i][j];
				}
			}
			for (int i = 1;i <= n + 1 - num;i++)
			{
				a[i][j] = a[i][j] - min2[j];
			}
		}
	}
	public static void deletes(int num)
	{ //????????
		for (int i = 2;i < n + 1 - num;i++)
		{
			for (int j = 1;j <= n + 1 - num;j++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
		for (int j = 2;j < n + 1 - num;j++)
		{
			for (int i = 1;i < n + 1 - num;i++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
	}
	public static int Main()
	{

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int q = 1;q <= n;q++)
		{
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int i = 1;i <= n - 1;i++)
			{ //??n-1???
				rows(i);
				columns(i);
				sum = sum + a[2][2];
				deletes(i);
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}

}

