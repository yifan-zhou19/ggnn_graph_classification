package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		char p;
		char q;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			for (p = 'A',q = 'a';p <= 'Z';p++,q++)
			{
				if (a.charAt(i) == p)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, q);
				}
				if (b.charAt(i) == p)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, q);
				}
			}
		}
		i = strcmp(a,b);
		if (i == 0)
		{
			System.out.print("=\n");
		}
		if (i < 0)
		{
			System.out.print("<\n");
		}
		if (i > 0)
		{
			System.out.print(">\n");
		}
	}
}

