import java.util.*;

package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		a = new Scanner(System.in).nextLine(); //?????????
		for (p = a, q = b; * p != '\0'; p++) //?p?q????a?b?????p
		{
			if (!((*p == ' ') && (*(p - 1) == ' '))) //????p?????????????????????????q??b?
			{
				*q = p;
				q++;
			} //???????
		}
		*q = '\0'; //??????
		 System.out.print(b);
		 System.out.print("\n");
		return 0;
	}
}
