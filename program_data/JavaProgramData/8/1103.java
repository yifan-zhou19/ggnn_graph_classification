package <missing>;

public class GlobalMembers
{
	public static int bijiao(Object x, Object y)
	{
		return *(int)x - (int)y;
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 0;i <= n - 1;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i <= m - 1;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		b[i] = Integer.parseInt(tempVar4);
	}
	}
	qsort(a,n,(Integer.SIZE / Byte.SIZE),bijiao);
	qsort(b,m,(Integer.SIZE / Byte.SIZE),bijiao);
	for (i = 0;i <= n - 1;i++)
	{
	System.out.printf("%d ",a[i]);
	}
	for (i = 0;i < m - 1;i++)
	{
	System.out.printf("%d ",b[i]);
	}
	System.out.printf("%d",b[m - 1]);
	}
}

