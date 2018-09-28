package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[100];
	int i;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	int x;
	x = n / 2;
	int y;
	for (i = 0;i < n - x;i++)
	{
	y = a[i];
	a[i] = a[n - i - 1];
	a[n - i - 1] = y;
	}
	for (i = 0;i < n - 1;i++)
	{
	System.out.printf("%d ",a[i]);
	}
	System.out.printf("%d",a[n - 1]);
	return 0;
	}
}

