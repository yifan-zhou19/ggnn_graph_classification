package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int num;
		int ans;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i <= x1 - 1; i++)
		{
			for (int j = 0 ; j <= y1 - 1 ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0 ; k <= x2 - 1; k++)
		{
			for (int l = 0 ; l <= y2 - 1 ; l++)
			{
				b[k][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int p = 0 ; p <= x1 - 1 ; p++)
		{
			for (int q = 0 ; q <= y2 - 1 ; q++)
			{
				num = 0;
				for (int t = 0 ; t <= y1 - 1 ; t++)
				{
					ans = a[p][t] * b[t][q];
					num = num + ans;
				}
				c[p][q] = num;
			}
		}
		for (int m = 0 ; m <= x1 - 1 ; m++)
		{
			for (int n = 0 ; n <= y2 - 1 ; n++)
			{
				if (n != y2 - 1)
				{
				  System.out.print(c[m][n]);
				  System.out.print(" ");
				}
				if (n == y2 - 1)
				{
					System.out.print(c[m][n]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}



}

