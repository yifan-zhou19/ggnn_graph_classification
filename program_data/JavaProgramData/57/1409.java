package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String zfc = new String(new char[33]);
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
			for (j = 0;zfc.charAt(j) != '\0';j++)
			{
				if (zfc.charAt(j + 1) == '\0')
				{
					if (zfc.charAt(j) == 'r')
					{
						zfc = tangible.StringFunctions.changeCharacter(zfc, j - 1, '\0');
					}
					else if (zfc.charAt(j) == 'g')
					{
						zfc = tangible.StringFunctions.changeCharacter(zfc, j - 2, '\0');
					}
					else if (zfc.charAt(j) == 'y')
					{
						zfc = tangible.StringFunctions.changeCharacter(zfc, j - 1, '\0');
					}
				}
			}
			System.out.printf("%s\n",zfc);



		}




	return 0;
	}

}

