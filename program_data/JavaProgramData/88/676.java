import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * coutnum.cpp
	 * ????
	 *  Created on: 2012-12-14
	 *      Author: 12219
	 */
	public static int Main()
	{
		String a = new String(new char[30]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int b;
		a = new Scanner(System.in).nextLine();
		b = a.length();
		for (p = a; p < a.Substring(b); p++)
		{
			if (*p >= '0' && *p <= '9')
			{
				System.out.print(p);
			}
			else
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}
