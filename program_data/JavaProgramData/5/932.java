package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		double n;
		double d;
		double c;
		double r;
		int i;
		int k;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
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
		d = a.length();
		c = b.length();
		k = 0;
		if (c != d)
		{
			System.out.print("error");
		return 0;
		}
		else
		{
			for (i = 0;i < c;i++)
			{
				if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
				{
					k++;
				}
				if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
				{
					k++;
				}
			}
			if (k != 0)
			{
				System.out.print("error");
				return 0;
			}
		}
			s = 0;
		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				s++;
			}
		}
		r = s / d;
		if (r <= n)
		{
			System.out.print("no");
		}
		if (r > n)
		{
			System.out.print("yes");
		}
		return 0;
	}
}

