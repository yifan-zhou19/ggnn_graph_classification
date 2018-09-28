package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
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
			  String a = new String(new char[260]);
			  String b = new String(new char[260]);
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = tempVar2.charAt(0);
			  }
			  int l;
			  l = a.length();
			  for (j = 0;j < l;j++)
			  {
					switch (a.charAt(j))
					{
						 case'A':
							 b = tangible.StringFunctions.changeCharacter(b, j, 'T');
							 break;
						 case'T':
							 b = tangible.StringFunctions.changeCharacter(b, j, 'A');
							 break;
						 case'C':
							 b = tangible.StringFunctions.changeCharacter(b, j, 'G');
							 break;
						 case'G':
							 b = tangible.StringFunctions.changeCharacter(b, j, 'C');
							 break;
					}
			  }
			  for (j = 0;j < l - 1;j++)
			  {
				  System.out.printf("%c",b.charAt(j));
			  }
			  System.out.printf("%c\n",b.charAt(l - 1));
		}
		return 0;
	}
}

