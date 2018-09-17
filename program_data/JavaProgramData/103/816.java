package <missing>;

public class GlobalMembers
{
	/*
	 * Run-lengthEncoding.cpp
	 *
	 *  Created on: 2012-12-25
	 *      Author: Cui Zhaoxiong Class4 1200012931
	 */
	public static int Main()
	{
		String input = new String(new char[1005]);
		input = ConsoleInput.readToWhiteSpace(true).charAt(0);
		char past;
		String zipc = new String(new char[1005]);
		int[] zipi = new int[1005];
		int flag = 0;
		int length = input.length();
		for (int i = 0;i <= length - 1;i++)
		{
			if (input.charAt(i) >= 'a')
			{
				input = tangible.StringFunctions.changeCharacter(input, i, input.charAt(i) - 'a'+'A');
			}
			if (i == 0)
			{
				past = input.charAt(0);
				zipc = tangible.StringFunctions.changeCharacter(zipc, 0, past);
				zipi[0] = 1;
			}
			else
			{
				if (past == input.charAt(i))
				{
					zipi[flag]++;
				}
				else
				{
					flag++;
					zipc = tangible.StringFunctions.changeCharacter(zipc, flag, input.charAt(i));
					zipi[flag] = 1;
				}
				past = input.charAt(i);
			}
		}
		for (int i = 0;i <= flag;i++)
		{
			System.out.print('(');
			System.out.print(zipc.charAt(i));
			System.out.print(',');
			System.out.print(zipi[i]);
			System.out.print(')');
		}
		return 0;
	}

}

