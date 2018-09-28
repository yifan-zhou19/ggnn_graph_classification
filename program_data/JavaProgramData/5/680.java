package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int t = 0;
		int l1;
		int l2;
		int l;
		int s1 = 0;
		int s2 = 0;
		double n;
		double t1;
		double t2;
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
		if (l1 != l2)
		{

			System.out.print("error");

		}
		else
		{
			for (j = 0;a.charAt(j);j++)
			{
				if (!(a.charAt(j) == 'A' || a.charAt(j) == 'T' || a.charAt(j) == 'C' || a.charAt(j) == 'G'))
				{
				   System.out.print("error");
				   s1++;
				   break;
				}
			}
			if (s1 == 0)
			{
			for (j = 0;b.charAt(j);j++)
			{
				if (!(b.charAt(j) == 'A' || b.charAt(j) == 'T' || b.charAt(j) == 'C' || b.charAt(j) == 'G'))
				{
				   System.out.print("error");
				   s2++;
				   break;
				}
			}
			}
			if (s1 == 0 && s2 == 0)
			{
		for (i = 0;a.charAt(i);i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				t++;
			}
		}
		l = a.length();
		t1 = l;
		t2 = t;
		if (t2 / t1 > n)
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

