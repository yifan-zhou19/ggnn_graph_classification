package <missing>;

public class GlobalMembers
{
	/*
	 * wenzipaiban.cpp
	 *????
	 *  Created on: 2011-12-9
	 *      Author: q
	 */
	public static int Main()
	{
		char[][] ch =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String p = new String(new char[40]); //?????????
		int n; //counter???????????
		int i;
		int counter = 0;
		p = ch; //?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			*p ++ = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		p = ch; //???????
		while (p < (ch + n))
		{
			if (counter == 0) //?????????
			{
				counter += String.valueOfp.length();
				System.out.print(p);
				p = p.Substring(1);
			}
			else
			{
				counter += String.valueOfp.length() + 1; //1?????
				if (counter <= 80)
				{ //???80
					System.out.print(' ');
					System.out.print(p);
					p = p.Substring(1);
				}
				else
				{ //??80??????
					counter = 0;
					System.out.print("\n");
				}
			}
		}

		return 0;
	}

}

