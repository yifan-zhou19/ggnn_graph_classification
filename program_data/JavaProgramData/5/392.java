package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t = 0;
		int s = 0;
		int l1;
		int l2;
		double n;
		double m;
		String a = new String(new char[256]);
		String b = new String(new char[256]);
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		l1 = a.length();
		l2 = b.length();
		for (i = 0;i < l1;i++)
		{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
			{
				s = s + 1;
			}
		}
		if (s != 0 || l1 != l2)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					t = t + 1;
				}
			}
			m = (double)t / l1;
			if (m > n)
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

