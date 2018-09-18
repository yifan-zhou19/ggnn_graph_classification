package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int num;
		int ans;
		int[][] a = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++) //??n???
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			} //??????
			ans = 0;
			for (num = 0;num < n - 1;num++) //?n-1??????
			{
				int min1;
				int min2;
				for (i = 0;i < n - num;i++)
				{
					min1 = a[i][0];
					for (j = 0;j < n - num;j++)
					{
						if (min1 > a[i][j])
						{
							min1 = a[i][j]; //???????
						}
					}
					for (j = 0;j < n - num;j++)
					{
						a[i][j] -= min1;
					}
				} //???
				for (j = 0;j < n - num;j++)
				{
					min2 = a[0][j];
					for (i = 0;i < n - num;i++)
					{
						if (min2 > a[i][j])
						{
							min2 = a[i][j];
						}
					}
					for (i = 0;i < n - num;i++)
					{
						a[i][j] -= min2;
					}
				} //???
				ans += a[1][1]; //??a[1][1]??
				for (i = 1;i < n - num - 1;i++)
				{
					for (j = 0;j < n - num;j++)
					{
						a[i][j] = a[i + 1][j];
					}
				} //?????3?????
				for (j = 1;j < n - num - 1;j++)
				{
					for (i = 0;i < n - num - 1;i++)
					{
						a[i][j] = a[i][j + 1];
					}
				} //?????3?????
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}
}

