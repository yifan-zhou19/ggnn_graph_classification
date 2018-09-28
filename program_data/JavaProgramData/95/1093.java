package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		char i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			if ((a.charAt(i) > 64) && (a.charAt(i) < 91))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
		}
		for (i = 0;i < 80;i++)
		{
			if ((b.charAt(i) > 64) && (b.charAt(i) < 91))
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">\n");
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=\n");
		}
		if (strcmp(a,b) < 0)
		{
			System.out.print("<\n");
		}
		return 0;
	}

}

