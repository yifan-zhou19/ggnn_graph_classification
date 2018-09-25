package <missing>;

public class GlobalMembers
{
	/*
	 * 220.cpp
	 *
	 *  Created on: 2012-11-11
	 *      Author: wu
	 */


	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		int i;
		String pai = new String(new char[4]);
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					a = (B > A) + (C == A);
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
					if (((A + a) == (B + b)) && ((A + a) == (C + c)))
					{
						for (i = 1;i <= 3;i++)
						{
							if (i == A)
							{
								pai = tangible.StringFunctions.changeCharacter(pai, i, 'A');
							}
							else if (i == B)
							{
								pai = tangible.StringFunctions.changeCharacter(pai, i, 'B');
							}
							else if (i == C)
							{
								pai = tangible.StringFunctions.changeCharacter(pai, i, 'C');
							}

						}
						for (i = 1;i <= 3;i++)
						{
							System.out.print(pai.charAt(i));
						}
					}
				}
			}
		}

		return 0;



	}
}

