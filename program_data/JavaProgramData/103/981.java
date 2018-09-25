import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * word zip.cpp
	 * ??:??????
	 *  Created on: 2013-1-13
	 *      Author: ???
	 */



	public static int Main()
	{
		String words = new String(new char[2000]);
		words = new Scanner(System.in).nextLine();
		String p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		p = words;
		q = words;
		while (true)
		{
			if (*q == '\0')
			{
				if (p >= 97)
				{
					p = p - 32;
				}
				System.out.print("(");
				System.out.print(p);
				System.out.print(',');
				System.out.print((q - p));
				System.out.print(")");
				System.out.print("\n");
				break;
			}
			if (p == *q || Math.abs(p - *q) == 32)
			{
				q++;
			}
			else
			{
				if (p >= 97)
				{
					p = p - 32;
				}
				System.out.print("(");
				System.out.print(p);
				System.out.print(',');
				System.out.print((q - p));
				System.out.print(")");
				p = q;
			}
		}
		return 0;
	}
}
