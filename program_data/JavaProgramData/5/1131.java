package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double y;
		double a;
		String q = new String(new char[501]);
		String h = new String(new char[501]);
		int n1;
		int n2;
		int i;
		int c = 0;
		int tag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			q = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			h = tempVar3.charAt(0);
		}
		n1 = q.length();
		n2 = h.length();
		if (n1 != n2)
		{
			System.out.print("error");
		}
		else
		{

			for (i = 0;i < n1;i++)
			{
				 if ((q.charAt(i) != 'A') && (q.charAt(i) != 'T') && (q.charAt(i) != 'C') && (q.charAt(i) != 'G'))
				 {
					 System.out.print("error");
					 tag = 1;
					 break;
				 }
			}
			if (tag == 0)
			{
			for (i = 0;i < n2;i++)
			{
				 if ((h.charAt(i) != 'A') && (h.charAt(i) != 'T') && (h.charAt(i) != 'C') && (h.charAt(i) != 'G'))
				 {
					  System.out.print("error");
					tag = 1;
					 break;
				 }
			}
			}
			for (i = 0;i < n1;i++)
			{
				if (q.charAt(i) == h.charAt(i))
				{
					c++;
				}
			}
			a = 1.0 * c / n1;
			if (tag == 0)
			{
				if (a > y)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
		}
		return 0;
	}

}

