package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double m;
		double s;
		int i;
		int c = 0;
		double z;
		double q = 0;
		String a = new String(new char[505]);
		String b = new String(new char[505]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Double.parseDouble(tempVar);
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
		n = a.length();
		m = b.length();


		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'C' && a.charAt(i) != 'G' && a.charAt(i) != 'T')
			{
				c = 1;
			}
		}
		for (i = 0;i < m;i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'C' && b.charAt(i) != 'G' && b.charAt(i) != 'T')
			{
				c = 1;
			}
		}
		if (c == 1 || m != n)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					q++;
				}
			}

			if (q / n >= s)
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

