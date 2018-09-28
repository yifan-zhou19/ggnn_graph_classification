package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int k;
		int m;
		int n;
		int b = 0;
		int in;
		int jn;
		int p = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < m;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;k < n;k++)
		{
	b = 0;
	for (i = 0;i < m;i++)
	{
	if (b < a[i][k])
	{
		b = a[i][k];
		in = i;
		jn = k;
	}
	else
	{
		continue;
	}
	}
	for (j = 0;j < n;j++)
	{
	if (b > a[in][j])
	{
		break;
	}
	else if (j == n - 1 && b <= a[in][j])
	{
		k = n;
		p = 0;
	}
	}
		}
	if (p == 1)
	{
		System.out.print("No");
	}
	else
	{
		System.out.printf("%d+%d\n",jn,in);
	}
	return 0;
	}

}

