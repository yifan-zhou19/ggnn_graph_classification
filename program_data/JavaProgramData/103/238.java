import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 12-5.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */

	public static int Main()
	{
		String s = new String(new char[1000]);
		char m;
		int len;
		int i;
		int num;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z')
			{
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
			}
		}
		i = 1;
		m = s.charAt(0);
		num = 1;
		while (i < len)
		{
			if (s.charAt(i) == m)
			{
				num++;
			}
			else
			{
				System.out.print('(');
				System.out.print(m);
				System.out.print(',');
				System.out.print(num);
				System.out.print(')');
				m = s.charAt(i);
				num = 1;
			}
			i++;
		}
		System.out.print('(');
		System.out.print(m);
		System.out.print(',');
		System.out.print(num);
		System.out.print(')');
		return 0;
	}
}

