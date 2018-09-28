package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int a;
	int b;
	int len;
	int len2;
	int x;
	int de = 0;
	String str = new String(new char[1025]);
	String str2 = new String(new char[1025]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		str = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	len = str.length();

	for (i = 0;i < len;i++)
	{
	if (str.charAt(i) >= 97)
	{
		x = str.charAt(i) + 10 - 'a';
	}
	else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
	{
		x = str.charAt(i) + 10 - 'A';
	}
	else
	{
		x = str.charAt(i) - '0';
	}
	de = de * a + x;
	}
	for (i = 0;i < 1025;i++)
	{
	if (de % b > 9)
	{
		str2 = tangible.StringFunctions.changeCharacter(str2, i, de % b + 55);
	}
	else
	{
		str2 = tangible.StringFunctions.changeCharacter(str2, i, de % b + 48);
	}
	de = de / b;
	if (de == 0)
	{
		str2 = tangible.StringFunctions.changeCharacter(str2, i + 1, '\0');
		break;
	}
	}

	len2 = str2.length();
	for (i = 0;i < len2;i++)
	{
	System.out.printf("%c",str2.charAt(len2 - i - 1));
	}
	System.out.print("\n");
	}
}

