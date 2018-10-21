import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * md.cpp
	 *
	 *  Created on: 2010-12-31
	 *      Author: 10040
	 */



	public static int Main()
	{
		String str = new String(new char[225]);
		str = new Scanner(System.in).nextLine();

		String str1 = new String(new char[255]);
		String str2 = new String(new char[255]);
		int i = 0;
		int len = str.length();
		for (; i < len; i++)
		{
			if (str.charAt(i) == ' ')
			{
				break;
			}
			str1 = tangible.StringFunctions.changeCharacter(str1, i, str.charAt(i));
		}
		str1 = tangible.StringFunctions.changeCharacter(str1, i, '\0');
		i++;
		int j;
		for (j = 0; i < len; j++,i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, j, str.charAt(i));
		}
		str2 = tangible.StringFunctions.changeCharacter(str2, j, '\0');
		//cout << str1 << endl << str2 ;
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 != len2)
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		for (int k = 0; k < len1; k++)
		{
			int flag = 0;
			for (int p = 0; p < len2; p++)
			{
				if (str2.charAt(p) == str1.charAt(k))
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, p, '1');
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("NO");
				System.out.print("\n");
				return 0;
			}
		}

		System.out.print("YES");
		System.out.print("\n");





		return 0;
	}


}

