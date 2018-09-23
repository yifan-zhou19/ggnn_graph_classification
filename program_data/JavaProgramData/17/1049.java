package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[160]);
		String ans = new String(new char[160]);
		int[] st = new int[160];
		int i;
		int si;
		for (;scanf("%s",s) != EOF;)
		{
			for (ans[0] = ' ', si = i = 0;i < s.length();si -= (s.charAt(i) == ')' && si>0), ans[++i] = ' ')
			{
				if (s.charAt(i) == '(')
				{
					st[si++] = i;
				}
				else if (s.charAt(i) == ')')
				{
					ans = tangible.StringFunctions.changeCharacter(ans, i, (si > 0)?' ':'?');
				}
			}
			for (ans[s.length()] = '\0',i = 0;i < si;i++)
			{
				ans = tangible.StringFunctions.changeCharacter(ans, st[i], '$');
			}
			System.out.printf("%s\n%s\n",s,ans);
		}
	}
}

