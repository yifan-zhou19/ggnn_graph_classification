package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ishuiwen = char * p;
		String s = new String(new char[500]);
		final String sub = "0";
		int i;
		int j;
		int l;
		int len;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (l = 2;l <= len;l++)
		{
			for (i = 0;i <= len - l;i++)
			{
				for (j = 0;j < l;j++)
				{
					sub = tangible.StringFunctions.changeCharacter(sub, j, s.charAt(i + j));
				}
				sub = tangible.StringFunctions.changeCharacter(sub, j, '\0');
			tangible.RefObject<String> tempRef_sub = new tangible.RefObject<String>(sub);
				if (ishuiwen(tempRef_sub) != 0)
				{
					sub = tempRef_sub.argValue;
					System.out.printf("%s\n",sub);
				}
				else
				{
					sub = tempRef_sub.argValue;
				}
			}
		}
		return 0;
	}
	public static int ishuiwen(tangible.RefObject<String> p)
	{
		int len;
		int i;
		len = p.argValue.length();
		for (i = 0;i < len / 2;i++)
		{
			if (*(p.argValue.Substring(i)) != *(p.argValue.Substring(len) - 1 - i))
			{
				return 0;
			}
		}
		return 1;
	}
}

