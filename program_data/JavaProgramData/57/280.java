package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int l;
		  String str = new String(new char[1000]);
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
				   l = str.length();
				   if ((str.charAt(l - 1) == 'y' && str.charAt(l - 2) == 'l') || (str.charAt(l - 1) == 'r' || str.charAt(l - 2) == 'e'))
				   {
				   str = tangible.StringFunctions.changeCharacter(str, l - 2, '\0');
				   }
				   else if ((str.charAt(l - 1) == 'g' && str.charAt(l - 2) == 'n' && str.charAt(l - 3) == 'i'))
				   {
				   str = tangible.StringFunctions.changeCharacter(str, l - 3, '\0');
				   }
				   System.out.printf("%s\n",str);
		  }
		  System.in.read();
		  System.in.read();
	}
}

