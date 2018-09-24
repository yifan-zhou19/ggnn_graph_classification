package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String s = new String(new char[1010]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   s = tempVar.charAt(0);
	   }
	   char x;
	   int c = 1;
	   int l = s.length();
	   int i;
	   for (i = 0;i < l;i++)
	   {
		  if ('a' <= s.charAt(i) && s.charAt(i) <= 'z')
		  {
			  s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
		  }
	   }
	   for (i = 0;i < l - 1;i++)
	   {
		  x = s.charAt(i);
		  if (s.charAt(i) == s.charAt(i + 1) && i == l - 2)
		  {
			  c++;
			  System.out.printf("(%c,%d)",x,c);
		  }
		  if (s.charAt(i) == s.charAt(i + 1))
		  {
			  c++;
		  }
		  else
		  {
			  System.out.printf("(%c,%d)",x,c);
			  c = 1;
		  }
	   }
	   if (s.charAt(l - 2) != s.charAt(l - 1))
	   {
		   System.out.printf("(%c,1)",s.charAt(l - 1));
	   }
	}

}

