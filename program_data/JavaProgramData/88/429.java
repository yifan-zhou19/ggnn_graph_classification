import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 4.1.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: ???
	 *        ??? ????
	 */



	public static int Main()
	{
		String c = new String(new char[31]);
		String str = new String(new char[31]);
		c = new Scanner(System.in).nextLine();
		int m = c.length();
		for (int i = 0;i < m;i++)
		{
			if (c.charAt(i) == '0') //??0?????
			{
				if (c.charAt(i + 1) != '0')
				{
					System.out.print(0);
					System.out.print("\n");
					continue;
				}
			}
			if (!(c.charAt(i) >= '1' && c.charAt(i) <= '9')) //??????
			{
				continue;
			}
			else
			{
				int j;
				for (j = 0;c.charAt(i) >= '0' && c.charAt(i) <= '9';i++, j++) //?????????
				{
					str = tangible.StringFunctions.changeCharacter(str, j, c.charAt(i));
				}
				str = str.substring(0, j);
				System.out.print(str);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

