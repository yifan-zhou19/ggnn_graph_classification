import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * zhizheng.cpp
	?? - ???????
	 *  Created on: 2012-12-12
	 *      Author: ???
	 */
	public static String str1 = new String(new char[101]);
	public static String str2 = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static char * q = null;
	public static int len1;
	public static int Main()
	{
		str1 = new Scanner(System.in).nextLine();
		len1 = str1.length();
		for (p = str1,q = str2;p < str1.Substring(len1) - 1;p++,q++)
		{
			*q = p + *(p + 1);
		}
		*q = p + *(p - len1 + 1);
		System.out.print(str2);
		System.out.print("\n");
		return 0;
	}

}
