package <missing>;

public class GlobalMembers
{
	//************************************************************
	//*? ? ?:????                                         *
	//*?    ?: ???                                          *
	//*????:2010-10-25                                       *
	//*????:?2--35???????????????            *
	//************************************************************
	public static int Main()
	{
		int i;
		int b;
		int c = 0;
		int d;
		int j;
		int count = 0;
		double a;
		double e;
		String char_a = new String(new char[32]); //????????????????32?????????32?
		String char_b = new String(new char[32]);
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		char_a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < char_a.length();i++) //??????????10???????
		{
			if (char_a.charAt(i) >= 48 && char_a.charAt(i) <= 57)
			{
				char_a = tangible.StringFunctions.changeCharacter(char_a, i, char_a.charAt(i) - 48);
			}
			else if (char_a.charAt(i) >= 97 && char_a.charAt(i) <= 122)
			{
				char_a = tangible.StringFunctions.changeCharacter(char_a, i, char_a.charAt(i) - 87);
			}
			else if (char_a.charAt(i) >= 65 && char_a.charAt(i) <= 90)
			{
				char_a = tangible.StringFunctions.changeCharacter(char_a, i, char_a.charAt(i) - 55);
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < char_a.length();i++) //??????????10???????
		{
			e = char_a.length() - i - 1;
			c = c + char_a.charAt(i) * Math.pow(a,e);
		}
		j = 0;
		if (c < b)
		{
			System.out.print(c);
			System.out.print("\n");
			return 0;
		}
		while (c >= b) //?10??????????
		{
			d = c % b;
			c = c / b;
			if (d < 10)
			{
				char_b = tangible.StringFunctions.changeCharacter(char_b, j, d + 48);
			}
			else if (d >= 10 && b <= 35)
			{
				char_b = tangible.StringFunctions.changeCharacter(char_b, j, d + 55);
			}
			count = count++;
			++j;
			if (c < b && c < 10)
			{
				char_b = tangible.StringFunctions.changeCharacter(char_b, j, c + 48);
			}
			if (c < b && c>10)
			{
				char_b = tangible.StringFunctions.changeCharacter(char_b, j, c + 55);
			}
		}
	for (j = count;j >= 0;j--) //????
	{
		System.out.print(char_b.charAt(j));
	}
	System.out.print("\n");
	return 0;
	} //?????

}

