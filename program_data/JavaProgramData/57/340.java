package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int i;
		String s = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  s = tempVar2.charAt(0);
		  }
		  l = s.length();
		  s = tangible.StringFunctions.changeCharacter(s, l, '\0');
		  if (s.charAt(l - 1) == 'r' && s.charAt(l - 2) == 'e')
		  {
		  s = tangible.StringFunctions.changeCharacter(s, l - 2, '\0');
		  }
		  else if (s.charAt(l - 1) == 'y' && s.charAt(l - 2) == 'l')
		  {
			  s = tangible.StringFunctions.changeCharacter(s, l - 2, '\0');
		  }
		  else
		  {
			  s = tangible.StringFunctions.changeCharacter(s, l - 3, '\0');
		  }
		  System.out.printf("%s\n",s);
		}
		  System.in.read();
		  System.in.read();
	}

}

