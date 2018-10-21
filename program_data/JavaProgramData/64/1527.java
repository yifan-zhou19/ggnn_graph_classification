package <missing>;

public class GlobalMembers
{
	/*
	 * julipaixu.cpp
	 * ??:??????????n??????
	 *  Created on: 2012-11-7
	 *      Author: ???
	 */



	public static int Main()
	{
		int n; //????,n??????
		int i = 0;
		int j = 0;
		int k = 0;
		double t1; //????????
		double d;
		int t2; //????????
		int t3;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] point = new int[3][n]; //??????point,num??????????
		int[][] num = new int[2][n * (n - 1) / 2];
		double[] distance = new double[n * (n - 1) / 2]; //??????distance,??????
		for (i = 0;i < n;i++) //??????
		{
			point[0][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			point[1][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			point[2][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++) //????,????????,????????
		{
			for (j = i + 1;j < n;j++)
			{
				d = (point[0][i] - point[0][j]) * (point[0][i] - point[0][j]) + (point[1][i] - point[1][j]) * (point[1][i] - point[1][j]) + (point[2][i] - point[2][j]) * (point[2][i] - point[2][j]);
				distance[k] = Math.sqrt(d);
				num[0][k] = i;
				num[1][k] = j;
				 k++;
			}
		}
		for (j = 1;j < n * (n - 1) / 2;j++) //????????????,?????num?????
		{
			for (i = 0;i < (n * (n - 1) / 2) - j;i++)
			{
				if (distance[i] < distance[i + 1])
				{
					t1 = distance[i + 1];
					distance[i + 1] = distance[i];
					distance[i] = t1;
					t2 = num[0][i + 1];
					num[0][i + 1] = num[0][i];
					num[0][i] = t2;
					t3 = num[1][i + 1];
					num[1][i + 1] = num[1][i];
					num[1][i] = t3;
				}
			}
		}
		for (k = 0;k < n * (n - 1) / 2;k++) //?????????
		{
			i = num[0][k];
			j = num[1][k];
			System.out.print('(');
			System.out.print(point[0][i]);
			System.out.print(',');
			System.out.print(point[1][i]);
			System.out.print(',');
			System.out.print(point[2][i]);
			System.out.print(")-(");
			System.out.print(point[0][j]);
			System.out.print(',');
			System.out.print(point[1][j]);
			System.out.print(',');
			System.out.print(point[2][j]);
			System.out.print(")=");
			System.out.printf("%.2f", distance[k]);
			System.out.printf("%.2f", "\n");
		}
			return 0;
	}
}

