package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] c = new int[2];
		int e = 0;
		char[][] a = new char[2][501];
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Double.parseDouble(tempVar);
		}
		for (i = 0;i < 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		c[0] = String.valueOf(a[0]).length();
		c[1] = String.valueOf(a[1]).length();
		if (c[0] != c[1])
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < 2;i++)
		{
			for (j = 0;j < c[i] - 1;j++)
			{
				if (a[i][j] != 'A' && a[i][j] != 'T' && a[i][j] != 'G' && a[i][j] != 'C')
				{
					System.out.print("error");
					return 0;
				}
			}
		}
		for (j = 0;j < c[0];j++)
		{
			if (a[0][j] == a[1][j])
			{
				e++;
			}
		}
		if (1.0 * e / c[0] > b)
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

