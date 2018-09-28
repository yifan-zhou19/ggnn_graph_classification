package <missing>;

public class GlobalMembers
{
	/*
	 * shuzu.2.3.cpp
	 *
	 *  Created on: 2012-11-19
	 *      Author: wangrunhui
	 */


	public static int Main()
	{
		int n; //a?????i,j,k,l???????ai?ak??????????
		int[][] a = new int[10][3];
		int i;
		int j;
		int k;
		int[] ai = new int[100];
		int[] ak = new int[100];
		int l = 0;
		int tempi;
		int tempk;
		double[] d = new double[100]; //d????
		double tempd;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++) //?a??
		{
			for (j = 0; j < 3; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < n; i++) //????????????????????
		{
			for (k = i + 1; k < n; k++) //???i+1?????????????
			{
				d[l] = Math.sqrt((a[i][0] - a[k][0]) * (a[i][0] - a[k][0]) + (a[i][1] - a[k][1]) * (a[i][1] - a[k][1]) + (a[i][2] - a[k][2]) * (a[i][2] - a[k][2]));
				ai[l] = i; //??????
				ak[l] = k;
				l++; //?????????
			}
		}
		for (i = 0 ; i < l - 1; i++) //????????????????????????????
		{
			for (j = 0; j < l - i - 1; j++)
			{
				if (d[j] < d[j + 1])
				{
					tempd = d[j];
					d[j] = d[j + 1];
					d[j + 1] = tempd;
					tempi = ai[j];
					ai[j] = ai[j + 1];
					ai[j + 1] = tempi;
					tempk = ak[j];
					ak[j] = ak[j + 1];
					ak[j + 1] = tempk;
				}
			}
		}
		for (j = 0; j < l ; j++) //??????
		{
			i = ai[j];
			k = ak[j];
			System.out.print('(');
			System.out.print(a[i][0]);
			System.out.print(',');
			System.out.print(a[i][1]);
			System.out.print(',');
			System.out.print(a[i][2]);
			System.out.print(")-(");
			System.out.print(a[k][0]);
			System.out.print(',');
			System.out.print(a[k][1]);
			System.out.print(',');
			System.out.print(a[k][2]);
			System.out.print(")=");
			System.out.printf("%.2f", d[j]);
			System.out.printf("%.2f", "\n");
		}
	}

}

