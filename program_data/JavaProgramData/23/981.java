package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int l;
		final String a = "";
		final String b = "";
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = l;i > 0;i--)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - 1));
		}
		a = tangible.StringFunctions.changeCharacter(a, 0, ' ');
		for (i = l;i >= 0;i--)
		{
			if (a.charAt(i) == ' ')
			{
				System.out.printf("%s", a.charAt(i + 1));
				a = tangible.StringFunctions.changeCharacter(a, i, '\0');
				if (i > 0)
				{
					System.out.print(" ");
				}
			}
		}
		return;
	}

}

