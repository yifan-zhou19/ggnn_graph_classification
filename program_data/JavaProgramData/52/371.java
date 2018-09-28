package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int m;
	int[] a = new int[200];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n - m;i++)
	{
	a[100 + i] = a[i];
	}
	for (j = 0,i = n - m;i < n;i++,j++)
	{
	a[j] = a[i];
	}
	for (j = m,i = 100;i < 100 + n - m;j++,i++)
	{
	a[j] = a[i];
	}
	for (i = 0;i < n - 1;i++)
	{
	System.out.printf("%d ",a[i]);
	}
	System.out.printf("%d\n",a[n - 1]);
	return 0;
	}
}

