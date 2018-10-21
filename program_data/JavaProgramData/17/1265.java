package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int len;
	 int c;
	 int[] zb = new int[101];
	 int[] fb = new int[101];
	 String a = new String(new char[101]);
	 String s = new String(new char[101]);
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
	  len = a.length();
	  for (j = 0;j < len;j++)
	  {
	   s = tangible.StringFunctions.changeCharacter(s, j, a.charAt(j));
	  }
	  s = tangible.StringFunctions.changeCharacter(s, len, '\0');
	  for (j = 0;j < len;j++)
	  {
	   if (s.charAt(j) != '(' && s.charAt(j) != ')')
	   {
		s = tangible.StringFunctions.changeCharacter(s, j, ' ');
	   }
	  }
	  int o = 0;
	  int h = 0;
	  for (j = 0;j < len;j++)
	  {
	   if (s.charAt(j) == '(')
	   {
		c = j;
		zb[o] = j;
		o++;
	   }
	   if (s.charAt(j) == ')' && o > 0)
	   {
		s = tangible.StringFunctions.changeCharacter(s, j, ' ');
		s = tangible.StringFunctions.changeCharacter(s, c, ' ');
	o--;
	if (o > 0)
	{
		c = zb[o - 1];
	}
	   }
	  }
	  for (j = 0;j < len;j++)
	  {
	   if (s.charAt(j) == '(')
	   {
		s = tangible.StringFunctions.changeCharacter(s, j, '$');
	   }
	   if (s.charAt(j) == ')')
	   {
		s = tangible.StringFunctions.changeCharacter(s, j, '?');
	   }
	  }
	  System.out.printf("%s\n%s", a, s);
	 System.out.print("\n");
	 }
	 return 0;
	}

}

