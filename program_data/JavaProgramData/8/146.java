package <missing>;

public class GlobalMembers
{
	public static void f(int[] str, int m)
	{
		int i;
		int j;
		int k;
		for (j = 0;j < m;j++)
		{
		for (i = 0;i < m - 1;i++)
		{
			if (str[i] > str[i + 1])
			{
				k = str[i];
			str[i] = str[i + 1];
			str[i + 1] = k;
			}
		}
		}
	}

	public static void g(int[] a, int[] b, int ma, int mb)
	{
		int i;
		for (i = ma;i < (ma + mb);i++)
		{
	a[i] = b[i - ma];
		}
	}


	public static void Main()
	{
		int ma;
		int mb;
		int i;
	int[] a = new int[8888];
	int[] b = new int[8888];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		ma = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		mb = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < ma;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < mb;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		b[i] = Integer.parseInt(tempVar4);
	}
	}
	f(a, ma);
	f(b, mb);
	g(a, b, ma, mb);
	for (i = 0;i <= (ma + mb - 1);i++)
	{
		if (i != 0)
		{
	System.out.print(" ");
		}
	System.out.printf("%d",a[i]);
	}
	}

}

