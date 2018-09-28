import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2010-12-19
	 *      Author: hanzhe
	 */


	public static int Main()
	{ //????
		int n;
		int i;
		String none = new String(new char[100]); //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		none = new Scanner(System.in).nextLine(); //???????
		while (n > 0)
		{
			String a = new String(new char[81]);
			int g = 0; //???
			a = new Scanner(System.in).nextLine();
			int na = a.length(); //????
			if (((a.charAt(0) == '_') + (((a.charAt(0) - 'a') >= 0) && ((a.charAt(0) - 'z') <= 0)) + (((a.charAt(0) - 'A') >= 0) && ((a.charAt(0) - 'Z') <= 0))) == 1)
			{
				g = 1; //?????
			}
			for (i = 1;i < na;i++) //????
			{
				if (((a.charAt(i) == '_') + (((a.charAt(i) - 'a') >= 0) && ((a.charAt(i) - 'a') <= 25)) + (((a.charAt(i) - '0') >= 0) && ((a.charAt(i) - '0') <= 9)) + (((a.charAt(i) - 'A') >= 0) && ((a.charAt(i) - 'A') <= 25))) == 1)
				{
					g = g * 1;
				}
				else
				{
					g = g * 0;
				}
			}
			System.out.print(g);
			System.out.print("\n");
			n--;
		}
		return 0;
	} //????

}

