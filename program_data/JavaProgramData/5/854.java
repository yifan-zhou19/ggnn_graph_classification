package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		String s = new String(new char[501]);
		String d = new String(new char[501]);
		int n;
		int m;
		int i;
		int j;
		int p = 0;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			d = tempVar3.charAt(0);
		}
		n = s.length();
		m = d.length();
		if (n != m)
		{
			System.out.print("error");
		}
		else if (n == m)
		{
			for (i = 0;i < n - 1;i++)
			{
				if (s.charAt(i) != 'A' && s.charAt(i) != 'G' && s.charAt(i) != 'C' && s.charAt(i) != 'T')
				{
					   q = 0;
					break;
				}
				else if (s.charAt(i) == d.charAt(i))
				{
					   p++;
				}
				else if (s.charAt(i) != d.charAt(i))
				{
					   p = p + 0;
				}
			}
			b = 1.0 * p / (n - 1);
			if (b > a && q != 0)
			{
				System.out.print("yes");
			}
			else if (b < a && q != 0)
			{
				System.out.print("no");
			}
			else if (q == 0)
			{
				System.out.print("error");
			}
		}
		return 0;
	}


}

