package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double p;
		int m;
		int i;
		int j;
		int c = 0;
		int q;
		int d = 0;
		int f = 0;
		int k = 0;
		char[][] u = new char[2][1000];
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
			u[i] = tempVar2.charAt(0);
		}
		}

	q = String.valueOf(u[1]).length();
	m = String.valueOf(u[0]).length();
	if (m != q)
	{
			 System.out.print("error");
			 return 0;
	}

	for (j = 0;j < m;j++)
	{
	if (u[0][j] != 'A' && u[0][j] != 'T' && u[0][j] != 'C' && u[0][j] != 'G')
	{
	f++;
	}
	}
	for (j = 0;j < q;j++)
	{
	if (u[1][j] != 'A' && u[1][j] != 'T' && u[1][j] != 'C' && u[1][j] != 'G')
	{
	f++;
	}
	}

	if (f != 0)
	{
	System.out.print("error");
	return 0;
	}

	for (j = 0;j < m;j++)
	{
	if (u[0][j] == u[1][j])
	{
	c++;
	}
	}

	p = (1.0 * c) / m;
	if (p >= n)
	{
			System.out.print("yes");
	}
	if (p < n)
	{
				  System.out.print("no");
	}
				  return 0;
	}
}

