import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * tiqushuzi.cpp
	 *
	 *  Created on: 2012-12-13
	 *      Author: Lenovo
	 */
	public static int Main()
	{
		String array = new String(new char[33]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * point = null;
		int sum = 0;
		array = new Scanner(System.in).nextLine();
		point = array;
		for (;point < array.length() + array;point++)
		{
			if ((*point < 48 || *point>57) && sum == 0)
			{
				System.out.print("\n");
				sum++;
			}
			else if ((*point < 48 || *point>57) && sum > 0)
			{
			}
			else
			{
				System.out.print(point);
				sum = 0;
			}
		}
		return 0;
	}

}
