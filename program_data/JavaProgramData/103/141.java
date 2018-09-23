package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[1000]);
	char i;
	char m = 1;
	char n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	for (i = 0;i <= 100;i++)
	{
	if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a')
	{
	str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) + 'A'-'a');
	}
	}
	i = 0;
	for (i = 0;i <= 999;i++)
	{
		if (str.charAt(i) == '\0')
		{
			n = i - 1;
			break;
		}
	}
	for (i = 0;i <= n;i++)
	{
		if (str.charAt(i) == str.charAt(i + 1))
		{
			m = m + 1;
		}
		else
		{
			System.out.printf("(%c,%d)",str.charAt(i),m);
			m = 1;
			continue;
		}

	}
	return 0;
	}
}

