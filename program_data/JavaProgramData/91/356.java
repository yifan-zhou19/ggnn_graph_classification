package <missing>;

public class GlobalMembers
{
	/*
	 * relative_string.cpp
	 *
	 *  Created on: 2013-12-12
	 *      Author: Mac
	 */


	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, '\0', 200);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, '\0', 200);
		p = a;
		q = b;
		p = new Scanner(System.in).nextLine();

		for (; q < b + a.length();q++)
		{
		*q = p + *(++p);
		}

		*(q - 1) = *(p - 1) + *a;

		System.out.print(b);
	}

}
