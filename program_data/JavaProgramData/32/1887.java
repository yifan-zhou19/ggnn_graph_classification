package <missing>;

public class GlobalMembers
{
	/*
	 * dazhengshujianfa.cpp
	 *
	 *  Created on: 2010-12-24
	 *      Author: lz
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[200]); //?????
		String b = new String(new char[200]); //????
		String c = new String(new char[200]); //???
		String s = new String(new char[200]); //????????
		while (n > 0)
		{
			n--;
			int i;
			int j;
			int carry = 0; //??
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int slen = s.length();
			for (i = 0;i < slen;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, s.charAt(slen - i - 1));
			}
			int alen = slen;
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			slen = s.length();
			for (i = 0;i < slen;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, s.charAt(slen - i - 1));
			}
			int blen = slen;
			for (i = 0;i < blen;i++) //??
			{
				if (a.charAt(i) - '0' - carry >= b.charAt(i) - '0')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, (char)(a.charAt(i) - b.charAt(i) - carry + '0'));
					carry = 0;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, i, (char)(a.charAt(i) - b.charAt(i) - carry + 10 + '0'));
					carry = 1;
				}
			}
			for (i = blen;i < alen;i++)
			{
				if (a.charAt(i) - carry >= '0')
				{
					c = tangible.StringFunctions.changeCharacter(c, i, (char)(a.charAt(i) - carry));
					carry = 0;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, i, (char)(a.charAt(i) - carry + 10));
					carry = 1;
				}
			}
			for (i = alen - 1;i >= 0;i--)
			{
				if (c.charAt(i) != '0')
				{
					break;
				}
			}
			for (j = i;j >= 0;j--)
			{
				System.out.print(c.charAt(j));
			}
	System.out.print("\n");
		}
		return 0;
	}

}

