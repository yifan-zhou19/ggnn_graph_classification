package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int n;
		int i;
		int k;
		int leap = 1;
	  String s = new String(new char[200]);
	  s = new Scanner(System.in).nextLine();
	  a = s.length();
	  for (i = 0;i < a;i++)
	  {
		  if (s.charAt(i) != ' ')
		  {
			  leap = 1;
			  System.out.printf("%c",s.charAt(i));
		  }
		  if (s.charAt(i) == ' ' && leap == 1)
		  {
			  System.out.print(" ");
		   leap = 0;
		  }
	  }

	}
}
