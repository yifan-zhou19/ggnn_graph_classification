package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[5]);
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		for (i = 0;i < zfc.length() / 2;i++)
		{
			a = zfc.charAt(i);
			zfc = tangible.StringFunctions.changeCharacter(zfc, i, zfc.charAt(zfc.length() - i - 1));
			zfc = tangible.StringFunctions.changeCharacter(zfc, zfc.length() - i - 1, a);
		}
		System.out.printf("%s",zfc);
		return 0;
	}
}

