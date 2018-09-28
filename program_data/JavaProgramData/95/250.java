package <missing>;

public class GlobalMembers
{
	public static char z(char a)
	{
		char y;
		if (a >= 65 && a <= 90)
		{
			y = a + 32;
		}
		else
		{
			y = a;
		}
		return (y);
	}
	public static int Main()
	{
		char z = char a;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		int x;
		int y;
		int i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		x = a.length();
		y = b.length();
		for (i = 0;i <= x;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, z(a.charAt(i)));
		}
		for (i = 0;i <= y;i++)
		{
			d = tangible.StringFunctions.changeCharacter(d, i, z(b.charAt(i)));
		}

		if (strcmp(c,d) < 0)
		{
			System.out.print("<");
		}
		else if (strcmp(c,d) == 0)
		{
			System.out.print("=");
		}
		 else
		 {
			 System.out.print(">");
		 }
	   return 0;
	}

}

