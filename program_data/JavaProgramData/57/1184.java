package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
	   int n;
	   int i;
	   int len;
	   String a = new String(new char[MAX + 1]);
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
		len = a.length();
		if (a.charAt(len - 1) == 'g')
		{
		 a = tangible.StringFunctions.changeCharacter(a, len - 3, '\0');
		}
		 else
		 {
		  a = tangible.StringFunctions.changeCharacter(a, len - 2, '\0');
		 }
	   System.out.printf("%s\n",a);
	   }
	   return 0;
	  }


}

