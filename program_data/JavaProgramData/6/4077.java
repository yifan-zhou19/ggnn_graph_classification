package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[] sum = new int[100];
		int i;
		int j;
		int l;
		int k;
		int m;
		int n;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m;j++)
			{
			 for (l = 0;l < n;l++)
			 {
			  a[j][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 }
			}
			for (j = 0;j < n;j++)
			{
			sum[i] = sum[i] + a[0][j];
			}
			for (j = 1;j < m;j++)
			{
				sum[i] = sum[i] + a[j][0];
				sum[i] = sum[i] + a[j][n - 1];
			}
			for (j = 1;j < n - 1;j++)
			{
			sum[i] = sum[i] + a[m - 1][j];
			}
		}
		for (i = 0;i < k;i++)
		{
		System.out.print(sum[i]);
		System.out.print("\n");
		}
		return 0;
	}
}

