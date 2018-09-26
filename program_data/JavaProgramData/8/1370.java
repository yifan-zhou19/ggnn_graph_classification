package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[200];
		int i;
		int m;
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
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
	int j;
	int p;
	for (i = m - 2;i >= 0;i--)
	{
	for (j = 0;j <= i;j++)
	{
	if (a[j] > a[j + 1])
	{
	p = a[j];
	a[j] = a[j + 1];
	a[j + 1] = p;
	}
	}
	}

	for (i = n - 2;i >= 0;i--)
	{
	for (j = 0;j <= i;j++)
	{
	if (b[j] > b[j + 1])
	{
	p = b[j];
	b[j] = b[j + 1];
	b[j + 1] = p;
	}
	}
	}
	int q;
	for (q = 0;q < m;q++)
	{
	c[q] = a[q];
	}
	for (q = m;q < m + n;q++)
	{
	c[q] = b[q - m];
	}
	int s;
	System.out.printf("%d",c[0]);
	for (s = 1;s < m + n;s++)
	{
	System.out.printf(" %d",c[s]);
	}

	}
}

