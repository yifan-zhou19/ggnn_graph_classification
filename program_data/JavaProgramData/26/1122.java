package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			String s1 = new String(new char[256]);
			String s2 = new String(new char[256]);
			int n;
			int l;
			int i;
			int j = 0;
			int k = 0;
			s1 = new Scanner(System.in).nextLine();
			l = s1.length();
			for (i = 0;i < l;i++)
			{
					if (s1.charAt(i) != ' ')
					{
							k = 0;
							s2 = tangible.StringFunctions.changeCharacter(s2, j, s1.charAt(i));
							j++;
					}
					else if (s1.charAt(i) == ' ' && k == 0)
					{
							k = 1;
							s2 = tangible.StringFunctions.changeCharacter(s2, j, s1.charAt(i));
							j++;
					}
			}
			System.out.printf("%s",s2);
	}
}

