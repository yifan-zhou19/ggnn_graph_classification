package <missing>;

public class GlobalMembers
{
	/*
	 * nb.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: ???
	 */
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l;
		int i;
		int m = 1;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z'))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, 'A' + a.charAt(i) - 'a');
			}
		}
		for (i = 0;i < l;i++)
		{
			m = 1;
			System.out.print('(');
			System.out.print(a.charAt(i));
			System.out.print(',');
			while (true)
			{
				if (a.charAt(i) == a.charAt(i + 1))
				{
					m++;
					i++;
				}
				else
				{
					break;
				}
			}
			System.out.print(m);
			System.out.print(')');
		}
		System.out.print("\n");
		return 0;
	}

}

