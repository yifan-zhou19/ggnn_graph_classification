package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int m;
		int n;
		int[][] array = new int[100][100];
		int sum;
		int i;
		int j;
		int k;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < n;k++)
				{
					array[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 0;j < m;j++)
			{
				sum = sum + array[j][0] + array[j][n - 1];
			}
			for (k = 0;k < n;k++)
			{
				sum = sum + array[0][k] + array[m - 1][k];
			}
			System.out.print(sum - array[0][0] - array[0][n - 1] - array[m - 1][0] - array[m - 1][n - 1]);
			System.out.print("\n");
		}
		System.in.read();
		return 0;
	}
}

