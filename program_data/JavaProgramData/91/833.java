package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			String a = new String(new char[102]);
			String b = new String(new char[102]);
			a = new Scanner(System.in).nextLine();
			int i = 0;
			for (;i < a.length();i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt((i + 1) % a.length()));
			}
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			System.out.printf("%s",b);
			return 0;
	}
}

