package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int b;
		String sz = new String(new char[520]);
		String zfc = new String(new char[520]);
		double a;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			zfc = tempVar3.charAt(0);
		}
		n = zfc.length();
		k = 0;
		b = 0;
		if (sz.length() != n)
		{
			System.out.print("error");
			b = 1;
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if ((sz.charAt(i) != 'A' && sz.charAt(i) != 'T' && sz.charAt(i) != 'G' && sz.charAt(i) != 'C') || (zfc.charAt(i) != 'A' && zfc.charAt(i) != 'T' && zfc.charAt(i) != 'G' && zfc.charAt(i) != 'C'))
				{
					System.out.print("error");
					b = 1;
					break;
				}
				else
				{
					if (sz.charAt(i) == zfc.charAt(i))
					{
						k++;
					}
				}
			}
		}
		if (b == 0)
		{
			m = 1.0 * k / n;
			if (m > a)
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

