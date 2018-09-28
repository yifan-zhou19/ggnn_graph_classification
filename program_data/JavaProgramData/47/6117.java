package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[100];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	int m;
	for (i = n - 1;i > 0;i--)
	{
	for (j = 0;j < i;j++)
	{
	m = a[j + 1];
	a[j + 1] = a[j];
	a[j] = m;
	}
	}
	for (i = 0;i < n;i++)
	{
	if (i == n - 1)
	{
		System.out.printf("%d",a[i]);
	}
	else
	{
		System.out.printf("%d ",a[i]);
	}
	}
	}

}

