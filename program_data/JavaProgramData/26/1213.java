package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int m;
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		m = 0;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, m, a.charAt(i));
				m++;
			}
				else if (a.charAt(i) != ' ')
				{
				b = tangible.StringFunctions.changeCharacter(b, m, a.charAt(i));
				m++;
				}
				else
				{
					continue;
				}
		}
		b = tangible.StringFunctions.changeCharacter(b, m, '\0');
		System.out.printf("%s", b);
		return 0;
	}
}

