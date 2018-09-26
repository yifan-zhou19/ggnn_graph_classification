package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "";
		final String s1 = "";
		int n;
		int i;
		int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		final String s = "";
		final String s1 = "";
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		for (j = 0;s.charAt(j) != '\0';j++)
		{
		  if (s.charAt(j) == 'A')
		  {
			  s1 = tangible.StringFunctions.changeCharacter(s1, j, 'T');
		  }
		  if (s.charAt(j) == 'T')
		  {
			  s1 = tangible.StringFunctions.changeCharacter(s1, j, 'A');
		  }
		  if (s.charAt(j) == 'C')
		  {
			  s1 = tangible.StringFunctions.changeCharacter(s1, j, 'G');
		  }
		  if (s.charAt(j) == 'G')
		  {
			  s1 = tangible.StringFunctions.changeCharacter(s1, j, 'C');
		  }
		}
	  System.out.printf("%s\n",s1);

	}


	return 0;
	}
}

