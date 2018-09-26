package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String y = new String(new char[501]);
		String s = new String(new char[501]);
		double h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s = tempVar3.charAt(0);
		}
		int len = y.length();
		int i;
		int sum = 0;
		int l = s.length();
		if (len != l)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < len;i++)
		{
			if ((y.charAt(i) != 'A' && y.charAt(i) != 'T' && y.charAt(i) != 'C' && y.charAt(i) != 'G') || (s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'C' && s.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
			else if (y.charAt(i) == s.charAt(i))
			{
				sum++;
			}
		}
		double p = (double)sum / len;
		if (p > h)
		{
			System.out.print("yes");
			return 0;
		}
		System.out.print("no");
		return 0;
	}

}

