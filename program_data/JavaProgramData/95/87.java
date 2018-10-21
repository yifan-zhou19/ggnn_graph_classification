package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s1 = new String(new char[80]);
	  String s2 = new String(new char[80]);
	  String r1 = new String(new char[80]);
	  String r2 = new String(new char[80]);
	  int n;
	  int i;
	  int c;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		int a = s1.length();
		int b = s2.length();
		if (a > b)
		{
			c = b;
		}
		else
		{
			c = a;
		}
		for (i = 0;i < c;i++)
		{
			r1 = tangible.StringFunctions.changeCharacter(r1, i, Character.toUpperCase(s1.charAt(i)));
			r2 = tangible.StringFunctions.changeCharacter(r2, i, Character.toUpperCase(s2.charAt(i)));
		}
			r1 = tangible.StringFunctions.changeCharacter(r1, i, r2[i] = '\0');
		 n = strcmp(r1,r2);
		  if (n == 0)
		  {
		  System.out.print("=");
		  }
		  else if (n < 0)
		  {
			  System.out.print("<");
		  }
		   else
		   {
			  System.out.print(">");
		   }
	   return 0;
	}


}

