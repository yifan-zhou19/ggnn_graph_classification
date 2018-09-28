package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int k = 0;
		String s = new String(new char[101]);
		String b = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, k++, s.charAt(i));
				while (s.charAt(i) == ' ')
				{
					i++;
				}
				b = tangible.StringFunctions.changeCharacter(b, k++, s.charAt(i));
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, k++, s.charAt(i));
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, k, '\0');
		System.out.printf("%s",b);

	return 0;
	}

}

