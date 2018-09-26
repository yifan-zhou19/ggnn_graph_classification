package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int la;
		int lb;
		int i;

		String s = new String(new char[80]);
		String a = new String(new char[80]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		la = s.length();
		lb = a.length();
		for (i = 0;i < la;i++)
		{
		 if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a')
		 {
			s.charAt(i) -= 32;
		 }
		}
		for (i = 0;i < lb;i++)
		{
		 if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
		 {
			a.charAt(i) -= 32;
		 }
		}
		for (i = 0;i <= 80;i++)
		{
			if (s.charAt(i) > a.charAt(i))
			{
			   System.out.print(">");
			   break;
			}
				 if (s.charAt(i) < a.charAt(i))
				 {
				   System.out.print("<");
				   break;
				 }
				  if (s.charAt(i) == a.charAt(i) && la == lb && i == la)
				  {

					  System.out.print("=\n");
				  }
				  if (i == la)
				  {
					  break;
				  }
		}

	}


}
