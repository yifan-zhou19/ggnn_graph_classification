package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String s = new String(new char[300]);
	int len;
	for (i = 0; i < n; i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   s = tempVar2.charAt(0);
	   }
	   len = s.length();
	   if (len > 3)
	   {
		if (s.charAt(len - 1) == 'r' && s.charAt(len - 2) == 'e')
		{
		   s = tangible.StringFunctions.changeCharacter(s, len - 2, '\0');
		}
		else if (s.charAt(len - 1) == 'y' && s.charAt(len - 2) == 'l')
		{
			 s = tangible.StringFunctions.changeCharacter(s, len - 2, '\0');
		}
		else if (s.charAt(len - 1) == 'g' && s.charAt(len - 2) == 'n' && s.charAt(len - 3) == 'i')
		{
		   s = tangible.StringFunctions.changeCharacter(s, len - 3, '\0');
		}
		  System.out.printf("%s\n", s);
	   }
		else
		{
			System.out.printf("%s\n", s);
		}
	}
	return 0;
	}
}

