package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len1;
		int len2;
		double rate;
		double rate0;
		double sum = 0;
		String line1 = new String(new char[501]);
		String line2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate0 = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			line1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			line2 = tempVar3.charAt(0);
		}
		len1 = line1.length();
		len2 = line2.length();
		if (len1 == len2)
		{
			for (i = 0;i < len1;i++)
			{
				if (line1.charAt(i) == line2.charAt(i))
				{
					sum++;
				}
				if (line1.charAt(i) != 'A' && line1.charAt(i) != 'T' && line1.charAt(i) != 'G' && line1.charAt(i) != 'C' || line2.charAt(i) != 'A' && line2.charAt(i) != 'T' && line2.charAt(i) != 'G' && line2.charAt(i) != 'C')
				{
					System.out.print("error");
					return 0;
				}
			}
			rate = 1.0 * sum / len1;
			if (rate >= rate0)
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
		return 0;
	}
}

