package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		int i;
		int j;
		int f = 0;
		for (i = 0;i < len - f;i++)
		{
			if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
			{
				for (j = i;j < len - f;j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
					i = 0;
				}
				str = tangible.StringFunctions.changeCharacter(str, len - f - 1, '\0');
				f++;
			}
		}
		System.out.println(str);
		return 0;
	}
}

