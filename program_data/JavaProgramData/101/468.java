package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //??abc??????
		int b;
		int c;

		for (int i = 0;i < 27;i++) //??????????
		{
		a = Math.floor((int)(Math.floor(i / 9)) % 3); //????floor??????double??? ???int?
		b = Math.floor((i % 9) / 3);
		c = i % 3;
	/*?????????:
	(2-a)<(2-b)
	(2-a)==(2-c)
	(2-a)>(2-b)
	(2-a)>(2-c)
	(2-c)>(2-b)
	(2-b)>(2-a)
	*/
		int a1 = 0; //??abc?????
		int b1 = 0;
		int c1 = 0;
		if (2 - a < 2 - b)
		{
			a1++;
		}
		if (2 - a == 2 - c)
		{
			a1++;
		}
		if (2 - a > 2 - b)
		{
			b1++;
		}
		if (2 - a > 2 - c)
		{
			b1++;
		}
		if (2 - c > 2 - b)
		{
			c1++;
		}
		if (2 - b > 2 - a)
		{
			c1++;
		}

		String ch = new String(new char[3]); //???????
		if ((a1 == a) && (b1 == b) && (c1 == c))
		{
		ch = tangible.StringFunctions.changeCharacter(ch, 2 - a, 'A');
		ch = tangible.StringFunctions.changeCharacter(ch, 2 - b, 'B');
		ch = tangible.StringFunctions.changeCharacter(ch, 2 - c, 'C');
		System.out.print(ch);
		}
		}
		return 0;
	}
}

