import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ym.cpp
	 *
	 *  Created on: 2010-12-31
	 *      Author: 10151
	 */

	public static int Main()
	{
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		for (int i = 0; i < len; i++)
		{
			if ((a.charAt(i) > '9' || a.charAt(i) < '0') && (a.charAt(i + 1) <= '9' && a.charAt(i + 1) >= '0'))
			{
				System.out.print("\n");
				continue;
			}
			if ((a.charAt(i) > '9' || a.charAt(i) < '0') && (a.charAt(i + 1) > '9' || a.charAt(i + 1) < '0'))
			{
				continue;
			}
			System.out.print(a.charAt(i));
		}
		return 0;
	}

}
