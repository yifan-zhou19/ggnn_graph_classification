package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int m;
		int n;
		int z;
		double x;
		String p = new String(new char[500]);
		String q = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			q = tempVar3.charAt(0);
		}
		a = p.length();
		b = q.length();
		for (i = 0;i < a;i++)
		{
			if ((p.charAt(i) != 'A') && (p.charAt(i) != 'T') && (p.charAt(i) != 'C') && (p.charAt(i) != 'G'))
			{
				m = 0;
			}
		}
		for (i = 0;i < b;i++)
		{
			if ((q.charAt(i) != 'A') && (q.charAt(i) != 'T') && (q.charAt(i) != 'C') && (q.charAt(i) != 'G'))
			{
				n = 0;
			}
		}
		if (a != b || m == 0 || n == 0)
		{
			System.out.print("error");
		}
		else
		{
			z = 0;
			for (i = 0;i < a;i++)
			{
				if (p.charAt(i) == q.charAt(i))
				{
					z++;
				}
			}
			if ((1.0 * z / a) > x)
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

