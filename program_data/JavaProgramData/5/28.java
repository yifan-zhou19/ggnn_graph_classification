package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String zfc = new String(new char[500]);
		String sz = new String(new char[500]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz = tempVar3.charAt(0);
		}
		int a = zfc.length();
		int b = sz.length();
		int m;
		if (a != b)
		{
			System.out.print("error");
		}
		else
		{
			m = a;
			int k = 0;
			int y;
			for (y = 0;y < m;y++)
			{
				if (zfc.charAt(y) != 'A' && zfc.charAt(y) != 'T' && zfc.charAt(y) != 'C' && zfc.charAt(y) != 'G' && zfc.charAt(y) != '\0')
				{
					System.out.print("error");
				k = 1;
				break;
				}
				if (sz.charAt(y) != 'A' && sz.charAt(y) != 'T' && sz.charAt(y) != 'C' && sz.charAt(y) != 'G' && zfc.charAt(y) != '\0')
				{
					System.out.print("error");
				k = 1;
				break;
				}
			}
				if (k == 0)
				{

		int i;
		int c = 0;
		for (i = 0;i < m;i++)
		{
			if (zfc.charAt(i) == sz.charAt(i))
			{
				c++;
			}
		}
		double s = c * 1.0 / m;
		if (s > n)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
				}
		}
		return 0;
	}



}

