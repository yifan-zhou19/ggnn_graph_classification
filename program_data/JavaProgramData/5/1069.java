package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int t = 0;
		int s;
		int d = 1;
		double b;
		double x = 0.0;
		String a = new String(new char[501]);
		String c = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		l = a.length();
		s = c.length();
		if (l == s)
		{
			for (i = 0;i < l;i++)
			{
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T') || (c.charAt(i) != 'A' && c.charAt(i) != 'G' && c.charAt(i) != 'C' && c.charAt(i) != 'T'))
				{
					d = 0;
					break;
				}
				else if (a.charAt(i) == c.charAt(i))
				{
					t++;
				}
				else
				{
					t = t;
				}
			}
			if (d != 0)
			{
			x = 1.0 * t / l;
			if (x >= b)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
			}
			else
			{
				System.out.print("error\n");
			}
		}
		else
		{
			System.out.print("error\n");
		}
		return 0;
	}
}

