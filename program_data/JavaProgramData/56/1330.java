package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[100]);
		char exc;
		int len;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
			len = zfc.length();
	for (i = 0; i < len / 2; i++)
	{
		exc = zfc.charAt(i);
		zfc = tangible.StringFunctions.changeCharacter(zfc, i, zfc.charAt(len - 1 - i));
		zfc = tangible.StringFunctions.changeCharacter(zfc, len - 1 - i, exc);
	}

	System.out.printf("%s", zfc);

		return 0;
	}

}

