package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int l;
		String zfc = new String(new char[33]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	for (j = 0;j < n;j++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc = tempVar2.charAt(0);
		}
		l = zfc.length();
		i = l - 2;
		if (zfc.charAt(i) == 'e' && zfc.charAt(i + 1) == 'r')
		{
			zfc = tangible.StringFunctions.changeCharacter(zfc, i, '\0');
		}
		else if (zfc.charAt(i) == 'l' && zfc.charAt(i + 1) == 'y')
		{
			zfc = tangible.StringFunctions.changeCharacter(zfc, i, '\0');
		}
		else if (zfc.charAt(i) == 'n' && zfc.charAt(i + 1) == 'g' && zfc.charAt(i - 1) == 'i')
		{
			zfc = tangible.StringFunctions.changeCharacter(zfc, i - 1, '\0');
		}

	   System.out.printf("%s\n",zfc);

	}


	return 0;
	}
}

