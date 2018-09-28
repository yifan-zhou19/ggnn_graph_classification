import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * tiqushuzi.cpp
	 *
	 *  Created on: 2012-12-14
	 *      Author: asus
	 */

	public static int Main()
	{
		String s = new String(new char[40]);
		s = new Scanner(System.in).nextLine();
		int t = 0;
		String temp = new String(new char[40]); //?temp?????
		for (int i = 0; i < s.length(); i++)
		{
			if (*(s.Substring(i)) >= '0' && *(s.Substring(i)) <= '9')
			{
				t++; //?t???????
				*(temp.Substring(t)) = *(s.Substring(i));
				if (i == s.length() - 1) //????????????
				{
				for (int i = 1; i <= t; i++)
				{
				System.out.print((temp.Substring(i)));
				}
				}
				continue;
			}
			else if (t != 0)
			{
				for (int i = 1; i <= t; i++)
				{
				System.out.print((temp.Substring(i)));
				}
				System.out.print("\n");
				t = 0;
			}
		}
		return 0;

	}
}
