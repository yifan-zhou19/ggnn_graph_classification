package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String zfc = new String(new char[MAX + 1]);
		char a = 'A';
		char b = 'T';
		char c = 'C';
		char d = 'G';
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

			for (j = 0;zfc.charAt(j);j++)
			{
				if (zfc.charAt(j) == a)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, j, b);
					continue;
				}

				if (zfc.charAt(j) == b)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, j, a);
					continue;
				}

				if (zfc.charAt(j) == c)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, j, d);
					continue;
				}

				if (zfc.charAt(j) == d)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, j, c);
					continue;
				}

			}
				System.out.printf("%s\n",zfc);
		}

		return 0;
	}




}

