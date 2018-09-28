package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[5]);
	char i;
	char p;
	for (i = 0;i < 5;i++)
	{
	String tempVar = ConsoleInput.scanfRead(null, 1);
	if (tempVar != null)
	{
		a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
	}
	}
	p = 0;
	for (i = 0;i < 5;i++)
	{
		if (a.charAt(i) != '\n')
		{
			p = p + 1;
		}
	}
	for (i = p - 1;i >= 0;i--)
	{
	System.out.printf("%c",a.charAt(i));
	}
	}
}

