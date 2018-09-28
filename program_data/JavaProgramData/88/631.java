import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * XIV8.cpp
	 *
	 *  Created on: 2012-12-11
	 *      Author:???
	 *      ???????
	 */
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		for (p = a; p - a < 31; p++)
		{
			if (*p >= '0' && *p <= '9')
			{
				System.out.print(p);
			}
			else if (*(p + 1) >= '0' && *(p + 1) <= '9')
			{
				System.out.print("\n");
			}
		}
	}

}
