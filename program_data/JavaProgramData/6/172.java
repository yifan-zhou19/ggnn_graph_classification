package <missing>;

public class GlobalMembers
{
	//?????
	//1000010098
	//???
	public static int sum(int m, int n, int[][] a)
	{
		int i;
		int sum = 0;
		for (i = 0;i < n; i++)
		{
			sum += *(*(a + m - 1) + i);
			sum += *(a + i);
		}
		for (i = 1;i <= m - 2; i++)
		{
			sum += **(a + i);
			sum += *(*(a + i) + n - 1);
		}
		return sum;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		int j;
		int p;
		int[][] a = new int[100][100];
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= p; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j < m; j++)
			{
				for (k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(sum(m, n, a));
			System.out.print("\n");
		}
		return 0;
	}


}

