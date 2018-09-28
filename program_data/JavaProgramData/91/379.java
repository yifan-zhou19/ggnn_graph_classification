package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		for (int i = 0;i < a.length();i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
		b = tangible.StringFunctions.changeCharacter(b, a.length() - 1, a.charAt(0) + a.charAt(a.length() - 1));
		System.out.printf("%c",b.charAt(i));
		}
	}
}

