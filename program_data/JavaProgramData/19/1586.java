import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * p7.cpp
	 *
	 *  Created on: 2010-11-5
	 *      Author: ???
	 *      ????
	 */
	public static int Main()
	{
		int i; //????????
		int j;
		int k;
		int a;
		int l;
		int sum = 0;
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		String s2 = new String(new char[101]);
		String s0 = new String(new char[101]);
		s = new Scanner(System.in).nextLine(); //?????
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int k1 = s.length();
		for (i = 0;i < s.length();i++) //???????
		{
			if ((s.charAt(i) == s1.charAt(0) && s.charAt(s1.length() + i) == ' ' && s.charAt(i - 1) == ' ') || (i == 0 && s.charAt(i) == s1.charAt(0) && s.charAt(s1.length() + i) == ' ') || (s.charAt(i) == s1.charAt(0) && s.charAt(i - 1) == ' ' && i + s1.length() == s.length()))
			{
			for (a = 0;a < s.length() - i - s1.length();a++) //????????????
			{
				s0 = tangible.StringFunctions.changeCharacter(s0, a, s.charAt(i + s1.length() + a));
			}
		for (j = 0;j < s2.length();j++) //???????
		{
			s = tangible.StringFunctions.changeCharacter(s, i + j, s2.charAt(j));
		}
		for (l = 0;l < s0.length();l++) //????????
		{
			s = tangible.StringFunctions.changeCharacter(s, i + j + l, s0.charAt(l));
		}
		 sum++;
		 i = i + s2.length() - s1.length();
			}
		}
		for (k = 0;k < k1 + sum * s2.length() - sum * s1.length();k++)
		{
		System.out.print(s.charAt(k));
		}
		return 0;
	}


}

