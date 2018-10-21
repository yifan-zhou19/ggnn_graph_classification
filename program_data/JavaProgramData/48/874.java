package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int m;
		int n;
		int i;
		int j;
		int k;
		int fx;
		int fy;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		for (int k = 0;k < n;k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			for (i = 1;i < 8;i++)
			{
				for (j = 1;j < 8;j++)
				{
					b[i][j] += a[i][j];
					for (fx = -1;fx <= 1;fx++)
					{
						for (fy = -1;fy <= 1;fy++)
						{
							b[i + fx][j + fy] += a[i][j];
						}
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(a,b,(Integer.SIZE / Byte.SIZE));
		}
		for (i = 0;i < 9;i++)
		{
			System.out.print(a[i][0]);
			for (j = 1;j < 9;j++)
			{
				System.out.print(' ');
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

