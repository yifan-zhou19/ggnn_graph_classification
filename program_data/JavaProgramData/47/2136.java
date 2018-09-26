package <missing>;

public class GlobalMembers
{
	/*
	 * shuzunixu.cpp
	 *
	 *  Created on: 2012-12-15
	 *      Author: ???
	 *      function:????
	 */


	public static void swap(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{ //?????????swap
		int tmp;
		tmp = a.argValue;
		a.argValue = b.argValue;
		b.argValue = tmp;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[n + 10];
		for (int i = 0; i < n; i++)
		{ //???????
			num[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (int i = 0, j = n - 1; i < j; i++, j--)
		{
			swap(num + i, num + j); //??????????
		}
		for (int i = 0; i < n - 1; i++)
		{
			System.out.print((num + i));
			System.out.print(' ');
		}
		System.out.print((num + n - 1));
		System.out.print("\n");
		return 0;
	}

}

