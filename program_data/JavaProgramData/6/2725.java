package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int k;
		int m;
		int n;
		int sum;
		int i;
		int j;
		int l;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			sum = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < m;j++)
		{
			for (l = 0;l < n;l++)
			{
				*(*(a + j) + l) = ConsoleInput.readToWhiteSpace(true);
			if ((j == 0) || (l == 0) || (j == (m - 1)) || (l == (n - 1)))
			{
				sum += *(*(a + j) + l);
			}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		}
		return 0;
	}

}

