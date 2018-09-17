package <missing>;

public class GlobalMembers
{
	/*
	 * ???.cpp
	 *
	 *  Created on: 2011-10-14
	 *      Author: 1100012857
	 */
	public static int Main()
	{
		String d = new String(new char[4]);
		int a;
		int b;
		int c;
		int i;
		for (a = 0;a <= 3;a++)
		{
			for (b = 0;b <= 3;b++)
			{
				for (c = 0;c <= 3;c++) //???
				{
					if ((b <= a) + (c != a) == a - 1)
					{
							if ((a <= b) + (a <= c) == b - 1)
							{
								if ((c <= b) + (b <= a) == c - 1)
								{ //????????????????
									d = tangible.StringFunctions.changeCharacter(d, a, 'A');
									d = tangible.StringFunctions.changeCharacter(d, b, 'B');
									d = tangible.StringFunctions.changeCharacter(d, c, 'C');
									for (i = 1;i <= 3;i++)
									{
										System.out.print(d.charAt(i));
									}
								}
							}
					}
				}
			}
		}
		  return 0;

	}

}

