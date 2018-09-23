package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ?? ? ?                              *
	//* ? ?      ?? ? ?                              *
	//* ? ? ? ??2010 ? 11 ? 17 ?                   * 
	//* ? ?      ?1000010185                            *
	//****************************************************** 
	public static int Main()
	{

		//?????????????????????????????WA??????????
		int a; //a?b?c???????A?B?C?????????
		int b;
		int c;
		int A;
		int B;
		int C;
		String m = new String(new char[4]); //??????
		for (a = 0; a < 3; a++)
		{
			for (b = 0; b < 3; b++)
			{
				for (c = 0; c < 3; c++)
				{

					//????????3????????
					A = (b > a) + (c == a);
					B = (a > b) + (a > c);
					C = (c > b) + (b > a);
					if ((((a > b && A < B) || (a < b && A > B)) + ((a > c && A < C) || (a < c && A > C)) + ((b > c && B < C) || (b < c && B > C))) == 3) //?????????????
					{
						m = tangible.StringFunctions.changeCharacter(m, a, 'A');
						m = tangible.StringFunctions.changeCharacter(m, b, 'B');
						m = tangible.StringFunctions.changeCharacter(m, c, 'C');
						m = tangible.StringFunctions.changeCharacter(m, 3, '\0');
						System.out.print(m);
					}
				}
			}
		}
		return 0;
	}
}

