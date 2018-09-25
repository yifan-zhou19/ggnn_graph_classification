package <missing>;

public class GlobalMembers
{
	/*
	 * exam.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: jsgl
	 *      ???
	 */

	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		String a = new String(new char[5]);

		//??????????
		for (z = 10; z <= 50; z = z + 10)
		{
			for (q = 10; q <= 50; q = q + 10)
			{
				if (z == q)
				{
					continue;
				}
				for (s = 10; s <= 50; s = s + 10)
				{
					if (s == z || s == q)
					{
						continue;
					}
					for (l = 10; l <= 50; l = l + 10)
					{
						if (l == z || l == q || l == s)
						{
							continue;
						}
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							//????????
							a = tangible.StringFunctions.changeCharacter(a, z / 10, 'z');
							a = tangible.StringFunctions.changeCharacter(a, q / 10, 'q');
							a = tangible.StringFunctions.changeCharacter(a, s / 10, 's');
							a = tangible.StringFunctions.changeCharacter(a, l / 10, 'l');
							for (int i = 5; i >= 1; i--)
							{
								if (a.charAt(i) == 'z' || a.charAt(i) == 'q' || a.charAt(i) == 's' || a.charAt(i) == 'l') //?????????????
								{
									System.out.print(a.charAt(i));
									System.out.print(" ");
									System.out.print(i * 10);
									System.out.print("\n");
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

