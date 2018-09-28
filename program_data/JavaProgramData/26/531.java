package <missing>;

public class GlobalMembers
{
	/*
	 * ???????.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: lenovo
	 */
	public static int Main()
	{
		String a = new String(new char[60]);
		while (true)
		{
			int i = 0;
			if (!(cin.get(a.charAt(i))))
			{
				break;
			}

			if (a.charAt(i) == ' ')
			{
				   while (true)
				   {
					   a = tangible.StringFunctions.changeCharacter(a, i + 1, ConsoleInput.readToWhiteSpace(true));
					   if (a.charAt(i + 1) != ' ')
					   {
						   System.out.print(' ');
						   System.out.print(a.charAt(i + 1));
						   break;
					   }
					   i++;
				   }
			}
			else
			{
				System.out.print(a.charAt(i));
			}
			i++;
		}
		return 0;
	}
}

