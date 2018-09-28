package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int l;
		String a = new String(new char[50]);
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (n = 0;n < l;n++)
		{
			if (a.charAt(n) == '\t')
			{
				a = tangible.StringFunctions.changeCharacter(a, n, ' ');
			}
		}
		for (i = l;i > 0;i--)
		{
			if ((a.charAt(i - 1) == ' ') && (a.charAt(i) == ' '))
			{
				a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i));
			}
		}
		System.out.println(a);
		return 0;
	}
}

