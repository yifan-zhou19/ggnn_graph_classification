package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = 0;
		int[][] a = new int[100][100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= k; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int sum = 0;
			for (int j = 0; j <= m - 1; j++)
			{
				for (int t = 0; t <= n - 1; t++)
				{
					a[j][t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			p = a[0][0];
			for (p = a[0][0]; p <= a[0][n - 1]; p++)
			{
				sum = sum + *p;
			}
			for (p = a [1][0]; p <= a[m - 2][0]; p = p + 100)
			{
				sum = sum + *p + *(p + n - 1);
			}
			for (p = a[m - 1][0]; p <= a[m - 1][n - 1]; p++)
			{
				sum = sum + *p;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
			return 0;
	}
}

