package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int l = 0;
	int m = 0;
	int i = 0;
	String str = new String(new char[20]);
	String sub = new String(new char[5]);

	while (scanf("%s%s",str,sub) != EOF)
	{
	l = str.length();

	for (i = 0;str.charAt(i) != '\0';i++)
	{
		if (str.charAt(i) > str.charAt(m))
		{
			m = i;
		}
	}

	for (i = l + 2;i >= m + 4;i--)
	{
		str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i - 3));
	}

	str = tangible.StringFunctions.changeCharacter(str, m + 1, sub.charAt(0));
	str = tangible.StringFunctions.changeCharacter(str, m + 2, sub.charAt(1));
	str = tangible.StringFunctions.changeCharacter(str, m + 3, sub.charAt(2));
	str = tangible.StringFunctions.changeCharacter(str, l + 3, '\0');

	System.out.printf("%s\n",str);
	}
	}

}

