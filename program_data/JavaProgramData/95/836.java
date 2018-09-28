import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1016.cpp
	 *
	 *  Created on: 2010-11-12
	 *      Author: dell
	 */
	public static int Main()
	{
		int s;
		int i;
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			if (str1.charAt(i) < 91 && str1.charAt(i)>63)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
			if (str2.charAt(i) < 91 && str2.charAt(i)>63)
			{
						str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
			}
		}
		s = strcmp(str1,str2);

		if (s == 0)
		{
			 System.out.print('=');
		}
			 if (s > 0)
			 {
			 System.out.print((char)62);
			 }
			 if (s < 0)
			 {
			 System.out.print((char)60);
			 }
			 return 0;
	}





}

