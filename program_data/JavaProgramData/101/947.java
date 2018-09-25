package <missing>;

public class GlobalMembers
{
	/*
	 * 14-food.cpp
	 *
	 *  Created on: 2012-11-9
	 *      Author: joip
	 */
	public static int Main()
	{
		int A; //??????????? ABC???????
		int B;
		int C;
		for (A = 0;A <= 2;A++) //????
		{
			for (B = 0;B <= 2;B++)
			{
				for (C = 0;C <= 2;C++)
				{
					if ((B > A) + (C == A) == 2 - A && (A > B) + (A > C) == 2 - B && (C > B) + (B > A) == 2 - C) //?????????????????????ABC???
					{
						String a = new String(new char[4]);
						a = tangible.StringFunctions.changeCharacter(a, A, 'A');
						a = tangible.StringFunctions.changeCharacter(a, B, 'B');
						a = tangible.StringFunctions.changeCharacter(a, C, 'C');
						for (int i = 0;i <= 2;i++)
						{
							System.out.print(a.charAt(i));
						}
					}
				}
			}
		}
		return 0;
	}

}

