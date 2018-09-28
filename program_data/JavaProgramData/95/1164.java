package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[100]);
	 String b = new String(new char[100]);
	 int i = 0;
	 while (i < 100)
	 {
	  a = a.substring(0, i);
	  b = b.substring(0, i);
	  i++;
	 }
	 i = 0;
	 a = new Scanner(System.in).nextLine();
	 b = new Scanner(System.in).nextLine();
	 int n = 0;
	 while (i < 100)
	 {
	  if (a.charAt(i) > 64 && a.charAt(i) < 91)
	  {
	   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
	  }
	  i++;
	 }
	 i = 0;
	 while (i < 100)
	 {
	  if (b.charAt(i) > 64 && b.charAt(i) < 91)
	  {
	   b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
	  }
	  i++;
	 }
	 i = 0;
	 int x;
	 x = strcmp(a,b);
	 if (x > 0)
	 {
	  System.out.print(">");
	 }
	 else
	 {
	  if (x < 0)
	  {
	   System.out.print("<");
	  }
	  else
	  {
	   System.out.print("=");
	  }
	 }
	}
}

