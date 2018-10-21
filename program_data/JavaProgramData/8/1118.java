package <missing>;

public class GlobalMembers
{
	public static int read(int[] a, int[] b)
	{
		int m;
		int n;
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
	a[0] = m;
	b[0] = n;
	for (i = 1;i <= m;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		b[i] = Integer.parseInt(tempVar4);
	}
	}
	return 0;
	}
	public static int seq(int[] a)
	{
		int i;
		int j;
		int t;
		int m = a[0];
	for (j = 1;j <= m - 1;j++)
	{
	for (i = 1;i <= m - j;i++)
	{
	if (a[i] > a[i + 1])
	{
		t = a[i];
		a[i] = a[i + 1];
		a[i + 1] = t;
	}
	}
	}
	return 0;
	}
	public static int toge(int[] a, int[] b)
	{
		int i;
		int m = a[0];
		int n = b[0];
	a[0] = a[0] + b[0];
	for (i = m + 1;i <= m + n;i++)
	{
	a[i] = b[i - m];
	}
	return 0;
	}
	public static int see(int[] a)
	{
		int i;
	System.out.printf("%d",a[1]);
	for (i = 2;i <= a[0];i++)
	{
	System.out.printf(" %d",a[i]);
	}
	return 0;
	}
	public static int Main()
	{
		int[] a = new int[200];
		int[] b = new int[100];
		read(a, b);
		seq(a);
		seq(b);
		toge(a, b);
		see(a);
	return 0;
	}
}

