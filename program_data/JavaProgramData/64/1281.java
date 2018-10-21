package <missing>;

public class GlobalMembers
{
	/*
	 * juli.cpp
	 *??: ?????????
	 *  Created on: 2012-11-9
	 *      Author: ??
	 */

	public static int Main()
	{
		int n; //??n???????????
		int i;
		int j;
		int k = 0;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int[] start = new int[45];
		int[] end = new int[45];
		double[] dis = new double[45]; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				start[k] = i;
				end[k] = j;
				dis[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				k++; //???????????????????????
			}
		}
		for (i = 0; i < k - 1; i++)
		{
			for (j = 0; j < k - i - 1; j++)
			{
				if (dis[j] < dis[j + 1])
				{
					swap(dis[j], dis[j + 1]);
					swap(start[j], start[j + 1]);
					swap(end[j], end[j + 1]); //????
				}
			}
		}
		for (i = 0; i < k; i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n", x[start[i]], y[start[i]], z[start[i]], x[end[i]], y[end[i]], z[end[i]], dis[i]); //?????
		}
		return 0;
	}

}

