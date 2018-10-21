package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k = 0;
		int la;
		int lb;
		double n;
		double s = 0;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
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
		la = a.length(),lb = b.length();
		if (la != lb)
		{
				k = 2;
		}
		else
		{
			for (i = 0;i < la;i++)
			{
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'T' && b.charAt(i) != 'C'))
				{
					k = 2;
					break;
				}
			}
			if (k != 2)
			{
				for (i = 0;i < la;i++)
				{
					if (a.charAt(i) == b.charAt(i))
					{
						s++;
					}
				}
				s = s / la;
				if (s <= n)
				{
					k = 1;
				}
				else
				{
					k = 0;
				}
			}
		}
		if (k == 1)
		{
			System.out.print("no");
		}
		if (k == 0)
		{
			System.out.print("yes");
		}
		if (k == 2)
		{
			System.out.print("error");
		}
		return 0;
	}





}

