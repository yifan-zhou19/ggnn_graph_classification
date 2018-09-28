package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int len1;
		int len2;
		int m = 0;
		double a;
		double n;
		double b;
		String jy1 = new String(new char[501]);
		String jy2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
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
		len1 = jy1.length();
		len2 = jy2.length();
		for (i = 0;i < len1;i++)
		{
			if ((jy1.charAt(i) != 'A') && (jy1.charAt(i) != 'T') && (jy1.charAt(i) != 'C') && (jy1.charAt(i) != 'G'))
			{
				m++;
			}
		}
		for (j = 0;j < len2;j++)
		{
			if ((jy2.charAt(j) != 'A') && (jy2.charAt(j) != 'T') && (jy2.charAt(j) != 'C') && (jy2.charAt(j) != 'G'))
			{
				m++;
			}
		}
		if (m > 0)
		{
			System.out.print("error");
		}
		else if (len1 == len2)
		{
			for (i = 0;i < len1;i++)
			{
				if (jy1.charAt(i) == jy2.charAt(i))
				{
					n++;
				}
			}
			b = n / len1;
			if (b > a)
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
	}

}

