package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String DNA1 = new String(new char[501]);
		String DNA2 = new String(new char[501]);
		char isbreak;
		isbreak = 'n';
		double x;
		double n;
		int i;
		int l1;
		int l2;
		int t;
		t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
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
		l1 = DNA1.length();
		l2 = DNA2.length();
		if (l1 != l2)
		{
			System.out.print("error");
		}
		else
		{
		for (i = 0;i < l1;i++)
		{
			if ((DNA1.charAt(i) != 'A' && DNA1.charAt(i) != 'T' && DNA1.charAt(i) != 'C' && DNA1.charAt(i) != 'G') || (DNA2.charAt(i) != 'A' && DNA2.charAt(i) != 'T' && DNA2.charAt(i) != 'C' && DNA2.charAt(i) != 'G'))
			{
				isbreak = 'y';
				break;
			}
			else
			{
				if (DNA1.charAt(i) == DNA2.charAt(i))
				{
					t++;
				}
			}
		}
		if (isbreak == 'y')
		{
			System.out.print("error");
		}
		else
		{
			x = (1.0 * t) / l1;
			if (x > n)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		}
		return 0;
	}
}

