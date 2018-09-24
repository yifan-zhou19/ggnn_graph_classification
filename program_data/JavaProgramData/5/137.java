package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String asd = new String(new char[500]);
		String zxc = new String(new char[500]);
		int i;
		int j;
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			asd = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			zxc = tempVar3.charAt(0);
		}
		int len1 = asd.length();
		int len2 = zxc.length();
		int a1 = 0;
		int a2 = 0;
		for (i = 0;i < len1;i++)
		{
			if (asd.charAt(i) != 'A' && asd.charAt(i) != 'C' && asd.charAt(i) != 'G' && asd.charAt(i) != 'T')
			{
				a1++;
			}
		}
		for (i = 0;i < len2;i++)
		{
			if (zxc.charAt(i) != 'A' && zxc.charAt(i) != 'C' && zxc.charAt(i) != 'G' && zxc.charAt(i) != 'T')
			{
				a2++;
			}
		}
		if (a1 != 0 || a2 != 0 || len1 != len2)
		{
			System.out.print("error");
		}
		else
		{
			int d = 0;
			for (i = 0;i < len1;i++)
			{
				if (asd.charAt(i) == zxc.charAt(i))
				{
				d++;
				}
			}
			double result = 1.0 * d / len1;
			if (result > n)
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

