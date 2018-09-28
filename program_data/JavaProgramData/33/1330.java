package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String zfc = new String(new char[256]);
		String jg = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
				for (j = 0; zfc.charAt(j) != '\0'; j++)
				{
				 if (zfc.charAt(j) == 'A')
				 {
					 jg = tangible.StringFunctions.changeCharacter(jg, j, 'T');
				 }
				 else if (zfc.charAt(j) == 'T')
				 {
					 jg = tangible.StringFunctions.changeCharacter(jg, j, 'A');
				 }
				 else if (zfc.charAt(j) == 'C')
				 {
					 jg = tangible.StringFunctions.changeCharacter(jg, j, 'G');
				 }
				 else
				 {
					 jg = tangible.StringFunctions.changeCharacter(jg, j, 'C');
				 }
				}
				jg = tangible.StringFunctions.changeCharacter(jg, j, '\0');
				System.out.printf("%s\n",jg);
		}

		return 0;
	}


}

