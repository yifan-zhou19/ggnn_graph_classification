package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[100]);
	String s1 = new String(new char[100]);
	int i;
	int len;
	int t;
		while ((s = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(s1,' ',(Character.SIZE / Byte.SIZE));
		 len = s.length();
		 t = 0;
		 for (i = 0;i < len;i++)
		 {
				 if (s.charAt(i) == '(')
				 {
					 t++;
				 }
			  if (s.charAt(i) == ')')
			  {
				   if (t > 0)
				   {
					   t--;
				   }
				   else
				   {
					   s1 = tangible.StringFunctions.changeCharacter(s1, i, '?');
				   }
			  }
		 }
		 t = 0;
		 for (i = len - 1;i >= 0;i--)
		 {
				if (s.charAt(i) == ')')
				{
					t++;
				}
			  if (s.charAt(i) == '(')
			  {
				   if (t > 0)
				   {
					   t--;
				   }
				   else
				   {
					   s1 = tangible.StringFunctions.changeCharacter(s1, i, '$');
				   }
			  }
		 }
		 for (i = 0;i < len;i++)
		 {
			 System.out.print(s.charAt(i));
		 }
		 System.out.print("\n");
		for (i = 0;i < len;i++)
		{
			System.out.print(s1.charAt(i));
		}
		System.out.print("\n");
		}



		  return 0;
	}

}

