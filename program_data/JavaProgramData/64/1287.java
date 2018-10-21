package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ????
	//
	//  Created by ? ?? on 12-12-11.
	//  Copyright (c) 2012? ? ??. All rights reserved.
	//



	public static int Main()
	{
		double[][] b = new double[99999][6];
		double[] c = new double[99999];
		double[][] a = new double[1000][3];

		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k = 0;
		int m;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < 3; j++)
			{
				a[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				b[k][0] = a[i][0];
				b[k][1] = a[i][1];
				b[k][2] = a[i][2];
				b[k][3] = a[j][0];
				b[k][4] = a[j][1];
				b[k][5] = a[j][2];
				c[k] = Math.sqrt(Math.pow(a[j][0] - a[i][0], 2) + Math.pow(a[j][1] - a[i][1], 2) + Math.pow(a[j][2] - a[i][2], 2));
				k++;
			}
		}
		for (i = 0; i < k - 1; i++)
		{
			for (j = 0; j < k - 1 - i; j++)
			{
				if (c[j] < c[j + 1])
				{
					double p = c[j];
					c[j] = c[j + 1];
					c[j + 1] = p;
					for (m = 0; m < 6; m++)
					{
						p = b[j][m];
						b[j][m] = b[j + 1][m];
						b[j + 1][m] = p;
					}
				}
			}
		}
		for (i = 0; i < k; i++)
		{
			System.out.printf("%f", "(");
			System.out.printf("%f", b[i][0]);
			System.out.printf("%f", ",");
			System.out.printf("%f", b[i][1]);
			System.out.printf("%f", ",");
			System.out.printf("%f", b[i][2]);
			System.out.printf("%f", ")");
			System.out.printf("%f", "-");
			System.out.printf("%f", "(");
			System.out.printf("%f", b[i][3]);
			System.out.printf("%f", ",");
			System.out.printf("%f", b[i][4]);
			System.out.printf("%f", ",");
			System.out.printf("%f", b[i][5]);
			System.out.printf("%f", ")");
			System.out.printf("%f", "=");
			System.out.printf("%.2f", c[i]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

