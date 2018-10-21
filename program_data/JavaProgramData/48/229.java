package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];

	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		a[4][4] = m;
		int i;
		int x;
		int y;
		for (i = 0; i != n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			for (x = 1;x != 8;x++)
			{
				for (y = 1;y != 8;y++)
				{
					b[x][y] += 2 * a[x][y];
					b[x - 1][y - 1] += a[x][y];
					b[x - 1][y] += a[x][y];
					b[x - 1][y + 1] += a[x][y];
					b[x][y - 1] += a[x][y];
					b[x][y + 1] += a[x][y];
					b[x + 1][y - 1] += a[x][y];
					b[x + 1][y] += a[x][y];
					b[x + 1][y + 1] += a[x][y];
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(a,b,(Integer.SIZE / Byte.SIZE));
		}
		for (x = 0;x != 9;x++)
		{
			for (y = 0;y != 9;y++)
			{
				if (y == 0)
				{
					System.out.print(a[x][y]);
				}
				else
				{
					System.out.print(' ');
					System.out.print(a[x][y]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


}

