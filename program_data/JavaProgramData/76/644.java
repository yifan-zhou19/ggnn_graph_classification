package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int t;
	int max;
	int min;
	int[] a = new int[50000];
	int[] b = new int[50000];
	int[] c = new int[10000];
	t = 1;
	max = 1;
	min = 10000;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	if (a[i] < min)
	{
	min = a[i];
	}
	if (b[i] > max)
	{
	max = b[i];
	}
	for (j = a[i];j < b[i];j++)
	{
	c[j] = 1;
	}
	}
	for (j = min;j < max;j++)
	{
	if (c[j] != 1)
	{
	t = 0;
	}
	}
	if (t == 0)
	{
	System.out.print("no");
	}
	else
	{
	System.out.printf("%d %d",min,max);
	}
	return 0;
	}
}

