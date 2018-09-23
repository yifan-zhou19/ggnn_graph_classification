package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String l = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = tempVar.charAt(0);
		}
		n = 1;
		for (i = 0;l.charAt(i) != '\0';i++)
		{
	  if (l.charAt(i) == l.charAt(i + 1) || l.charAt(i) == l.charAt(i + 1) - 'a'+'A' || l.charAt(i) == l.charAt(i + 1) - 'A'+'a')
	  {
			if (l.charAt(i) >= 'A' && l.charAt(i) <= 'Z')
			{
			   if (l.charAt(i) == l.charAt(i + 1) || l.charAt(i) == l.charAt(i + 1) - 'a'+'A')
			   {
		   n = n + 1;
			   }
			}
		else
		{
			   if (l.charAt(i) == l.charAt(i + 1) || l.charAt(i) == l.charAt(i + 1) - 'A'+'a')
			   {
		   n = n + 1;
			   }
		}
	  }
		else
		{
			  if (l.charAt(i) >= 'A' && l.charAt(i) <= 'Z')
			  {
			   System.out.printf("(%c,%d)",l.charAt(i),n);
			n = 1;
			  }
		   if (l.charAt(i) >= 'a' && l.charAt(i) <= 'z')
		   {
			   l = tangible.StringFunctions.changeCharacter(l, i, l.charAt(i) - 'a'+'A');
		   System.out.printf("(%c,%d)",l.charAt(i),n);
			n = 1;
		   }
		}
		}
	}

}

