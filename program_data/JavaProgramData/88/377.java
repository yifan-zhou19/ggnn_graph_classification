import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * test4_1.cpp
	 *?? - ????
	 *  Created on: 2010-12-31
	 *      Author: 10035
	 */

	public static int Main()
	{
		String c = new String(new char[50]); //????
		int n;
		int i;
		c = new Scanner(System.in).nextLine();
		n = c.length();
		i = 0;
		while (i < n)
		{
			if ((c.charAt(i) < '0') || (c.charAt(i)>'9'))
			{
				i++;
				continue;
			} //????,????
			while ((c.charAt(i) >= '0') && (c.charAt(i) <= '9') && (i < n))
			{
				System.out.print(c.charAt(i));
				i++;
			} //???,??
			System.out.print("\n");
		}
		return 0;
	}

}
