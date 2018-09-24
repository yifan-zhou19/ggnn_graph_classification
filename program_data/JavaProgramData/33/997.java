package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int t;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String a = new String(new char[300]);
	 String b = new String(new char[300]);
	 for (i = 0;i < n;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = tempVar2.charAt(0);
	   }
	   t = a.length();
	   for (j = 0;j < t;j++)
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
	   b = tangible.StringFunctions.changeCharacter(b, t, '\0');
	   System.out.printf("%s\n",b);
	 }


	return 0;
	}

}

