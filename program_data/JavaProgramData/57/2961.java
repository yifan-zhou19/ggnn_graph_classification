package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str = new String(new char[100]);
	  int n;
	  int i;
	  int d;
	  int c;
	  int m;
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
			 str = tempVar2.charAt(0);
		 }
		 m = str.length();
		   c = str.length() - 2;
		   d = str.length() - 3;
		 if (str.charAt(c) == 'e' || str.charAt(c) == 'l')
		 {
			str = tangible.StringFunctions.changeCharacter(str, c, '\0');
		 }
		 else if (str.charAt(d) == 'i')
		 {
			 str = tangible.StringFunctions.changeCharacter(str, d, '\0');
		 }
		 System.out.printf("%s\n",str);
	  }
	   return 0;
	}

}

