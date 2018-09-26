package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[81]);
		String b = new String(new char[81]);
		int c;
		int d;
		int i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = a.length();
		d = b.length();
		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (i = 0;i < d;i++)
		{
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
		}
		if (strcmp(a,b) == 1)
		{
			System.out.print(">");
		}
		else if (strcmp(a,b) == -1)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("=");
		}

	}


}

