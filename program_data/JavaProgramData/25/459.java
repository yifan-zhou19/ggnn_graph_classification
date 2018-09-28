package <missing>;

public class GlobalMembers
{
	/*
	 * 12.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */
	/*
	 * 13.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */
	public static String a = new String(new char[1000]);
	public static int[] b = new int[1000];
	public static void chen()
	{
		int carry = 0;
		int i;
		for (i = 0 ;a.charAt(i) != '#' ;i++)
		{
			b[i] = (a.charAt(i) - '0') * 2 + carry;
			carry = b[i] / 10;
			b[i] = b[i] % 10;
			a = tangible.StringFunctions.changeCharacter(a, i, b[i] + '0');
		}
		if (carry != 0)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, carry + '0');
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = tangible.StringFunctions.changeCharacter(a, 0, '1');
		for (i = 1 ; i < 1000 ;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '#');
		}
		if (n == 0)
		{
			System.out.print("1");
		}
		else
		{
			for (i = 1 ; i <= n ; i++)
			{
				chen();
			}
		for (i = 0 ; a.charAt(i) != '#' ; i++)
		{
			;
		}
		for (j = i - 1 ; j >= 0 ;j--)
		{
			System.out.print(a.charAt(j));
		}
		}
		return 0;
	}


}

