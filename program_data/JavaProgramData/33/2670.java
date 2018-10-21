package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (int j = 0;j < n;j++)
		  {
				  String a = new String(new char[500]);
				  String b = new String(new char[500]);
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a = tempVar2.charAt(0);
				  }
				  int len = a.length();
				  for (int i = 0;i < len;i++)
				  {
						  if (a.charAt(i) == 'A')
						  {
							  b = tangible.StringFunctions.changeCharacter(b, i, 'T');
						  }
						  if (a.charAt(i) == 'T')
						  {
							  b = tangible.StringFunctions.changeCharacter(b, i, 'A');
						  }
						  if (a.charAt(i) == 'G')
						  {
							  b = tangible.StringFunctions.changeCharacter(b, i, 'C');
						  }
						  if (a.charAt(i) == 'C')
						  {
							  b = tangible.StringFunctions.changeCharacter(b, i, 'G');
						  }
				  }
				  b = tangible.StringFunctions.changeCharacter(b, len, '\0');
				  System.out.printf("%s\n",b);
		  }
	}
}

