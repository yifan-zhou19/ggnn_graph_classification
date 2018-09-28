package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int max1 = 0;
	int max2 = 0;
	int[] a = new int[999];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 1;i <= n;i++)
	{
	if (a[i] > max1 && a[i] > max2)
	{
		max2 = max1;
		max1 = a[i];
	}
	else if (a[i] < max1 && a[i]> max2)
	{
		max2 = a[i];
	}
	else if (a[i] < max1 && a[i] < max2)
	{
	}
	}
	System.out.printf("%d\n%d",max1,max2);
	}
}

