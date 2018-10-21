package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		int sum = 0;
		int i;
		int l1;
		int l2;
		int judge = 1;
		String x = new String(new char[1001]);
		String y = new String(new char[1001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = tempVar3.charAt(0);
		}
		l1 = x.length(),l2 = y.length();
		if (l1 != l2)
		{
		   judge = 0;
		}
		else
		{
		   for (i = 0;i < l1;i++)
		   {
			   if (x.charAt(i) != 'C' && x.charAt(i) != 'G' && x.charAt(i) != 'A' && x.charAt(i) != 'T')
			   {
				  judge = 0;
			   }
			   if (y.charAt(i) != 'C' && y.charAt(i) != 'G' && y.charAt(i) != 'A' && y.charAt(i) != 'T')
			   {
				  judge = 0;
			   }
		   }
		}
		if (judge == 1)
		{
		   for (i = 0;i < l1;i++)
		   {
				if (x.charAt(i) == y.charAt(i))
				{
				   sum++;
				}
		   }
		   if (sum >= (int)(a * l1))
		   {
			  System.out.print("yes");
		   }
		   else
		   {
			  System.out.print("no");
		   }
		}
		else
		{
		  System.out.print("error");
		}
		return 0;
	}

}

