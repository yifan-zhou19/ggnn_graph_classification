package <missing>;

public class GlobalMembers
{
	//***********************************************************************
	//????????? 
	//????????? 
	//??????
	//***********************************************************************
	public static int match(int i)
	{
		 if (i == n) //????
		 {
			  return 0;
		 }
		 else if (str.charAt(i) == ')') //??????
		 {
			  str = tangible.StringFunctions.changeCharacter(str, i, '?');
			  for (int j = i - 1; j >= 0; j--)
			  {
								  if (str.charAt(j) == '$')
								  {
											str = tangible.StringFunctions.changeCharacter(str, j, ' ');
											str = tangible.StringFunctions.changeCharacter(str, i, ' ');
											break;
								  }
			  }
		 }
		 else if (str.charAt(i) == '(') //??????$
		 {
			  str = tangible.StringFunctions.changeCharacter(str, i, '$');
		 }
		 else
		 {
			  str = tangible.StringFunctions.changeCharacter(str, i, ' ');
		 }
		 match(i + 1);
		 return 0;
	}
	public static String str = new String(new char[101]);
	public static int n;
	public static int Main() //???
	{
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0) //????
		{
					   System.out.print(str);
					   System.out.print("\n");
					   n = str.length();
					   match(0);
					   System.out.print(str);
					   System.out.print("\n");
		}
		return 0;
	}


}

