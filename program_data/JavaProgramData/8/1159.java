package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int Main()
	{
		int[] p = new int[100];
		int[] q = new int[100];
		int[] c = new int[200];
	void re(int a[],int b[]);
	void or(int a[],int b[]);
	void cb(int a[],int b[],int d[]);
	void pr(int d[]);
	re(p, q);
	or(p, q);
	cb(p, q, c);
	pr(c);
	return 0;
	}
	public static void re(int[] a, int[] b)
	{
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
	}
	public static void or(int[] a, int[] b)
	{
	int i;
	int j;
	int t;
	for (i = 0;i < m - 1;i++)
	{
	for (j = i + 1;j < m;j++)
	{
	if (a[i] > a[j])
	{
		t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	}
	}
	for (i = 0;i < n - 1;i++)
	{
	for (j = i + 1;j < n;j++)
	{
	if (b[i] > b[j])
	{
		t = b[i];
		b[i] = b[j];
		b[j] = t;
	}
	}
	}
	}
	public static void cb(int[] a, int[] b, int[] d)
	{
	int i;
	for (i = 0;i < m;i++)
	{
		d[i] = a[i];
	}
	for (i = m;i < m + n;i++)
	{
		d[i] = b[i - m];
	}
	}
	public static void pr(int[] d)
	{
	int i;
	System.out.printf("%d",d[0]);
	for (i = 1;i < m + n;i++)
	{
	System.out.printf(" %d",d[i]);
	}
	}
}

