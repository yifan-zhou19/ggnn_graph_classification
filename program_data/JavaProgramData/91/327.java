import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 15.cpp
	 *
	 *  Created on: 2013-12-8
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		a = new Scanner(System.in).nextLine(); //?????
		s = a.length();
		for (p = a,q = b;p < a.Substring(s);p++,q++)
		{
			if (p == a.Substring(s) - 1)
			{
			  *q = p + *a;
			}
			else
			{
			  *q = p + *(p + 1); //????
			}
		  System.out.print(q);
		}
	return 0;
	}

}
