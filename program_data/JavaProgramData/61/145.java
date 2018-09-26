package <missing>;

public class GlobalMembers
{
	/*
	 * c++practice_026.cpp
	 * name:??????
	 *  Created on: 2011-11-1
	 *      Author: zhujile
	 */
	public static int Main()
	{
		int[] a = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int n;
		int i;
		int[] num = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 2;j < 21;j++)
		{
				a[j] = a[j - 1] + a[j - 2]; //??21????
		}
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(a[num[i] - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

