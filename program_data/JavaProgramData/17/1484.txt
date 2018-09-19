package <missing>;

public class GlobalMembers
{
	public static int j = 1;
	public static int Main()
	{
		String a = new String(new char[101]);
	 a = null;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	l:
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	 if (a.charAt(0) == 0)
	 {
		 return 0;
	 }
	 else
	 {
	   System.out.printf("%s\n",a);
	 }
	 int r;
	 int i;
	 int k;
	 r = a.length();
	 for (i = r - 1;i >= 0;i--)
	 {
		  if (a.charAt(i) != '(' && a.charAt(i) != ')')
		  {
			  a = tangible.StringFunctions.changeCharacter(a, i, ' ');
		  }
	   else if (a.charAt(i) == '(')
	   {
			for (k = i;k <= r - 1;k++)
			{
				if (a.charAt(k) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
					a = tangible.StringFunctions.changeCharacter(a, k, ' ');
					break;
				}
			}
	   }
	 }
	  for (i = 0;i <= r - 1;i++)
	  {
		   if (a.charAt(i) == '(')
		   {
			   a = tangible.StringFunctions.changeCharacter(a, i, '$');
		   }
		else if (a.charAt(i) == ')')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '?');
		}
	  }
	  System.out.printf("%s\n",a);
	  return main();


	}

}

