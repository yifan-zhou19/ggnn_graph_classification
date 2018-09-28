package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int LEN;
		String zfc = new String(new char[51]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			LEN = zfc.length();
			switch (zfc.charAt(LEN - 1))
			{
			case 'r':
				zfc = tangible.StringFunctions.changeCharacter(zfc, LEN - 2, '\0');
				break;
			case 'y':
				zfc = tangible.StringFunctions.changeCharacter(zfc, LEN - 2, '\0');
				break;
			case 'g':
				zfc = tangible.StringFunctions.changeCharacter(zfc, LEN - 3, '\0');
				break;
			}
			System.out.printf("%s\n",zfc);
		}
		return 0;
	}
}

