package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int n;
		int i;
		int j;
		int m1;
		int l1;
		int m2;
		int l2;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (*(*(a + i) + j) == 0 && *(*(a + i - 1) + j) != 0 && *(*(a + i) + j - 1) != 0)
				{
					m1 = i;
					l1 = j;
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (*(*(a + i) + j) == 0 && *(*(a + i + 1) + j) != 0 && *(*(a + i) + j + 1) != 0)
				{
					m2 = i;
					l2 = j;
				}
			}
		}
		sum = (m2 - m1 - 1) * (l2 - l1 - 1);
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

