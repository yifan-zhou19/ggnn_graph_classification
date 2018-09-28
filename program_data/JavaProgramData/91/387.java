package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i + 1) != '\0')
			{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
			}
			else
			{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(0) + a.charAt(i));
			}
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		System.out.print("\n");

		return 0;
	}

}

