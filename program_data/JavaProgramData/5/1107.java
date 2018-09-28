package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zfc = new char[5][600];
		int i;
		int p;
		int q;
		int sum = 0;
		double n;
		double flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (i = 0;i < 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
		}
		p = String.valueOf(zfc[0]).length();
		q = String.valueOf(zfc[1]).length();
		if (p != q)
		{
			System.out.print("error\n");
			return 0;
		}
		for (i = 0;(zfc[0][i] != '\0') && (zfc[1][i] != '\0');i++)
		{
			if ((zfc[0][i] != 'A' && zfc[0][i] != 'G' && zfc[0][i] != 'C' && zfc[0][i] != 'T') || (zfc[1][i] != 'A' && zfc[1][i] != 'G' && zfc[1][i] != 'C' && zfc[1][i] != 'T'))
			{
				System.out.print("error\n");
				return 0;
			}
			if (zfc[0][i] == zfc[1][i])
			{
				sum++;
			}
		}
		flag = 1.0 * sum / p;
		if (flag > n)
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

