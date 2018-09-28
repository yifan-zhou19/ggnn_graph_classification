package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int m;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String a = new String(new char[260]);
	  String b = new String(new char[260]);
	  for (i = 0;i < n;i++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = tempVar2.charAt(0);
	   }

	   for (j = 0,k = 0;a.charAt(j) != '\0';j++,k++)
	   {
		if (a.charAt(j) == 'A')
		{
		 b = tangible.StringFunctions.changeCharacter(b, k, 'T');
		}
		else if (a.charAt(j) == 'T')
		{
		  b = tangible.StringFunctions.changeCharacter(b, k, 'A');
		}
		else if (a.charAt(j) == 'G')
		{
		  b = tangible.StringFunctions.changeCharacter(b, k, 'C');
		}
		else if (a.charAt(j) == 'C')
		{
		  b = tangible.StringFunctions.changeCharacter(b, k, 'G');
		}
	   }
	   b = tangible.StringFunctions.changeCharacter(b, k, '\0');
	   System.out.printf("%s\n",b);
	  }
		   return 0;
	}


}

