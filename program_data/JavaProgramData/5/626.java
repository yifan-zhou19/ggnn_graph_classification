package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double m;
		double x;
		int t = 0;
		int a;
		int b;
		int u = 0;
		String ji = new String(new char[501]);
		String yin = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ji = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			yin = tempVar3.charAt(0);
		}
		a = ji.length();
		b = yin.length();
		if (a != b)
		{
			System.out.print("error");
		}
		else
		{
			for (int q = 0;q < a;q++)
			{
				if ((ji.charAt(q) != 'A' && ji.charAt(q) != 'T' && ji.charAt(q) != 'C' && ji.charAt(q) != 'G') || (yin.charAt(q) != 'A' && yin.charAt(q) != 'C' && yin.charAt(q) != 'T' && yin.charAt(q) != 'G'))
				{
					u = 1;
				}
			}
			if (u == 1)
			{
				System.out.print("error");
			}
			else
			{
			   for (int h = 0;h < a;h++)
			   {
				if (ji.charAt(h) == yin.charAt(h))
				{
					t++;
				}
			   }
			x = 1.0 * t / a;
			if (x > m)
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

