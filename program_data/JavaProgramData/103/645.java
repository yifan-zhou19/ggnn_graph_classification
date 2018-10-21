package <missing>;

public class GlobalMembers
{
	public static int f(char c)
	{
		if ((c > 'Z') && (c <= 'z'))
		{
		c = c - 'a'+'A';
		}
		return c;
	}
	public static int Main()
	{
		int j = 1;
	  String str = new String(new char[1050]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  str = tempVar.charAt(0);
	  }
	  for (int i = 0;i <= str.length() - 1;i++)
	  {
		  str = tangible.StringFunctions.changeCharacter(str, i, f(str.charAt(i)));
	  }
	  for (int i = 0;i <= str.length() - 1;i++)
	  {
		  if (str.charAt(i) == str.charAt(i + 1))
		  {
		   j = j + 1;
		  }
	   else
	   {
		   System.out.printf("(%c,%d)",str.charAt(i),j);
		j = 1;
	   }
	  }
	}
}

