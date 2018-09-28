package <missing>;

public class GlobalMembers
{
	/*
	 * T1.cpp
	 *
	 *  Created on: 2012-11-4
	 *      Author: ??
	 *      Function: ??????
	 */

	public static int Main()
	{
		int n;
		int[] a = new int[510];
		int i;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //?????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++) //???????????0
		{
			if (a[i] % 2 == 0)
			{
				a[i] = 0;
			}
		}
		for (i = 0;i < n - 1;i++) //????????????????0????????
		{
			for (int j = i + 1;j < n;j++)
			{
				if (a[j] < a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 0;i < n;i++) //????
		{
			while (a[i] != 0)
			{
			if (i == n - 1)
			{
					System.out.print(a[n - 1]);
					System.out.print("\n");
					break;
			}
			else
			{
					System.out.print(a[i]);
					System.out.print(",");
					break;
			}
			}
		}
		return 0;
	}
}

