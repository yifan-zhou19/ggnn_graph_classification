package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		int i;
		int n;
		int m;
		int t = 0;
		int k = 0;
		String x = new String(new char[501]);
		String y = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		x = new Scanner(System.in).nextLine();
		y = new Scanner(System.in).nextLine();
		n = x.length();
		m = y.length();
		if (n != m)
		{
			System.out.print("error\n");
		}
		else
		{
		 for (i = 0;i < n;i++)
		 {
			 if ((x.charAt(i) != 'A' && x.charAt(i) != 'G' && x.charAt(i) != 'T' && x.charAt(i) != 'C') || (y.charAt(i) != 'A' && y.charAt(i) != 'G' && y.charAt(i) != 'T' && y.charAt(i) != 'C'))
			 {
				 k = 1;
				 System.out.print("error\n");
				 break;
			 }
			else if (x.charAt(i) == y.charAt(i))
			{
				t++;
			}
		 }
		 if (k != 1)
		 {
		  if ((double)((double)t / (double)n) > a)
		  {
			  System.out.print("yes\n");
		  }
		   else
		   {
			   System.out.print("no\n");
		   }
		 }
		}
		return 0;
	}

}

