package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		int n;
		int i;
		int j;
		int k;
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
		  k = a.length();
		  for (j = 0;j <= k;j++)
		  {
			if (a.charAt(j) == 'A')
			{
			   b = tangible.StringFunctions.changeCharacter(b, j, 'T');
			}
			else if (a.charAt(j) == 'T')
			{
			   b = tangible.StringFunctions.changeCharacter(b, j, 'A');
			}
			else if (a.charAt(j) == 'C')
			{
			   b = tangible.StringFunctions.changeCharacter(b, j, 'G');
			}
			else if (a.charAt(j) == 'G')
			{
			   b = tangible.StringFunctions.changeCharacter(b, j, 'C');
			}
			else if (a.charAt(j) == '\0')
			{
			   b = tangible.StringFunctions.changeCharacter(b, j, '\0');
			}
		  }
		  System.out.printf("%s\n",b);
		}
		return 0;
	}




}

