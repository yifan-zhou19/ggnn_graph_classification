import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ?????@.cpp
	 *
	 *  Created on: 2011-10-31
	 *      Author: Administrator
	 */
	public static int Main() //?????
	{ //?????
		int i;
		String str1 = new String(new char[81]); //?????
		String str2 = new String(new char[81]); //?????
		str1 = new Scanner(System.in).nextLine(); //????
		str2 = new Scanner(System.in).nextLine(); //????
		for (i = 0;i < 81;i++) //??
		{
			for (i = 0;i <= 90;i++)
			{
				if (str1.charAt(i) > 64 && str1.charAt(i) < 91)
				{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
				}
			if (str2.charAt(i) > 64 && str2.charAt(i) < 91)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32); //???????
			}
			}
		}
		switch (strcmp(str1,str2))
		{
			case-1:
			System.out.print("<");
			break;
		case 0:
			System.out.print("=");
			break;
		case 1:
			System.out.print(">");
			break;
		}
		return 0; //???????????????????
	} //????

}

