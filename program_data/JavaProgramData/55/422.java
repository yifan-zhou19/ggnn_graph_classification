package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char intonumber = char x;
	char intochar = int y;
	String str = new String(new char[N]);
	str = new Scanner(System.in).nextLine();

	int i = 0;
	int c1 = 0;
	while (str.charAt(i) != ' ')
	{
		c1 = c1 * 10 + intonumber(str.charAt(i++));
	}
	while (str.charAt(i) == ' ')
	{
		i++;
	}

	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long n1=0;
	int n1 = 0;
	while (str.charAt(i) != ' ')
	{
		n1 = n1 * c1 + intonumber(str.charAt(i++));

	}
	while (str.charAt(i) == ' ')
	{
		i++;
	}

	int l1 = 0;
	while (str.charAt(i) != '\0')
	{
	l1 = l1 * 10 + intonumber(str.charAt(i++));
	}

	int f;
	String yu = new String(new char[M]);
	for (f = 0;n1 > 0;f++)
	{
		yu = tangible.StringFunctions.changeCharacter(yu, f, intochar(n1 % l1));
		n1 = n1 / l1;
	}
	if (f == 0)
	{
		System.out.printf("%d",0);
	}
	for (f--;f >= 0;f--)
	{
	System.out.printf("%c",yu.charAt(f));
	}

	}



	public static char intonumber(char x)
	{
		if (x >= 'a' && x <= 'z')
		{
			x = x - 87;
		}
		else if (x >= 'A' && x <= 'Z')
		{
			x = x - 55;
		}
		else if (x >= 48 && x <= 57)
		{
			x = x - 48;
		}
		return (x);
	}

	public static char intochar(int y)
	{
		if (y >= 0 && y <= 9)
		{
			y = y + 48;
		}
		else if (y > 9 && y <= 35)
		{
			y = y + 55;
		}
		return (y);

	}

}

