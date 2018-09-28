package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double j;
		double n;
		int i;
		int l;
		int k;
		int p = 0;
		int u;
		int h = 0;
		char[][] a = new char[2][501];
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
				a[i] = tempVar2.charAt(0);
			}
		}
		l = String.valueOf(a[0]).length();
		k = String.valueOf(a[1]).length();
		if (l != k)
		{
			System.out.print("error");
		}
		else
		{
			for (u = 0;u < l;u++)
			{
				if ((a[0][u] != 'A') && (a[0][u] != 'T') && (a[0][u] != 'G') && (a[0][u] != 'C') && (a[1][u] != 'A') && (a[1][u] != 'T') && (a[1][u] != 'G') && (a[1][u] != 'C'))
				{
					p++;
				}
				else
				{
					if (a[0][u] == a[1][u])
					{
						h++;
					}
				}
			}
			if (p != 0)
			{
				System.out.print("error");
			}
			else
			{
				j = 1.0 * h / l;
				if (j > n)
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

