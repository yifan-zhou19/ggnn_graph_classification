package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len1;
		int len2;
		double n;
		double j = 0;
		double e = 0;
		String s = new String(new char[501]);
		String a = new String(new char[501]);
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
			a = tempVar3.charAt(0);
		}
		len1 = s.length();
		len2 = a.length();
		if (len1 != len2)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < len1;i++)
		{
			if ((s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'C' && s.charAt(i) != 'G') || (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
			if ((s.charAt(i) == 'A' || s.charAt(i) == 'T' || s.charAt(i) == 'C' || s.charAt(i) == 'G' || a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G') && s.charAt(i) == a.charAt(i))
			{
				j = j + 1;
			}
		}
		e = j / len1;
		if (e > n)
		{
			System.out.print("yes");
		}
		else if (e <= n)
		{
			System.out.print("no");
		}
		return 0;
	}


}

