package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int l;
	  int j;
	  String s = new String(new char[20]);
	  String c = new String(new char[20]);
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
		l = s.length();
		for (j = 0;j < l;j++)
		{
		  if (s.charAt(j) == 'e' || s.charAt(j) == 'l' || s.charAt(j) == 'i')
		  {
			c = s.Substring(j);
			if (strcmp(c,"er") == 0 || strcmp(c,"ly") == 0 || strcmp(c,"ing") == 0)
			{
			  s = tangible.StringFunctions.changeCharacter(s, j, '\0');
			  System.out.printf("%s\n",s);
			}
		  }
		}
	  }
	  return 0;
	}
}

