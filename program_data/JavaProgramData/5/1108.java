package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Double.parseDouble(tempVar);
		}
		int flag;
		int i;
		int x = 0;
		String d1 = new String(new char[501]);
		String d2 = new String(new char[501]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d2 = tempVar3.charAt(0);
		}
		for (i = 0;i < (d1.length() - 1) && i < (d2.length() - 1);i++)
		{
			if ((d1.charAt(i) == 'A' || d1.charAt(i) == 'T' || d1.charAt(i) == 'C' || d1.charAt(i) == 'G') && (d2.charAt(i) == 'A' || d2.charAt(i) == 'T' || d2.charAt(i) == 'C' || d2.charAt(i) == 'G'))
			{
				flag = 1;
			}
			else
			{
				flag = 0;
				break;
			}
		}
		if (d1.length() != d2.length() || flag == 0)
		{
			System.out.print("error");
				return 0;
		}
		else
		{
			for (i = 0;i < d1.length();i++)
			{
				if (d1.charAt(i) == d2.charAt(i))
				{
					x++;
				}
			}
		}
		if (1.0 * x / (d1.length() - 1) > k)
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

