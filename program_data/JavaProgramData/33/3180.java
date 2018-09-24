package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		String zfc = new String(new char[256]);
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
		  else if (zfc.charAt(i) == 'G')
		  {
			  zfc = tangible.StringFunctions.changeCharacter(zfc, i, 'C');
		  }
		  else if (zfc.charAt(i) == 'C')
		  {
			  zfc = tangible.StringFunctions.changeCharacter(zfc, i, 'G');
		  }
		}
	   System.out.printf("%s\n",zfc);

	}


	return 0;
	}
}

