package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String s = new String(new char[15]);
		while (scanf("%s %s",str,substr) != EOF)
		{
			m = str.length();
			n = substr.length();
			j = 0;
			for (i = 0;i < m;i++)
			{
				if (str.charAt(i) > str.charAt(j))
				{
					j = i;
				}
			}
			for (i = 0;i <= j;i++)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, str.charAt(i));
			}
			for (i = j + 1;i < j + 1 + n;i++)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, substr.charAt(i - j - 1));
			}
			for (i = j + 1 + n;i < m + n;i++)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, str.charAt(i - n));
			}
			s = tangible.StringFunctions.changeCharacter(s, m + n, '\0');
			System.out.printf("%s\n",s);
		}
	}


}

