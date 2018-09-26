package <missing>;

public class GlobalMembers
{
	/********************************************
	 *@file   1.cpp                             *
	 *@author ??                              *
	 *@date   2013-12-13                        *
	 *@description                              *
	 *??????12?????                  *
	 ********************************************
	 */
	public static int Main()
	{
		int n;
		int m;
		int[] num = new int[110];
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = num;
		p += n + m - 1; // ??????
		for (i = 0; i < n; i++)
		{
			*(p--) = *(p - m);
		}
		for (i = 0; i < m; i++)
		{
			*(p--) = *(p + n);
		}
		for (i = 0; i < n; i++)
		{
			System.out.print(num[i]);
			if (i != n - 1)
			{
				System.out.print(' ');
			}
		}
		return 0;
	}
}

