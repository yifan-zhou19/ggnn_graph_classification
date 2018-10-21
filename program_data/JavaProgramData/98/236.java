import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * qimo_2.cpp
	 * Name:????
	 *  Created on: 2011-1-9
	 *      Author: Wang Ju
	 */

	public static int Main()
	{
		int l = 0;
		int n;
		String p = null;
		String s = new String(new char[2000]);
		String a = new String(new char[10]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine();
		l = 0;
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		p = s;
		System.out.print(p);
		l = s.length();
		while (n > 1)
		{
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = l + s.length();
			p = s;
			if (l == 80)
			{
				System.out.print("\n");
				System.out.print(p);
				l = s.length();
			}
			else
			{
				if (l < 80)
				{
					System.out.print(" ");
					System.out.print(p);
					l++;
				}
				else if (l > 80)
				{
					System.out.print("\n");
					System.out.print(p);
					l = s.length();
				}
			}
			n--;
		}
		return 0;
	}

}

