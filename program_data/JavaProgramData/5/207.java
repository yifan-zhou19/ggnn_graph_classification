package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double c;
		int a;
		int i;
		int d = 1;
		int b = 0;
		final String sz = "";
		final String u = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		scanf("\n");
		sz = new Scanner(System.in).nextLine();

		u = new Scanner(System.in).nextLine();
		a = sz.length();
		for (i = 0;i < a;i++)
		{
			if (sz.charAt(i) != 'A' && sz.charAt(i) != 'G' && sz.charAt(i) != 'T' && sz.charAt(i) != 'C')
			{
				System.out.print("error");
				d = 0;
				break;
			}
			else if (u.charAt(i) != 'A' && u.charAt(i) != 'G' && u.charAt(i) != 'T' && u.charAt(i) != 'C')
			{
				System.out.print("error");
				d = 0;
				break;
			}

		 else if (sz.charAt(i) == u.charAt(i))
		 {
				b++;
		 }

		}
		c = b * 1.0 / a;
		if (d == 1)
		{
		   if (c > n)
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

