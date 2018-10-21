package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double p;
		int la;
		int i;
		int y = 0;
		int lb;
		int s = 0;
		String zfa = new String(new char[501]);
		String zfb = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfa = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			zfb = tempVar3.charAt(0);
		}
		la = zfa.length();
		lb = zfb.length();
		if (la != lb)
		{
		   y = 1;
		}
		if (y == 0)
		{
		for (i = 0;zfa.charAt(i) != '\0' && zfb.charAt(i) != '\0';i++)
		{
			if (((zfa.charAt(i) != 'A') && (zfa.charAt(i) != 'T') && (zfa.charAt(i) != 'C') && (zfa.charAt(i) != 'G')) || ((zfb.charAt(i) != 'A') && (zfb.charAt(i) != 'T') && (zfb.charAt(i) != 'C') && (zfb.charAt(i) != 'G')))
			{
				y = 1;
				break;

			}
			if (zfa.charAt(i) == zfb.charAt(i))
			{
			s++;
			}
		}
		if ((1.0 * s / la) > p && y == 0)
		{
		System.out.print("yes");
		}
		else if (y == 0)
		{
		System.out.print("no");
		}
		}
		if (y == 1)
		{
	 System.out.print("error");

		}



		return 0;









	}
}

