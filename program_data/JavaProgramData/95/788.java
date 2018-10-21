package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int t;
		int k;
	 String s1 = new String(new char[81]);
	 String s2 = new String(new char[81]);
	 s1 = new Scanner(System.in).nextLine();
	 s2 = new Scanner(System.in).nextLine();
	 m = s1.length();
	 n = s2.length();
	 t = (m < n)? m:n;
	 for (i = 0;i < t;)
	 {
		 if (s1.charAt(i) <= 'z' && s1.charAt(i) >= 'a')
		 {
			 s1.charAt(i) -= 32;
		 }
	  if (s2.charAt(i) <= 'z' && s2.charAt(i) >= 'a')
	  {
		  s2.charAt(i) -= 32;
	  }
	  k = s1.charAt(i) - s2.charAt(i);
	  if (k > 0)
	  {
		  System.out.print(">");
		  break;
	  }
	  else if (k < 0)
	  {
		  System.out.print("<");
		  break;
	  }
		   else
		   {
			   i++;
		   }
	 }
	 if (k == 0 && m > n)
	 {
		 System.out.print(">");
	 }
	 else if (k == 0 && m < n)
	 {
		 System.out.print("<");
	 }
	 else if (k == 0)
	 {
		 System.out.print("=");
	 }
	}
}
