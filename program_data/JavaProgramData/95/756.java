import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1000010227_30-3.cpp
	 *
	 *  Created on: 2010-11-7
	 *      Author: hanzhe
	 */


	public static int Main()
	{
		int k;
		String a = new String(new char[100]); //??????
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;i <= 99;i++)
		{
			if (a.charAt(i) > 'Z') //a[i]?????????
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if (b.charAt(i) > 'Z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
		}
		k = strcmp(a,b);
		if (k > 0)
		{
			System.out.print(">");
		}
		if (k < 0)
		{
			System.out.print("<");
		}
		if (k == 0)
		{
			System.out.print("=");
		}
		return 0;
	} //????

}

