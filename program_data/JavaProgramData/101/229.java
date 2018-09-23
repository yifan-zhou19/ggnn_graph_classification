package <missing>;

public class GlobalMembers
{
	/*3?????????????? 
	A??B??????C??????? 
	B??A??????A??C??? 
	C????B????B?A???? 
	????????????????????? 
	???????????3??????*/
	//Goofy 2010 11 19
	public static int Main()
	{
		String peo = new String(new char[4]);
		int a;
		int b;
		int c;
		int i;
		int judger = 0;
		peo = tangible.StringFunctions.changeCharacter(peo, 3, '\0');
		for (a = 0; a < 3; a++)
		{
		for (b = 0; b < 3; b++)
		{
		for (c = 0; c < 3; c++)
		{
			judger = 0;
			peo = tangible.StringFunctions.changeCharacter(peo, a, 'A');
			peo = tangible.StringFunctions.changeCharacter(peo, b, 'B');
			peo = tangible.StringFunctions.changeCharacter(peo, c, 'C');
			if ((b > a) + (c == a) == 2 - a) //A
			{
				judger++;
			}
			if ((a > b) + (a > c) == 2 - b) //B
			{
				judger++;
			}
			if ((c > b) + (b > a) == 2 - c) //C
			{
				judger++;
			}
			if (judger == 3)
			{
				System.out.print(peo);
				System.out.print("\n");
			}
		}
		}
		}
		return 0;
	}
}

