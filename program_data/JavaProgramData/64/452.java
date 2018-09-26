package <missing>;

public class GlobalMembers
{
	/**
	* @file 1.cpp
	* @author ???
	* @date 2011-12?07
	* @description
	* ??????:????
	*/

	public static int Main()
	{
		int n;
		int[][] d = new int[101][3];
		int i;
		int j;
		int k;
		int m1;
		int m2;
		int[] p = new int[3];
		p = d;
		double[][] l = new double[10][10];
		double max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			*(p[i]) = ConsoleInput.readToWhiteSpace(true);
			*(p[i] + 1) = ConsoleInput.readToWhiteSpace(true);
			*(p[i] + 2) = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				l[i][j] = Math.sqrt((double)(*(p[i]) - *(p[j])) * (*(p[i]) - *(p[j])) + (*(p[i] + 1) - *(p[j] + 1)) * (*(p[i] + 1) - *(p[j] + 1)) + (*(p[i] + 2) - *(p[j] + 2)) * (*(p[i] + 2) - *(p[j] + 2)));
			} // ????????
		}
		for (k = 0; k < n * (n - 1) / 2; k++)
		{
			for (i = 0; i < n - 1; i++)
			{
				for (j = i + 1; j < n; j++)
				{
					if (l[i][j] > max)
					{
						max = l[i][j];
						m1 = i;
						m2 = j; // ?????????
					}
				}
			}
			System.out.print('(');
			System.out.print((p[m1]));
			System.out.print(',');
			System.out.print((p[m1] + 1));
			System.out.print(',');
			System.out.print((p[m1] + 2));
			System.out.print(")-(");
			System.out.print((p[m2]));
			System.out.print(',');
			System.out.print((p[m2] + 1));
			System.out.print(',');
			System.out.print((p[m2] + 2));
			System.out.print(')');
			System.out.print('=');
			System.out.printf("%.2f", l[m1][m2]);
			System.out.printf("%.2f", "\n");
			l[m1][m2] = 0; // ??????????????????????
			max = 0;
		}
		return 0;
	}
}

