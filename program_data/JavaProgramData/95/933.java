package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String a = new String(new char[80]);
	   String b = new String(new char[80]);
	   int i;
	   int len1;
	   int len2;
	   int t;
	   a = new Scanner(System.in).nextLine();
	   b = new Scanner(System.in).nextLine();
	   len1 = a.length();
	   len2 = b.length();
	   for (i = 0;i < len1;i++)
	   {
		  if (a.charAt(i) <= 'Z' && a.charAt(i) >= 'A')
		  {
			  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
		  }
	   }
	   for (i = 0;i < len2;i++)
	   {
		  if (b.charAt(i) <= 'Z' && b.charAt(i) >= 'A')
		  {
			  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
		  }
	   }
	   t = strcmp(a,b);
	   if (t > 0)
	   {
		   System.out.print(">\n");
	   }
	   else
	   {
		  if (t == 0)
		  {
			  System.out.print("=\n");
		  }
		  else
		  {
			  System.out.print("<\n");
		  }
	   }
	}
}

