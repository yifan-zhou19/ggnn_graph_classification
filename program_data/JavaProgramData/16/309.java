package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10001]);
		String b = new String(new char[10001]);
		String c = new String(new char[10001]);
		int x;
		int i;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		x = a.length();
		for (i = 0;i <= x;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(x - i - 1));
		}

		System.out.print(b);
		return 0;
	}
}

