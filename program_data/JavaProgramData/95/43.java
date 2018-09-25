package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int m;
		 int n;
		 int max;
		 String p = new String(new char[80]);
		 String q = new String(new char[80]);
		 p = new Scanner(System.in).nextLine();
		 q = new Scanner(System.in).nextLine();
		 m = p.length();
		 n = q.length();
		 if (m > n)
		 {
			 max = m;
		 }
		 else
		 {
			 max = n;
		 }
		 for (int i = 0;i < max;i++)
		 {
			  if (p.charAt(i) >= 'a' && p.charAt(i) <= 'z')
			  {
				  p = tangible.StringFunctions.changeCharacter(p, i, p.charAt(i) - 32);
			  }
		 }
		 for (int j = 0;j < max;j++)
		 {
			  if (q.charAt(j) >= 'a' && q.charAt(j) <= 'z')
			  {
				  q = tangible.StringFunctions.changeCharacter(q, j, q.charAt(j) - 32);
			  }
		 }
		 int a = strcmp(p,q);
			 if (a > 0)
			 {
				 System.out.print(">");
			 }
			 else if (a < 0)
			 {
				 System.out.print("<");
			 }
			 else if (a == 0)
			 {
				 System.out.print("=");
			 }
		 return 0;
	}
}

