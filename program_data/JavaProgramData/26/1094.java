package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int n;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i);i++)
		{
			if ((a.charAt(i) != ' ') || ((a.charAt(i) == ' ') && (a.charAt(i + 1) != ' ')))
			{
				b = tangible.StringFunctions.changeCharacter(b, i - j, a.charAt(i));
			}
			else
			{
				j++;
			}
		}
		n = a.length();
		b = tangible.StringFunctions.changeCharacter(b, n - j, '\0');
		System.out.printf("%s",b);
		return 0;
	}

}

