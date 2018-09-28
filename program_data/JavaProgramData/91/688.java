import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * qinpengzifuchuan.cpp
	 *
	 *  Created on: 2012-12-14
	 *      Author: Justin
	 */

	public static int Main()
	{
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		String r;
		a = new Scanner(System.in).nextLine();
		int len;
		len = a.length();
		for (p = a;p < a.Substring(len) - 1;p++)
		{
			int b;
			b = p + *(p + 1);
			char c;
			c = b;
			System.out.print(c);
		}
		q = a;
		r = a.Substring(len) - 1;
		int d = q + r;
		char e = d;
		System.out.print(e);

	}
}
