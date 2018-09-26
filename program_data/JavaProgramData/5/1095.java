package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double rate;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Double.parseDouble(tempVar);
		}
		String DNA1 = new String(new char[501]);
		String DNA2 = new String(new char[501]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			DNA1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			DNA2 = tempVar3.charAt(0);
		}
		int i;
		int k = 0;
		int len1 = DNA1.length();
		int len2 = DNA2.length();
		int m1 = 0;
		int m2 = 0;
		for (i = 0;i < len1;i++)
		{
			if (DNA1.charAt(i) != 'A' && DNA1.charAt(i) != 'G' && DNA1.charAt(i) != 'C' && DNA1.charAt(i) != 'T')
			{
				m1++;
				break;
			}
		}
		for (i = 0;i < len2;i++)
		{
			if (DNA2.charAt(i) != 'A' && DNA2.charAt(i) != 'G' && DNA2.charAt(i) != 'C' && DNA2.charAt(i) != 'T')
			{
				m2++;
				break;
			}
		}
		if (len1 != len2 || m1 == 1 || m2 == 1)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				if (DNA1.charAt(i) == DNA2.charAt(i))
				{
					k++;
				}
			}
			double p = 1.0 * k / len1;
			if (p > rate)
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

