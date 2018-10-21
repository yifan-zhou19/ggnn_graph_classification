package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100000];
		int b = 0;
		int c;
		int f = 0;
		int d;
		int e;
		int i;
		int row1;
		int row2;
		int col1;
		int col2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] == 0)
			{
			b += 1;
			if (b == 1)
			{
			d = i;
			}
			}
		}
		for (i = 0;i < n * n;i++)
		{
			if (sz[i] == 0)
			{
			f += 1;
			if (f == b)
			{
			e = i;
			}
			}
		}
		row1 = d / n;
		col1 = d % n;
		row2 = e / n;
		col2 = e % n;
		c = (col2 - col1 + 1) * (row2 - row1 + 1) - b;
		System.out.printf("%d",c);
			return 0;
	}


}

