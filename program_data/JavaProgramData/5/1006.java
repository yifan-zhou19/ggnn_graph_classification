package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double r;
		int i;
		int a;
		int b;
		int c;
		int d;
		int e = 0;
		String q = new String(new char[501]);
		String w = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			q = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			w = tempVar3.charAt(0);
		}
		a = q.length();
		b = w.length();
		if (a != b)
		{
			System.out.print("error");
		}
		else
		{
			c = a,d = b;
		   for (i = 0;i < a;i++)
		   {
			   if (q.charAt(i) != 'A' && q.charAt(i) != 'C' && q.charAt(i) != 'G' && q.charAt(i) != 'T')
			   {
				c--;
			   }
		   }
		for (i = 0;i < b;i++)
		{
			if (w.charAt(i) != 'A' && w.charAt(i) != 'C' && w.charAt(i) != 'G' && w.charAt(i) != 'T')
			{
				d--;
			}
		}
		if (a != c || b != d)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < a;i++)
			{
				if (q.charAt(i) == w.charAt(i))
				{
					e++;
				}
			}
		   r = 1.0 * e / a;
		if (r >= n)
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

