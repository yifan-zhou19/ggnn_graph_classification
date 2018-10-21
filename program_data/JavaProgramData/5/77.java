package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		int i;
		int len;
		int n = 0;
		int x;
		int y;
		double m;
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
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
		x = a.length();
		y = b.length();
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) > 'Z' || a.charAt(i) < 'A')
			{
				System.out.print("error");
				return 0;
			}
		}
		if (x != y)
		{
			System.out.print("error");
		}
		else
		{
			len = a.length();
			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					n++;
				}
			}

		p = (double)n / len;
		if (p > m)
		{
			System.out.print("yes");
		}
		else if (p <= m)
		{
			System.out.print("no");
		}
		}
		return 0;
	}


}

