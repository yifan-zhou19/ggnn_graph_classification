package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????????    **
	//*????? 1300012990 **
	//*???2013.12.07  **
	//********************************
	public static int[][] b = new int[9][9];
	public static int[][] old = new int[9][9];
	public static void num(int a, int e)
	{
		int i;
		int j;
		for (i = 0;i <= 8;i++)
		{
			for (j = 0;j <= 8;j++)
			{
				old[i][j] = b[i][j];
			}
		}
		for (i = 4 - a; i <= 4 + a; i++)
		{
			for (j = 4 - a; j <= 4 + a; j++)
			{
				ab(i, j);
			}
		}
		a++;
		if (a == e)
		{
			return;
		}
		else
		{
			num(a, e);
		}
	}
	public static void ab(int c, int d)
	{
		int i;
		int j;
		for (i = c - 1; i <= c + 1; i++)
		{
			for (j = d - 1; j <= d + 1; j++)
			{
				b[i][j] = b[i][j] + old[c][d];
			}
		}
		return;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Integer.SIZE / Byte.SIZE));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[4][4] = m;
		num(0, n);
		for (i = 0;i <= 8;i++)
		{
			System.out.print(b[i][0]);
			for (j = 1;j <= 8;j++)
			{
				System.out.print(" ");
				System.out.print(b[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}







}

