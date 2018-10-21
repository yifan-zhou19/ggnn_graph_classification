package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int b;
	public static int c;
	public static int d;
	public static int[][] m1 = new int[128][128];
	public static int[][] m2 = new int[128][128];
	public static int[][] m3 = new int[128][128];
	public static int Main()
	{
		int i;
		int j;
		int k;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < a; i++)
		{ // ????????????
			for (j = 0; j < b; j++)
			{
				m1[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < c; i++)
		{ // ????????????
			for (j = 0; j < d; j++)
			{
				m2[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < a; i++)
		{ // ????
			for (j = 0; j < b; j++)
			{
				for (k = 0; k < d; k++)
				{ // b =c????????????
					m3[i][k] += m1[i][j] * m2[j][k]; //????
				}
			}
		}
		for (i = 0; i < a; i++)
		{
			for (j = 0; j < d - 1; ++j)
			{
				System.out.print(m3[i][j]);
				System.out.print(' ');
			}
			System.out.print(m3[i][j]);
			System.out.print("\n");
		}
		return 0;
	}

}

