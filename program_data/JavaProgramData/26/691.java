package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	String str = new String(new char[101]);
	str = new Scanner(System.in).nextLine();
	for (i = 0;i < str.length();i++)
	{
		if (str.charAt(i) == ' ')
		{
			if (str.charAt(i + 1) == ' ')
			{
				for (j = i;j <= str.length();j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
				}
				i--;
			}

		}

	}
	System.out.printf("%s",str);
	}
}

