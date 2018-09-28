package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[253]);
	public static String b = new String(new char[253]);
	public static String c = new String(new char[253]);
	public static int j;

	public static int Main()
	{
		void f1(int length,int length2);
		void f2(int length,int length3);
		void f3(int length1,int length2,int length3);
		for (j = 0;j <= 250;j++)
		{
			c = tangible.StringFunctions.changeCharacter(c, j, '0');
		}
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int length1;
		int length2;
		int length3 = 250;
		int i;
		length1 = a.length() - 1;
		length2 = b.length() - 1;
		for (i = 0;(length1 >= 0 && length2 >= 0);i++, length1--, length2--, length3--)
		{
			f3(length1, length2, length3);
		}
		if (length1 == -1)
		{
			for (;length2 >= 0;length2--,length3--)
			{
				f1(length2, length3);
			}
		}
		else
		{
			for (;length1 >= 0;length1--,length3--)
			{
				f2(length1, length3);
			}
		}
		int k = 0;
		for (i = 0 ; i <= 250 ; i++)
		{
			if (c.charAt(i) != '0' || (c.charAt(i) == '0' && i == 250) || k == 1)
			{
				System.out.print(c.charAt(i));
				k = 1;
			}
		}

		return 0;
	}

	public static void f1(int length,int length3)
	{
		int x;
		int z;
			x = b.charAt(length) - '0';
			z = c.charAt(length3) - '0';
			if (x + z >= 10)
			{
				c = tangible.StringFunctions.changeCharacter(c, length3, (x + z) % 10 + '0');
				c = tangible.StringFunctions.changeCharacter(c, length3 - 1, (x + z) / 10 + '0');
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, length3, x + z + '0');
			}
	}

	public static void f2(int length,int length3)
	{
		int x;
		int z;
			x = a.charAt(length) - '0';
			z = c.charAt(length3) - '0';
			if (x + z >= 10)
			{
				c = tangible.StringFunctions.changeCharacter(c, length3, (x + z) % 10 + '0');
				c = tangible.StringFunctions.changeCharacter(c, length3 - 1, (x + z) / 10 + '0');
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, length3, x + z + '0');
			}
	}

	public static void f3(int length1,int length2,int length3)
	{
		int x;
		int y;
		int z;
		x = a.charAt(length1) - '0';
		y = b.charAt(length2) - '0';
		z = c.charAt(length3) - '0';
		if (x + y + z >= 10)
		{
			c = tangible.StringFunctions.changeCharacter(c, length3, (x + y + z) % 10 + '0');
			c = tangible.StringFunctions.changeCharacter(c, length3 - 1, (x + y + z) / 10 + '0');
		}
		else
		{
			c = tangible.StringFunctions.changeCharacter(c, length3, x + y + z + '0');
		}
	}

}

