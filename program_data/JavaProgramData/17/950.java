package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static int b;
	public static void nihao()
	{

	  for (int i = 0;i < b;i++)
	  {
		int r = 0;
		if (a.charAt(i) == ')')
		{
			for (int j = i - 1;j >= 0;j--)
			{
			  if (a.charAt(j) == '(')
			  {
				for (int k = j;k <= i;k++)
				{
				  a = tangible.StringFunctions.changeCharacter(a, k, ' ');
				}
				r = 1;
				break;
			  }
			}
			if (r == 0)
			{
			  a = tangible.StringFunctions.changeCharacter(a, i, '?');
			  for (int k = i - 1;k >= 0;k--)
			  {
			  if (a.charAt(k) != '?')
			  {
				a = tangible.StringFunctions.changeCharacter(a, k, ' ');
			  }
			  }
			}
		}
	  }

	}
	public static void nimei()
	{
	  for (int i = b - 1;i >= 0;i--)
	  {
		if (a.charAt(i) == '(')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '$');
		}
	  }

	}
	public static void nima()
	{
	   for (int i = 0;i < b;i++)
	   {
		   if (a.charAt(i) != '?' && a.charAt(i) != '$')
		   {
			 a = tangible.StringFunctions.changeCharacter(a, i, ' ');
		   }
	   }
	   for (int i = 0;i < b;i++)
	   {
		 System.out.print(a.charAt(i));
	   }
	   System.out.print("\n");
	}
	public static int Main()
	{
	  while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
	  {
		System.out.print(a);
		System.out.print("\n");
		b = a.length();
		nihao();
		nimei();
		nima();
	  }





	  return 0;
	}

}

