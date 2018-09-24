package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int c;
		int d;
		int e = 0;
		int t = 0;
		double n;
		double m;
		String a = new String(new char[501]);
		String b = new String(new char[500]);
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
		c = a.length();
		d = b.length();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T')
			{
				t++;
			}
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T')
			{
				t++;
			}
		}
		if (t > 0)
		{
			System.out.print("error");
		}
		else if (t == 0)
		{
			if (c == d)
			{
				for (i = 0;a.charAt(i) != '\0';i++)
				{
					if (a.charAt(i) == b.charAt(i))
					{
						e++;
					}
				}
				m = e * 1.0 / c;
				if (m > n)
				{
					System.out.print("yes");
				}
				else
				{
				   System.out.print("no");
				}
			}
			else
			{
				System.out.print("error");
			}
		}
		return 0;
	}

}

