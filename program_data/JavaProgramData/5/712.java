package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double k;
		int xt = 0;
		int i;
		int a;
		int b;
		String zfc1 = new String(new char[1000]);
		String zfc2 = new String(new char[1000]);
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
		a = zfc1.length();
		b = zfc2.length();
		for (i = 0;i < a;i++)
		{
			if (zfc1.charAt(i) != 'A' && zfc1.charAt(i) != 'T' && zfc1.charAt(i) != 'G' && zfc1.charAt(i) != 'C')
			{
				a = 0;
				break;
			}
			else
			{
				continue;
			}
		}
		for (i = 0;i < b;i++)
		{
			if (zfc2.charAt(i) != 'A' && zfc2.charAt(i) != 'T' && zfc2.charAt(i) != 'G' && zfc2.charAt(i) != 'C')
			{
				b = 0;
				break;
			}
			else
			{
				continue;
			}
		}
		if (a == 0 || b == 0 || a != b)
		{
			System.out.print("error");
		}
		else
		{
		for (i = 0;i < b;i++)
		{
			if (zfc1.charAt(i) == zfc2.charAt(i))
			{
				xt = xt + 1;
			}
			else
			{
				xt = xt;
			}
		}
		if (b * k < xt)
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

