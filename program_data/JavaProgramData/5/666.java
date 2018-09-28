package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int n;
		int L;
		int t;
		double q;
		double p;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Double.parseDouble(tempVar);
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
		l = a.length();
		L = b.length();

		if (l != L)
		{
			System.out.print("error\n");
		}
		else
		{
			t = 1;
			for (i = 0;i < l;i++)
			{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
			{
				t = 0;
				break;
			}
			else if (a.charAt(i) == b.charAt(i))
			{
				n++;

			}
			}
		if (t == 1)
		{
		q = 1.0 * n / l;
		if (q > p)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
		}
		if (t == 0)
		{
			System.out.print("error\n");
		}
		}
		return 0;
	}
}

