package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int l;
	  int n;
	  int j;
	  String zfc = new String(new char[300]);
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
	   l = zfc.length();
	  for (j = 0;j < l;j++)
	  {
	   if (zfc.charAt(j) == 'A')
	   {
		   zfc = tangible.StringFunctions.changeCharacter(zfc, j, 'T');
	   }
	   else if (zfc.charAt(j) == 'T')
	   {
		   zfc = tangible.StringFunctions.changeCharacter(zfc, j, 'A');
	   }
	   else if (zfc.charAt(j) == 'C')
	   {
		   zfc = tangible.StringFunctions.changeCharacter(zfc, j, 'G');
	   }
	   else if (zfc.charAt(j) == 'G')
	   {
		   zfc = tangible.StringFunctions.changeCharacter(zfc, j, 'C');
	   }
	  }
	   System.out.printf("%s\n",zfc);
	  }

	return 0;
	}
}

