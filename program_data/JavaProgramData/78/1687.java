package <missing>;

public class GlobalMembers
{
	/*
	 * 2.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if (((z + q) == (s + l)) && ((z + l) > (s + q)) && ((z + s) < q) && q != z && s != z && s != q && l != z && l != q && l != s)
						{ //?????????????
							String a = new String(new char[4]);
							int[] b = {z, q, s, l};
							a = tangible.StringFunctions.changeCharacter(a, 0, 'z');
							a = tangible.StringFunctions.changeCharacter(a, 1, 'q');
							a = tangible.StringFunctions.changeCharacter(a, 2, 's');
							a = tangible.StringFunctions.changeCharacter(a, 3, 'l');
						for (int j = 3;j > 0;j--)
						{
							for (int i = 0;i < j;i++)
							{
								if (b[i] < b[i + 1])
								{
									int t = b[i];
									b[i] = b[i + 1];
									b[i + 1] = t;
									char s = a.charAt(i);
									a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
									a = tangible.StringFunctions.changeCharacter(a, i + 1, s);
								} //????
							}
						}
						for (int k = 0;k < 4;k++)
						{
							System.out.print(a.charAt(k));
							System.out.print(" ");
							System.out.print(b[k] * 10);
							System.out.print("\n");
						}

						}
					}
				}
			}
		}
		return 0;
	}

}

