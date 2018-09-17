package <missing>;

public class GlobalMembers
{
	/*
	 * bifanliang.cpp
	 *
	 *  Created on: 2012-10-19
	 *      Author: 99003
	 */

	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int j;
		int t;
		int sum1;
		int sum2;
		int sum3;
		int[] arr = new int[10];
		String name = new String(new char[10]);
		for (a = 0; a <= 2; a = a + 1)
		{ //abc???10 2??????
			for (b = 0; b <= 2; b = b + 1)
			{
				for (c = 0; c < 2; c = c + 1)
				{
					if (a != b && b != c && a != c)
					{
						sum1 = (b > a) + (c == a);
						sum2 = (a > b) + (a > c);
						sum3 = (c > b) + (b > a); //sum????????
						if (a + sum1 == b + sum2 && b + sum2 == c + sum3)
						{
							arr[0] = a; //???????
							arr[1] = b;
							arr[2] = c;
							name = tangible.StringFunctions.changeCharacter(name, 0, 'A');
							name = tangible.StringFunctions.changeCharacter(name, 1, 'B');
							name = tangible.StringFunctions.changeCharacter(name, 2, 'C');
							name = tangible.StringFunctions.changeCharacter(name, 3, '\0');
							for (i = 0; i < 3; i++)
							{
								for (j = i + 1; j < 3; j++)
								{
									if (arr[i] > arr[j])
									{
										t = arr[i];
										arr[i] = arr[j];
										arr[j] = t;
										t = name.charAt(i);
										name = tangible.StringFunctions.changeCharacter(name, i, name.charAt(j));
										name = tangible.StringFunctions.changeCharacter(name, j, t);
									}
								}
							}
							System.out.print(name.charAt(0));
							System.out.print(name.charAt(1));
							System.out.print(name.charAt(2));

						}
					}
				}
			}
		}
		return 0;
	}

}

