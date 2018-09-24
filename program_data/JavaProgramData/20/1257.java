package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
		int max = 0;
		int i;
		int l;
		while (scanf("%s%s",str,substr) != EOF)
		{
			l = str.length();
			for (i = 0;i < l;i++)
			{
				if (str.charAt(i) > str.charAt(max))
				{
					max = i;
				}
			}
			for (i = l - 1;i >= max + 1;i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
			}
			for (i = 1;i <= 3;i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, max + i, substr.charAt(i - 1));
			}
			str = str.substring(0, l + 3);
			System.out.println(str);
		}
	}

}

