package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		int i;
		while (scanf("%s %s",str,substr) != EOF)
		{
			String a = new String(new char[11]);
			int l = str.length();
			int m = 0;
			for (i = 1;i < l;i++)
			{
				if (str.charAt(m) < str.charAt(i))
				{
					m = i;
				}
			}
			for (i = m + 1;i < l;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i - m - 1, str.charAt(i));
			}
			a = tangible.StringFunctions.changeCharacter(a, l - m - 1, '\0');
			str = tangible.StringFunctions.changeCharacter(str, m + 1, '\0');
			str += substr;
			str += a;
			System.out.printf("%s\n",str);
		}
	}
}

