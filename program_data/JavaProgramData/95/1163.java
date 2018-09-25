package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) >= 97)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
					 i++;
		}
		i = 0;
		while (b.charAt(i) != '\0')
		{
			if (b.charAt(i) >= 97)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
					i++;
		}
			if (strcmp(a,b) > 0)
			{
			System.out.print(">");
			}
			if (strcmp(a,b) < 0)
			{
			System.out.print("<");
			}
			if (strcmp(a,b) == 0)
			{
			System.out.print("=");
			}
			return 0;
	}
}

