package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int l1;
		int l2;
		int n;
		int i;
		int j;
		int k;
		int num = 0;
		int f = 0;
		double s;
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Double.parseDouble(tempVar);
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
		System.out.print("error");
		f = 1;
		return 0;
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C')
				{
		System.out.print("error");
		f = 1;
			return 0;
				}
			}
		for (i = 0;i < l2;i++)
		{
				if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
				{
		System.out.print("error");
		f = 1;
		return 0;
				}
		}
		if (f == 0)
		{
			for (i = 0;i < l1;i++)
			{
		if (a.charAt(i) == b.charAt(i))
		{
			num++;
		}
			}
		}
		if (f == 0)
		{
		p = (double)num / l1;
		if (p > s)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		}
		}




		return 0;
	}


}

