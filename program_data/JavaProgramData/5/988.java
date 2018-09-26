package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int r;
		int t;
		int n;
		int q;
		int e;
		int i;
		double m;
		double w;
		n = 0;
		r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		q = a.length();
		e = b.length();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C')
			{
				r++;
			}
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
			{
				r++;
			}
		}
		if (q != e || r != 0)
		{
			System.out.print("error");
		}
		else
		{
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			t = a.charAt(i) - b.charAt(i);
			if (t == 0)
			{
				n++;
			}
		}
		w = 1.0 * n / q;
		if (w > m)
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

