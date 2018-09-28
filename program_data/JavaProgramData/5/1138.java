package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double rate;
		int x1;
		int x2;
		int y = 0;
		int i;
		int flag = 0;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Double.parseDouble(tempVar);
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
		x1 = a.length();
		x2 = b.length();
		for (i = 0;i < x1;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'C' && a.charAt(i) != 'T' && a.charAt(i) != 'G')
			{
				flag = 1;
				break;
			}
		}
		for (i = 0;i < x1;i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'C' && b.charAt(i) != 'T' && b.charAt(i) != 'G')
			{
				flag = 1;
				break;
			}
		}
		if (flag == 0 && x1 == x2)
		{
			for (i = 0;i < x1;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					y++;
				}
			}
			if ((double)y / (double)x1 > rate)
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

