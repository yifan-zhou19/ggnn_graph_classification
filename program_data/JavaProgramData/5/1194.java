package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double m = 0.0;
			 int t;
			 int i;
			 int r;
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String z = new String(new char[100]);
		String c = new String(new char[100]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			z = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		t = z.length();
		r = c.length();
		if (t != r)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < t;i++)
			{
				if ((z.charAt(i) != 'A' && z.charAt(i) != 'T' && z.charAt(i) != 'C' && z.charAt(i) != 'G') || (c.charAt(i) != 'A' && c.charAt(i) != 'T' && c.charAt(i) != 'C' && c.charAt(i) != 'G'))
				{
					System.out.print("error");
					return 0;
				}
				if (z.charAt(i) == c.charAt(i))
				{
					m++;
				}
			}
			if (1.0 * m / t > n)
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

