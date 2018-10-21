import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1000010175_325.cpp
	 *
	 *  Created on: 2010-11-26
	 *      Author: ???
	 *      function:  ?????C????????
	 */



	public static int Main()
	{
		String str = new String(new char[100]);
		int i;
		int n;
		int ilen;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = new Scanner(System.in).nextLine(); //??????'\n'
		while (n > 0)
		{
			str = new Scanner(System.in).nextLine();
			ilen = str.length();
			i = 1;
			if ((str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') || (str.charAt(0) == '_')) //?????????????
			{
				for (;i < ilen;i++)
				{
					if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) == '_') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')) //????????
					{
						continue;
					}
					else
					{
						break;
					}
				}
			}
			if (i == ilen)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
			n--;
		}
		return 0;
	}
}

