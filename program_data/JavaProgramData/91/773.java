import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *???: friend_string.cpp
	 *??: ???
	 *????: 2012-12-09
	 *??: ???????
	 */



	public static int Main()
	{
		String str1 = new String(new char[MAXL + 10]);
		String str2 = new String(new char[MAXL + 10]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;

		str1 = new Scanner(System.in).nextLine();
		for (p = str1,q = str2; * p;p++,q++)
		{
			*q = p;
			if (*(p + 1)) //????????
			{
				*q += *(p + 1);
			}
			else
			{
				*q += *str1;
			}
		}
		*q = 0; //???\0
		System.out.print(str2);
		System.out.print("\n");
		return 0;
	}


}
