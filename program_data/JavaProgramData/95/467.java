package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int l;
	 int p;
	 int h;
	 String a = new String(new char[1000]);
	 String b = new String(new char[1000]);
	 a = new Scanner(System.in).nextLine();
	 b = new Scanner(System.in).nextLine();
	 l = a.length();
	 h = b.length();
	 for (i = 0;i < l;i++)
	 {
	  if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
	  {
	   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
	  }
	 }
	 for (p = 0;p < h;p++)
	 {
	  if (b.charAt(p) >= 65 && b.charAt(p) <= 90)
	  {
	   b = tangible.StringFunctions.changeCharacter(b, p, b.charAt(p) + 32);
	  }
	 }
	 if (l >= h)
	 {
	  for (j = 0;j < h;j++)
	  {
		   if (a.charAt(j) > b.charAt(j))
		   {
			 System.out.print(">");
			 break;
		   }
		if (a.charAt(j) < b.charAt(j))
		{
			 System.out.print("<");
			 break;
		}
	  }
	   if (j == h)
	   {
	   System.out.print("=");
	   }
	 }
	 if (l < h)
	 {
	  for (j = 0;j < l;j++)
	  {
		   if (a.charAt(j) > b.charAt(j))
		   {
			 System.out.print(">");
			 break;
		   }
		if (a.charAt(j) < b.charAt(j))
		{
			 System.out.print("<");
			 break;
		}
	  }
		if (j == l)
		{
	   System.out.print("=");
		}
	 }
	}

}

