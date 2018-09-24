package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String d = new String(new char[260]);
	  int i = 0;
	  int j = 0;
	  int n;
	  char A;
	  char T;
	  char G;
	  char C;
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
			  d = tempVar2.charAt(0);
		  }
	  for (i = 0;d.charAt(i) != '\0';i++)
	  {
	   if (d.charAt(i) == 'A')
	   {
		   d = tangible.StringFunctions.changeCharacter(d, i, 'T');
	   }
	   else if (d.charAt(i) == 'T')
	   {
		   d = tangible.StringFunctions.changeCharacter(d, i, 'A');
	   }
	   else if (d.charAt(i) == 'G')
	   {
		   d = tangible.StringFunctions.changeCharacter(d, i, 'C');
	   }
	   else if (d.charAt(i) == 'C')
	   {
		   d = tangible.StringFunctions.changeCharacter(d, i, 'G');
	   }
	  }
	  System.out.printf("%s\n",d);
	  }
		 return 0;
	}

}

