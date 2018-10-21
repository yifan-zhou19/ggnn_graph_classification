package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int i;
	   int n;
	   int k;
	   int j;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String s = new String(new char[256]);
	   for (i = 1;i < n + 1;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   s = tempVar2.charAt(0);
		   }
		   s.length();
		   k = s.length();
		   String ss = new String(new char[256]);
		   for (j = 0;j < k;j++)
		   {
			   if (s.charAt(j) == 'A')
			   {
				   ss = tangible.StringFunctions.changeCharacter(ss, j, 'T');
			   }
			   if (s.charAt(j) == 'T')
			   {
				   ss = tangible.StringFunctions.changeCharacter(ss, j, 'A');
			   }
			   if (s.charAt(j) == 'G')
			   {
				   ss = tangible.StringFunctions.changeCharacter(ss, j, 'C');
			   }
			   if (s.charAt(j) == 'C')
			   {
				   ss = tangible.StringFunctions.changeCharacter(ss, j, 'G');
			   }
		   }
		   ss = tangible.StringFunctions.changeCharacter(ss, j, '\0');
		   System.out.printf("%s\n",ss);
	   }
	}


}

