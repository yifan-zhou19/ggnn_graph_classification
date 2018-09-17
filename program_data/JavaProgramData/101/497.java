package <missing>;

public class GlobalMembers
{
	//****************************************
	//*??????                         **
	//*?????? 1100012798              **
	//*???2011.10.15                     **
	//****************************************
	public static int Main()
	{
		int a; // ??a,b,c,ai,bi,ci???
		int b;
		int c;
		int ai;
		int bi;
		int ci;
		String k = new String(new char[3]); // ??k[3]?????
		for (a = 0;a < 3;a++) // ????,???a,b,c?????
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++)
				{
					ai = 0;
					bi = 0;
					ci = 0; // ??????
					if (b > a)
					{
						ai++;
					}
					if (c == a)
					{
						ai++;
					}
					if (b < a)
					{
						bi++;
					}
					if (c < a)
					{
						bi++;
					}
					if (c > b)
					{
						ci++;
					}
					if (b > a)
					{
						ci++; // ????????????
					}
					if ((a + ai == 2) && (b + bi == 2) && (c + ci == 2))
					{
						k = tangible.StringFunctions.changeCharacter(k, a, 'A');
						k = tangible.StringFunctions.changeCharacter(k, b, 'B');
						k = tangible.StringFunctions.changeCharacter(k, c, 'C');
						System.out.print(k.charAt(0));
						System.out.print(k.charAt(1));
						System.out.print(k.charAt(2));
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

