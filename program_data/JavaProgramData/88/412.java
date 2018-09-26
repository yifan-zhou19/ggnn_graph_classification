import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * tqsz.cpp
	 *
	 *  Created on: 2010-12-31
	 *      Author: dell
	 */
	public static int Main()
	{
		int s;
		int i;
		int longs;
		String zfc = new String(new char[50]);
		zfc = new Scanner(System.in).nextLine();
		longs = zfc.length();
		for (i = 0;i < longs;i++)
		{
			if (zfc.charAt(i) > 47 && zfc.charAt(i) < 58)
			{
			s = zfc.charAt(i) - 48;
				System.out.print(s);
			}
			else
			{
				System.out.print("\n");
			}
		}
	}

}
