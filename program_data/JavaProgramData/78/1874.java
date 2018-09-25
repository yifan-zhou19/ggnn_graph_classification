package <missing>;

public class GlobalMembers
{
	/*
	 * 12.10.26.cpp
	 *  Created on: 2012-10-26
	 *  Author: ???
	 *  ??:???
	 */
	public static int Main()
	{
		int[] w = new int[5];
		int z;
		int q;
		int s;
		int l;
		int i;
		int j;
		int t;
		String n = new String(new char[5]);
		char k;
		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
				for (s = 1; s <= 5; s++)
				{
					for (l = 1; l <= 5; l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							w[1] = z;
							w[2] = q;
							w[3] = s;
							w[4] = l;
							n = tangible.StringFunctions.changeCharacter(n, 1, 'z');
							n = tangible.StringFunctions.changeCharacter(n, 2, 'q');
							n = tangible.StringFunctions.changeCharacter(n, 3, 's');
							n = tangible.StringFunctions.changeCharacter(n, 4, 'l');
							for (i = 1; i <= 4; i++)
							{
								for (j = i + 1; j <= 4; j++)
								{
									if (w[i] < w[j])
									{
										t = w[i];
										w[i] = w[j];
										w[j] = t;
										k = n.charAt(i);
										n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(j));
										n = tangible.StringFunctions.changeCharacter(n, j, k);
									}
								}
							}
							for (i = 1; i <= 4; i++)
							{
										System.out.print(n.charAt(i));
										System.out.print(' ');
										System.out.print(w[i] * 10);
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

