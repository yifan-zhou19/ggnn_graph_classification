package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int r = 0;
	int n;
	int m;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[10000];
	int[] b = new int[10000];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (a[i] % 2 == 1)
	{
	b[r] = a[i];
	r = r + 1;
	}
	if (a[i] % 2 == 0)
	{
	r = r;
	}
	}
	for (i = 0;i < r;i++)
	{
	for (j = r - 1;j > i;j--)
	{
	if (b[j] <= b[j - 1])
	{
	m = b[j - 1];
	b[j - 1] = b[j];
	b[j] = m;
	}
	if (b[j] > b[j - 1])
	{
	b[j] = b[j];
	b[j - 1] = b[j - 1];
	}
	}
	}
	for (i = 0;i < r - 1;i++)
	{
	System.out.printf("%d,",b[i]);
	}
	System.out.printf("%d",b[r - 1]);
	}
}

