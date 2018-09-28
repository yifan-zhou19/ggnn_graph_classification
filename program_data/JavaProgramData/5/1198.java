package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int p = 0;
		int q = 0;
		int judge = 0;
		double n;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
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
		p = a.length();
		for (i = 0;i < p;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < p;i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < p;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				q++;
			}
		}
		if (1.0 * q / p >= n)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

