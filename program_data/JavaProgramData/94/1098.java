package <missing>;

public class GlobalMembers
{
	/*
	 * jishudanzeng.cpp
	 *  Created on: 2012-11-8
	 *      Author:??? 1200012899
	 */
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int[] a = new int[1000];
		int j;
		int temp;
		int k = 0;
		for (i = 0;i < N;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < N - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp; //???????????a??????????
				}
			}
		}
		for (i = 0;i < N;i++)
		{
			if (a[i] % 2 == 1)
			{
				k = k + 1;
				if (k != 1)
				{
					System.out.print(",");
				}
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

