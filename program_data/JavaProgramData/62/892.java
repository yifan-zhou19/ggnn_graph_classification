package <missing>;

public class GlobalMembers
{
	/*
	 * SpaceFilter22.cpp
	 *
	 *  Created on: 2013-12-5
	 *      Author: 111
	 */

	public static int Main()
	{
		String str = new String(new char[201]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		str = new Scanner(System.in).nextLine(); //????
		System.out.print(str.charAt(0));
		for (p = str.Substring(1);p < str + str.length();p++)
		{
			if (*p != ' ' || (*(p - 1) != ' ')) //???????????????????????
			{
				System.out.print(p);
			}
		}
		return 0;
	}

}
