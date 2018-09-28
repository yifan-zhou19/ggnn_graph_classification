package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s = 0;
		int n;
		int l1;
		int l2;
		int f = 0;
		int i;
		double m;
		double x;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
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
		l1 = a.length();
		l2 = b.length();
		if (l1 != l2)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
				{
					f = 1;
				}
			}
			if (f == 1)
			{
				System.out.print("error\n");
			}
			else
			{
				for (i = 0;i < l1;i++)
				{
					if (a.charAt(i) == b.charAt(i))
					{
						s++;
					}
				}
				x = (double)s / l1;
				if (x > m)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
		}
		return 0;
	}
}

