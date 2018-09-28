package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x;
		int y;
		double w;
		double sum = 0;
		double p;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Double.parseDouble(tempVar);
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
	x = a.length();
	y = b.length();
		if (x == y)
		{
			for (i = 0;i < x;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					sum++;
				}
				else if ((a.charAt(i) != 'A' && a.charAt(i) != 'C' && a.charAt(i) != 'T' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'C' && b.charAt(i) != 'T' && b.charAt(i) != 'G'))
				{
				System.out.print("error\n");
				return 0;
				}
			}

		}
		else if (x != y)
		{
			System.out.print("error\n");
			return 0;
		}
		while (x == y)
		{
			p = sum / x;
			if (p >= w)
			{
				System.out.print("yes\n");
				break;
			}
			else
			{
				System.out.print("no\n");
			}
			break;
		}

		return 0;
	}


}

