package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double bz;
		double sj;
		int n1;
		int n2;
		int n;
		int i;
		int p;
		String jy1 = new String(new char[501]);
		String jy2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bz = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			jy1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			jy2 = tempVar3.charAt(0);
		}
		p = 0;
		n1 = jy1.length();
		n2 = jy2.length();
		if (n1 == n2)
		{
			n = n1;
		}
		else
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < n;i++)
		{
			if ((jy1.charAt(i) != 65 && jy1.charAt(i) != 84 && jy1.charAt(i) != 67 && jy1.charAt(i) != 71) || (jy2.charAt(i) != 65 && jy2.charAt(i) != 84 && jy2.charAt(i) != 67 && jy2.charAt(i) != 71))
			{
				System.out.print("error");
				return 0;
			}
			else
			{
			if (jy1.charAt(i) == jy2.charAt(i))
			{
				p++;
			}
			else
			{
				p = p;
			}
			}
		}
		sj = 1.0 * p / n;
		if (sj >= bz)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

