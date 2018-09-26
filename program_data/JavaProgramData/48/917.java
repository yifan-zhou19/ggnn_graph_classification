package <missing>;

public class GlobalMembers
{
	/*
	 * ????main.cpp
	 * ??????
	 * ?????2013-01-11
	 * ???????9???????????????m?????????????????????10???????10??????????????????????????????????????????n(1?n?4)????????????????
	 */

	public static int Main()
	{
		int day;
		int d;
		int i;
		int j;
		int k;
		int di;
		int dj;
		int[][] a = new int[9][9];
		int[][] aa = new int[9][9];
		int[][] direction =
		{
			{1, 0},
			{-1, 0},
			{0, 1},
			{0, -1},
			{-1, -1},
			{-1, 1},
			{1, 1},
			{1, -1}
		};
		a[4][4] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (d = 0; d < day; d++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(aa,0,(Integer.SIZE / Byte.SIZE));
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					if (aa[i][j] == a[i][j])
					{
						continue;
					}
					for (k = 0; k < 8; k++)
					{
						di = direction[k][0];
						dj = direction[k][1];
						if (i + di < 9 && i + di >= 0 && j + dj < 9 && j + dj >= 0)
						{
							a[i + di][j + dj] += (a[i][j] - aa[i][j]);
							aa[i + di][j + dj] += (a[i][j] - aa[i][j]);
						}
					}
					a[i][j] += (a[i][j] - aa[i][j]);
				}
			}
		}
		for (i = 0; i < 9; i++)
		{
			System.out.print(a[i][0]);
			for (j = 1; j < 9; j++)
			{
				System.out.print(' ');
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

