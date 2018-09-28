package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int al;
		int bl;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		al = a.length();
		bl = b.length();
		for (i = 0;i < al;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, (char)((int)a.charAt(i) - 32));
			}
		}
		for (i = 0;i < bl;i++)
		{
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, (char)((int)b.charAt(i) - 32));
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
		}
		else if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("<");
		}
		return 0;
	}

}

