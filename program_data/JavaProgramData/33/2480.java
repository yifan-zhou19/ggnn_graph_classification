package <missing>;

public class GlobalMembers
{
	public static char b(char f)
	{
	   if (f == 'A')
	   {
		   return 'T';
	   }
	   if (f == 'T')
	   {
		   return 'A';
	   }
	   if (f == 'C')
	   {
		   return 'G';
	   }
	   if (f == 'G')
	   {
		   return 'C';
	   }
	}
	public static int Main()
	{
	   String s = new String(new char[256]);
	   int i;
	   int j;
	   int n;
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
			   s = tempVar2.charAt(0);
		   }
		   for (i = 0;s.charAt(i);i++)
		   {
			   s = tangible.StringFunctions.changeCharacter(s, i, b(s.charAt(i)));
		   }
		   System.out.printf("%s\n",s);
	   }
	return 0;
	}
}

