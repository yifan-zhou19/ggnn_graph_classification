package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		int c;
		int d;
		int m = 0;
		int z = 0;
		double e;
		double f;
		double g;
		double h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Double.parseDouble(tempVar);
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
			for (int i = 0;a.charAt(i) != '\0';i++)
			{
			if ((a.charAt(i) == 'A') || (a.charAt(i) == 'T') || (a.charAt(i) == 'C') || (a.charAt(i) == 'G'))
			{
				z++;
			}
			}
		for (int i = 0;b.charAt(i) != '\0';i++)
		{
			if ((b.charAt(i) == 'A') || (b.charAt(i) == 'T') || (b.charAt(i) == 'C') || (b.charAt(i) == 'G'))
			{
				z++;
			}
		}

		c = a.length();
		d = b.length();
		if (c == d)
		{
			for (int i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					m++;
				}
			}
			f = m;
			g = c;
			e = f / g;
			if (e >= h != 0 && z == 2 * c)
			{
				System.out.print("yes");
			}
			else if (e < h && z == 2 * c)
			{
				System.out.print("no");
			}
		}
		if (c != d || z != 2 * c)
		{
			System.out.print("error");
		}
		return 0;
		}
}

