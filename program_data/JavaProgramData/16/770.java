package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int l;

		a = ConsoleInput.readToWhiteSpace(true).charAt(0);

		l = a.length();

		for (int i = 0; i < l; i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(l - i - 1));
			System.out.print(b.charAt(i));
		}

		return 0;
	}

}

