package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		int m;
		int n;
		int i;
		int j = 0;
		int k = 0;
		double x;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
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
		m = a.length();
		n = b.length();
		if (m == n)
		{
			for (i = 0;i < m;i++)
			{
				if (a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T')
				{
					k = 1;
					break;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T')
				{
					k = 1;
					break;
				}
			}
			if (k != 1)
			{
			for (i = 0;i < m;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					j += 1;
				}
			}
			e = j * 1.0 / m;
			if (e > x)
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
		else
		{
			System.out.print("error");
		}
		return 0;
	}




}

