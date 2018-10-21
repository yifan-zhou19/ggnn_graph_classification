package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int c;
		int d;
		int i;
		double a;
		double e;
		double f;
		String n = new String(new char[501]);
		String m = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = tempVar3.charAt(0);
		}
		b = n.length();
		c = m.length();
		d = 0;
		if (b != c)
		{
		 d++;
		}
		for (i = 0;i < b;i++)
		{
			if ((n.charAt(i) != 'A') && (n.charAt(i) != 'T') && (n.charAt(i) != 'C') && (n.charAt(i) != 'G') || (m.charAt(i) != 'A') && (m.charAt(i) != 'T') && (m.charAt(i) != 'C') && (m.charAt(i) != 'G'))
			{
				d++;
			}
		}
			if (d != 0)
			{
				System.out.print("error");
			}
			else
			{
				e = 0;
			for (i = 0;i < b;i++)
			{
				if (n.charAt(i) == m.charAt(i))
				{
					e++;
				}
			}
				 f = e / b;
				 if (f > a)
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

