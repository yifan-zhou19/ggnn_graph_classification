package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double v;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			v = Double.parseDouble(tempVar);
		}
		String s = new String(new char[600]);
		String z = new String(new char[600]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			z = tempVar3.charAt(0);
		}
		int a;
		int b;
		a = s.length();
		b = z.length();
		int m;
		int n;
		int p = 0;
		int q = 0;
		for (m = 0;m < a;m++)
		{
			if (s.charAt(m) != 'A' && s.charAt(m) != 'T' && s.charAt(m) != 'C' && s.charAt(m) != 'G')
			{
				p = 1;
			}
		}
		for (n = 0;n < a;n++)
		{
			if (z.charAt(n) != 'A' && z.charAt(n) != 'T' && z.charAt(n) != 'C' && z.charAt(n) != 'G')
			{
				q = 1;
			}
		}
		int w = 0;
		double u;
		if (m != n || q == 1 || p == 1)
		{
			System.out.print("error");
			w = 1;
		}
		int sum = 0;
		for (n = 0;n < a;n++)
		{
			if (s.charAt(n) == z.charAt(n))
			{
				sum++;
			}
		}
		u = 1.0 * sum / a;
		if (w == 1)
		{
			;
		}
		else
		{
			if (u > v)
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

