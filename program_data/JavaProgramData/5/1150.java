package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int result;
		double c;
		double w;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Double.parseDouble(tempVar);
		}
		scanf("\n");
		String xlyi = new String(new char[501]);
		String xler = new String(new char[501]);
		xlyi = new Scanner(System.in).nextLine();
		xler = new Scanner(System.in).nextLine();
		n = xlyi.length();
		m = xler.length();
		if (m != n)
		{
			result = 0;
		}
		else
		{
		for (i = 0;i < n;i++)
		{
			if ((xlyi.charAt(i) != 'A' && xlyi.charAt(i) != 'G' && xlyi.charAt(i) != 'C' && xlyi.charAt(i) != 'T') || (xler.charAt(i) != 'A' && xler.charAt(i) != 'G' && xler.charAt(i) != 'C' && xler.charAt(i) != 'T'))
			{
				result = 0;
			}
			else
			{
				result = 1;
			}
		}
		}
		if (result == 1)
		{
		for (i = 0;i < m;i++)
		{
				if (xlyi.charAt(i) == xler.charAt(i))
				{
					a++;
				}
		}
		}
		c = 1.00 * a / n;
		if (result == 0)
		{
			System.out.print("error");
		}
		else if (c >= w)
		{
			System.out.print("yes");
		}
		else if (c < w)
		{
			System.out.print("no");
		}
		return 0;
	}

}

