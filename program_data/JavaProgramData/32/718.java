package <missing>;

public class GlobalMembers
{
	/*
	 * dazhengshujianfa.cpp
	 *
	 *  Created on: 2010-11-17
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int lenth1;
		int lenth2;
		int carry;
		carry = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		for (i = 1;i <= n;i++)
		{
			carry = 0;
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			lenth1 = a.length();
			lenth2 = b.length();
			for (j = lenth2;j < lenth1;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, '0');
			}
			c = a;
			for (j = 1;j <= lenth2;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, lenth1 - j, a.charAt(lenth1 - j) - b.charAt(lenth2 - j) - carry + '0');
				if (c.charAt(lenth1 - j) - '0' < 0)
				{
					carry = 1;
					c.charAt(lenth1 - j) += 10;
				}
				else
				{
					carry = 0;
				}
			}
			if (lenth1 > lenth2)
			{
				if (carry == 1)
				{
					c.charAt(lenth1 - lenth2 - 1) -= 1;
				}
			}
			if (c.charAt(0) == '0')
			{
				c = tangible.StringFunctions.changeCharacter(c, 0, '\0');
			}
			for (j = 0;j < lenth1;j++)
			{
				System.out.print(c.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}


}

