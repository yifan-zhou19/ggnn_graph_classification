package <missing>;

public class GlobalMembers
{
	/*
	 * BrotherCharaters.cpp
	 *  ???????
	 *  Created on: 2013-12-5
	 *      Author: 111
	 */

	public static int Main()
	{
	String str = new String(new char[102]);
	str = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p = null;
	for (p = str;p < str + str.length() - 1;p++) //??strlen??????????char???????????????
	{
	System.out.print((char)(*p + *(p + 1)));
	}
	System.out.print((char)(str.charAt(0) + str.charAt(str.length() - 1)));
		return 0;
	}

}
