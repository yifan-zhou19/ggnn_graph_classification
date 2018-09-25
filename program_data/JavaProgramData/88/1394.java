package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int i;
		int j = 0;
		int l;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		str.charAt(l + 1) == ' ';
		for (i = 0;i <= l;i++)
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				str = tangible.StringFunctions.changeCharacter(str, j++, str.charAt(i));
			}
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9' && (str.charAt(i + 1)>'9' || str.charAt(i + 1) < '0'))
			{
				str = tangible.StringFunctions.changeCharacter(str, j++, '\n');
			}
			if (str.charAt(i) == '\0')
			{
				str = tangible.StringFunctions.changeCharacter(str, j, '\0');
			}
		}
			for (j = 0;str.charAt(j) != '\0';j++)
			{
			System.out.printf("%c",str.charAt(j));
			}
			return 0;
	}

}

