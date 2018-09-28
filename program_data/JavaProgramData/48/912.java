package <missing>;

public class GlobalMembers
{
	//**********************************
	//*  ????homework_20.cpp       *
	//*  ??????1200012884        * 
	//*  ?????2012?11?15?      *
	//*  ?????????????    *
	//**********************************
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];
	public static int[] x = {-1, 0, 1, -1, 1, -1, 0, 1};
	public static int[] y = {-1, -1, -1, 0, 0, 1, 1, 1};

	public static int Main()
	{
		int p;
		int q;
		int i;
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		for (;n > 0;n--)
		{
			for (p = 0;p < 9;p++)
			{
				for (q = 0;q < 9;q++)
				{
					for (i = 0;i < 8;i++)
					{
						b[p + x[i]][q + y[i]] += a[p][q];
					}
					b[p][q] += a[p][q] * 2;
				}
			}
			for (p = 0;p < 9;p++)
			{
				for (q = 0;q < 9;q++)
				{
					a[p][q] = b[p][q];
					b[p][q] = 0;
				}
			}
		}
		for (p = 0;p < 9;p++)
		{
			for (q = 0;q < 8;q++)
			{
				System.out.print(a[p][q]);
				System.out.print(" ");
			}
			System.out.print(a[p][8]);
			System.out.print("\n");
		}
		return 0;
	}
}

