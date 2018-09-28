package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int len;
		String zfc = new String(new char[33]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			zfc = new Scanner(System.in).nextLine();
			len = zfc.length();
			if (zfc.charAt(len - 1) == 'r')
			{
				if (zfc.charAt(len - 2) == 'e')
				{

					zfc = tangible.StringFunctions.changeCharacter(zfc, len - 2, '\0');
				}
			}
			else if (zfc.charAt(len - 1) == 'g')
			{
				if (zfc.charAt(len - 2) == 'n')
				{
					if (zfc.charAt(len - 3) == 'i')
					{
						 zfc = tangible.StringFunctions.changeCharacter(zfc, len - 3, '\0');

					}
				}
			}
			else if (zfc.charAt(len - 1) == 'y')
			{
				if (zfc.charAt(len - 2) == 'l')
				{

					zfc = tangible.StringFunctions.changeCharacter(zfc, len - 2, '\0');
				}
			}
		System.out.printf("%s\n",zfc);
		}

		return 0;
	}


}

