package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int n;
	  String s = new String(new char[1111]);
	  char d;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (j = 0;j < n;j++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
		  if (s.charAt(i) == 'A')
		  {
			d = 'T';
		  }
		  if (s.charAt(i) == 'T')
		  {
			d = 'A';
		  }
		  if (s.charAt(i) == 'C')
		  {
			d = 'G';
		  }
		  if (s.charAt(i) == 'G')
		  {
			d = 'C';
		  }
		  s = tangible.StringFunctions.changeCharacter(s, i, d);
		}
		System.out.printf("%s\n",s);
	  }
	  return 0;
	}


}

