package <missing>;

public class GlobalMembers
{
	/*
	 *  Name:distance.cpp
	 *
	 *  Created on: 2012-11-05
	 *  Author: ??
	 *  Function?????
	 */


	public static int Main()
	{
		int n;
		int i;
		int j;
		int count;
		int temp = 0;
		float sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count = n * (n - 1) / 2;
		int[][] point = new int[3][n];
		float[] distance = new float[count];
		float distance_temp;
		int[][] ptp = new int[2][count];
		int ptp_temp;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				point[j][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				sum = (float)(point[0][i] - point[0][j]) * (point[0][i] - point[0][j]) + (point[1][i] - point[1][j]) * (point[1][i] - point[1][j]) + (point[2][i] - point[2][j]) * (point[2][i] - point[2][j]);
				distance[temp] = Math.sqrt(sum);
				ptp[0][temp] = i;
				ptp[1][temp] = j;
				temp++;
			}
		}
		for (i = 0;i < count - 1;i++)
		{
			for (j = 0;j < count - 1 - i;j++)
			{
				if (distance[j] < distance[j + 1])
				{
					distance_temp = distance[j];
					distance[j] = distance[j + 1];
					distance[j + 1] = distance_temp;
					ptp_temp = ptp[0][j + 1];
					ptp[0][j + 1] = ptp[0][j];
					ptp[0][j] = ptp_temp;
					ptp_temp = ptp[1][j + 1];
					ptp[1][j + 1] = ptp[1][j];
					ptp[1][j] = ptp_temp;
				}
			}
		}
		for (i = 0;i < count;i++)
		{
			System.out.print('(');
			System.out.print(point[0][ptp[0][i]]);
			System.out.print(',');
			System.out.print(point[1][ptp[0][i]]);
			System.out.print(',');
			System.out.print(point[2][ptp[0][i]]);
			System.out.print(")-(");
			System.out.print(point[0][ptp[1][i]]);
			System.out.print(',');
			System.out.print(point[1][ptp[1][i]]);
			System.out.print(',');
			System.out.print(point[2][ptp[1][i]]);
			System.out.print(")=");
			System.out.printf("%.2f", distance[i]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}


}

