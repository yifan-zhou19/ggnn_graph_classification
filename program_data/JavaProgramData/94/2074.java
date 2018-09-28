package <missing>;

public class GlobalMembers
{
	/*
	 * s.cpp
	 *
	 *  Created on: 2013-11-3
	 *      Author: shu
	 */
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int[] a = new int[N];
		for (i = 0;i < N;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		sort(a,a + N);
		for (i = 0;i < N;i++)
		{
		if (a[i] % 2 != 0)
		{
			System.out.print(a[i]);
		}
		break;
		}
		for (i = i + 1;i < N;i++)
		{
			if (a[i] % 2 != 0)
			{
				System.out.print(",");
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

