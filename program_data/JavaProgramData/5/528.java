package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k = 1;
		int l;
		int e;
		String s = new String(new char[501]);
		String g = new String(new char[501]);
		double n;
		double r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			g = tempVar3.charAt(0);
		}
		l = s.length();
		e = g.length();
		if (l != e)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;s.charAt(i);i++)
			{
				if (((s.charAt(i) == 'A') || (s.charAt(i) == 'T') || (s.charAt(i) == 'C') || (s.charAt(i) == 'G')) && ((g.charAt(i) == 'A') || (g.charAt(i) == 'T') || (g.charAt(i) == 'C') || (g.charAt(i) == 'G')))
				{
					if (g.charAt(i) == s.charAt(i))
					{
						k++;
					}
				}
				else
				{
					k = 0;
					break;
				}
			}
			if (k == 0)
			{
				System.out.print("error");
			}
			else
			{
				k--;
				r = 1.0 * k / l;
				if (r > n)
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

