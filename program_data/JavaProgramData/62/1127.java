package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int i;
		int j;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		j = 0;
			for (i = 0;i <= n;i++)
			{
			if (a.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
			else if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
			else if (a.charAt(i) == '\0')
			{
								b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			}
			}
		System.out.printf("%s",b);

		return 0;
	}

}

