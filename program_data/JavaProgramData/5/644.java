package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int left = 0;
		int right = 0;
		int a = 0;
		int get = 0;
		int i;
		double m;
		double q;
		String l = new String(new char[520]);
		String r = new String(new char[520]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			r = tempVar3.charAt(0);
		}
		for (i = 0;l.charAt(i);i++)
		{
			left++;
			if (l.charAt(i) != 'A' && l.charAt(i) != 'G' && l.charAt(i) != 'T' && l.charAt(i) != 'C')
			{
				a = 1;
			}
		}
		for (i = 0;r.charAt(i);i++)
		{
			right++;
			if (r.charAt(i) != 'A' && r.charAt(i) != 'G' && r.charAt(i) != 'T' && r.charAt(i) != 'C')
			{
				a = 1;
			}
		}
		if (a == 1 || left != right)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;l.charAt(i);i++)
			{
				if (l.charAt(i) == r.charAt(i))
				{
					get++;
				}
			}
			q = 1.0 * get / left;
			if (q > m)
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

