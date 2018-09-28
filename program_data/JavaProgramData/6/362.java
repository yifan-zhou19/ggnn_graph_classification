package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int sum;
		int[][] a = new int[100][100];
		int[] p;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1; j <= k; j++)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (p = a, i = 0; i < m * n; i++)
			{
				p[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (i <= n - 1 || i >= m * n - n - 1 || (i + 1) % n == 0 || i % n == 0)
				{
					sum += p[i];
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

