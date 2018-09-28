package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc1 = new String(new char[505]);
		String zfc2 = new String(new char[505]);
		int i;
		int j;
		double k;
		j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			zfc2 = tempVar3.charAt(0);
		}
		if (zfc1.length() != zfc2.length())
		{
			System.out.print("error");
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				zfc1 = tempVar4.charAt(0);
			}
			return 0;
		}
		for (i = 0;i < zfc1.length();i++)
		{
			if ((zfc1.charAt(i) != 'A' && zfc1.charAt(i) != 'T' && zfc1.charAt(i) != 'C' && zfc1.charAt(i) != 'G') || (zfc2.charAt(i) != 'A' && zfc2.charAt(i) != 'T' && zfc2.charAt(i) != 'C' && zfc2.charAt(i) != 'G'))
			{
				System.out.print("error");
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					zfc1 = tempVar5.charAt(0);
				}
				return 0;
			}
		}
		for (i = 0;i < zfc1.length();i++)
		{
			if (zfc1.charAt(i) == zfc2.charAt(i))
			{
				j++;
			}
		}
		if (1.0 * j / zfc1.length() > k)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			zfc1 = tempVar6.charAt(0);
		}
		return 0;
	}
}

