package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = {0};
		int[][] b = {0};
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[MAX / 2][MAX / 2] = m;
		for (int k = 0; k < n; k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));
			for (int i = 1; i < MAX - 1; i++)
			{
				for (int j = 1; j < MAX - 1; j++)
				{
					b[i][j] += a[i][j];
					for (int x = -1; x <= 1; x++)
					{
						for (int y = -1; y <= 1; y++)
						{
							b[i + x][j + y] += a[i][j];
						}
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(a, b, (Integer.SIZE / Byte.SIZE));
		}
		for (int i = 0; i < MAX; i++)
		{
			for (int j = 0; j < MAX - 1; j++)
			{
				System.out.print(a[i][j]);
				System.out.print(' ');
			}
			System.out.print(a[i][MAX - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

