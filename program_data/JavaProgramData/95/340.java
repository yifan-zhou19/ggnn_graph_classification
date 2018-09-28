package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l1;
		int l2;
		int i;
		String s = new String(new char[80]);
		String t = new String(new char[80]);
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		l1 = s.length();
		l2 = t.length();
	   for (i = 0; i < (l1 + l2) / 2; i++)
	   {
		   s = tangible.StringFunctions.changeCharacter(s, i, Character.toUpperCase(s.charAt(i)));
		   t = tangible.StringFunctions.changeCharacter(t, i, Character.toUpperCase(t.charAt(i)));
	   }
	   if (strcmp(s,t) == 0)
	   {
		   System.out.print("=\n");
	   }
	   if (strcmp(s,t) > 0)
	   {
		   System.out.print(">\n");
	   }
	   if (strcmp(s,t) < 0)
	   {
		   System.out.print("<\n");
	   }
	   return 0;
	}
}

