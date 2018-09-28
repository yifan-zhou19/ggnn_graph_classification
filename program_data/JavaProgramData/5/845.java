package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double z;
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = Double.parseDouble(tempVar);
		}
		String zfc = new String(new char[501]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc = tempVar2.charAt(0);
		}
		String bjc = new String(new char[501]);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			bjc = tempVar3.charAt(0);
		}
		i = 0;
		j = 0;
		c = 0;
		d = 0;
		n = 0;
		while (zfc.charAt(i) != '\0')
		{
			i++;
		}
		while (bjc.charAt(j) != '\0')
		{
			j++;
		}
		for (a = 0;zfc.charAt(a) != '\0';a++)
		{
			if (zfc.charAt(a) == 'A' || zfc.charAt(a) == 'T' || zfc.charAt(a) == 'C' || zfc.charAt(a) == 'G')
			{
				c++;
			}
		}
		for (b = 0;bjc.charAt(b) != '\0';b++)
		{
			if (bjc.charAt(b) == 'A' || bjc.charAt(b) == 'T' || bjc.charAt(b) == 'C' || bjc.charAt(b) == 'G')
			{
				d++;
			}
		}
		if (i == j && c == i && d == i)
		{
			for (m = 0;m < i;m++)
			{
				if (zfc.charAt(m) == bjc.charAt(m))
				{
					n++;
				}
			}
		if ((1.0 * n / i) > z)
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

