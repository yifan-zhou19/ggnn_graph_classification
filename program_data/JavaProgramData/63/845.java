package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int r;
		int p;
		int q;
		int n; //A???n?m??B???m?k?
		int m;
		int k;
		int[][] a = new int[100][100]; //???????????
		int[][] b = new int[100][100]; //???????????
		int[][] c = new int[100][100];
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			//??A?? 
			for (r = 0; r < n; r++)
			{
				for (p = 0; p < m; p++)
				{
					a[r][p] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			//??B?? 
			for (r = 0; r < m; r++)
			{
				for (p = 0; p < k; p++)
				{
					b[r][p] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			//????????????C?????????? 
			for (r = 0; r < n; r++)
			{
				for (p = 0; p < k; p++)
				{
					for (q = 0; q < m; q++)
					{
						c[r][p] = c[r][p] + a[r][q] * b[q][p];
					}
				}
			}
			//?C??????? k ??? n ??? 
			for (r = 0; r < n; r++)
			{
				for (p = 0; p < k - 1; p++)
				{
					System.out.print(c[r][p]);
					System.out.print(" ");
				}
				System.out.print(c[r][k - 1]);
				System.out.print("\n");
			}
		return 0;
	}
}

