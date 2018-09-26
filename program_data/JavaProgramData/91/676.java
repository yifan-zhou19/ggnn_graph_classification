import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * homework3.cpp
	 *
	 *  Created on: 2012-12-4
	 *      Author: Lixurong
	 */


	public static int Main()
	{
		String a = new String(new char[1000]);
		char b;
		a = new Scanner(System.in).nextLine();
		b = a;
		for (int i = 0; i < a.length() - 1; i++)
		{
			int c = (a.Substring(i) + 1);
			*(a.Substring(i)) += c;
		}
		int c = b;
		int len = a.length() - 1;
		*(a.Substring(len)) += c;
		System.out.print(a);
		return 0;
	}

}
