package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-11-6
	 *      Author: ???
	 *      1100012870
	 */
	public static int Main()
	{
		String a = new String(new char[6]); //a???????
		char[] b = {' ', 'A', 'B', 'C', 'D', 'E'};
		int[] c = new int[6];
		int i;
		int j;
		int k;
		int l;
		int m;
		int w;

		for (i = 1;i <= 5;i++) //??5???
		{
			for (j = 1;j <= 5;j++)
			{
				if (i == j)
				{
					continue;
				}
				for (l = 1;l <= 5;l++)
				{
					if (i == l)
					{
						continue;
					}
					if (j == l)
					{
						continue;
					}
					for (k = 1;k <= 5;k++)
					{
						if (i == k)
						{
							continue;
						}
						if (j == k)
						{
							continue;
						}
						if (l == k)
						{
							continue;
						}
						for (m = 1;m <= 5;m++)
						{
							if (i == m)
							{
								continue;
							}
							if (j == m)
							{
								continue;
							}
							if (l == m)
							{
								continue;
							}
							if (k == m)
							{
								continue;
							}

							a = tangible.StringFunctions.changeCharacter(a, 1, b[i]); //???a????????????
							a = tangible.StringFunctions.changeCharacter(a, 2, b[j]);
							a = tangible.StringFunctions.changeCharacter(a, 3, b[l]);
							a = tangible.StringFunctions.changeCharacter(a, 4, b[k]);
							a = tangible.StringFunctions.changeCharacter(a, 5, b[m]);

							c[1] = (a.charAt(1) == 'E'); //?????5??????
							c[2] = (a.charAt(2) == 'B');
							c[3] = (a.charAt(5) == 'A');
							c[4] = (a.charAt(1) != 'C');
							c[5] = (a.charAt(1) == 'D');

							if (c[i] != 1 || c[j] != 1)
							{
								continue; //???????????????
							}
							if (c[l] != 0 || c[k] != 0 || c[m] != 0)
							{
								continue; //??????????????
							}

							for (w = 1;w <= 5;w++) //????????????5??????
							{
								if (a.charAt(w) == 'A')
								{
									System.out.print(w);
								}
							}
							for (w = 1;w <= 5;w++)
							{
								if (a.charAt(w) == 'B')
								{
									System.out.print(' ');
									System.out.print(w);
								}
							}
							for (w = 1;w <= 5;w++)
							{
								if (a.charAt(w) == 'C')
								{
									System.out.print(' ');
									System.out.print(w);
								}
							}
							for (w = 1;w <= 5;w++)
							{
								if (a.charAt(w) == 'D')
								{
									System.out.print(' ');
									System.out.print(w);
								}
							}
							for (w = 1;w <= 5;w++)
							{
								if (a.charAt(w) == 'E')
								{
									System.out.print(' ');
									System.out.print(w);
								}
							}
							return 0;
						}
					}
				}
			}
		}
	}
}

