package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String c = new String(new char[1001]);
	  char b;
	  int j;
	  int a = 1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  c = tempVar.charAt(0);
	  }
	  for (j = 1;;j++)
	  {
		if (c.charAt(j) == c.charAt(j - 1) && c.charAt(j) != '\0' || c.charAt(j) == c.charAt(j - 1) + 32 || c.charAt(j) == c.charAt(j - 1) - 32)
		{
		   a++;
		}
		if (c.charAt(j) != c.charAt(j - 1) && c.charAt(j) != '\0' && c.charAt(j) != c.charAt(j - 1) + 32 && c.charAt(j) != c.charAt(j - 1) - 32)
		{
		  if (c.charAt(j - 1) >= 'A' && c.charAt(j - 1) <= 'Z')
		  {
			System.out.printf("(%c,%d)",c.charAt(j - 1),a);
		  }
		  if (c.charAt(j - 1) >= 'a' && c.charAt(j - 1) <= 'z')
		  {
			System.out.printf("(%c,%d)",c.charAt(j - 1) + 'A'-'a',a);
		  }
		  a = 1;
		}
		if (c.charAt(j) == '\0')
		{
		  if (c.charAt(j - 1) >= 'A' && c.charAt(j - 1) <= 'Z')
		  {
			System.out.printf("(%c,%d)",c.charAt(j - 1),a);
		  }
		  if (c.charAt(j - 1) >= 'a' && c.charAt(j - 1) <= 'z')
		  {
			System.out.printf("(%c,%d)",c.charAt(j - 1) + 'A'-'a',a);
		  }
		  break;
		}
	  }

	}

}

