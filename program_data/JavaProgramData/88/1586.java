import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * tiqushuzi.cpp
	 *
	 *  Created on: 2010-12-13
	 *      Author: ??
	 *      ????????
	 */
	public static int Main()
	{
		String str = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		int i;
		str = new Scanner(System.in).nextLine(); //?????
		p = str; //???????????
		for (i = 0; * p != '\0';p++)
		{
			if (*p >= '0' && *p <= '9')
			{
				System.out.print(p);
			}
			else if (*(p - 1) >= '\0' && *(p - 1) <= '9')
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}
