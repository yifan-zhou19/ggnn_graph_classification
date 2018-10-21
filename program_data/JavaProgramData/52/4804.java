package <missing>;

public class GlobalMembers
{
	/*
	 * yidongshuzu.cpp
	 *
	 *  Created on: 2011-12-9
	 *      Author: Dai Guangda
	 */
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[200];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = a; p < a + n; p++)
		{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = a + n - 1; p >= a; p--)
		{
			*(p + m) = *p;
		}
		for (p = a; p < a + m; p++)
		{
			*p = (p + n);
		}
		for (p = a; p < a + n - 1; p++)
		{
			System.out.print(p);
			System.out.print(' ');
		}
		System.out.print(p);
		return 0;
	}

}

