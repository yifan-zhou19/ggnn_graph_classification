package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int panduan(int[] p, int n, int m)
	{
		int z;
	if (n >= 0 && n < 5 && m >= 0 && m < 5)
	{
	z = 1;
	}
	else
	{
	z = 0;
	}
	return z;
	}
	public static void jiaohuan(int[] p, int n, int m)
	{
		int i;
		int j;
		int[] b = new int[5];
	for (j = 0;j < 5;j++)
	{
	b[j] = (p[n] + j);
	}
	for (j = 0;j < 5;j++)
	{
	*(p[n] + j) = *(p[m] + j);
	}
	for (j = 0;j < 5;j++)
	{
	*(p[m] + j) = b[j];
	}
	for (i = 0;i < 5;i++)
	{
		System.out.printf("%d",p[i]);
		for (j = 1;j < 5;j++)
		{
	System.out.printf(" %d",*(p[i] + j));
		}
	System.out.print("\n");
	}
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			*(a + i) + j = tempVar;
		}
		}
		}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	if (panduan(a, n, m) == 0)
	{
	System.out.print("error");
	}
	else
	{
		jiaohuan(a, n, m);
	}





	return 0;
	}
}

