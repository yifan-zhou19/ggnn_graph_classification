import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * hfbzf.cpp
	 *
	 *  Created on: 2011-12-11
	 *      Author: miaomiao
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[81]);
		int i;
		int count;
		cin.ignore(); //??????
		while (n-- != 0)
		{
		a = new Scanner(System.in).nextLine(); //????????
		count = 0; //??
		for (i = 0;a.charAt(i);i++)
		{
		if ((a.charAt(0) == '_') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z')) //???????
		{
				if ((a.charAt(i) == '_') || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= '0' && a.charAt(i) <= '9'))
				{
					count++; //???????
				}
		}
		}
		if (count == a.length()) //????????????
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}
		}
		return 0;
	}



}

