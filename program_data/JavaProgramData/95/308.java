package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String a = new String(new char[80]);
	  String b = new String(new char[80]);
	  int c;
	  int i;
	  a = new Scanner(System.in).nextLine();
	  b = new Scanner(System.in).nextLine();
	  for (i = 0;a.charAt(i) != '\0';i++)
	  {
		 if (a.charAt(i) > (char)64 && a.charAt(i) < (char)91)
		 {
			 a = tangible.StringFunctions.changeCharacter(a, i, (char)a.charAt(i) + 32);
		 }
	  }
	  for (i = 0;b.charAt(i) != '\0';i++)
	  {
		 if (b.charAt(i) > (char)64 && b.charAt(i) < (char)91)
		 {
			 b = tangible.StringFunctions.changeCharacter(b, i, (char)b.charAt(i) + 32);
		 }
	  }
	  c = strcmp(a,b);
	  if (c > 0)
	  {
		  System.out.print(">\n");
	  }
	  else if (c == 0)
	  {
		  System.out.print("=\n");
	  }
	  else if (c < 0)
	  {
		  System.out.print("<\n");
	  }
	}
}

