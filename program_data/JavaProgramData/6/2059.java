package <missing>;

public class GlobalMembers
{
	/*
	 * T7.cpp
	 *
	 *  Created on: 2012-12-10
	 *      Author: weiwan
	 *      Function:??????????
	 */

	public static int Main()
	{
		int k; //i,j,z,temp??????sum??
		int m;
		int n;
		int i;
		int j;
		int z;
		int sum;
		int temp;
		int[][] a = new int[101][101];
		int[] p = a;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m;j++) //?????
			{
				for (z = 0;z < n;z++)
				{
					*(p[j] + z) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			if (m != 1 && n != 1)
			{
				for (temp = 0;temp < n;temp++) //?????????????
				{
					sum += (*(p[0] + temp) + *(p[m - 1] + temp));
				}
				for (temp = 0;temp < m;temp++) //?????????????
				{
					sum += (*(p[temp]) + *(p[temp] + n - 1));
				}
				sum -= (p) + *(p[0] + n - 1) + *(p[m - 1]) + *(p[m - 1] + n - 1); //?????
				System.out.print(sum);
				System.out.print("\n");
			}
			else
			{
				System.out.print((p));
				System.out.print("\n");
			}
		}
		return 0;
	}
}

