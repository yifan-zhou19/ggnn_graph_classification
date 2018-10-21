import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * theoutputstring.cpp
	 *
	 *  Created on: 2012-12-17
	 *      Author: ???
	 */
	public static int Main()
	{
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		String b = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = b;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		while (p < a.Substring(n) - 1)
		{
			*q = p + *(p + 1);
			p++;
			q++;
		}

			*q = p + *a;
		for (q = b; q < b.Substring(n); q++)
		{
			System.out.print(q);
		}
		return 0;
	}

}
