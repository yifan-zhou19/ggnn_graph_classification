import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * gd.cpp
	 *
	 *  Created on: 2010-12-31
	 *      Author: 10058
	 */

	public static int Main()
	{
		String c = new String(new char[50]);
		c = new Scanner(System.in).nextLine();
		int i = 0;
		while (c.charAt(i) != '\0')
		{
			if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
			{
				System.out.print(c.charAt(i));
			}
			else
			{

				if (i != 0 && c.charAt(i - 1) >= '0' && c.charAt(i - 1) <= '9')
				{
					System.out.print("\n");
				}
			}
			i++;
		}
		return 0;
	}

}
