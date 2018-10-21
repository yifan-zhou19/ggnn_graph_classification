package <missing>;

public class GlobalMembers
{
	public static String sen = new String(new char[256]);
	public static int len;
	public static int i;
	public static int del()
	{
		int j;
		for (j = i + 1;j < len;j++)
		{
			if (sen.charAt(j) == 32)
			{
			sen = tangible.StringFunctions.changeCharacter(sen, j, 126);
			}
			else
			{
			return 0;
			}
		}
		return 0;
	}
	public static int Main()
	{
	sen = new Scanner(System.in).nextLine();
	len = sen.length();
	for (i = 0;i < len;i++)
	{
	if (sen.charAt(i) == 32)
	{
	del();
	}
	}
	for (i = 0;i < len;i++)
	{
		if (sen.charAt(i) != 126)
		{
		System.out.printf("%c",sen.charAt(i));
		}
	}
	return 0;
	}
}

