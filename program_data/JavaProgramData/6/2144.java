package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < k;i++)
		{
			int m = 0;
			int n = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] mat = new int[100][100];
			int sum = 0;
			for (int j = 0;j < m;j++)
			{
			for (int k = 0;k < n;k++)
			{
				*(*(mat + j) + k) = ConsoleInput.readToWhiteSpace(true);
				if ((j == 0) || (j == m - 1) || (k == 0) || (k == n - 1)) //?????????????????????
				{
					sum = sum + *(*(mat + j) + k);
				}
			}
			}
			System.out.print(sum);
			System.out.print("\n");

		}

		return 0;
	}

}

