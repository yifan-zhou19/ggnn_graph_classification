package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		int k;
		int i;
		int j = 0;
		int l;
		String s = new String(new char[501]);
		String c = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		k = s.length();
		l = c.length();
		for (i = 0;s.charAt(i);i++)
		{
			if (k != l || (s.charAt(i) != 'A' && s.charAt(i) != 'G' && s.charAt(i) != 'C' && s.charAt(i) != 'T') || (c.charAt(i) != 'A' && c.charAt(i) != 'G' && c.charAt(i) != 'C' && c.charAt(i) != 'T'))
			{
				j = -1;
				break;
			}
			if (0 == s.charAt(i) - c.charAt(i))
			{
				j++;
			}
		}
		if (n <= 1.00 * j / k && j != 0)
		{
			System.out.print("yes");
		}
		else if (j == -1)
		{
			System.out.print("error");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

