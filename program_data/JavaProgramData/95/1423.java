package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[90]);
	 String b = new String(new char[90]);
	 int i;
	 int j;
	 int k;
	 int m;
	 int n;
	 k = 0;
	 a = new Scanner(System.in).nextLine();
	 b = new Scanner(System.in).nextLine();
	 m = a.length();
	 n = b.length();




	 for (i = 0;i < m;i++)
	 {
		   if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
		   {
			   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
		   }
		   if (b.charAt(i) >= 97 && b.charAt(i) <= 122)
		   {
			   b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
		   }
	 }
			  for (i = 0;i < m;i++)
			  {
				  if (a.charAt(i) > b.charAt(i))
				  {
					  System.out.print(">");
				  k = 1;
				  break;
				  }
				  else
				  {
					  if (a.charAt(i) < b.charAt(i))
					  {
						  System.out.print("<");
					  k = 1;
					  break;
					  }
				  }
			  }
			  if (k == 0)
			  {
				  System.out.print("=");
			  }

	}


}

