import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012835_3.2.cpp
	 *
	 *  Created on: 2010-11-6
	 *      Author: huangjiali
	 */
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int len1;
		int len2;
		int i;
		a = new Scanner(System.in).nextLine(); //?????a
		len1 = a.length();
		b = new Scanner(System.in).nextLine(); //?????b
		len2 = b.length();
		for (i = 0;i < len1;i++)
		{
			if (a.charAt(i) <= 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32); //?a???????
			}
			if (b.charAt(i) <= 'Z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32); //?b???????
			}
			if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				System.out.print("\n");
				break;
			} //??a??b????"<"
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				System.out.print("\n");
				break;
			} //??a??b????">"
		}
		if (i == len1)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		return 0;
	}

}

