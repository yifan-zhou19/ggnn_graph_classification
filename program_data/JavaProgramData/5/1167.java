package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		String b = new String(new char[501]);
		String c = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		int i;
		int t = 0;
		for (i = 0;i < b.length();i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			{
				t = 1;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) != 'A' && c.charAt(i) != 'T' && c.charAt(i) != 'C' && c.charAt(i) != 'G')
			{
				t = 1;
			}
		}
		if (b.length() != c.length() || t == 1)
		{
			System.out.print("error");
		}
			else
			{

			int i;
			int sum = 0;
			for (i = 0;i < b.length();i++)
			{
				if (b.charAt(i) == c.charAt(i))
				{
					sum++;
				}
			}
			double d;
			int m;
			m = b.length();
			d = sum * 1.0 / m;
			if (d > a)
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

