package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long intonumber(char x);
	int intonumber = char x;
	char intochar = int y;
	String str = new String(new char[N]);
	String former = new String(new char[3]);
	str = new Scanner(System.in).nextLine();
	int i = 0;
	int c1 = 0;
	int c2 = 0;
	while (str.charAt(i) != ' ')
	{
		former = tangible.StringFunctions.changeCharacter(former, i, intonumber(str.charAt(i)));
		c2 = c1 + former.charAt(i);
		c1 = c2 * 10;
		i++;
	}
	i++;
	int j = 0;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long n2=0,n1=0;
	int n2 = 0;
	int n1 = 0;
	String num = new String(new char[N]);
	while (str.charAt(i) != ' ')
	{
		num = tangible.StringFunctions.changeCharacter(num, j, intonumber(str.charAt(i)));
		n2 = n1 + num.charAt(j);
		n1 = n2 * c2;
		j++;
		i++;

	}
	i++;
	int k = 0;
	int l1 = 0;
	int l2 = 0;
	String later = new String(new char[3]);
	while (str.charAt(i) != '\0')
	{
	later = tangible.StringFunctions.changeCharacter(later, k, intonumber(str.charAt(i)));
	l2 = l1 + later.charAt(k);
	l1 = l2 * 10;
	i++;
	k++;

	}


	int f;
	String yu = new String(new char[M]);
	for (f = 0;n2 > 0;f++)
	{
		yu = tangible.StringFunctions.changeCharacter(yu, f, intochar(n2 % l2));
		n2 = n2 / l2;
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



	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long intonumber(char x)
	public static int intonumber(char x)
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
		else if (y > 9 && y <= 32)
		{
			y = y + 55;
		}
		return (y);

	}


}

