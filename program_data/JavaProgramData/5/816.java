package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int c;
		int d;
		int e = 0;
		int f = 0;
		char[][] h = new char[1][501];
		char[][] i = new char[1][501];
		double j;
		double k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			h[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i[0] = tempVar3.charAt(0);
		}
		b = String.valueOf(h[0]).length();
		c = String.valueOf(i[0]).length();
		if (b != c)
		{
			f++;
			System.out.print("error");
		}
		else
		{
			for (d = 0;d < b;d++)
			{
				if ((h[0][d] != 'A' && h[0][d] != 'T' && h[0][d] != 'C' && h[0][d] != 'G') || (i[0][d] != 'A' && i[0][d] != 'T' && i[0][d] != 'C' && i[0][d] != 'G'))
				{
					System.out.print("error");
					f++;
					break;
				}
				else
				{
					if (h[0][d] == i[0][d])
					{
						e++;
					}
				}
			}
		}
		if (f == 0)
		{
			k = 1.0 * e / b;
			if (k > j)
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

