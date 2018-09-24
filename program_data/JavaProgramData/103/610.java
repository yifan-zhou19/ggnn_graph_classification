package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[5000]);
	   char t;
	   int la;
	   int i;
	   int j;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   la = a.length();
	   for (i = 0 ; i < la ; i++)
	   {
		if ('a' <= a.charAt(i) && a.charAt(i) <= 'z')
		{
		 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a' + 'A');
		}
	   }
	   for (i = 0 ; i < la ;)
	   {
		 t = a.charAt(i++), j = 1;
		 for (; a.charAt(i) == t ; i++, j++)
		 {
			 ;
		 }
		 System.out.printf("(%c,%d)", t, j);
	   }
	  // getchar (); getchar ();
	   return 0;
	}

}

