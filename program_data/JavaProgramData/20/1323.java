package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String s1 = "";
		final String s2 = "";
		final String a = "";
		final String c = "";
		int i;
		int j;
		int n;
		int m = 0;
		int k = 0;
		while (scanf("%s%s",s1,s2) != EOF)
		{
			n = s1.length();
			for (i = 0;i < n;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, s1.charAt(i));
			}
			for (i = 0;i < n - 1;i++)
			{
				if (s1.charAt(m) < s1.charAt(i + 1))
				{
					m = i + 1;
				}
			}
			for (i = 0;i <= m;i++)
			{
				System.out.printf("%c",c.charAt(i));
				s1 = tangible.StringFunctions.changeCharacter(s1, i, '\0');
				c = tangible.StringFunctions.changeCharacter(c, i, '\0');
			}
			System.out.printf("%c%c%c",s2.charAt(0),s2.charAt(1),s2.charAt(2));
			for (j = m + 1;j < n;j++)
			{
				System.out.printf("%c",c.charAt(j));
				s1 = tangible.StringFunctions.changeCharacter(s1, j, '\0');
				c = tangible.StringFunctions.changeCharacter(c, j, '\0');
			}
			System.out.print("\n");
			m = 0;
			k = 0;
		}
	}

}

