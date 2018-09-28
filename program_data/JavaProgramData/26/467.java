import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * guolvkongge.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: lz
	 */

	public static int Main()
	{
		String c = new String(new char[105]);
		c = new Scanner(System.in).nextLine();
		int i = 0;
		while (c.charAt(i) != '\0')
		{
			while (c.charAt(i) != ' ' && c.charAt(i) != '\0')
			{
				System.out.print(c.charAt(i));
				i++;
			}
			if (c.charAt(i) == '\0')
			{
				break;
			}
			System.out.print(c.charAt(i));
			i++;
			while (c.charAt(i) == ' ')
			{
				i++;
			}
		}

		return 0;
	}

}
