package <missing>;

public class GlobalMembers
{
	public static void paixu(int[] a, int m)
	{
	int i;
	int j;
	int d;
	for (i = 0;i < m;i++)
	{
	for (j = i + 1;j < m;j++)
	{
	if (a[i] > a[j])
	{
	d = a[i];
	a[i] = a[j];
	a[j] = d;
	}
	}
	}
	return;
	}
	public static void hebing(int[] a, int[] b, int m, int n)
	{
	int i;
	System.out.printf("%d",a[0]);
	for (i = 1;i < m;i++)
	{
	System.out.printf(" %d",a[i]);
	}
	for (i = 0;i < n;i++)
	{
	System.out.printf(" %d",b[i]);
	}
	return;
	}

	public static int Main()
	{
	int m;
	int n;
	int[] a = new int[100];
	int[] b = new int[100];
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < m;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		b[i] = Integer.parseInt(tempVar4);
	}
	}
	paixu(a, m);
	paixu(b, n);
	hebing(a, b, m, n);
	return 0;
	}

}

