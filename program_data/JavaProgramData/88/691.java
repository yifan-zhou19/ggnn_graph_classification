import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * tiqushuzi.cpp
	 *
	 *  Created on: 2012-12-13
	 *      Author: alias
	 */
	public static int Main()
	{
		String str = new String(new char[31]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		for (int i = 0;i < len;i++)
		{
			if (*(str.Substring(i)) >= '0' && *(str.Substring(i)) <= '9')
			{
				System.out.print((str.Substring(i)));
			}
			else
			{
				if (*(str.Substring(i) + 1) >= '0' && *(str.Substring(i) + 1) <= '9')
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
