package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static int Main()
	{
	   String s = new String(new char[300]);
	   String a = new String(new char[300]);
	   String b = new String(new char[300]);
	   int x;
	   int y;
	   int z;
	   int i;
	   int k;
	   s = new Scanner(System.in).nextLine();
	   a = new Scanner(System.in).nextLine();
	   b = new Scanner(System.in).nextLine();
	   x = s.length();
	   y = a.length();
	   z = b.length();
	   for (k = 0;k <= x - 1;k++)
	   {
			int q = 1;
		 for (i = k;q != 9 && i <= k + y - 1;i++)
		 {
			  if (s.charAt(i) != a.charAt(i - k))
			  {
			  q = 9;
			  }
		 }
		 if (q == 9)
		 {
			 continue;
		 }
		 else if (q == 1 && ((s.charAt(k - 1) == ' ' && k > 0) || k == 0))
		 {
			 if (y >= z)
			 {
			   for (i = k;i <= k + z - 1;i++)
			   {
			   s = tangible.StringFunctions.changeCharacter(s, i, b.charAt(i - k));
			   }
			   for (i = k + z;i <= 299;i++)
			   {
			   s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i + y - z));
			   }
			 }
			 else if (y < z)
			 {
			   for (i = 299;i >= k + z;i--)
			   {
			   s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i + y - z));
			   }
			   for (i = k;i <= k + z - 1;i++)
			   {
			   s = tangible.StringFunctions.changeCharacter(s, i, b.charAt(i - k));
			   }
			 }
		 }
		 k += z - 1;
	   }
	   System.out.printf("%s",s);
	}
}

