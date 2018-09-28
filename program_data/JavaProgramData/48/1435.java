package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];

	public static int Main()
	{
		int m;
		int day;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Integer.SIZE / Byte.SIZE));
		b[4][4] = m;
		for (int i = 0; i < day; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
			for (int p = 0; p < 9; p++)
			{
				for (int q = 0; q < 9; q++)
				{
					if (b[p][q] != 0)
					{
						a[p][q] = a[p][q] + 2 * b[p][q];
						if (p - 1 >= 0)
						{
							a[p - 1][q] += b[p][q];
						}
						if (p + 1 < 9)
						{
							a[p + 1][q] += b[p][q];
						}
						if (q - 1 >= 0)
						{
							a[p][q - 1] += b[p][q];
						}
						if (q + 1 < 9)
						{
							a[p][q + 1] += b[p][q];
						}
						if (p - 1 >= 0 && q - 1 >= 0)
						{
							a[p - 1][q - 1] += b[p][q];
						}
						if (p + 1 < 9 && q + 1 < 9)
						{
							a[p + 1][q + 1] += b[p][q];
						}
						if (p - 1 >= 0 && q + 1 < 9)
						{
							a[p - 1][q + 1] += b[p][q];
						}
						if (p + 1 < 9 && q - 1 >= 0)
						{
							a[p + 1][q - 1] += b[p][q];
						}
					}
				}
			}
			for (int g = 0; g < 9; g++)
			{
				for (int h = 0; h < 9; h++)
				{
					b[g][h] = a[g][h];
				}
			}
		}
		for (int s = 0; s < 9; s++)
		{
			System.out.print(a[s][0]);
			for (int t = 1; t < 9; t++)
			{
				System.out.print(' ');
				System.out.print(a[s][t]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

