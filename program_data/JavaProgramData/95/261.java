package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[81]);
		String b = new String(new char[81]);
		int i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
			if (a.charAt(i) > 96)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if (b.charAt(i) > 96)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
		}
		if (strcmp(a,b) > 0)
		{
				System.out.print(">\n");
		}
		else if (strcmp(a,b) < 0)
		{
				System.out.print("<\n");
		}
		else if (strcmp(a,b) == 0)
		{
				System.out.print("=\n");
		}

		return 0;
	}


}

