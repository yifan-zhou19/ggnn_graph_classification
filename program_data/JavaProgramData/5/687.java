package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double m;
		double n;
		int i;
		int l;
		int s = 0;
		int q = 0;
		String a = new String(new char[550]);
		String b = new String(new char[550]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
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
		l = a.length();
		if (l != b.length())
		{
			q = 1;
		}
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
			{
				q = 1;
			}
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			{
				q = 1;
			}
		}
		if (q == 0)
		{
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					s += 1;
				}
			}
			n = 1.00 * s / l;
			if (m < n)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		if (q == 1)
		{
			System.out.print("error");
		}
		return 0;
	}
}

