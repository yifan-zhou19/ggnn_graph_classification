package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		int j;
		int k;
		int l;
		final String str = "";
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == ' ')
			{
				for (j = i + 1;str.charAt(j) == ' ';j++)
				{
					;
				}
				l -= j - i - 1;
				for (k = i + 1;k < l;k++)
				{
					str = tangible.StringFunctions.changeCharacter(str, k, str.charAt(k + j - i - 1));
				}
				str = tangible.StringFunctions.changeCharacter(str, k, '\0');
			}
		}
		System.out.printf("%s",str);
		return 0;
	}

}

