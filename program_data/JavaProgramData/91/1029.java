package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[102]);
		String b = new String(new char[102]);
		int i;
		int j;
		for (i = 0;i <= 101;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		}
		for (i = 1;;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
			if (a.charAt(i) == '\n')
			{
				j = i - 1;
				break;
			}
		}
		for (i = 1;i < j;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
		}
		b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j) + a.charAt(1));
		for (i = 1;i <= j;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		return 0;
	}
}

