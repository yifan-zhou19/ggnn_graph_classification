package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[11][11];
	public static void day()
	{
		 int i;
		 int j;
		 int[][] b = new int[11][11];
		 for (i = 0;i < 11;i++)
		 {
			 for (j = 0;j < 11;j++)
			 {
				 b[i][j] = a[i][j];
			 }
		 }
		 for (i = 1;i <= 9;i++)
		 {
		 for (j = 1;j <= 9;j++)
		 {
						  b[i + 1][j] += a[i][j];
						  b[i - 1][j] += a[i][j];
						  b[i][j + 1] += a[i][j];
						  b[i][j - 1] += a[i][j];
						  b[i + 1][j + 1] += a[i][j];
						  b[i + 1][j - 1] += a[i][j];
						  b[i - 1][j + 1] += a[i][j];
						  b[i - 1][j - 1] += a[i][j];
						  b[i][j] += a[i][j];
		 }
		 }
		 for (i = 0;i < 11;i++)
		 {
			 for (j = 0;j < 11;j++)
			 {
				 a[i][j] = b[i][j];
			 }
		 }
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int days;
		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 11;j++)
			{
				a[i][j] = 0;
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = n;
		for (i = 1;i <= days;i++)
		{
			day();
		}
		for (i = 1;i < 10;i++)
		{
						 System.out.print(a[i][1]);
						 for (j = 2;j < 10;j++)
						 {
							 System.out.print(' ');
							 System.out.print(a[i][j]);
						 }
						 System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

