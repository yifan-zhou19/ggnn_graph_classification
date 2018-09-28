package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[80]);
	  String b = new String(new char[80]);
	  String c = new String(new char[80]);
	  String d = new String(new char[80]);
	  int i;
	  int m;
	  int n;
	  a = new Scanner(System.in).nextLine();
	  b = new Scanner(System.in).nextLine();
	  m = a.length();
	  n = b.length();
	  for (i = 0;i < 80;i++)
	  {
		  if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
		  {
			  c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) + 32);
		  }
		  else
		  {
			  c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i));
		  }
	 if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
	 {
	  d = tangible.StringFunctions.changeCharacter(d, i, b.charAt(i) + 32);
	 }
	  else
	  {
		  d = tangible.StringFunctions.changeCharacter(d, i, b.charAt(i));
	  }
	  }
	  if (strcmp(c,d) > 0)
	  {
		  System.out.print(">");
	  }
	  if (strcmp(c,d) == 0)
	  {
		  System.out.print("=");
	  }
	  if (strcmp(c,d) < 0)
	  {
		  System.out.print("<");
	  }
	  return 0;
	}
}

