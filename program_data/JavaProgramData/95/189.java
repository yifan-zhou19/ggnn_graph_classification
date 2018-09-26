package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int j;
	 String a = new String(new char[80]);
	 String b = new String(new char[80]);
	 a = new Scanner(System.in).nextLine();
	 b = new Scanner(System.in).nextLine();
	 j = 0;
	 while (a.charAt(j) != '\0')
	 {
	   if ((a.charAt(j) >= 'A') && (a.charAt(j) <= 'Z'))
	   {
	   a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 32);
	   }
	   j++;
	 }
	  j = 0;
	 while (b.charAt(j) != '\0')
	 {
	   if ((b.charAt(j) >= 'A') && (b.charAt(j) <= 'Z'))
	   {
	   b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j) + 32);
	   }
	   j++;
	 }
	  if (strcmp(a,b) > 0)
	  {
	  System.out.print(">");
	  }
	  else if (strcmp(a,b) < 0)
	  {
	  System.out.print("<");
	  }
	  else if (strcmp(a,b) == 0)
	  {
		  System.out.print("=");
	  }
	}
}

