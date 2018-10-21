package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int f = int x;
		  String str = new String(new char[1001]);
		  int i;
		  int m;
		  char c;
		  m = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  str = tempVar.charAt(0);
		  }
		  for (i = 0;(c = str.charAt(i)) != '\0';i++)
		  {
			str = tangible.StringFunctions.changeCharacter(str, i, f(str.charAt(i)));
		  }
		  for (i = 0;(c = str.charAt(i)) != '\0';i++)
		  {
			if (str.charAt(i + 1) == str.charAt(i))
			{
			m = m + 1;
			}
			else
			{
				 System.out.printf("(%c,%d)",str.charAt(i),m);
				 m = 1;
			}
		  }
	}
	public static int f(int x)
	{
		if (x >= 'a' && x <= 'z')
		{
			x = x - 'a'+'A';
		}
		return (x);
	}
}

