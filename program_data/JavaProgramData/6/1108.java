package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		int sum;
		int[] n = new int[200];
		int g;
		int[] s = new int[200];
		for (g = 0;g <= t - 1;g++)
		{
		s[g] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n[g] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int i;
		int j;
		for (i = 0;i <= s[g] - 1;i++)
		{
			for (j = 0;j <= n[g] - 1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		sum = 0;
		for (i = 0;i <= s[g] - 1;i++)
		{
			sum = sum + **(a + i);
			sum = sum + *(*(a + i) + n[g] - 1);
		}
		for (j = 0;j <= n[g] - 1;j++)
		{
			sum = sum + *(a + j);
			sum = sum + *(*(a + s[g] - 1) + j);
		}
		sum = sum - * a - *(*(a + s[g] - 1) + n[g] - 1) - *(a + n[g] - 1) - **(a + s[g] - 1);
		System.out.print(sum);
		System.out.print("\n");
		}
		return 0;

	}
}

