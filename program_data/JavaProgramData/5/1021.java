package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x;
		int y;
		double a;
		String zfc1 = new String(new char[501]);
		String zfc2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			zfc2 = tempVar3.charAt(0);
		}
		x = zfc1.length();
		y = zfc2.length();
		int s = 0;
		for (i = 0;i < x;i++)
		{
		   if (zfc1.charAt(i) != 'A' && zfc1.charAt(i) != 'G' && zfc1.charAt(i) != 'C' && zfc1.charAt(i) != 'T')
		   {
			  s = 1;
			  break;
		   }
		}
		for (i = 0;i < y;i++)
		{
		   if (zfc2.charAt(i) != 'A' && zfc2.charAt(i) != 'G' && zfc2.charAt(i) != 'C' && zfc2.charAt(i) != 'T')
		   {
			  s = 1;
			  break;
		   }
		}
		if (x != y || s == 1)
		{
				 System.out.print("error");
		}
		else
		{
			  int t = 0;
			  for (i = 0;i < x;i++)
			  {
				  if (zfc1.charAt(i) == zfc2.charAt(i))
				  {
					 t++;
				  }
			  }
			  double s;
			  s = 1.0 * t / (1.0 * x);
			  if (s > a)
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

