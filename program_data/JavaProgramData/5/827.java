package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double x;
		double y;
		int na;
		int nb;
		int i;
		int c;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		na = a.length();
		nb = b.length();
		if (na != nb)
		{
			System.out.print("error");
			return 0;
		}
		else
		{
			c = 0;
			for (i = 0;i < na;i++)
			{
				if ((a.charAt(i) == 'A') || (a.charAt(i) == 'T') || (a.charAt(i) == 'C') || (a.charAt(i) == 'G'))
				{
				   if ((b.charAt(i) == 'A') || (b.charAt(i) == 'T') || (b.charAt(i) == 'C') || (b.charAt(i) == 'G'))
				   {
					 if (a.charAt(i) == b.charAt(i))
					 {
						 c = c + 1;
					 }
				   }
				   else
				   {
					   System.out.print("error");
							return 0;
				   }
				}
				else
				{
					System.out.print("error");
					  return 0;
				}
			}
		}
					y = 1.0 * c / na;
					if (y >= x)
					{
					System.out.print("yes");
					}
					else
					{
						System.out.print("no");
					}
					return 0;
	}



}

