package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[1000]);
		  int i;
		  int l;
		  int c;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  l = s.length();
		  c = 0;
		  for (i = 0;i <= l - 1;i++)
		  {
			  if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
			  {
			  s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
			  }
		  }
		  for (i = 0;i <= l - 1;i++)
		  {
			  if ((s.charAt(i) == s.charAt(i + 1)) && (i < l))
			  {
				  c = c + 1;
			  }
			  else
			  {
			  if ((s.charAt(i) == s.charAt(i + 1)) && (s.charAt(i + 2) == '\0'))
			  {
				  System.out.printf("(%c,%d)",s.charAt(i),c);
			  }
			  else
			  {
				  System.out.printf("(%c,%d)",s.charAt(i),c + 1);
			   c = 0;
			  }
			  }
		  }
		  System.in.read();
		  System.in.read();
	}

}

