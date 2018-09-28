package <missing>;

public class GlobalMembers
{
	//********************************
	//*??  ???????      *****
	//*????? 1300012753     ***** 
	//*???2013.11.19          *****   
	//********************************
	public static void cal(int[][][] a, int step)
	{
		for (int i = 4 - step; i <= 4 + step; i++)
		{
			for (int j = 4 - step; j <= 4 + step; j++)
			{
				a[step + 1][i - 1][j - 1] += a[step][i][j];
				a[step + 1][i - 1][j] += a[step][i][j];
				a[step + 1][i - 1][j + 1] += a[step][i][j];
				a[step + 1][i][j - 1] += a[step][i][j];
				a[step + 1][i][j + 1] += a[step][i][j];
				a[step + 1][i + 1][j - 1] += a[step][i][j];
				a[step + 1][i + 1][j] += a[step][i][j];
				a[step + 1][i + 1][j + 1] += a[step][i][j];
				a[step + 1][i][j] += 2 * a[step][i][j];
			}
		}
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][][] a = new int[5][9][9];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		a[0][4][4] = 1;
		for (int i = 0; i < n; i++)
		{
		cal(a, i);
		}
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				if (j == 0)
				{
				System.out.print(a[n][i][j] * m);
				}
				else
				{
				System.out.print(' ');
				System.out.print(a[n][i][j] * m);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

