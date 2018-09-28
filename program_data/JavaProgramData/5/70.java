package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double s = 0;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String a = new String(new char[600]);
		String b = new String(new char[600]);
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
		int l1;
		int l2;
		l1 = a.length();
		l2 = b.length();
		if (l1 != l2)
		{
			System.out.print("error");
		}
		if (l1 == l2)
		{
			int i;
			int T = 0;
			for (i = 0;a.charAt(i) != '\0' && b.charAt(i) != '\0';i++)
			{
				if ((a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'G' || a.charAt(i) == 'C') && (b.charAt(i) == 'G' || b.charAt(i) == 'T' || b.charAt(i) == 'A' || b.charAt(i) == 'C'))
				{
				if (a.charAt(i) == b.charAt(i))
				{
						s++;
				}
				}
				else
				{
					System.out.print("error");
					T = 1;
					break;

				}
			}
			if (T == 0)
			{
			m = s / l1;
			if (m > n)
			{
				System.out.print("yes");
			}
			if (m <= n)
			{
				System.out.print("no");
			}
			}
		}
		return 0;
	}
}

