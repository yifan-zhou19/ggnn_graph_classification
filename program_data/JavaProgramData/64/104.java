/*
 * jiegou_4.cpp
 * ???????
 *  Created on: 2011-1-2
 *      Author: Wang Ju
 */

public class distance //?????distance
{
	public double[] a = new double[3]; //??1
	public double[] b = new double[3]; //??2
	public double distance; //???????
}

package <missing>;

public class GlobalMembers
{
	public static int factorial(int i) //????facortial,??i?????????
	{
		return (i * (i + 1)) / 2;
	}
	public static double oper(double x1, double y1, double z1, double x2, double y2, double z2)
	{
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2));
	//????oper,???????
	}
	public static int Main() //????
	{
		int n; //????
		int i;
		int j;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[][] x = new double[n][3];
		for (i = 0; i < n; i++)
		{
			x[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			x[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			x[i][2] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		m = factorial(n - 1); //m?distance???
		distance[] dot = tangible.Arrays.initializeWithDefaultdistanceInstances(m); //??m?distance??
		int k = 0;
		for (i = 1; i < n; i++)
		{
			for (j = i + 1; j <= n; j++)
			{
				dot[k].a[0] = x[i - 1][0];
				dot[k].a[1] = x[i - 1][1];
				dot[k].a[2] = x[i - 1][2];
				dot[k].b[0] = x[j - 1][0];
				dot[k].b[1] = x[j - 1][1];
				dot[k].b[2] = x[j - 1][2];
				dot[k].distance = oper(dot[k].a[0], dot[k].a[1], dot[k].a[2], dot[k].b[0], dot[k].b[1], dot[k].b[2]);
				k++;
	//?????????????????????????
			}
		}
		for (i = 0; i < m - 1; i++)
		{
			for (j = 0; j < m - i - 1; j++)
			{
				if (dot[j].distance < dot[j + 1].distance)
				{
					distance temp = dot[j];
					dot[j] = dot[j + 1];
					dot[j + 1] = temp; //?????
				}
			}
		}
		for (i = 0; i < m; i++)
		{
			System.out.printf("%f", "(");
			System.out.printf("%f", dot[i].a[0]);
			System.out.printf("%f", ",");
			System.out.printf("%f", dot[i].a[1]);
			System.out.printf("%f", ",");
			System.out.printf("%f", dot[i].a[2]);
			System.out.printf("%f", ")-(");
			System.out.printf("%f", dot[i].b[0]);
			System.out.printf("%f", ",");
			System.out.printf("%f", dot[i].b[1]);
			System.out.printf("%f", ",");
			System.out.printf("%f", dot[i].b[2]);
			System.out.printf("%f", ")=");
			System.out.printf("%.2f", dot[i].distance);
			System.out.printf("%.2f", "\n");
		} //???????????
		return 0; //???0?
	}




}

