import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * lt12.3bijiaozifu.cpp
	 *
	 *  Created on: 2011-10-27
	 *      Author: Dai Guangda
	 */
	public static int Main()
	{
		int i;
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine(); //???????
		b = new Scanner(System.in).nextLine();
		for (i = 0; i < a.length(); i++)
		{
			if (a.charAt(i) == b.charAt(i) || a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' && b.charAt(i) == a.charAt(i) + 32 || a.charAt(i) >= 'a' && a.charAt(i) <= 'z' && b.charAt(i) == a.charAt(i) - 32)
			{
				continue; //???????????????????
			}
			else
			{
				if ((a.charAt(i) < 'A' || a.charAt(i)>'z') && a.charAt(i) > b.charAt(i) || a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' && a.charAt(i) < b.charAt(i) && a.charAt(i)> b.charAt(i) - 32 || a.charAt(i) >= 'a' && a.charAt(i) <= 'z' && a.charAt(i)> b.charAt(i) && a.charAt(i) < b.charAt(i) + 32)
				{
					System.out.print('>');
				}
				else
				{
					System.out.print('<');
				}
				break;
			} //???????????????????
		}
		if (i == a.length()) //?a??????
		{
			if (i < b.length())
			{
				System.out.print('<');
			}
			else
			{
				System.out.print('=');
			}
		}
		return 0;
	}

}
