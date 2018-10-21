package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b = 0;
		int a;
		int len1;
		int len2;
		int x = 0;
		int c;
		double bz;
		String m1 = new String(new char[505]);
		String m2 = new String(new char[505]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bz = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m2 = tempVar3.charAt(0);
		}
		len1 = m1.length();
		len2 = m2.length();
		if (len1 != len2)
		{
			x = 1;
		}
		for (c = 0;c < len1;c++)
		{
			if (m1.charAt(c) != 'A' && m1.charAt(c) != 'T' && m1.charAt(c) != 'C' && m1.charAt(c) != 'G' || m2.charAt(c) != 'A' && m2.charAt(c) != 'T' && m2.charAt(c) != 'C' && m2.charAt(c) != 'G')
			{
				x = 1;
			}
		}
		if (x != 0)
		{
			System.out.print("error");
		}
		else
		{
			for (a = 0;a < len1;a++)
			{
				if (m1.charAt(a) == m2.charAt(a))
				{
					b++;
				}
			}
			if (b * 1.0 / len1 > bz)
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

