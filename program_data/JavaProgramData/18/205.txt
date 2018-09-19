package <missing>;

public class GlobalMembers
{
	public static int sum = 0;

	public static int min(int[] a, int n) //???????????
	{
		int m = a[0];
		for (int i = 0;i < n;i++)
		{
			if (a[i] < m)
			{
				m = a[i];
			}
		}
		return m;
	}

	public static int juzhen(int[][] a, int n)
	{
		int[] hangmin = new int[100]; //?????????????????
		int[] liemin = new int[100];
		for (int i = 0;i < n;i++)
		{
			hangmin[i] = min(a[i], n); //?????????
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[i][j] = a[i][j] - hangmin[i]; //?????????????????????
			}
		}
		int[] templie = new int[100]; //??????????????
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				templie[j] = a[j][i];
			}
			liemin[i] = min(templie, n); //?????????
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[j][i] = a[j][i] - liemin[i]; //???????????????????????
			}
		}
		sum = sum + a[1][1]; //??sum
		for (int i = 1;i < n;i++) //???????
		{
			for (int j = 0;j < n;j++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
		for (int j = 1;j < n;j++)
		{
			for (int i = 0;i < n;i++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		n = n - 1; //?n??1
		if (n == 1) //??????????????1???
		{
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		else
		{
			juzhen(a, n); //???????
		}
		return 0;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		for (int k = 1;k <= n;k++) //?k???????
		{
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		juzhen(a, n);
		}
		return 0;
	}
}

