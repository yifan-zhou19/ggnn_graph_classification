package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l1;
		int l2;
		int l;
		int n;
		int i;
		double p;
		double P;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			P = Double.parseDouble(tempVar);
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
		l1 = a.length();
		l2 = b.length();
		if (l1 == l2)
		{
			l = l1;
			n = 0;
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
				{
					System.out.print("error\n");
					return 0;
				}
				if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
				{
					System.out.print("error\n");
					return 0;
				}
			}
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					n++;
				}
			}
			p = 1.0 * n / l;
			if (p > P)
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

		return 0;
	}



}

