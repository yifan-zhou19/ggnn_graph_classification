package <missing>;

public class GlobalMembers
{
	//**************************************
	//????1000012825_4                 *
	//??????                         *
	//???11.19                          *
	//????????                     *
	//**************************************
	public static int Main()
	{
		int a;
		int b;
		int c;
		int AA1;
		int AA2;
		int BB1;
		int BB2;
		int CC1;
		int CC2;
		int i;
		String str = new String(new char[3]); //???????????A,B,C
		for (a = 0; a <= 2; a++)
		{
			for (b = 0 ; b <= 2; b++)
			{
				for (c = 0; c <= 2; c++)
				{
					AA1 = (b > a);
					AA2 = (c == a);
					BB1 = (a > b);
					BB2 = (a > c);
					CC1 = (c > b);
					CC2 = (b > a); //???3??????
					if ((a + AA1 + AA2 == 2) && (b + BB1 + BB2 == 2) && (c + CC1 + CC2 == 2) && (a != b) && (a != c) && (b != c))
					{
					// ?????????????????3??????
						str = tangible.StringFunctions.changeCharacter(str, a, 'A');
						str = tangible.StringFunctions.changeCharacter(str, b, 'B');
						str = tangible.StringFunctions.changeCharacter(str, c, 'C'); //????A,B,C???????
					}
				}
			}
		}
		for (i = 0; i <= 2; i++) //????
		{
			System.out.print(str.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}




}

