package <missing>;

public class GlobalMembers
{
	/*
	 * Distance sorting.cpp
	 *
	 *  Created on: 2013-11-6
	 *      Author: ???
	 */
	public static int Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		float[] d = new float[100];
		float p;
		float[][] x = new float[100][3];
		float[][] y = new float[100][3];
		int i;
		int j;
		int n;
		int k;
		int m = 0;
		int s;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				  x[m][0] = a[i];
				  x[m][1] = b[i];
				  x[m][2] = c[i];
				  y[m][0] = a[j];
				  y[m][1] = b[j];
				  y[m][2] = c[j];
				  d[m] = Math.sqrt((x[m][0] - y[m][0]) * (x[m][0] - y[m][0]) + (x[m][1] - y[m][1]) * (x[m][1] - y[m][1]) + (x[m][2] - y[m][2]) * (x[m][2] - y[m][2]));
				  m++;
			}
		}
		for (j = 0;j < m - 1;j++)
		{
			for (i = 0;i < m - 1 - j;i++)
			{
				if (d[i] < d[i + 1])
				{
					p = d[i];
					d[i] = d[i + 1];
					d[i + 1] = p;
					for (k = 0;k < 3;k++)
					{
						s = x[i][k];
						x[i][k] = x[i + 1][k];
						x[i + 1][k] = s;
						t = y[i][k];
						y[i][k] = y[i + 1][k];
						y[i + 1][k] = t;
					}
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%f", "(");
			System.out.printf("%f", x[i][0]);
			System.out.printf("%f", ",");
			System.out.printf("%f", x[i][1]);
			System.out.printf("%f", ",");
			System.out.printf("%f", x[i][2]);
			System.out.printf("%f", ")-(");
			System.out.printf("%f", y[i][0]);
			System.out.printf("%f", ",");
			System.out.printf("%f", y[i][1]);
			System.out.printf("%f", ",");
			System.out.printf("%f", y[i][2]);
			System.out.printf("%f", ")=");
			System.out.printf("%.2f", d[i]);
			System.out.printf("%.2f", "\n");
		}


		 return 0;

	}

}

