package <missing>;

public class GlobalMembers
{
	//********************
	//*??:???
	//*??;???
	//*2012-10-26
	//********************
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i = 0;
		final String f = "ABC";
		for (a = 1;a <= 3;a++) //?????????
		{
			for (b = 1;b <= 3;b++)
			{
				if (b == a)
				{
					continue;
				}
				for (c = 1;c <= 3;c++)
				{
					if (c == a || c == b)
					{
						continue;
					}
					if (((b < a) + (c == a) == a - 1) && ((a < b) + (a < c) == b - 1) && ((c < b) + (b < a) == c - 1)) //????????
					{
						if (a < b && a < c)
						{
							f = tangible.StringFunctions.changeCharacter(f, 0, 'A'); //????????
						}
						if (b < a && b < c)
						{
							f = tangible.StringFunctions.changeCharacter(f, 0, 'B');
						}
						if (c < a && c < b)
						{
							f = tangible.StringFunctions.changeCharacter(f, 0, 'C');
						}
						if (f.charAt(0) == 'A')
						{
							if (b < c)
							{
								f = tangible.StringFunctions.changeCharacter(f, 1, 'B',f[2] = 'C'); //???????
							}
							else
							{
								f = tangible.StringFunctions.changeCharacter(f, 1, 'C',f[2] = 'B');
							}
						}
						if (f.charAt(0) == 'B')
						{
							if (a < c)
							{
								f = tangible.StringFunctions.changeCharacter(f, 1, 'A',f[2] = 'C');
							}
							else
							{
								f = tangible.StringFunctions.changeCharacter(f, 1, 'C', f[2] = 'A');
							}
						}
						if (f.charAt(0) == 'C')
						{
							if (a < b)
							{
								f = tangible.StringFunctions.changeCharacter(f, 1, 'A',f[2] = 'B');
							}
							else
							{
								f = tangible.StringFunctions.changeCharacter(f, 1, 'B', f[2] = 'A');
							}
						}
					}
				}
			}
		}
		for (i = 2;i >= 0;i--) //??????????
		{
			System.out.print(f.charAt(i));
		}
		return 0;
	}


}

