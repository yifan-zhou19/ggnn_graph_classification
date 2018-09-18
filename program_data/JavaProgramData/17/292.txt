package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[] p = new int[109];
		String s = new String(new char[110]);
		String t = new String(new char[110]);
		while (scanf("%s",s) != EOF)
		{
		for (i = 0;i < 109;i++)
		{
			p[i] = 0;
		}
		t = s;
		for (i = 0,j = 0;i < s.length();i++)
		{
			if (s.charAt(i) == '(')
			{
				p[j++] = i;
			}
			if (s.charAt(i) == ')' && j > 0)
			{
				s = tangible.StringFunctions.changeCharacter(s, p[j - --1], s[i] = ' ');
			}
			if (s.charAt(i) != '(' && s.charAt(i) != ')')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, ' ');
			}
		}
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) == '(')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '$');
			}
			if (s.charAt(i) == ')')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '?');
			}
		}
		System.out.printf("%s\n%s\n",t,s);
		}
	}

}

