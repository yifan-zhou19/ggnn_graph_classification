package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[256]);
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			for (i = 0;zfc.charAt(i) != '\0';i++)
			{
				if (zfc.charAt(i) == 'A')
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, i, 'T');
				}
				else if (zfc.charAt(i) == 'T')
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, i, 'A');
				}
				else if (zfc.charAt(i) == 'C')
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, i, 'G');
				}
				else if (zfc.charAt(i) == 'G')
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, i, 'C');
				}
			}
			System.out.printf("%s\n",zfc);
		}
	return 0;
	}


}

