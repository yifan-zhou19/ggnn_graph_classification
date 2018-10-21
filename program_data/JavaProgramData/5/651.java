package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double m;
		int i;
		int a;
		int b;
		int c;
		int d;
		int e;
		String w = new String(new char[501]);
		String f = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			f = tempVar3.charAt(0);
		}
		a = 0;
		b = 0;
		c = w.length();
		d = f.length();
		e = 0;
		if (c != d)
		{
			e = 1;
		}
		else
		{
			for (i = 0;i < c;i++)
			{
				if (!(w.charAt(i) == 'A' || w.charAt(i) == 'C' || w.charAt(i) == 'T' || w.charAt(i) == 'G'))
				{
				e = 1;
				break;
				}
			}
			for (i = 0;i < d;i++)
			{
				if (!(f.charAt(i) == 'A' || f.charAt(i) == 'C' || f.charAt(i) == 'T' || f.charAt(i) == 'G'))
				{
				e = 1;
				break;
				}
			}
		}
		if (e == 1)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < d;i++)
			{
				if (w.charAt(i) == f.charAt(i))
				{
				a++;
				}
				b++;
			}
			m = 1.0 * a / b;
			if (m >= n)
			{
				System.out.print("yes");
			}
			else if (m < n)
			{
				System.out.print("no");
			}
		}
		return 0;
	}




}

