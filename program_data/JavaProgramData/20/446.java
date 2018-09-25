package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
		while (scanf("%s%s",str,substr) != EOF)
		{
				int i;
				int p = 0;
				int ch = 0;
				int len = str.length();
				for (i = 0; i < len; i++)
				{
					if (str.charAt(i) > ch)
					{
						ch = str.charAt(i);
						p = i;
					}
				}
				for (i = 0; i < len; i++)
				{
					if (str.charAt(i) == str.charAt(p) && i < p)
					{
						p = i;
						break;
					}
				}
				for (i = len;i >= p + 1;i--)
				{
					str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
				}
				for (i = p + 1;i < p + 4;i++)
				{
					str = tangible.StringFunctions.changeCharacter(str, i, substr.charAt(i - 1 - p));
				}
				System.out.printf("%s\n",str);
		}
	}

}

