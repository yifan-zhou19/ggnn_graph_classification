package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *
	 *  Created on: 2012-11-3
	 *      Author: AK
	 */
	public static int Main()
	{
		double[][] a = new double[50][3]; //???????????????????
		double distance;
		int[] x = new int[10]; //?????????
		int[] y = new int[10];
		int[] z = new int[10];
		int n; //?????????
		int x1;
		int y1;
		int z1;
		int i;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{ //????????
			x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x[i] = x1;
			y[i] = y1;
			z[i] = z1;
		}
		for (i = 0;i <= n - 2;i++) //???????????????????????????
		{
			for (j = i + 1;j <= n - 1;j++)
			{
				a[k][0] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				a[k][1] = i;
				a[k][2] = j;
				k++;
			}
		}
		for (i = 1;i <= k - 1;i++) //??????????????????????????????????????
		{
			for (j = k - 1;j >= i;j--)
			{
				if (a[j][0] > a[j - 1][0])
				{
					distance = a[j - 1][0];
					a[j - 1][0] = a[j][0];
					a[j][0] = distance;
					distance = a[j - 1][1];
					a[j - 1][1] = a[j][1];
					a[j][1] = distance;
					distance = a[j - 1][2];
					a[j - 1][2] = a[j][2];
					a[j][2] = distance;
				}
			}
		}
		for (i = 0;i <= k - 1;i++) //????      ????????????printf????
		{
			System.out.print('(');
			System.out.print(x[(int)(a[i][1])]);
			System.out.print(',');
			System.out.print(y[(int)(a[i][1])]);
			System.out.print(',');
			System.out.print(z[(int)(a[i][1])]);
			System.out.print(")-(");
			System.out.print(x[(int)(a[i][2])]);
			System.out.print(',');
			System.out.print(y[(int)(a[i][2])]);
			System.out.print(',');
			System.out.print(z[(int)(a[i][2])]);
			System.out.print(")=");
			System.out.printf("%.2f", a[i][0]);
			System.out.printf("%.2f", "\n");
		}
		return 0;

	}
}

