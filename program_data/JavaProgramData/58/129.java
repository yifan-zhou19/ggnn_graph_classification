import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 5.cpp
	 *
	 *  Created on: 2010-11-24
	 *      Author: hanzhe
	 */


	public static int Main()
	{ //????
		int n;
		String a = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine(); //?????
		while (n > 0)
		{ //???
			int g = 0; //g=1????
			int i;
			int na;
			a = new Scanner(System.in).nextLine(); //??
			na = a.length(); //??
			if ((a.charAt(0) == '_') + ((a.charAt(0) - 'a' >= 0) && (a.charAt(0) - 'z' <= 0)) + ((a.charAt(0) - 'A' >= 0) && (a.charAt(0) - 'Z' <= 0)) == 1)
			{
				g = 1;
			}
			for (i = 1;i < na;i++)
			{ //??????????(?_,a~z,
				if ((a.charAt(i) == '_') + ((a.charAt(i) - 'a' >= 0) && (a.charAt(i) - 'z' <= 0)) + ((a.charAt(i) - 'A' >= 0) && (a.charAt(i) - 'Z' <= 0)) + ((a.charAt(i) - '0' >= 0) && (a.charAt(i) - '9' <= 0)) == 1)
				{
					g = g * 1;
				}
				else
				{
					g = 0;
				}
			}
			if (g == 1)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			else
			{
				System.out.print("0");
				System.out.print("\n");
			}
			n--;
		}
		return 0;
	} //????

}

