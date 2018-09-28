package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[25][25];
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
		 for (j = 0;j < n;j++)
		 {
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		}
		for (i = 0;i < m;i++)
		{
		 for (j = 0;j < n;j++)
		 {
			if ((i - 1 < 0 || a[i][j] >= a[i - 1][j]) && (j - 1 < 0 || a[i][j] >= a[i][j - 1]) && (i + 1 >= m != 0 || a[i][j] >= a[i + 1][j]) && (j + 1 >= n != 0 || a[i][j] >= a[i][j + 1]))
			{
			 System.out.print(i);
			 System.out.print(' ');
			 System.out.print(j);
			 System.out.print("\n");
			}
		 }
		}
		return 0;
	}
}

