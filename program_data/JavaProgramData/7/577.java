package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String copy = new String(new char[101]);
		String before = new String(new char[101]);
		String after = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		int i = 0;
		int j;
		for (i;i <= (int)(s.length() - a.length());i++)
		{
				for (j = 0;j < (int)(a.length());j++)
				{
						copy = tangible.StringFunctions.changeCharacter(copy, j, s.charAt(i + j));
				}
				copy = tangible.StringFunctions.changeCharacter(copy, j, '\0');
				if (strcmp(copy,a) == 0)
				{
					for (j = 0;j < i;j++)
					{
						before = tangible.StringFunctions.changeCharacter(before, j, s.charAt(j));
					}
					before = tangible.StringFunctions.changeCharacter(before, j, '\0');
					for (j = i + (int)a.length();j < (int)(s.length());j++)
					{
						after = tangible.StringFunctions.changeCharacter(after, j - i - (int)a.length(), s.charAt(j));
					}
					after = tangible.StringFunctions.changeCharacter(after, j - i - (int)a.length(), '\0');
					before += b;
					before += after;
					s = before;
					break;
				}
		}
		System.out.println(s);
		return 0;
	}

}

