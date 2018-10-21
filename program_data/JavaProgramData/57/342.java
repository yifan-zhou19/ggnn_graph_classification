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
		  String a = new String(new char[100]);
		  String b = new String(new char[100]);
		  for (int i = 0;i < n;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a = tempVar2.charAt(0);
				  }
				  int m;
				  m = a.length();
				  if (a.charAt(m - 2) == 'l' || a.charAt(m - 2) == 'e')
				  {
								 for (int k = 0;k < m - 2;k++)
								 {
									  b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(k));
								 }
								 b = tangible.StringFunctions.changeCharacter(b, m - 2, '\0');
				  }
				  if (a.charAt(m - 3) == 'i')
				  {
								 for (int k = 0;k < m - 3;k++)
								 {
									  b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(k));
								 }
								 b = tangible.StringFunctions.changeCharacter(b, m - 3, '\0');
				  }
				  System.out.printf("%s\n",b);
		  }
	}

}

