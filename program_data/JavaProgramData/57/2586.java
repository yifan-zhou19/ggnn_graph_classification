package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int len;
		int i;
		  String s = new String(new char[100]);
		  char[] p = {'g'};
		  String q = new String(new char[1]);
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
		  len = s.length();
		  q = tangible.StringFunctions.changeCharacter(q, 0, s.charAt(len - 1));
		  if (q.charAt(0) == 'g')
		  {
			  s = tangible.StringFunctions.changeCharacter(s, len - 1, '\0',s[len - 2] = '\0',s[len - 3] = '\0');
		  }
		  else
		  {
			  s = tangible.StringFunctions.changeCharacter(s, len - 1, s[len - 2] = '\0');
		  }
		  System.out.printf("%s\n",s);

		  }
	}
}

