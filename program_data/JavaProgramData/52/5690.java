package <missing>;

public class GlobalMembers
{
	/*
	 * CycleRemove.cpp
	 *
	 *  Created on: 2013-12-5
	 *      Author: 111
	 */

	public static int Main()
	{
		int[] str = new int[102];
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
		for (p = str;p < str + n;p++)
		{
		*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(str[n - m]);
		for (p = str + n - m + 1;p < str + n;p++)
		{
			System.out.print(' ');
			System.out.print(p);
		}
		for (p = str;p < str + n - m;p++)
		{
			System.out.print(' ');
			System.out.print(p);
		}
		return 0;
	}

}

