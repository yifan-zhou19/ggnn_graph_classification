package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int q;
		String s = new String(new char[51]);
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
			   s = tempVar2.charAt(0);
		   }
		   q = 0;
		   for (p = 0;s.charAt(p) != '\0';p++)
		   {
			   q++;
		   }
		   if (s.charAt(q - 2) == 'e' && s.charAt(q - 1) == 'r')
		   {
			   s = tangible.StringFunctions.changeCharacter(s, q - 2, '\0');
		   }
		   else if (s.charAt(q - 3) == 'i' && s.charAt(q - 2) == 'n' && s.charAt(q - 1) == 'g')
		   {
			   s = tangible.StringFunctions.changeCharacter(s, q - 3, '\0');
		   }
		   else if (s.charAt(q - 2) == 'l' && s.charAt(q - 1) == 'y')
		   {
			   s = tangible.StringFunctions.changeCharacter(s, q - 2, '\0');
		   }
		   System.out.printf("%s\n",s);
		}
		return 0;
	}
}

