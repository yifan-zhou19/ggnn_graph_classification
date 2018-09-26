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
	  while (n-- != 0)
	  {
	  String s = new String(new char[256]);
	  int i;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s = tempVar2.charAt(0);
	  }
	  int len = s.length();
	  for (i = 0;i < len;i++)
	  {
	  if (s.charAt(i) == 'A')
	  {
		 s = tangible.StringFunctions.changeCharacter(s, i, 'T');
	  }
	  else if (s.charAt(i) == 'T')
	  {
		  s = tangible.StringFunctions.changeCharacter(s, i, 'A');
	  }
	  else if (s.charAt(i) == 'C')
	  {
		  s = tangible.StringFunctions.changeCharacter(s, i, 'G');
	  }
	  else if (s.charAt(i) == 'G')
	  {
		  s = tangible.StringFunctions.changeCharacter(s, i, 'C');
	  }
	  }
	  System.out.printf("%s\n",s);

	  }
	  return 0;
	}

}

