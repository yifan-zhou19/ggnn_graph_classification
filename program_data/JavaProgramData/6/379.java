package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k >= 1)
		{
			int m;
			int n;
			int i;
			int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			int * p = 0;
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] a = new int[100][100];
			for (i = 0; i < m; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (p = a[0]; p < a[0] + n; p++) //???
			{
				sum = sum + *p;
			}
			for (p = a[0]; p <= a[m - 1]; p += 100) //???
			{
				sum = sum + *p;
			}
			for (p = a[m - 1]; p < a[m - 1] + n; p++) //????
			{
				sum = sum + *p;
			}
			for (p = a[0] + n - 1; p <= a[m - 1] + n - 1; p += 100) //????
			{
				sum = sum + *p;
			}
			System.out.print(sum - a[0][0] - a[0][n - 1] - a[m - 1][0] - a[m - 1][n - 1]);
			System.out.print("\n");
			k--;
		}
		return 0;
	}
}

