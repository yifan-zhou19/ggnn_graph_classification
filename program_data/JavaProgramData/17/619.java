package <missing>;

public class GlobalMembers
{
	//***********************************************************************
	//????????? 
	//????????? 
	//??????
	//***********************************************************************
	public static int match(int i, int n, String str)
	{
		 if (i == n) //????
		 {
			  return 0;
		 }
		 else if (str[i].equals(')')) //??????
		 {
			  str[i] = '?';
			  for (int j = i - 1; j >= 0; j--)
			  {
								  if (str[j].equals('$'))
								  {
											str[j] = ' ';
											str[i] = ' ';
											break;
								  }
			  }
			  match(i + 1, n, str);
			  return 0;
		 }
		 else if (str[i].equals('(')) //??????$
		 {
			  str[i] = '$';
			  match(i + 1, n, str); //????
			  return 0;
		 }
		 else
		 {
			  str[i] = ' ';
			  match(i + 1, n, str);
			  return 0;
		 }
	}
	public static int Main() //???
	{
		String str = new String(new char[101]);
		int n;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0) //????
		{
					   System.out.print(str);
					   System.out.print("\n");
					   n = str.length();
					   match(0, n, str);
					   System.out.print(str);
					   System.out.print("\n");
		}
		return 0;
	}


}

