package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int q;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String c = new String(new char[10]);
		double n;
		double t = 0;
		c = new Scanner(System.in).nextLine();
		n = Double.parseDouble(c);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		q = a.length();
		if (a.length() != b.length())
		{
	System.out.print("error");
	return 0;
		}
	else
	{
	   for (i = 0;a.charAt(i) != '\0';i = i + 1)
	   {
		   if (a.charAt(i) > 97 || b.charAt(i) > 97)
		   {

			   System.out.print("error");
		   return 0;
		   }
			 else
			 {
			   if (a.charAt(i) == b.charAt(i))
			   {
				  t = t + 1;
			   }



			 }
	   }
	}




			  if (n < 0)
			  {
					System.out.print("yes");
			  }
			  else
			  {
				  if (t / (q * 1.00) > n)
				  {
					System.out.print("yes");
				  }
				  else
				  {
					System.out.print("no");
				  }
			  }

	return 0;
	}

}
