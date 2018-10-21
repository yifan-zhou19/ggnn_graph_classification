package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		int i;
		int j = 0;
		int b;
		int c;
		char[][] zfc = new char[2][501];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		for (i = 0;i < 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
		}
		b = String.valueOf(zfc[0]).length();
		c = String.valueOf(zfc[1]).length();
		if (b != c)
		{
			System.out.print("error");
			return 0;
		}
		else
		{
		for (i = 0;zfc[0][i] != '\0';i++)
		{
			if ((zfc[0][i] != 'A' && zfc[0][i] != 'T' && zfc[0][i] != 'C' && zfc[0][i] != 'G') || (zfc[1][i] != 'A' && zfc[1][i] != 'T' && zfc[1][i] != 'C' && zfc[1][i] != 'G'))
			{
				System.out.print("error");
				return 0;
			}
			else if (zfc[0][i] == zfc[1][i])
			{
				j++;
			}
		}
		}
		if ((double)1.0 * j / String.valueOf(zfc[0]).length() > a)
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

