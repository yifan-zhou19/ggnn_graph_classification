package <missing>;

public class GlobalMembers
{
	/*
	 * 4.cpp
	 *
	 *  Created on: 2011-1-1
	 *      Author: Administrator
	 */

	public static double f(int x1,int y1,int z1,int x2,int y2,int z2)
	{
		double d2 = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2);
		return Math.sqrt(d2);
	} //?????
	public static int Main()
	{
		int[] x = new int[10]; //??????
		int[] y = new int[10];
		int[] z = new int[10];
		double[][] d = new double[10][10]; //????
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < i;j++)
			{
				d[i][j] = f(x[i], y[i], z[i], x[j], y[j], z[j]);
			} //??????
		}

		for (int k = 0;k < n * (n - 1) / 2;k++)
		{
			int a = 0;
			int b = 0;
			double D = 0;
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < i;j++)
				{
					if (d[i][j] > D)
					{
						D = d[i][j];
						a = i;
						b = j;
					}
				} //????????????
			}
			System.out.print("(");
			System.out.print(x[b]);
			System.out.print(",");
			System.out.print(y[b]);
			System.out.print(",");
			System.out.print(z[b]);
			System.out.print(")-(");
			System.out.print(x[a]);
			System.out.print(",");
			System.out.print(y[a]);
			System.out.print(",");
			System.out.print(z[a]);
			System.out.print(")=");
			System.out.printf("%.2f", D);
			System.out.printf("%.2f", "\n");
			d[a][b] = -1; //?????????????
		}
		return 0;
	}

}

