package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		int i;
		int j;
		int max;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < a.length();i++)
		{
		   if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		   {
			  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
		   }
		}
		for (i = 0;i < a.length();i++)
		{
		   for (j = 0;j < a.length() - i;j++)
		   {
			  if (a.charAt(i) == a.charAt(i + j))
			  {
				 max = j + 1;
			  }
			  else
			  {
				  break;
			  }
		   }
		   System.out.print("(");
		   System.out.print(a.charAt(i));
		   System.out.print(',');
		   System.out.print(max);
		   System.out.print(")");
		   i = i + max - 1;
		}
		return 0;
	}

}

