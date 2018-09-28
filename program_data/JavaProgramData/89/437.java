package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[20000];
	int[] b = new int[20000];
	int h;
	int i;
	int j;
	int[] c = new int[10000];
	int[] d = new int[10000];
	int k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (h = 0;;h++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[h] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[h] = Integer.parseInt(tempVar3);
	}
	if (a[h] == 0 && b[h] == 0)
	{
	break;
	}
	}
	for (i = 0;i < n;i++)
	{
		c[i] = 1;
		d[i] = 0;
	}
	for (j = 0;j < n;j++)
	{
	for (i = 0;i < h;i++)
	{
	if (a[i] == j)
	{
		c[j] = 0;
		break;
	}
	}
	}
	for (j = 0;j < n;j++)
	{
	if (c[j] != 0)
	{
	for (i = 0;i < h;i++)
	{
	if (b[i] == j)
	{
	d[j]++;
	}
	}
	}
	}
	for (j = 0;j < n;j++)
	{
	if (d[j] == n - 1 && n > 1)
	{
		System.out.printf("%d\n",j);
		k = 1;
	}
	}
	if (k == 0)
	{
	System.out.print("NOT FOUND");
	}
	}
}

