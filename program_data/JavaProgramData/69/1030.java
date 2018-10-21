package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[250]);
		  String b = new String(new char[250]);
		  String c = new String(new char[252]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b = tempVar2.charAt(0);
		  }
		  int L1 = a.length(); //??????????
		  int L2 = b.length();
		  int j = 0;
		  for (int i = 0;;i++)
		  {
			   if (L1 - i - 1 < 0 && L2 - i - 1 < 0) //??????
			   {
				   if (j == 1)
				   {
						c = tangible.StringFunctions.changeCharacter(c, i, 49);
						 c = tangible.StringFunctions.changeCharacter(c, i + 1, '\0');
				   }
					else
					{
					c = tangible.StringFunctions.changeCharacter(c, i, '\0');
					}
					break;
			   }
			   if (L1 - i - 1 < 0)
			   {
				   c = tangible.StringFunctions.changeCharacter(c, i, b.charAt(L2 - i - 1) + j - 48); //j??????
			   }
			   else if (L2 - i - 1 < 0)
			   {
				   c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(L1 - i - 1) + j - 48);
			   }
			   else
			   {
				   c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(L1 - i - 1) + b.charAt(L2 - i - 1) + j - 96);
			   }
			   if (c.charAt(i) >= 10)
			   {
				   j = 1;
					c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 10);
			   }
			   else
			   {
				   j = 0;
			   }
			   c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + 48);
		  }
		  int L = c.length();
		  int m = 0;
		  for (int i = L - 1;;i--) //?????0???
		  {
		  if (c.charAt(i) == 48)
		  {
			  m = m + 1;
		  }
		  else
		  {
			  break;
		  }
		  }
		  if (c.charAt(0) == 48 && L == 1)
		  {
			  System.out.print("0");
		  }
		  for (int i = L - m - 1;i >= 0;i--)
		  {
		  System.out.printf("%c",c.charAt(i));
		  }
	}

}

