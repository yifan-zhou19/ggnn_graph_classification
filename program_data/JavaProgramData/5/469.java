package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int b;
		int c;
		int d = 1;
		int e = 1;
		int f = 0;
		double a;
		double g;
		String s = new String(new char[500]);
		String z = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		b = s.length();
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			z = tempVar3.charAt(0);
		}
		c = z.length();
		if (b != c)
		{
			System.out.print("error");
			d = 0;
			e = 0;
		}
		if (d == 1)
		{
			for (i = 0;i < b;i++)
			{
				if ((s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'C' && s.charAt(i) != 'G') || (z.charAt(i) != 'A' && z.charAt(i) != 'T' && z.charAt(i) != 'C' && z.charAt(i) != 'G'))
				{
		System.out.print("error");
		e = 0;
		break;
				}
			}
		}
		if (d == 1 && e == 1)
		{
			for (i = 0;i < b;i++)
			{
				if (s.charAt(i) == z.charAt(i))
				{
					f++;
				}
			}
		g = (1.0 * f) / b;
		if (g > a)
		{
			System.out.print("yes");
		}
		if (g <= a)
		{
			System.out.print("no");
		}
		}
	return 0;
	}
}

