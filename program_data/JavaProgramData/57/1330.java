package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String zfc = new String(new char[50]);
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			p = zfc.length();
			for (int j = 0;zfc.charAt(j);j++)
			{
				if (zfc.charAt(p - 2) == 'l' && zfc.charAt(p - 1) == 'y')
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, p - 2, '\0');
				}
				else if (zfc.charAt(p - 2) == 'e' && zfc.charAt(p - 1) == 'r')
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, p - 2, '\0');
				}
				else if (zfc.charAt(p - 3) == 'i' && zfc.charAt(p - 2) == 'n' && zfc.charAt(p - 1) == 'g')
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, p - 3, '\0');
				}
			}
			System.out.printf("%s\n",zfc);
		}
		return 0;
	}



}

