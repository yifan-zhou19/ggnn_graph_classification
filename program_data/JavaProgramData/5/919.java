package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int a;
		double w;
		double n;
		x = 0;
		y = 0;
		n = 0;
		a = 0;
		String sz = new String(new char[500]);
		String s = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s = tempVar3.charAt(0);
		}
		for (i = 0;sz.charAt(i) != '\0';i++)
		{
		   x++;
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
		   y++;
		}
		if (x != y)
		{
		   a = 1;
		}
		else if (x == y)
		{
			for (i = 0;sz.charAt(i) != '\0';i++)
			{
				if (sz.charAt(i) == 'A' || sz.charAt(i) == 'C' || sz.charAt(i) == 'T' || sz.charAt(i) == 'G')
				{
				 if (sz.charAt(i) == s.charAt(i))
				 {
					n = n + 1;
				 }
				 else if (s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'C' && s.charAt(i) != 'G')
				 {
					a = 1;
				 }
				}
				else if (sz.charAt(i) != 'A' && sz.charAt(i) != 'T' && sz.charAt(i) != 'C' && sz.charAt(i) != 'G')
				{
					a = 1;
				}
			}
		}
		   if (a == 1)
		   {
			   System.out.print("error");
		   }
		else if (a == 0)
		{
		  n = 1.0 * n / x;
			if (n >= w)
			{
			System.out.print("yes");
			}
		  else if (n < w)
		  {
			System.out.print("no");
		  }
		}
		return 0;
	}

}

