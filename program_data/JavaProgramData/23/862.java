package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		String p;
		int i;
		int j;
		int l;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = l - 1;i >= 0;i--)
		{
			s = tangible.StringFunctions.changeCharacter(s, i + 1, s.charAt(i));
		}
		s = tangible.StringFunctions.changeCharacter(s, 0, s[l + 1] = ' ');
		p = s;

		for (i = l;i >= 0;i--)
		{
			if (*(p.Substring(i)) == ' ')
			{
				for (j = i + 1; * (p.Substring(j)) != ' ';j++)
				{
					System.out.printf("%c",*(p.Substring(j)));
				}
				if (i != '\0')
				{
					System.out.print(" ");
				}
			}
		}


	}

}

