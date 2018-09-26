package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		double c;
		double d;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		m = a.length();
		n = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
				if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
				{
					 break;
				}
				if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
				{
					break;
				}
		}
		if (a.length() != b.length())
		{
			System.out.print("error");
		}
		else if (i < m)
		{
			System.out.print("error");
		}
		else if (i >= m)
		{
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					 n += 1;
				}
			}
			d = 1.0 * n / m;
			if (d > c)
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

