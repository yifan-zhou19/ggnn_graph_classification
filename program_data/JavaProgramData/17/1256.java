package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int i;
		int j;
		String str = new String(new char[101]);
		String str1 = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
		  str = new Scanner(System.in).nextLine();
		  System.out.println(str);
		  for (i = 0;i < str.length();i++)
		  {
			if (str.charAt(i) == ')')
			{
			for (j = i;j >= 0;j--)
			{
			   if (str.charAt(j) == '(')
			   {
				   str = tangible.StringFunctions.changeCharacter(str, j, '0');
				   str = tangible.StringFunctions.changeCharacter(str, i, '0');
				   break;
			   }
			}
			}
		  }

		  System.out.print("\n");
		  for (i = 0;i < str.length();i++)
		  {
		   if (str.charAt(i) == '(')
		   {
			   System.out.print("$");
		   }
		   if (str.charAt(i) == ')')
		   {
			   System.out.print("?");
		   }
		   if (str.charAt(i) != '(' && str.charAt(i) != ')')
		   {
			   System.out.print(" ");
		   }
		  }
		  System.out.print("\n");
		}
	}


}

