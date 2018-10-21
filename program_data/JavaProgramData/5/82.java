package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double r;
		double x;
		int l;
		int l1;
		int l2;
		int i;
		int j;
		int t = 0;
		int flag = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Double.parseDouble(tempVar);
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
			if (a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G')
			{
				continue;
			}
			else
			{
				flag = 1;
			}
		}
		for (j = 0;j < l2;j++)
		{
			if (b.charAt(j) == 'A' || b.charAt(j) == 'T' || b.charAt(j) == 'C' || b.charAt(j) == 'G')
			{
				continue;
			}
			else
			{
				flag = 1;
			}
		}
		if (l1 != l2 || flag == 1)
		{
			System.out.print("error");
			return 0;
		}
		else
		{
			l = l1;
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					t = t + 1;
				}
			}
			x = (double)t / l;
			if (x > r)
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

