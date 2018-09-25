package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		String b = new String(new char[110]);
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0; a.charAt(i + 1) != '\0'; i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
		}
		b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(0));
		b = tangible.StringFunctions.changeCharacter(b, i + 1, '\0');
		System.out.println(b);
		return 0;
	}
}

