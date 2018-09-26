package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];
	public static int n;
	public static int day = 0;

	public static void feed()
	{
		 if (day == n)
		 {
			 return;
		 }
		 for (int i = 0; i <= 8; i++)
		 {
			 for (int j = 0; j <= 8; j++)
			 {
				 b[i][j] += 2 * a[i][j];
				 if (i + 1 <= 8)
				 {
					 b[i + 1][j] += a[i][j];
					 if (j + 1 <= 8)
					 {
						 b[i + 1][j + 1] += a[i][j];
					 }
					 if (j - 1 >= 0)
					 {
						 b[i + 1][j - 1] += a[i][j];
					 }
				 }
				 if (i - 1 >= 0)
				 {
					 b[i - 1][j] += a[i][j];
					 if (j + 1 <= 8)
					 {
						 b[i - 1][j + 1] += a[i][j];
					 }
					 if (j - 1 >= 0)
					 {
						 b[i - 1][j - 1] += a[i][j];
					 }
				 }
				 if (j + 1 <= 8)
				 {
					 b[i][j + 1] += a[i][j];
				 }
				 if (j - 1 >= 0)
				 {
					 b[i][j - 1] += a[i][j];
				 }
			 }
		 }
			 for (int i = 0; i <= 8; i++)
			 {
				 for (int j = 0; j <= 8; j++)
				 {
						  a[i][j] = b[i][j];
						  b[i][j] = 0;
				 }
			 }
			 day++;
			 feed();
	}

	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		feed();
		for (int i = 0; i <= 8; i++)
		{
			for (int j = 0; j <= 8; j++)
			{
				System.out.print(a[i][j]);
				if (j < 8)
				{
					System.out.print(" ");
				}
				if (j == 8)
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

