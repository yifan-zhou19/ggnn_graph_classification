package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int la;
		int lb;
		la = a.length();
		lb = b.length();
		for (i = 0;i < la;i++)
		{
			if (a.charAt(i) < 'a' && a.charAt(i) >= 'A')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, (char)a.charAt(i) + 32);
			}
		}
		for (i = 0;i < lb;i++)
		{
			if (b.charAt(i) < 'a' && b.charAt(i) >= 'A')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, (char)b.charAt(i) + 32);
			}
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(a,b) == 0)
		{
			System.out.print("=");
		}
		else if (strcmp(a,b) < 0)
		{
			System.out.print("<");
		}

	}

}

