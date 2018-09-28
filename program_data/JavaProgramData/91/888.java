package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		String p;
		cin.get(a, 101);
		p = a;
		for (int i = 0; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i + 1) == '\0')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, *(p.Substring(i)) + p);
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, *(p.Substring(i)) + *(p.Substring(i) + 1));
			}
		}
		System.out.print(b);
		return 0;
	}
}

