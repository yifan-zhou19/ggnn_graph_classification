package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double x;
		double z = 0;
		double n = 0;
		double m = 0;
		int y = 0;
		int i;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead("\n");
			 if (tempVar3 != null)
			 {
				 b = tempVar3.charAt(0);
			 }
		for (i = 0;a.charAt(i);i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C')
			{
				y++;
			}
		}
		for (i = 0;b.charAt(i);i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
			{
				y++;
			}
		}
		for (i = 0;a.charAt(i);i++)
		{
			n++;
		}
		for (i = 0;b.charAt(i);i++)
		{
			m++;
		}
		if (m != n)
		{
			y++;
		}
		if (y != 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;a.charAt(i);i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					z++;
				}
			}
			if (z / n > x)
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

