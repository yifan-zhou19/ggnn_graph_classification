package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012826_????_05.cpp
	 *
	 *  Created on: 2010-11-16
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int[] c = new int[100];
		int[] p = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			c[i] = i + 1;
		}
		for (i = 0;i < n;i++)
		{
			if ((c[i] % 7 == 0) || ((c[i] - 7) % 10 == 0) || (c[i] > 69 && c[i] < 80)) //?????7??
			{
			c[i] = 0;
			}
		} //??7??????0
		for (i = 0;i < n;i++)
		{
			p[i] = c[i] * c[i];
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + p[i];
		}
		System.out.print(sum);
		System.out.print("\n");
	}
}

