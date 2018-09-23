package <missing>;

public class GlobalMembers
{
	/*
	 *  Name:homework.cpp
	 *  Created on: 2012-12-12
	 *  Author: Meng Li
	 *  Function:????
	 *   */


	public static int Main()
	{ //???
		String input = new String(new char[1000]);
		input = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int length = 0;
		length = input.length();
		int i;
		int count = 0;
		int j;
		for (i = 0;i < length;i++)
		{
			count = 0;
			if (input.charAt(i) >= 97)
			{
				input = tangible.StringFunctions.changeCharacter(input, i, input.charAt(i) - 32);
			}
			for (j = i;j < length;j++)
			{
				if (input.charAt(i) == input.charAt(j) || input.charAt(j) == input.charAt(i) + 32)
				{
					count++;
				}
				else
				{
					break;
				}
			}
			System.out.print('(');
			System.out.print(input.charAt(i));
			System.out.print(',');
			System.out.print(count);
			System.out.print(')');
			i = j - 1;
		}
		return 0;
	}

}

