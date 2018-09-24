package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String da = new String(new char[501]);
		String db = new String(new char[501]);
		double s;
		double ss;
		double l;
		int l1;
		int l2;
		int i;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			da = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			db = tempVar3.charAt(0);
		}

		l1 = da.length();
		l2 = db.length();
		if (l1 != l2)
		{
				   System.out.print("error");
				   return 0;
		}
		for (i = 0;i < l1;i++)
		{
			if ((da.charAt(i) != 'A' && da.charAt(i) != 'C' && da.charAt(i) != 'T' && da.charAt(i) != 'G') || (db.charAt(i) != 'A' && db.charAt(i) != 'C' && db.charAt(i) != 'T' && db.charAt(i) != 'G'))
			{
				   System.out.print("error");
				   return 0;
			}
			if (da.charAt(i) == db.charAt(i))
			{
				m++;
			}
		}
		l = l1;
		ss = m / l;
		if (ss > s)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}

		return 0;
	}
}

