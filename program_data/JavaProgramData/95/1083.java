import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * xx.cpp
	 *
	 *  Created on: 2011-11-2
	 *      Author: FXD
	 */

	public static int Main() //?????
	{ //?????
		String a = new String(new char[80]); //?????????????????
		String b = new String(new char[80]);
		int i;
		a = new Scanner(System.in).nextLine(); //??a?????
		b = new Scanner(System.in).nextLine(); //??b?????
		for (i = 0;i < 80;i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
		if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
		}
		} //??????????????
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
		}
		if (strcmp(a,b) < 0)
		{
			System.out.print("<");
		}
		return 0; //???????????????????
	} //?????


}

