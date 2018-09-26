package <missing>;

public class GlobalMembers
{
	public static int Main()
	{




			String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int i;
		int n;
		int m;
		int d = 0;
	int e = 0;

		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();

		n = a.length();
		for (i = 0;i < n;i++)
		{
					  if (a.charAt(i) == b.charAt(0))
					  {
									if (a.charAt(i + 1) == b.charAt(1))
									{
													   if (a.charAt(i + 2) == b.charAt(2))
													   {
															 d = i;
									break;
													   }
									}
					  }

		}


			m = c.length();
		  if (d != 0)
		  {

				 for (i = d;i < d + m;i++)
				 {

					a = tangible.StringFunctions.changeCharacter(a, i, c.charAt(e));
					  e++;

				 }




		  }
		  System.out.println(a);

	return 0;
	}
}

