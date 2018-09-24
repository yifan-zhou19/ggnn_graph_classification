package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n1;
		int n2;
		int l = 0;
		double e;
		double q = 0;
		int i;
		String a = new String(new char[501]);
		String b = new String(new char[501]);


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Double.parseDouble(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n1 = a.length();
		n2 = b.length();

		if (n1 != n2)
		{
		System.out.print("error");
		l++;
		}
		if (l == 0)
		{
		   for (i = 0;i < n1;i++)
		   {
			 if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
			 {
			  System.out.print("error");
			  l++;
			  break;
			 }

		   }

		}
		if (l == 0)
		{
		   for (i = 0;i < n2;i++)
		   {
					if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
					{
					  System.out.print("error");
					  l++;
					  break;
					}

		   }

		}



		if (l == 0)
		{
		   for (i = 0;i < n1;i++)
		   {

			  if (a.charAt(i) == b.charAt(i))
			  {
				 q++;
			  }
		   }
		   if ((q / n1) > e)
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

