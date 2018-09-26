package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char strupr = char x;
		int i;
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		String c = new String(new char[80]);
		String d = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, String.valueOf(a.charAt(i)).toUpperCase());
		 d = tangible.StringFunctions.changeCharacter(d, i, String.valueOf(b.charAt(i)).toUpperCase());
		}
		if (strcmp(c,d) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(c,d) < 0)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("=");
		}
	}
	public static char strupr(char x)
	{
		if (x > 96 && x < 123)
		{
			return (x - 32);
		}
		else
		{
			return (x);
		}
	}
}

