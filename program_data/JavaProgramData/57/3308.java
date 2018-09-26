package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int i;
		int len;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   s = tempVar.charAt(0);
		   }
		   len = s.length();
		   if (s.charAt(len - 1) == 'r' && s.charAt(len - 2) == 'e')
		   {
			   s = tangible.StringFunctions.changeCharacter(s, len - 2, '\0');
			   System.out.printf("%s\n",s);
			   continue;
		   }
		   if (s.charAt(len - 1) == 'y' && s.charAt(len - 2) == 'l')
		   {
			   s = tangible.StringFunctions.changeCharacter(s, len - 2, '\0');
			   System.out.printf("%s\n",s);
			   continue;
		   }
		   if (s.charAt(len - 1) == 'g' && s.charAt(len - 2) == 'n' && s.charAt(len - 3) == 'i')
		   {
			   s = tangible.StringFunctions.changeCharacter(s, len - 3, '\0');
			   System.out.printf("%s\n",s);
			   continue;
		   }
		   System.out.printf("%s\n",s);
		}
	}
}

