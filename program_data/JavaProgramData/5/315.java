package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a = 0;
		int b = 0;
		int p = 0;
		String sz = new String(new char[10000]);
		String s = new String(new char[10000]);
		double n;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s = tempVar3.charAt(0);
		}
		for (i = 0;sz.charAt(i);i++)
		{
			if (sz.charAt(i) == s.charAt(i))
			{
		a++;
			}
		b++;
		if ((sz.charAt(i) != 'A' && sz.charAt(i) != 'T' && sz.charAt(i) != 'C' && sz.charAt(i) != 'G') || (s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'C' && s.charAt(i) != 'G'))
		{
			p++;
		}
		}
	c = 1.0 * a / b;
	if (p != 0)
	{
		System.out.print("error");
	}

	 if (p == 0 && c > n)
	 {
		System.out.print("yes");
	 }
	 if (p == 0 && c <= n)
	 {
		System.out.print("no");
	 }



	return 0;
	}
}

