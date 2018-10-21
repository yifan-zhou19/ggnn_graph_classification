package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String zfc = new String(new char[300]);
	int len;

		for (int i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc = tempVar2.charAt(0);
		}



				len = zfc.length();
		  for (int j = 0;j < len;j++)
		  {
			 if (zfc.charAt(j) == 'A')
			 {
			   zfc = tangible.StringFunctions.changeCharacter(zfc, j, 'T');
			 }
			  else if (zfc.charAt(j) == 'T')
			  {
			   zfc = tangible.StringFunctions.changeCharacter(zfc, j, 'A');
			  }
			 else if (zfc.charAt(j) == 'G')
			 {
			   zfc = tangible.StringFunctions.changeCharacter(zfc, j, 'C');
			 }
			 else if (zfc.charAt(j) == 'C')
			 {
			   zfc = tangible.StringFunctions.changeCharacter(zfc, j, 'G');
			 }
		  }
			  System.out.printf("%s\n",zfc);

		}
		 return 0;
	}

}

