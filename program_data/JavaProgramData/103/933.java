package <missing>;

public class GlobalMembers
{
	/*
	 * ??(12-5) ??????
	 *
	 *  Created on: 2013-1-12
	 *      Author: zhuyongfu
	 */


	public static int Main()
	{
		String s1 = new String(new char[1001]);
		String s2 = new String(new char[1001]);
		int l;
		int i;
		int num = 1;
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = s1.length();
		for (i = 0;i < l;i++)
		{
			if (s1.charAt(i) > 90)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i) - 32);
			}
			else
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i));
			}
		}
		if (l == 1)
		{
			System.out.print('(');
			System.out.print(s2.charAt(0));
			System.out.print(',');
			System.out.print(num);
			System.out.print(')');
			return 0;
		}
		for (i = 1;i < l;i++)
		{
			if (s2.charAt(i) != s2.charAt(i - 1) && i != l - 1)
			{
				System.out.print('(');
				System.out.print(s2.charAt(i - 1));
				System.out.print(',');
				System.out.print(num);
				System.out.print(')');
				num = 1;
			}
			if (s2.charAt(i) != s2.charAt(i - 1) && i == l - 1)
			{
				System.out.print('(');
				System.out.print(s2.charAt(i - 1));
				System.out.print(',');
				System.out.print(num);
				System.out.print(')');
				num = 1;
				System.out.print('(');
				System.out.print(s2.charAt(i));
				System.out.print(',');
				System.out.print(num);
				System.out.print(')');
			}
			if (s2.charAt(i) == s2.charAt(i - 1) && i != l - 1)
			{
				num++;
			}
			if (s2.charAt(i) == s2.charAt(i - 1) && i == l - 1)
			{
				num++;
				System.out.print('(');
				System.out.print(s2.charAt(i - 1));
				System.out.print(',');
				System.out.print(num);
				System.out.print(')');
			}
		}
		return 0;
	}

}

