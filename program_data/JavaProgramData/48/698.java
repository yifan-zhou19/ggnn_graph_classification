package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???  ???????        **
	//*????? 1100012996       **
	//*???2011.11.23**
	//****************************************
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int i;
		int j;
		int k;
		int m;
		int n;
		int p;
		int q;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		for (k = 0; k < n; k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 1; i < 8; i++)
			{
				for (j = 1; j < 8; j++)
				{
					b[i][j] += a[i][j];
					for (p = -1; p <= 1 ; p++)
					{
						for (q = -1; q <= 1; q++)
						{
							b[i + p][j + q] += a[i][j];
						}
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
				memcpy(a, b,(Integer.SIZE / Byte.SIZE));
		}
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if (j == 0)
				{
					System.out.print(a[i][j]);
				}

				else
				{
					System.out.print(" ");
					System.out.print(a[i][j]);
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

