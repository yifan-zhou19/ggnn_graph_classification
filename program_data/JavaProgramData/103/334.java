package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int num;
		int j;
		int length = 0;
		int pos = 0;
		String a = new String(new char[1000]);
		a = null;
		a.Substring(1) = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; a.charAt(i) != 0; i++)
		{
			if (a.charAt(i) > 96 && a.charAt(i) < 123)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (i = 2; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) != a.charAt(i - 1))
			{
				length = i - 1 - pos;
				pos = i - 1;
				System.out.print("(");
				System.out.print(a.charAt(i - 1));
				System.out.print(",");
				System.out.print(length);
				System.out.print(")");
			}
		}
		System.out.print("(");
		System.out.print(a.charAt(i - 1));
		System.out.print(",");
		System.out.print(i - 1 - pos);
		System.out.print(")");
		return 0;
	}
}

