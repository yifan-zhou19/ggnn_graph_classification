package <missing>;

public class GlobalMembers
{
	/*
	 * v.cpp
	 *
	 *  Created on: 2012-10-23
	 *      Author: user
	 */

	public static int Main()
	{
		int a;
		int b;
		int c;
		int j;
		int i;
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				for (c = 0;c <= 2;c++)
				{
				if ((b > a) + (c == a) == 2 - a && (b < a) + (c < a) == 2 - b && (c> b) + (b> a) == (2 - c))
				{
					break;
				}
				}
				if ((b > a) + (c == a) == 2 - a && (b < a) + (c < a) == 2 - b && (c> b) + (b> a) == (2 - c))
				{
					break;
				}
			}
			if ((b > a) + (c == a) == 2 - a && (b < a) + (c < a) == 2 - b && (c> b) + (b> a) == (2 - c))
			{
				break;
			}
		}
		String m = new String(new char[3]);
		char u;
		int[] n = new int[3];
		int t;
		m = tangible.StringFunctions.changeCharacter(m, 0, 'A');
		m = tangible.StringFunctions.changeCharacter(m, 1, 'B');
		m = tangible.StringFunctions.changeCharacter(m, 2, 'C');
		n[0] = a;
		n[1] = b;
		n[2] = c;
		for (j = 0;j < 2;j++)
		{
			for (i = 0;i < 2 - j;i++)
			{
				if (n[i] > n[i + 1])
				{
					t = n[i];
					n[i] = n[i + 1];
					n[i + 1] = t;
				u = m.charAt(i);
				m = tangible.StringFunctions.changeCharacter(m, i, m.charAt(i + 1));
				m = tangible.StringFunctions.changeCharacter(m, i + 1, u);
				}
			}
		}
		System.out.print(m.charAt(0));
		System.out.print(m.charAt(1));
		System.out.print(m.charAt(2));
		return 0;

	}
}

