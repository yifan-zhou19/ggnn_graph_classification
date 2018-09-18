package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int sum = 0;
	public static int minu(int x,int y)
	{
		if (x < y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static void del(int n)
	{
		int i;
		int m;
		int[] num = new int[n];
		if (n == 1)
		{
			System.out.print(sum);
			System.out.print("\n");
			return;
		}
		else
		{
		for (i = 0;i < n;i++)
		{
			num[i] = a[i][0];
			for (m = 0;m < n;m++)
			{
				num[i] = minu(num[i], a[i][m]);
			}
			if (num[i] != 0)
			{
				for (m = 0;m < n;m++)
				{
					a[i][m] = a[i][m] - num[i];
				}
			}
		} //???
		for (i = 0;i < n;i++)
		{
			num[i] = a[0][i];
			for (m = 0;m < n;m++)
			{
				num[i] = minu(num[i], a[m][i]);
			}
			if (num[i] != 0)
			{
				for (m = 0;m < n;m++)
				{
					a[m][i] = a[m][i] - num[i]; //???
				}
			}
		}
		sum += a[1][1];
		for (i = 1;i < n - 1;i++)
		{
			for (m = 0;m < n;m++)
			{
				a[i][m] = a[i + 1][m];
			}
		}
		for (i = 1;i < n - 1;i++)
		{
			for (m = 0;m < n;m++)
			{
				a[m][i] = a[m][i + 1];
			}
		}
		del(n - 1);
		}
	}
	public static int Main()
	{
		int j;
		int k;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			sum = 0;
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		del(n);
		}
		return 0;
	}
}

