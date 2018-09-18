package <missing>;

public class GlobalMembers
{
	/*
	 * wanyi.cpp
	 *
	 *  Created on: 2012-12-3
	 *      Author: 7
	 */
	public static String a = new String(new char[150]);
	public static String b = new String(new char[150]);
	public static int[] sig = new int[150];
	public static int Main()
	{
		int i;
		int k = 0;
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			k = 0;
			int l = a.length();
			for (i = 0;i < l;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i));
					if (a.charAt(i) == '(')
					{
						b = tangible.StringFunctions.changeCharacter(b, i, '$');
						sig[k] = i;
						k++;
					}
					if (a.charAt(i) == ')')
					{
						k--;
						if (k < 0)
						{
								b = tangible.StringFunctions.changeCharacter(b, i, '?');
								k = 0;
						}
						else
						{
							b = tangible.StringFunctions.changeCharacter(b, sig[k], 'a');
						}
					}
			}
			System.out.print(a);
			System.out.print("\n");
			for (i = 0;i < l;i++)
			{
				if (b.charAt(i) != '$' && b.charAt(i) != '?')
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(b.charAt(i));
				}
			}
			System.out.print("\n");
		}
	}

}

