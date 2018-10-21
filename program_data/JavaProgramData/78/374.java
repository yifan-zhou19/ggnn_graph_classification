package <missing>;

public class GlobalMembers
{
	/*
	 *100030.cpp
	 *???????
	 *Created on: 2012-10-13
	 *Author:??
	 */
	public static int z = 0;
	public static int q = 0;
	public static int s = 0;
	public static int l = 0;
	public static int c = 0;
	public static int[] a = new int[10];
	public static int i = 0;
	public static int j = 0;
	public static String m = new String(new char[5]);
	public static char d;
	public static int Main()
	{
		for (z = 1;z < 6;z++) //????
		{
			for (q = 1;q < 6;q++)
			{
				if (z != q)
				{
					for (s = 1;s < 6;s++)
					{
						if ((z != s) && (q != s))
						{
							for (l = 1;l < 6;l++)
							{
								if ((z != l) && (q != l) && (s != l))
								{
									if (((z + q) == (s + l)) && ((z + l) > (s + q)) && ((z + s) < (q)))
									{
										a[0] = z,a[1] = q,a[2] = s,a[3] = l;
										m = tangible.StringFunctions.changeCharacter(m, 0, 'z');
										m = tangible.StringFunctions.changeCharacter(m, 1, 'q');
										m = tangible.StringFunctions.changeCharacter(m, 2, 's');
										m = tangible.StringFunctions.changeCharacter(m, 3, 'l');
										for (i = 0;i < 3;i++)
										{ //?????
											for (j = 0;j < (3 - i);j++)
											{
												if (a[j] > a[j + 1])
												{
													c = a[j];
													a[j] = a[j + 1];
													a[j + 1] = c;
													d = m.charAt(j);
													m = tangible.StringFunctions.changeCharacter(m, j, m.charAt(j + 1));
													m = tangible.StringFunctions.changeCharacter(m, j + 1, d);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.print(m.charAt(3));
		System.out.print(' ');
		System.out.print(a[3] * 10);
		System.out.print("\n");
		System.out.print(m.charAt(2));
		System.out.print(' ');
		System.out.print(a[2] * 10);
		System.out.print("\n");
		System.out.print(m.charAt(1));
		System.out.print(' ');
		System.out.print(a[1] * 10);
		System.out.print("\n");
		System.out.print(m.charAt(0));
		System.out.print(' ');
		System.out.print(a[0] * 10);
		System.out.print("\n");
		return 0;
	}

}

