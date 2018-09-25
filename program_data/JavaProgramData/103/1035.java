package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String c = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = tempVar.charAt(0);
		  }
		  int i;
		  int j;
		  i = 0;
		  for (int k = 0;c.charAt(k) != '\0';k++)
		  {
				  if (c.charAt(k) >= 'a' && c.charAt(k) <= 'z')
				  {
				  c = tangible.StringFunctions.changeCharacter(c, k, c.charAt(k) - 'a'+'A');
				  }
		  }
		  while (c.charAt(i) != '\0')
		  {
					   for (j = i;;j++)
					   {
										  if (c.charAt(j) != c.charAt(i))
										  {
										  break;
										  }
					   }
		  System.out.printf("(%c,%d)",c.charAt(i),(j - i));
		  i = j;
		  }
	}

}

