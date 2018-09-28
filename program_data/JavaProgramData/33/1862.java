package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int l;
	 int j;
	 String a = new String(new char[255]);
	 final String b = "";
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
		  a = tempVar2.charAt(0);
	  }
	  l = a.length();
	  for (j = 0;j < l;j++)
	  {
		if (a.charAt(j) == 'A')
		{
		b = tangible.StringFunctions.changeCharacter(b, j, 'T');
		}
		if (a.charAt(j) == 'T')
		{
		b = tangible.StringFunctions.changeCharacter(b, j, 'A');
		}
		if (a.charAt(j) == 'C')
		{
		b = tangible.StringFunctions.changeCharacter(b, j, 'G');
		}
		if (a.charAt(j) == 'G')
		{
		b = tangible.StringFunctions.changeCharacter(b, j, 'C');
		}
	  }
	  System.out.printf("%s\n",b);
	  for (j = 0;j < l;j++)
	  {
	   b = tangible.StringFunctions.changeCharacter(b, j, '\0');
	  }
	 }
	 return 0;
	}



}

