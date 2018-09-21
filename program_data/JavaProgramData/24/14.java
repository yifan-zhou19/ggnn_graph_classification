package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		char[][] s = new char[100][100];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char c;
		String p;
		s[0] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 1;c = System.in.read() != '\n';i++)
		{
			s[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		a = s[0];
		a = tangible.StringFunctions.changeCharacter(a, String.valueOf(s[0]).length(), '\0');
		b = s[0];
		b = tangible.StringFunctions.changeCharacter(b, String.valueOf(s[0]).length(), '\0');
		for (j = 0;j < i;j++)
		{
			p = s[j];
			if (String.valueOf(s[j]).length() > a.length())
			{
				a = p;
			a = tangible.StringFunctions.changeCharacter(a, String.valueOf(s[j]).length(), '\0');
			}
		}
		System.out.print(a);
		System.out.print("\n");
		for (j = 0;j < i;j++)
		{
			p = s[j];
			if (String.valueOf(s[j]).length() < b.length())
			{
				b = p;
			b = tangible.StringFunctions.changeCharacter(b, String.valueOf(s[j]).length(), '\0');
			}
		}
		System.out.print(b);
		System.out.print("\n");
	return 0;
	}
}

