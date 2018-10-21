package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		String zfc = new String(new char[1000]);
		String zfc1 = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		int b = 0;
		double c;
		int d = 0;
		int i;
		int j;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			zfc1 = tempVar3.charAt(0);
		}
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		int z = 0;
		for (i = 0;i < zfc.length();i++)
		{
			if (zfc.charAt(i) == 'A' || zfc.charAt(i) == 'T' || zfc.charAt(i) == 'C' || zfc.charAt(i) == 'G')
			{
				g++;
			}
		}
		for (i = 0;i < zfc1.length();i++)
		{
			if (zfc1.charAt(i) == 'A' || zfc1.charAt(i) == 'T' || zfc1.charAt(i) == 'C' || zfc1.charAt(i) == 'G')
			{
			h++;
			}
		}
		if ((g != zfc.length()) || (h != zfc1.length()) || zfc.length() != zfc1.length())
		{
			System.out.print("error\n");
			z = 1;
		}
		if (z != 1)
		{
		for (j = 0;j < zfc.length();j++)
		{
			if (zfc.charAt(j) == zfc1.charAt(j))
			{
				b++;
			}
		}
		for (j = 0;j < zfc.length();j++)
		{
			d++;
		}
		c = 1.0 * b / d;

		if (c > a)
		{
			System.out.print("yes\n");
		}
		if (c <= a)
		{
			System.out.print("no\n");
		}
		}
		return 0;
	}

}

