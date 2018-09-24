package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int i;
		int m;
		double n;
		m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		int p = a.length();
		int q = b.length();
		if (p == q)
		{
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'C') && (a.charAt(i) != 'G')) || ((b.charAt(i) != 'A') && (b.charAt(i) != 'T') && (b.charAt(i) != 'C') && (b.charAt(i) != 'G')))
				{
					System.out.print("error");
					return 0;
				}
				else
				{
					if ((a.charAt(i)) == (b.charAt(i)))
					{
						m++;
					}
				}
			}
			if ((1.0 * m / (p * 1.0)) >= n)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}

}

