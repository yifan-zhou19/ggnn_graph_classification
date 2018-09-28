package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[81]);
	   String s2 = new String(new char[81]);
	   int i;
	   s1 = new Scanner(System.in).nextLine();
	   s2 = new Scanner(System.in).nextLine();

	   for (i = 0;i <= 80;i++)
	   {
		  if (s1.charAt(i) >= 65 && s1.charAt(i) <= 90)
		  {
			s1.charAt(i) += 32;
		  }
	   }
	for (i = 0;i <= 80;i++)
	{
		  if (s2.charAt(i) >= 65 && s2.charAt(i) <= 90)
		  {
			s2.charAt(i) += 32;
		  }
	}
		if (strcmp(s1,s2) == 0)
		{
			System.out.print("=");
		}
		else if (strcmp(s1,s2) > 0)
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("<");
		}

	return 0;
	}



}
