package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l1;
		int l0;
		int js = 0;
		double jg;
		double bl;
		char[][] a = new char[2][501];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bl = Double.parseDouble(tempVar);
		}
		for (i = 0;i < 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		l0 = String.valueOf(a[0]).length();
		l1 = String.valueOf(a[1]).length();
		if (l1 != l0)
		{
			System.out.print("error");
			return 0;
		}
		for (j = 0;j < 2;j++)
		{
			for (i = 0;i < l1;i++)
			{
				if ((a[j][i] != 'A') && (a[j][i] != 'T') && (a[j][i] != 'C') && (a[j][i] != 'G'))
				{
				   System.out.print("error");
				   return 0;
				}
			}
		}
		for (i = 0;i < l1;i++)
		{
			if (a[0][i] == a[1][i])
			{
				js++;
			}
		}
		jg = 1.0 * js / l1;
		if (jg > bl)
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

