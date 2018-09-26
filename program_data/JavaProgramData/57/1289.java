package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[33]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
		  m = a.length();
		  if ((a.charAt(m - 2) == 'e' && a.charAt(m - 1) == 'r') || (a.charAt(m - 2) == 'l' && a.charAt(m - 1) == 'y'))
		  {
			  a = tangible.StringFunctions.changeCharacter(a, m - 2, '\0');
		  }
		  else
		  {
			  a = tangible.StringFunctions.changeCharacter(a, m - 3, '\0');
		  }
		  System.out.printf("%s\n",a);
		}
		return 0;
	}
}

