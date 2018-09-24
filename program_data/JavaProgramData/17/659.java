package <missing>;

public class GlobalMembers
{
	public static String use = new String(new char[150]);
	public static String rem = new String(new char[150]);
	public static int len;
	public static void rid(int begin, int end)
	{
	  if (begin <= end)
	  {
		  if (use.charAt(begin) != ')')
		  {
			  rid(begin + 1, end);
		  }
		  else
		  {
			  int i = begin;
			  while (use.charAt(i) != '(' && i >= 0)
			  {
				  i--; //????
			  }
				if (i == -1)
				{
					  use = tangible.StringFunctions.changeCharacter(use, begin, '?');
					  rid(begin + 1, end);
				}
				else
				{
					for (int j = i;j <= begin;j++)
					{
						 use = tangible.StringFunctions.changeCharacter(use, j, ' ');
						 rid(begin + 1, end);
					}
				}
		  }
	  }
	}
	public static int Main()
	{
		while (true)
		{
		char s;
		int i = 0;
		while ((s = System.in.read()) != '\n')
		{
			use = tangible.StringFunctions.changeCharacter(use, i, s);
			rem = tangible.StringFunctions.changeCharacter(rem, i, s);
			i++;
		}
		len = i - 1; //[0]->[len]
		rid(0, len);
			  for (int j = 0;j <= len;j++)
			  {
			  if (use.charAt(j) == '(')
			  {
				  use = tangible.StringFunctions.changeCharacter(use, j, '$');
			  }
			  else if (use.charAt(j) == ')')
			  {
				  use = tangible.StringFunctions.changeCharacter(use, j, '?');
			  }
			  else if (use.charAt(j) != '?' && use.charAt(j) != '$')
			  {
				  use = tangible.StringFunctions.changeCharacter(use, j, ' ');
			  }
			  }

		for (i = 0;i <= len;i++)
		{
			System.out.print(rem.charAt(i));
		}
		System.out.print("\n");
		for (i = 0;i <= len;i++)
		{
			System.out.print(use.charAt(i));
		}
		System.out.print("\n");
		}

		return 0;
	}
}

