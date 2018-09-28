package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[510]);
		String s2 = new String(new char[510]);
		double n;
		double q;
		int i;
		int len1;
		int len2;
		int D;
		int c;
		int d;
		int f;
		c = 0;
		D = 1;
		d = f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s2 = tempVar3.charAt(0);
		}
		len1 = s1.length();
		len2 = s2.length();
		if (len1 != len2)
		{
			D = 0;
		}
		else if (len1 == len2)
		{
			for (i = 0;i < len1;i++)
			{
				if (s1.charAt(i) != 'A' && s1.charAt(i) != 'G' && s1.charAt(i) != 'C' && s1.charAt(i) != 'T')
				{
					d++;
				}
			}
			if (d > 0)
			{
				D = 0;
			}
			for (i = 0;i < len1;i++)
			{
				if (s2.charAt(i) != 'A' && s2.charAt(i) != 'G' && s2.charAt(i) != 'C' && s2.charAt(i) != 'T')
				{
					 f++;
				}
			}
			if (f > 0)
			{
				D = 0;
			}
		}
		for (i = 0;i < len1;i++)
		{
			if (s1.charAt(i) == s2.charAt(i))
			{
				c++;
			}
		}
		q = 1.0 * c / len1;
		if (D == 1 && q > n)
		{
			System.out.print("yes");
		}
		else if (D == 1 && q <= n)
		{
			System.out.print("no");
		}
		else if (D == 0)
		{
			System.out.print("error");
		}
		return 0;
	}


}

