package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[100]);
	public static int[] temp = new int[100];
	public static int[] addition = new int[100];
	public static int flag;
	public static int i;
	public static int j;
	public static int f()
	{
		for (i = 0;i < s.length();i++)
		{
			  if (s.charAt(i) == '(')
			  {
				  s = tangible.StringFunctions.changeCharacter(s, i, '$');
				  addition[flag] = i;
				  flag++;
			  }
			  else if (s.charAt(i) == ')')
			  {
					if (flag != 0)
					{
							s = tangible.StringFunctions.changeCharacter(s, i, ' ');
							flag--;
							s = tangible.StringFunctions.changeCharacter(s, addition[flag], ' ');
					}
						else
						{
							s = tangible.StringFunctions.changeCharacter(s, i, '?');
						}
			  }
			   else
			   {
				   s = tangible.StringFunctions.changeCharacter(s, i, ' ');
			   }
		}
	}
	public static int Main()
	{
		while ((s = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			  System.out.print(s);
			  System.out.print("\n");
			  flag = 0;
			  f();
			  System.out.print(s);
			  System.out.print("\n");
		}
		  return 0;
	}

}

