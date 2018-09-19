package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
	while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (substr = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
	{
	String a = new String(new char[14]);
	int len_a = str.length();
	int len_b = substr.length();
	int i;
	int j;
	char max = 0;
	for (i = 0;i < len_a;i++) //?????
	{
	if (str.charAt(i) > max)
	{
		max = str.charAt(i);
	}
	else
	{
		continue;
	}
	}
	for (i = 0;i < len_a;i++)
	{
	if (str.charAt(i) == max)
	{
	if (i == len_a - 1) //????????????,????????,?????
	{
	for (j = len_a;j <= len_a + len_b;j++)
	{
	str = tangible.StringFunctions.changeCharacter(str, j, substr.charAt(j - len_a));
	}
	}
	else
	{
	for (j = 0;j < len_a - i - 1;j++)
	{
	a = tangible.StringFunctions.changeCharacter(a, j, str.charAt(j + i + 1));
	}
	for (j = i + 1;j < i + len_b + 1;j++)
	{
	str = tangible.StringFunctions.changeCharacter(str, j, substr.charAt(j - i - 1));
	}
	for (j = i + len_b + 1;j < len_a + len_b;j++)
	{
	str = tangible.StringFunctions.changeCharacter(str, j, a.charAt(j - i - len_b - 1));
	}
	str = tangible.StringFunctions.changeCharacter(str, j, '\0');
	}
	break;
	}
	else
	{
		continue;
	}
	}
	System.out.print(str);
	System.out.print("\n");
	}
	return 0;
	}
}

