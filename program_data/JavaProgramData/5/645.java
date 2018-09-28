package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double r;
		double k = 0;
		double p;
		int i;
		int q = 1;
		String s = new String(new char[600]);
		String s1 = new String(new char[600]);
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
			s1 = tempVar3.charAt(0);
		}
	for (i = 0;i < s.length();i++)
	{
		if ((s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'C' && s.charAt(i) != 'G' && s.charAt(i) != 'A') || (s1.charAt(i) != 'T' && s1.charAt(i) != 'C' && s1.charAt(i) != 'G' && s1.charAt(i) != 'A'))
		{
				System.out.print("error");
				   q = 0;
				   break;
		}
	}
	if (q == 1)
	{
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) == s1.charAt(i))
			{
				k++;
			}
		}
		p = 1.0 * k / s.length();
		if (p > r)
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

