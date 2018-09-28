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
		int l;
		int sum1 = 0;
		int sum = 0;
		int[][] a = new int[100][100];

		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 1;l <= k;l++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] p = new int[100];
			p = a;
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
				*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
				sum = sum + *(p[i] + j);
				}
			}
			for (i = 1;i < m - 1;i++)
			{
				for (j = 1;j < n - 1;j++)
				{
					sum1 = sum1 + *(p[i] + j);
				}
			}

			sum = sum - sum1;
			System.out.print(sum);
			System.out.print("\n");
			sum = sum1 = 0;
		}
	}
}

