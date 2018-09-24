package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[15]);
		String substr = new String(new char[5]);
		char a;
		int i;
		int j;
		int n;
		int m;
		int l;
		while (scanf("%s%s",str,substr) != EOF)
		{
			n = substr.length();
			m = str.length();
			a = 0;
			for (i = 0;i < m;i++)
			{
				if (a < str.charAt(i))
				{
					a = str.charAt(i);
				}
			}
			for (j = 0;;j++)
			{
				if (a == str.charAt(j))
				{
					break;
				}
			}
			for (l = m - 1;l >= j + 1;l--)
			{
				str = tangible.StringFunctions.changeCharacter(str, l + n, str.charAt(l));
			}
			for (l = j + 1;l <= j + n;l++)
			{
				str = tangible.StringFunctions.changeCharacter(str, l, substr.charAt(l - j - 1));
			}
			str = tangible.StringFunctions.changeCharacter(str, m + n, '\0');
			System.out.printf("%s\n",str);
		}
	}
}

