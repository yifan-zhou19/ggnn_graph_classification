package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int i;
	int l;
	String s = new String(new char[100]);
	char[] sub = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	while (scanf("%s%s",s,sub) != EOF)
	{
			l = s.length();
			m = 0;
			for (i = 1;i < l;i++)
			{
					if (s.charAt(i) > s.charAt(m))
					{
					  m = i;
					}
			}
			for (i = l + 3;i > m + 3;i--)
			{
			  s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i - 3));
			}
			s = tangible.StringFunctions.changeCharacter(s, m + 1, sub[0]);
			s = tangible.StringFunctions.changeCharacter(s, m + 2, sub[1]);
			s = tangible.StringFunctions.changeCharacter(s, m + 3, sub[2]);
			System.out.printf("%s\n",s);
	}
	}
}

