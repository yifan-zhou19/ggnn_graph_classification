package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[20]);
		String substr = new String(new char[3]);
		String s = new String(new char[20]);
		int i;
		int j = 0;
		int k;
		int m;
		while (scanf("%s %s",str,substr) == 2)
		{
			m = str.length();
			for (i = 0;i < m;i++)
			{
				if (str.charAt(i) > str.charAt(j))
				{
					j = i;
				}
			}
			for (i = m - 1;i > j;i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
			}
			for (i = j + 1,k = 0;i < j + 4;i++,k++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, substr.charAt(k));
			}
			str = tangible.StringFunctions.changeCharacter(str, m + 3, '\0');
			System.out.printf("%s\n",str);
		}
	}

}

