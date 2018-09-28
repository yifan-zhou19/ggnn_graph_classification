package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	String zfc = new String(new char[6]);
	String exc = new String(new char[6]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		zfc = tempVar.charAt(0);
	}
	a = zfc.length();
	for (int i = 0;i < a / 2;i++)
	{
	exc = tangible.StringFunctions.changeCharacter(exc, i, zfc.charAt(i));
	zfc = tangible.StringFunctions.changeCharacter(zfc, i, zfc.charAt(a - i - 1));
	zfc = tangible.StringFunctions.changeCharacter(zfc, a - i - 1, exc.charAt(i));
	}
	System.out.printf("%s\n",zfc);
	return 0;
	}
}

