package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double r;
		String s = new String(new char[501]);
		String t = new String(new char[501]);
		int m;
		int n;
		int i;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = tempVar3.charAt(0);
		}
		m = s.length();
		n = t.length();
		if (m != n)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if ((s.charAt(i) != 'A' && s.charAt(i) != 'G' && s.charAt(i) != 'C' && s.charAt(i) != 'T') || (t.charAt(i) != 'A' && t.charAt(i) != 'G' && t.charAt(i) != 'C' && t.charAt(i) != 'T'))
				{
					k = -1;
					break;
				}
				else if (s.charAt(i) == t.charAt(i))
				{
					k++;
				}
			}
			if (k == -1)
			{
				System.out.print("error");
			}
			else if ((1.0 * k / n) > r)
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

