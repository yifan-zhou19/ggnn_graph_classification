package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n = 0;
		int len1;
		int len2;
		double p;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Double.parseDouble(tempVar);
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
		len1 = a.length();
		len2 = b.length();
		if (len1 != len2)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < len1;i++)
		{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
			if (a.charAt(i) == b.charAt(i))
			{
				n++;
			}
		}
		if ((double)n / len1 > p)
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

