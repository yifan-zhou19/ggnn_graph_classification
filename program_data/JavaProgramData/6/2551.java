package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[105][105];
		(int)(*p)[105] = null;
		int sum;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int time = 1;time <= k;time++)
		{
			sum = 0;
			p = a;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i < m;i++)
			{
				for (int j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int i = 0;i < n;i++)
			{
				sum = sum + *(*p + i) + *(*(p + m - 1) + i);
			}
			for (int i = 1;i < m - 1;i++)
			{
				sum = sum + *(*(p + i)) + *(*(p + i) + n - 1);
			}
			if ((m == 1) || (n == 1))
			{
			sum = sum / 2;
			}
			System.out.print(sum);
			System.out.print("\n");
		}

		return 0;
	}

}

