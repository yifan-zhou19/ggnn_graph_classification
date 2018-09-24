package <missing>;

public class GlobalMembers
{
	/*
	 * 14.cpp
	 *
	 *  Created on: 2011-12-2
	 *      Author: 11294
	 */
	public static int max(int s1,int s2)
	{
		if (s1 > s2)
		{
			return s1;
		}
		else
		{
			return s2;
		}
	}
	public static int Main()
	{
		final String a = "";
		final String b = "";
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int s1 = a.length();
		int s2 = b.length();
		int i;
		final String c = "";
		final String d = "";
		for (i = 0;i < s1;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(s1 - 1 - i));
		}
		for (i = 0;i < s2;i++)
		{
			d = tangible.StringFunctions.changeCharacter(d, i, b.charAt(s2 - 1 - i));
		}
		final String result = "";
		int carry = 0;
		int smax = max(s1, s2);
		for (i = 0;i <= smax;i++)
		{
			if (c.charAt(i) == 0)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '0');
			}
			if (d.charAt(i) == 0)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, '0');
			}
			result = tangible.StringFunctions.changeCharacter(result, i, c.charAt(i) + d.charAt(i) - 48 + carry);
			if (result.charAt(i) >= 58)
			{
				result = tangible.StringFunctions.changeCharacter(result, i, result.charAt(i) - 10);
				carry = 1;
			}
			else
			{
				carry = 0;
			}
		}
		for (i = smax;i >= 0;i--)
		{
			if (result.charAt(i) != '0')
			{
				break;
			}
		}
		if (i == -1)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			for (;i >= 0;i--)
			{
			System.out.print(result.charAt(i));
			}
		}
		return 0;
	}

}

