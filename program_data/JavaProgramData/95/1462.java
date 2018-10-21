package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n1;
	  int n2;
	  String s1 = new String(new char[80]);
	  String s2 = new String(new char[80]);
	  s1 = new Scanner(System.in).nextLine();
	  s2 = new Scanner(System.in).nextLine();
	  n1 = s1.length();
	  n2 = s2.length();
	  i = -1;
		do
		{
			  i++;
			 if (s1.charAt(i) > 96)
			 {
				 s1.charAt(i) -= 32;
			 }
			 if (s2.charAt(i) > 96)
			 {
				 s2.charAt(i) -= 32;
			 }
		} while (s1.charAt(i) == s2.charAt(i) && i <= n1 - 1 && i <= n2 - 1);


		if (s1.charAt(i) < s2.charAt(i))
		{
			System.out.print("<");
		}
		  else if (s1.charAt(i) > s2.charAt(i))
		  {
			  System.out.print(">");
		  }
			  else
			  {
				  System.out.print("=");
			  }

	  return 0;
	}
}
